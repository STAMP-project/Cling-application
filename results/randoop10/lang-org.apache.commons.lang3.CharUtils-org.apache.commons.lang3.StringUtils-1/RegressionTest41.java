import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test20501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20501");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse(" \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????????????????????????????????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20502");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u0055", "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20503");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u97d3\u6587\u5357\u97d3)", "ECANADAgCANADACANADAsh                                                                                                   ", 5);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20504");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("TITcnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf", 55, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 89 + "'", int3 == 89);
    }

    @Test
    public void test20505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20505");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fran\347ais (France)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test20506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20506");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray10 = new char[] { ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("itTAiT_ITALIAN_EgAish", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "china", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\ritalieital", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CCCC\\CCCCC                                                             ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 18 + "'", int17 == 18);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\uCinese (Cina)\\u0069h..\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a..." + "'", str2, "\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a...");
    }

    @Test
    public void test20508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\u0020italianitalianitalianitali\\u0020italianitalianitalianitalhcsineilati", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20509");
        java.util.Locale locale1 = new java.util.Locale("hi!(\\U0020,Italienisch############################################hi!       ");
        org.junit.Assert.assertEquals(locale1.toString(), "hi!(\\u0020,italienisch############################################hi!       ");
    }

    @Test
    public void test20510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20510");
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
        java.util.Locale.Builder builder12 = builder11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setLanguageTag("                                                                 CANADA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:                                                                  CANADA [at index 0]");
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
    }

    @Test
    public void test20511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20511");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('t');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "t" + "'", str1, "t");
    }

    @Test
    public void test20512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\         ", "c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\         " + "'", str2, "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\         ");
    }

    @Test
    public void test20513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20513");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "HhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhHHHHHHHHHH", 23, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhHHHHHHHHHH" + "'", str4, "HhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhhHhhhhhhhhHHHHHHHHHH");
    }

    @Test
    public void test20514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20514");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!nglish (United Kingdom)!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!", "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20515");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\u0020iItalian\\u008600u\\U\\u0020iItalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uitalian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 574 + "'", int1 == 574);
    }

    @Test
    public void test20516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("8ian\\u0020i86", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8ian" + "'", str2, "8ian");
    }

    @Test
    public void test20517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20517");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.String str5 = locale0.getDisplayVariant();
        boolean boolean6 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italian" + "'", str3, "Italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test20518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20518");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale locale6 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.removeUnicodeLocaleAttribute("                                                                  \\U0069HHHHHHHHHH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                                                   \\U0069HHHHHHHHHH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test20519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20519");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "en_ca");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20520");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\u002", (int) '\u671d', 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test20521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20521");
        char[] charArray7 = new char[] { ' ' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("FRENCH (CANADA)", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("en_CA", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i!", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u007", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test20522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20522");
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("HI!", locale1);
        java.lang.String str5 = locale1.getScript();
        java.lang.String str6 = locale1.toLanguageTag();
        java.lang.String str7 = locale1.getCountry();
        java.lang.String str8 = locale1.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale1.getUnicodeLocaleType("\\!u!00!de!\\!u!0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: \\!u!00!de!\\!u!0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "de" + "'", str6, "de");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test20523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20523");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\u00de\\u00\\u\\u00de\\u00\\u", "gERMAN (gERMANY)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20524");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale.Builder builder12 = builder9.setLocale(locale10);
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder14 = builder9.setLocale(locale13);
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleAttributes();
        boolean boolean16 = locale13.hasExtensions();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder6.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French (Canada)" + "'", str11, "French (Canada)");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test20525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20525");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r...", "\\u0039", 120);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ')', 0, 400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20526");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HCSTUD \\U0034", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\u0030UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 41);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20527");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("i\\u0020iTALIANiTALIANiTALIANiTALIit         \\");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\u0020iItalian\\u008600u\\", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020iItalian\\u008600u\\" + "'", str2, "\\u0020iItalian\\u008600u\\");
    }

    @Test
    public void test20529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20529");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "talHan");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test20530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20530");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test20531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20531");
        char[] charArray14 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                         ", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("Englisch", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00 ", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hcstued-e#__nailati", charArray14);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test20532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20532");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "h");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemand");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL" + "'", str5, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL" + "'", str7, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test20533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20533");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) ")aHI0200U\\NAIHAAAAAAAAAAAAAAAAAAAAAAAAAA)a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20534");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                             hcsfr-CueD                                         ...", "eCANADAgCANADACANADAsh                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20535");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str2 = locale1.getDisplayScript();
        java.util.Locale.setDefault(locale1);
        java.lang.String str4 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test20536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20536");
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
            java.util.Locale.Builder builder11 = builder6.setUnicodeLocaleKeyword("                                             xx_xx                                              ", "GGGGGGGGGGGGGGGGGGGGGGGaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:                                              xx_xx                                               [at index 0]");
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
    public void test20537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20537");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\u006bCinese (Cina)\\u0069h..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20538");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 'i');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20539");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "CCCC\\CCCC                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20540");
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
        java.lang.String str29 = locale17.getVariant();
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.util.Locale locale31 = java.util.Locale.ITALIAN;
        java.lang.String str33 = locale31.getExtension('h');
        java.lang.String str34 = locale30.getDisplayScript(locale31);
        java.util.Locale locale35 = locale30.stripExtensions();
        java.lang.String str36 = locale35.getISO3Country();
        boolean boolean37 = locale35.hasExtensions();
        java.lang.String str38 = locale35.getISO3Language();
        java.lang.String str39 = locale17.getDisplayLanguage(locale35);
        java.lang.String str40 = locale35.getISO3Language();
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
        org.junit.Assert.assertEquals(locale16.toString(), "");
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
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "FRA" + "'", str36, "FRA");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fra" + "'", str38, "fra");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "fran\347ais" + "'", str39, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "fra" + "'", str40, "fra");
    }

    @Test
    public void test20541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("fr_FR", "franz\366sisch\n(frankreich)hsiage_nailati_tiattihi!_nailati         hsilgne_nailati_", (int) 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr_FR" + "'", str3, "fr_FR");
    }

    @Test
    public void test20542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20542");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("CCCCCCCCC");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test20543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20543");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\u5fb7\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test20544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20544");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20545");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                   ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00 ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "tTAT_ITA", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "2IT HI!       _\\U0020_ITALIENISCH####################################################################            2I", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "00000000000000coreen (Coree du Sud", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 115, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test20547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20547");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischI" + "'", str1, "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischI");
    }

    @Test
    public void test20548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20548");
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
            java.util.Locale.Builder builder41 = builder0.setScript("DACFACGACHACIACKACLAC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: DACFACGACHACIACKACLAC [at index 0]");
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
    public void test20549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20549");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "2IT HI!       _\\U0020_ITALIENISCH####################################################################            2I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("ecanadaGcanadacanadaSH", "EEEEEEEEEE       ", "\\U0020IiTALIAN\\U0020I                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ecanadaGcanadacanadaSH" + "'", str3, "ecanadaGcanadacanadaSH");
    }

    @Test
    public void test20551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20551");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Iinglese", (int) (short) -1, "HI!(\\U0020,ITALIENISCH#########################################################################################)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Iinglese" + "'", str3, "Iinglese");
    }

    @Test
    public void test20552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20552");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          italy", (double) 38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=38.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20553");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "i!", (java.lang.CharSequence) "!_\\U0020_Itle");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test20554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20554");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("inglesehhhhhhhhh", "E             g                          ", 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("ITALIAE", "hcstued", 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAE" + "'", str3, "ITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAE");
    }

    @Test
    public void test20556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20556");
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
        java.lang.String str25 = locale9.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "francese" + "'", str25, "francese");
    }

    @Test
    public void test20557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20557");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...It...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", "                                                                                                                     ", "\ud504\ub791\uc2a4");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test20559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20559");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                     \\u005c         ", "    ##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test20560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20560");
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
            java.util.Locale.Builder builder13 = builder11.addUnicodeLocaleAttribute("fr_FR                  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr_FR                   [at index 0]");
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
    public void test20561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ITALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", "fr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_frfr_fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("EHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglis");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglis" + "'", str1, "EHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglis");
    }

    @Test
    public void test20563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20563");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0020iItalian\\u008600u\\U\\u0020iItalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uitalian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", "ehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLIS");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20564");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Francia", "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20565");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!_\\U0020_itle########################################################################################", "cHINESISCH(cHINA)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test20566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20566");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "FRENCH                     ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test20567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20567");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC", "iTTAIT_ITALIAN_EGAISH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20568");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                                                                                                    ");
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", strArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("9hhhhhhhhhh", strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, 'T', 98, (int) 'f');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Eagaash" + "'", str12, "Eagaash");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 395 + "'", int15 == 395);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Egsh" + "'", str17, "Egsh");
    }

    @Test
    public void test20569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw", "U00\\U0034\\U00                                             HCSTUD                                             \\U0034");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test20570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20570");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "n       nn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20571");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("8600u\\                                 hsiAgE_NAILATI_TiATti8600u\\                     nglish (United Kingdom)", "fr-cafr-cafr-c8600u\\fr-cafr-cafr-caEEEEEE", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str1, "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test20573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20573");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                 \\u0069hhhhhhhhhh                 ", "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk\n", (int) 'h');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20574");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("english", 102, "9hhhhhhhhhh_\\U0078");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhenglish" + "'", str3, "9hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhenglish");
    }

    @Test
    public void test20575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20575");
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
        java.util.Locale locale59 = java.util.Locale.US;
        java.lang.String str60 = locale59.getScript();
        java.util.Set<java.lang.String> strSet61 = locale59.getUnicodeLocaleAttributes();
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet61, 'A');
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strSet61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, strMap65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList66, strMap67);
        java.util.Collection<java.util.Locale> localeCollection69 = null;
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter(languageRangeList68, localeCollection69);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter(languageRangeList43, localeCollection69);
        java.util.Locale locale72 = java.util.Locale.ITALIAN;
        java.lang.String str73 = locale72.getDisplayLanguage();
        java.util.Locale locale74 = locale72.stripExtensions();
        java.lang.String str75 = locale72.getLanguage();
        java.lang.String str76 = locale72.getISO3Language();
        java.util.Set<java.lang.String> strSet77 = locale72.getUnicodeLocaleKeys();
        java.lang.String str78 = java.util.Locale.lookupTag(languageRangeList43, (java.util.Collection<java.lang.String>) strSet77);
        java.lang.String str80 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet77, '9');
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
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + filteringMode55 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode55.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode57.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "it");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "italiano" + "'", str73, "italiano");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "it");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "it" + "'", str75, "it");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "ita" + "'", str76, "ita");
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test20576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20576");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ITALIAE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test20577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("IT44444444444444444EN", "\\u0074");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20578");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "de                                                                                                                      ", (java.lang.CharSequence) "Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "de                                                                                                                      " + "'", charSequence2, "de                                                                                                                      ");
    }

    @Test
    public void test20579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20579");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("      ", "italian (italian,eng_KOKOKO_      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20580");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("U005C", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDk...", "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U005C" + "'", str3, "U005C");
    }

    @Test
    public void test20581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20581");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u004", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20582");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444NAILATI44444444444444", 'U');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (ALLEMAND)", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test20583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20583");
        java.util.Locale locale2 = new java.util.Locale("Italienisch", "l");
        org.junit.Assert.assertEquals(locale2.toString(), "italienisch_L");
    }

    @Test
    public void test20584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20584");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("de", "itTAiT_ITALIAN_EgAish");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("4", (java.lang.Object[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("    ...", strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '.');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "cccccccccccccccccccccccccccc...");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "de" + "'", str6, "de");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "de" + "'", str10, "de");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test20585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20585");
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
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList42, filteringMode44);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList48);
        java.lang.String str51 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList48);
        java.util.Locale locale52 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet53 = locale52.getExtensionKeys();
        java.util.Locale locale55 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale57 = new java.util.Locale("");
        java.util.Locale locale58 = java.util.Locale.FRANCE;
        java.util.Locale locale59 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str60 = locale58.getDisplayScript(locale59);
        java.util.Locale locale61 = java.util.Locale.ENGLISH;
        java.lang.String str62 = locale61.getDisplayCountry();
        java.util.Locale locale63 = java.util.Locale.PRC;
        java.util.Locale locale64 = java.util.Locale.US;
        java.util.Locale locale65 = java.util.Locale.FRANCE;
        java.util.Locale locale66 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str67 = locale65.getDisplayScript(locale66);
        java.util.Locale locale68 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet69 = locale68.getExtensionKeys();
        java.util.Locale locale70 = java.util.Locale.ITALIAN;
        java.lang.String str71 = locale70.getDisplayLanguage();
        java.util.Locale locale72 = java.util.Locale.FRENCH;
        java.util.Locale locale73 = java.util.Locale.US;
        java.util.Locale locale74 = java.util.Locale.ITALIAN;
        java.lang.String str75 = locale74.getDisplayLanguage();
        java.util.Locale locale76 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale52, locale55, locale57, locale58, locale61, locale63, locale64, locale66, locale68, locale70, locale72, locale73, locale74, locale76 };
        java.util.ArrayList<java.util.Locale> localeList78 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList78, localeArray77);
        java.util.Locale locale80 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap82 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList83 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap82);
        java.util.Locale locale84 = java.util.Locale.UK;
        java.util.Locale.Category category85 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale86 = java.util.Locale.getDefault(category85);
        java.util.Locale locale87 = java.util.Locale.GERMAN;
        java.util.Locale locale88 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str89 = locale87.getDisplayName(locale88);
        java.util.Locale.setDefault(category85, locale88);
        java.util.Set<java.lang.String> strSet91 = locale88.getUnicodeLocaleKeys();
        java.lang.String str92 = locale84.getDisplayVariant(locale88);
        java.lang.String str93 = locale84.getCountry();
        java.lang.String str94 = locale84.getDisplayVariant();
        java.util.Set<java.lang.String> strSet95 = locale84.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags(languageRangeList83, (java.util.Collection<java.lang.String>) strSet95);
        java.lang.String str98 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList96, 'x');
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
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode44.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it");
        org.junit.Assert.assertNotNull(charSet53);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "it");
        org.junit.Assert.assertNotNull(charSet69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "italiano" + "'", str71, "italiano");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "fr");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "it");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "italiano" + "'", str75, "italiano");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(locale80);
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertNotNull(languageRangeList83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category85 + "' != '" + java.util.Locale.Category.FORMAT + "'", category85.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "it");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "de");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "allemand" + "'", str89, "allemand");
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "GB" + "'", str93, "GB");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test20586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\U0034\\U00                                             HdI!        (\\u0020,iTALICNIUEd#########################################################################################STUd                                             \\U0034\\U00", "EEEEEEEEEFRAEEEEEEEEE", "2222222222222222222italian_ITALIAN_EnglisFitalian (italian,englis");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test20587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20587");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.lang.String str5 = locale1.getExtension('x');
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.lang.String str9 = locale1.getDisplayScript(locale8);
        java.lang.String str10 = locale1.getDisplayVariant();
        java.lang.String str11 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglese" + "'", str2, "inglese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
    }

    @Test
    public void test20588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20588");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\u671d", "", 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test20589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20589");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "!IH");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "EN_CA");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "ITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAEhcstuedITALIAE", 113, 84);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test20590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("(C)ALANALANALANAL", 9, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(C)ALANALANALANAL" + "'", str3, "(C)ALANALANALANAL");
    }

    @Test
    public void test20591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20591");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\ud55c\uad6d\uc5b4KR", 220, "tedesco (Germania)");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4KRtedesco (Germania)tedesco (Germania)tedesco (Germania)tedesco (Germania)tedesco (Germania)tedesco (Germania)" + "'", str3, "\ud55c\uad6d\uc5b4KRtedesco (Germania)tedesco (Germania)tedesco (Germania)tedesco (Germania)tedesco (Germania)tedesco (Germania)");
    }

    @Test
    public void test20592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20592");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('\u671d');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "i\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB" + "'", str1, "i\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB");
    }

    @Test
    public void test20594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20594");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Italia", (int) 'C');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20595");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("hi!_\\U0020...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hi!_\\U0020... [at index 0]");
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
    public void test20596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20596");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANIU0020ITALIANITALIANITALIANITALI", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("2aiTALIANiTALIANiTALIANiTALCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2aiTALIANiTALIANiTALIANiTALCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str1, "2aiTALIANiTALIANiTALIANiTALCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test20598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20598");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Eagaash", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20599");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "nglish (United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", "Franzosisch(Frankreich)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20601");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("TAUAWAXAZBA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TAUAWAXAZBA" + "'", str1, "TAUAWAXAZBA");
    }

    @Test
    public void test20602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20602");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("it_IT", "\\u0049", (int) 'A');
        boolean boolean12 = languageRange1.equals((java.lang.Object) "\\u0049");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gbr" + "'", str6, "gbr");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20603");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAA...ANITALIAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAA...ANITALIAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAA...ANITALIAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test20604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20604");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.lang.String str9 = locale0.getScript();
        java.util.Set<java.lang.String> strSet10 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale11 = java.util.Locale.JAPAN;
        java.lang.String str12 = locale0.getDisplayName(locale11);
        java.util.Locale locale13 = null;
        java.lang.String str14 = locale11.getDisplayVariant(locale13);
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
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)" + "'", str12, "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test20605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20605");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0020 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW)", 30, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...N4AO4AQ4AR4AS4AT4A..." + "'", str3, "...N4AO4AQ4AR4AS4AT4A...");
    }

    @Test
    public void test20606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20606");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0038zho                                                                     ", "talian (FRA,Undetermined)", "                                                                                                         German (Germany)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0038zho                                                                     " + "'", str3, "\\u0038zho                                                                     ");
    }

    @Test
    public void test20607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20607");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setExtension('x', "\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00hFranzosischFranzosisch(Frankreich)\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00(\\U0020IITALIAN\\U0020I)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: \\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00hFranzosischFranzosisch(Frankreich)\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00(\\U0020IITALIAN\\U0020I) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test20608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!        (\\U0020,Italifran\347#######################", "en_US                ita                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!        (\\U0020,Italifran\347#######################" + "'", str2, "hi!        (\\U0020,Italifran\347#######################");
    }

    @Test
    public void test20609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test20610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20610");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("HI!", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Franz\366sisch", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "gbr", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc...", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "fRANZ\326SISC", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test20611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("chinois (chine)", "tali...an");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinois (chine)" + "'", str2, "chinois (chine)");
    }

    @Test
    public void test20612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("X", 371);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("talan");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tala" + "'", str1, "tala");
    }

    @Test
    public void test20614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                          inglesehhhhhhhhh                                          ", "))))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          inglesehhhhhhhhh                                          " + "'", str2, "                                          inglesehhhhhhhhh                                          ");
    }

    @Test
    public void test20615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20615");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'G');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand" + "'", str3, "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand" + "'", str4, "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
    }

    @Test
    public void test20616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20616");
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
        java.util.Locale locale24 = builder15.build();
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
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
    }

    @Test
    public void test20617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20617");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("9hhhhhhhhhh                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9hhhhhhhhhh" + "'", str1, "9hhhhhhhhhh");
    }

    @Test
    public void test20618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20618");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinesisch (China)" + "'", str5, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test20619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "Y", "\ud504           fr_FR                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test20620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20620");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '\u6cd5');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u6cd5" + "'", str1, "\\u6cd5");
    }

    @Test
    public void test20621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20621");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 'k');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'i' + "'", char2 == 'i');
    }

    @Test
    public void test20622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\u82f1\u6587", "\\u004e                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u6587" + "'", str2, "\u82f1\u6587");
    }

    @Test
    public void test20623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("FRANZOSISCH(FRANKREICH)", "                             kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRANZOSISCH(FRANKREICH)" + "'", str2, "FRANZOSISCH(FRANKREICH)");
    }

    @Test
    public void test20624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20624");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("CINESE (cINA)", "...hbi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih", 57, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih");
    }

    @Test
    public void test20626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20626");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setExtension('0', "         ITALIAN_italian_eNGLISH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test20627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20627");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("TALIAN_ITALIAN_ENGLISH", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20628");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "             \\u0049             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test20629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
    }

    @Test
    public void test20630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20630");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("               china                                                                                                      ", 73, "it-IT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               china                                                                                                      " + "'", str3, "               china                                                                                                      ");
    }

    @Test
    public void test20631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20631");
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
            java.util.Locale.Builder builder13 = builder11.removeUnicodeLocaleAttribute("anglais (royaume-uni)FRA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: anglais (royaume-uni)FRA [at index 0]");
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
    public void test20632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20632");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("de                                                                                                                      ", (int) 'z', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de                                                                                                                      ##" + "'", str3, "de                                                                                                                      ##");
    }

    @Test
    public void test20633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20633");
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
        java.lang.String str11 = locale9.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italian" + "'", str10, "italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italian" + "'", str11, "italian");
    }

    @Test
    public void test20634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20634");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsine..." + "'", str1, "hhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsineilatihhcsine...");
    }

    @Test
    public void test20635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20635");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("itTAiT_ITA");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061", strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("France", (java.lang.Object[]) strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("e                               e                   ", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 6 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "itChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TAChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)iChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)_Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)ITA" + "'", str7, "itChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TAChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)iChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)_Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)ITA");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance..." + "'", str11, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...");
    }

    @Test
    public void test20636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20636");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0048", "iTALIAN                                                                 ", 72);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("R", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0048" + "'", str5, "\\u0048");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "R" + "'", str9, "R");
    }

    @Test
    public void test20637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20637");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20638");
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
        java.lang.String str31 = locale19.getVariant();
        java.lang.String str32 = locale19.getDisplayScript();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Englisch" + "'", str20, "Englisch");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "!IH" + "'", str21, "!IH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale28.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test20639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20639");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("FRZ\326CZ(FRKREC)", 66, '\ud504');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRZ\326\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504" + "'", str3, "FRZ\326\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504");
    }

    @Test
    public void test20640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20640");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('.');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character . is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20641");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("FRANCESE (cANADA)", "China");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20642");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hzhzhzhzhz", "eAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", (int) 'B');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20643");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test20644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhfrancese (Canada)", 'g');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhfrancese (Canada)" + "'", str2, "...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhfrancese (Canada)");
    }

    @Test
    public void test20645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20645");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setScript("IT44444444444444444EN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: IT44444444444444444EN [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test20646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20646");
        java.util.Locale locale1 = new java.util.Locale("\\u0020hi!       _\\U0020_Italienisch################");
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0020hi!       _\\u0020_italienisch################");
    }

    @Test
    public void test20647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20647");
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
        java.lang.String str72 = locale47.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
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
        org.junit.Assert.assertEquals(locale33.toString(), "de");
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
    public void test20648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20648");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA", "hI!       ", (int) ' ');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                     fran\347ais (france)                                      ");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                               English(UnitedKingdom)                               ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test20649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20649");
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
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.getDefault(category27);
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = locale29.getDisplayName(locale30);
        java.util.Locale.setDefault(category27, locale30);
        java.util.Locale.Category category33 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale34 = java.util.Locale.getDefault(category33);
        java.lang.String str36 = locale34.getExtension('x');
        java.util.Locale.setDefault(category27, locale34);
        java.util.Locale.Builder builder38 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder39 = builder38.clearExtensions();
        java.util.Locale.Builder builder41 = builder38.setLanguageTag("Italian");
        java.util.Locale locale42 = java.util.Locale.PRC;
        java.lang.String str43 = locale42.getDisplayName();
        java.util.Locale.Builder builder44 = builder38.setLocale(locale42);
        java.util.Locale.Builder builder45 = builder44.clear();
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder47 = builder45.setLocale(locale46);
        java.lang.String str48 = locale46.getDisplayName();
        java.util.Locale.setDefault(category27, locale46);
        java.util.Set<java.lang.String> strSet50 = locale46.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet50);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + category27 + "' != '" + java.util.Locale.Category.FORMAT + "'", category27.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "allemand" + "'", str31, "allemand");
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.FORMAT + "'", category33.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_CA");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "chinois (Chine)" + "'", str43, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "cor\351en" + "'", str48, "cor\351en");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(strList51);
    }

    @Test
    public void test20650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20650");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHINESE", "kkkkkkkkkkkkkkkkkkkk)dnk(hcsis\366znrfkkkkkkkkkkkkkkkkkkkk", (int) 'd');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20651");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Franz\366sisch", " ", 104);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0061ItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalif", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'H');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Franz\366sisch" + "'", str5, "Franz\366sisch");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Franz\366sisch" + "'", str8, "Franz\366sisch");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Franz\366sisch" + "'", str11, "Franz\366sisch");
    }

    @Test
    public void test20652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20652");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) 'G');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void test20653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20653");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Deutscd", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", 163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20654");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test20655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20655");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap48);
        java.util.Locale locale50 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet51 = locale50.getExtensionKeys();
        java.lang.String str52 = locale50.getVariant();
        java.lang.String str53 = locale50.getDisplayName();
        java.lang.String str54 = locale50.getCountry();
        java.util.Set<java.lang.String> strSet55 = locale50.getUnicodeLocaleKeys();
        java.lang.String str56 = java.util.Locale.lookupTag(languageRangeList49, (java.util.Collection<java.lang.String>) strSet55);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.util.Locale.FilteringMode filteringMode68 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strList66, filteringMode68);
        java.util.Locale.FilteringMode filteringMode70 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, (java.util.Collection<java.lang.String>) strList66, filteringMode70);
        java.util.Collection<java.util.Locale> localeCollection72 = null;
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, localeCollection72);
        java.util.Locale locale74 = java.util.Locale.lookup(languageRangeList49, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale locale75 = java.util.Locale.lookup(languageRangeList46, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList46, strMap76);
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
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it");
        org.junit.Assert.assertNotNull(charSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "italien" + "'", str53, "italien");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + filteringMode68 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode68.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertTrue("'" + filteringMode70 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode70.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertNull(locale74);
        org.junit.Assert.assertNull(locale75);
        org.junit.Assert.assertNotNull(languageRangeList77);
    }

    @Test
    public void test20656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("RoADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni", "FR-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20657");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FR" + "'", str1, "FR");
    }

    @Test
    public void test20658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20658");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine...", "Eg");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHH" + "'", str1, "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHH");
    }

    @Test
    public void test20660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20660");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d  \\\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d", "                                                                                                         German (Germany)", (int) 'n');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20661");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "00000000000000coreen (Coree du Sud)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHH", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ti_NAILATI         HHHHHHHHailahsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_n" + "'", str2, "ti_NAILATI         HHHHHHHHailahsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_n");
    }

    @Test
    public void test20663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20663");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        java.util.Locale locale9 = new java.util.Locale("en");
        boolean boolean10 = locale9.hasExtensions();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        java.lang.String str12 = locale6.getDisplayCountry(locale9);
        java.util.Locale locale14 = new java.util.Locale("en");
        boolean boolean15 = locale14.hasExtensions();
        java.lang.String str16 = locale9.getDisplayCountry(locale14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.lowerCase("Frnz\366sisch (Knd)", locale9);
        java.util.Set<java.lang.Character> charSet18 = locale9.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "France" + "'", str12, "France");
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "frnz\366sisch (knd)" + "'", str17, "frnz\366sisch (knd)");
        org.junit.Assert.assertNotNull(charSet18);
    }

    @Test
    public void test20664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20664");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Allemagne", "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20666");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                 \\u0069hhhhhhhhhh                 ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test20667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 ", " Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 " + "'", str2, "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 ");
    }

    @Test
    public void test20668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                            fr_FR                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                            FR_fr                  " + "'", str1, "                                                                            FR_fr                  ");
    }

    @Test
    public void test20669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20669");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("           e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ", (int) 'k', (int) 'F');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20670");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Chinesischitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoit");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinesischitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoit" + "'", str2, "Chinesischitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoit");
    }

    @Test
    public void test20671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla", 'N');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla" + "'", str2, "#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla");
    }

    @Test
    public void test20672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20672");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str1, "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test20673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaabaGafakamanarasavayazbabGbgbhbibmbn...", "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaabaGafakamanarasavayazbabGbgbhbibmbn..." + "'", str2, "aaabaGafakamanarasavayazbabGbgbhbibmbn...");
    }

    @Test
    public void test20674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20674");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                          ...", "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20676");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!       ", (double) 89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=89.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20677");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Chinesisch (Ch", "                                                                                           u0020italianitalianitalianitali");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20678");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.removeUnicodeLocaleAttribute("RA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: RA [at index 0]");
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
    public void test20679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20679");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20680");
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
        java.lang.String str19 = locale9.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "deutsch");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italy" + "'", str4, "Italy");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fr_FR" + "'", str19, "fr_FR");
    }

    @Test
    public void test20681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20681");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\0020iTALIANiTALIANiTALIANiTAL", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20682");
        java.util.Locale locale2 = new java.util.Locale("iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "\\u005");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale2.toLanguageTag();
        org.junit.Assert.assertEquals(locale2.toString(), "iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn_\\U005");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str3, "iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
    }

    @Test
    public void test20683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20683");
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
        java.util.Locale locale38 = new java.util.Locale("", "");
        java.util.Locale locale39 = java.util.Locale.FRENCH;
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.lang.String str41 = locale40.getDisplayCountry();
        java.lang.String str42 = locale39.getDisplayVariant(locale40);
        java.lang.String str43 = locale39.getDisplayCountry();
        java.lang.String str44 = locale39.getScript();
        java.lang.String str45 = locale39.getScript();
        java.lang.String str46 = locale38.getDisplayCountry(locale39);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.upperCase("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAh", locale39);
        java.lang.String str48 = locale33.getDisplayLanguage(locale39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = locale33.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for                                      franc?ais (france)                                      ");
        } catch (java.util.MissingResourceException e) {
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
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "inglese" + "'", str20, "inglese");
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
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH" + "'", str47, "HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "                                     fran\347ais (france)                                      " + "'", str48, "                                     fran\347ais (france)                                      ");
    }

    @Test
    public void test20684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "\\u0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN" + "'", str2, "iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
    }

    @Test
    public void test20685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20685");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\83RA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20686");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("italieital");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italieital");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("cCCCC...", (int) '2', '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000cCCCC...000000000000000000000" + "'", str3, "000000000000000000000cCCCC...000000000000000000000");
    }

    @Test
    public void test20688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("zhAzhzhzhzhzhzhzhzhzhzh", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test20689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("eee", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eee" + "'", str2, "eee");
    }

    @Test
    public void test20690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20690");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("1\\u0061\\u0061\\u0061");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\U0061\\U0061\\U0061" + "'", str1, "1\\U0061\\U0061\\U0061");
    }

    @Test
    public void test20691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20691");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder0.setExtension('h', "zho                                                                    \\u0020italianitalianitalianitali");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: zho                                                                    \\u0020italianitalianitalianitali [at index 0]");
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
    }

    @Test
    public void test20692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20692");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                ESELGNI                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20693");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("italien (Italie)", "Royaume-Uniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20694");
        java.util.Locale locale4 = new java.util.Locale("\\u00de\\u00", "Francia", "nglish (united kingdom)");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("\u30a4\u30bf\u30ea\u30a2\u8a9e", locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "\\u00de\\u00_FRANCIA_nglish (united kingdom)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str5, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
    }

    @Test
    public void test20695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20695");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("E             g                          ", "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", (int) 'z');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "n,eng\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\ualian (italiait");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("en", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test20696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20696");
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
        java.lang.String str23 = locale12.getISO3Country();
        java.lang.String str24 = locale12.toString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "italian" + "'", str24, "italian");
    }

    @Test
    public void test20697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20697");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italienisch#########################################################################################" + "'", str1, "Italienisch#########################################################################################");
    }

    @Test
    public void test20698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20698");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "german (germany)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20699");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("TALIAN\\U0023", 'd');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TALIAN\\U0023" + "'", str3, "TALIAN\\U0023");
    }

    @Test
    public void test20700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20700");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!_\\U0020_Itle########################################################################################", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################################################" + "'", str2, "#######################################################################");
    }

    @Test
    public void test20702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20702");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale4);
        java.util.Set<java.lang.Character> charSet7 = locale4.getExtensionKeys();
        java.lang.String str8 = locale0.getDisplayLanguage(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!IH" + "'", str6, "!IH");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English" + "'", str8, "English");
    }

    @Test
    public void test20703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20703");
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
        java.lang.String str42 = locale36.getCountry();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Chinese (China)" + "'", str37, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zho" + "'", str39, "zho");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "CN" + "'", str42, "CN");
    }

    @Test
    public void test20704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20704");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Chinese (Taiwan)", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20705");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('I', (int) '\n');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test20706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("adaeafagaialamanaoaqarasatauawaxazbabbbdEEEEEEEEEFRAEEEEEEEEEcdcfcgchcickclcmcncocrcucvcwcxcyczded...", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cvcwcxcyczded...uawaxazbabbbdEEEEEEEEEFRAEEEEEEEEEcdcfcgchcickclcmcncocrcuadaeafagaialamanaoaqarasata" + "'", str2, "cvcwcxcyczded...uawaxazbabbbdEEEEEEEEEFRAEEEEEEEEEcdcfcgchcickclcmcncocrcuadaeafagaialamanaoaqarasata");
    }

    @Test
    public void test20707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20707");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 'B');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                 KOREAN (SOUTH KOREA)", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test20708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20708");
        java.util.Locale locale1 = new java.util.Locale("\\u0068");
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.util.Locale locale9 = builder8.build();
        java.lang.String str10 = locale1.getDisplayVariant(locale9);
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0068");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French (Canada)" + "'", str7, "French (Canada)");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test20709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20709");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                 it", (java.lang.CharSequence) "U00\\U0034\\U00                                             HCSTUD                                             \\U0034");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test20710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20710");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\u610f\u5927\u5229", 53, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u610f\u5927\u5229" + "'", str3, "\u610f\u5927\u5229");
    }

    @Test
    public void test20711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20711");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("TALIAN", "TALIAN\\u0023", "i\\u0020iTALIANiTALIANiTALIANiTALIit         \\     ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TALIAN" + "'", str4, "TALIAN");
    }

    @Test
    public void test20712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20712");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) 'N');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA                        " + "'", str2, "                       r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA                        ");
    }

    @Test
    public void test20713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20713");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("       iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str1, "iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test20714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20714");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("ITTAIT_ITALIAN_EGAISH          ", (int) '\u671d', 56);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test20715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20715");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "fr-ca");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20716");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str4 = locale1.getExtension('F');
        java.lang.String str5 = locale1.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de" + "'", str5, "de");
    }

    @Test
    public void test20717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("CCCC\\CCCC                                                       ", 102);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCC\\CCCC                                                       " + "'", str2, "CCCC\\CCCC                                                       ");
    }

    @Test
    public void test20718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("FRA", "\\u002", "E             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRA" + "'", str3, "FRA");
    }

    @Test
    public void test20719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20719");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\AuA0046", 241, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20720");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("U00\\U0034\\U00                                             HCSTUD                                             \\U0034", "    ...EnglishEn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("000000000000000000000000000000000000000000000FRANZ\326SISCH0000000000000000000000000000000000000000000000", "                                                                                                    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000000000000000000000000000000000000000000000FRANZ\326SISCH0000000000000000000000000000000000000000000000" + "'", str2, "000000000000000000000000000000000000000000000FRANZ\326SISCH0000000000000000000000000000000000000000000000");
    }

    @Test
    public void test20722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("nglish (United Kingdom)french (NC_HZ)", "  \\u007a555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nglish (United Kingdom)french (NC_HZ)" + "'", str2, "nglish (United Kingdom)french (NC_HZ)");
    }

    @Test
    public void test20723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20723");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("EN_US", "....................................................................................... (italian,english)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20724");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Euguush", "HI!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Euguush" + "'", str2, "Euguush");
    }

    @Test
    public void test20726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r              Deutsch", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20727");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Italia                                                  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test20728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("nc_HZ", "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20729");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("ITTAIT_ITALIAN_EGAISH                                                                                ", 395, 104);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITTAIT_ITALIAN_EGAISH                                                                                " + "'", str3, "ITTAIT_ITALIAN_EGAISH                                                                                ");
    }

    @Test
    public void test20730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20730");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                 ", "ecanadaGcanadacanadaSH                                                                                                   ", "                                       \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test20731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20731");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ADA\\AFAGA0A5AMANAOAQARASA6A0AWAXAZBABBBDB\\BFBGBHB0BJB5BMBNBOBQBRBSB6BVBWBYBZCACCCDCFCGCHC0CKC5CMCNCOCRC0CVCWCXCYCZD\\Dh...", "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADA\\A\\AGA0A5AMANAOAQARASA6A0AWAXAZBABBBDB\\B\\BGBHB0BJB5BMBNBOBQBRBSB6BVBWBYBZCACCCDC\\CGCHC0CKC5CMCNCOCRC0CVCWCXCYCZD\\D\\..." + "'", str3, "ADA\\A\\AGA0A5AMANAOAQARASA6A0AWAXAZBABBBDB\\B\\BGBHB0BJB5BMBNBOBQBRBSB6BVBWBYBZCACCCDC\\CGCHC0CKC5CMCNCOCRC0CVCWCXCYCZD\\D\\...");
    }

    @Test
    public void test20732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20732");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!       _\\u0020_iTALIENISCH####################################################################...", "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20733");
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
        java.util.Locale locale89 = java.util.Locale.US;
        java.lang.String str90 = locale89.toLanguageTag();
        java.util.Set<java.lang.String> strSet91 = locale89.getUnicodeLocaleKeys();
        java.lang.String str92 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet91);
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
// flaky:         org.junit.Assert.assertEquals("'" + str75 + "' != '" + "italien" + "'", str75, "italien");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "italien" + "'", str79, "italien");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(locale84);
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode86.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNull(locale88);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "en-US" + "'", str90, "en-US");
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNull(str92);
    }

    @Test
    public void test20734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20734");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca (                                      )hsilgne,nailati( )", "\\U002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20735");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("R0                                               nailati             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "r0                                               nailati             " + "'", str1, "r0                                               nailati             ");
    }

    @Test
    public void test20736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20736");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setRegion("44444444444444444444444444444444444444444444it                   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 44444444444444444444444444444444444444444444it                    [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "italian");
    }

    @Test
    public void test20737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20737");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = new java.util.Locale("\\u005c");
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale5);
        java.lang.String str7 = locale5.getVariant();
        java.lang.String str8 = locale3.getDisplayScript(locale5);
        java.lang.String str10 = locale3.getExtension('C');
        boolean boolean11 = locale3.hasExtensions();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale3.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "franz\366sisch (frankreich)" + "'", str6, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "\\u005c");
    }

    @Test
    public void test20738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            " + "'", str1, "            ");
    }

    @Test
    public void test20739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20739");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...cccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoan...", "FRNZ\326SISCH (KND)", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20740");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("8ian\\u0020i86");
        java.lang.String str3 = locale2.getVariant();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("nglish (United Kingdom)", locale2);
        java.util.Locale locale5 = locale2.stripExtensions();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale10.getISO3Country();
        java.util.Locale.Builder builder12 = builder9.setLocale(locale10);
        java.util.Locale locale13 = builder12.build();
        java.lang.String str14 = locale5.getDisplayVariant(locale13);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nglish (united kingdom)" + "'", str4, "nglish (united kingdom)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CAN" + "'", str11, "CAN");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test20741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx..." + "'", str2, "CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...");
    }

    @Test
    public void test20742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20742");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'E', (int) '8');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test20743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20743");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("      ", 116, 'e');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee      eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str3, "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee      eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test20744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20744");
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
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("8ian\\u0020i86");
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.lang.String str28 = locale26.getExtension('h');
        java.lang.String str29 = locale25.getDisplayScript(locale26);
        java.lang.String str30 = locale25.getISO3Country();
        java.lang.String str31 = locale23.getDisplayVariant(locale25);
        java.lang.String str32 = locale25.getCountry();
        java.util.Set<java.lang.Character> charSet33 = locale25.getExtensionKeys();
        java.lang.String str34 = locale21.getDisplayName(locale25);
        java.lang.String str35 = locale9.getDisplayLanguage(locale21);
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FRA" + "'", str30, "FRA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "FR" + "'", str32, "FR");
        org.junit.Assert.assertNotNull(charSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "French" + "'", str35, "French");
    }

    @Test
    public void test20745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20745");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_CA", "", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test20746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20746");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("ANGLAIS (ROYAUME-UNI)FRA", 0, 220);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ANGLAIS (ROYAUME-UNI)FRA" + "'", str3, "ANGLAIS (ROYAUME-UNI)FRA");
    }

    @Test
    public void test20747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20747");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", 136, 102);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test20748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20748");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) " hi!       _\\U0020...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20749");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'x', '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'x' + "'", char2 == 'x');
    }

    @Test
    public void test20750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20750");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("E             g                          sh", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCC...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("French (Canadad", "de                                                                                                                      ##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French (Canadad" + "'", str2, "French (Canadad");
    }

    @Test
    public void test20752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("erma (ermay)", "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGkorezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20753");
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
        java.lang.String str15 = locale2.getVariant();
        java.lang.String str16 = locale2.getDisplayCountry();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Canada" + "'", str16, "Canada");
    }

    @Test
    public void test20754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20754");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "Italienisch");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        boolean boolean12 = languageRange1.equals((java.lang.Object) strArray10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("x");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test20756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20756");
        char[] charArray10 = new char[] { 'A', 't', '\r', 'f', 'R' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("It_I", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AhzRAhzQAhzOAhzNAh", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ITA", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Chinesisch (China)", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "At\rfR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "At\rfR");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[A, t, \r, f, R]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20757");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test20758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test20759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20759");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setLanguage("a)AAAAAAAAAAAAAAAAAAAAAAAAAAHIAN\\U0020IHa)AAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: a)AAAAAAAAAAAAAAAAAAAAAAAAAAHIAN\\U0020IHa)AAAAAAAAAAAAAAAAAAAAAAAAAA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test20760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20760");
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
        java.util.Locale.Builder builder12 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setScript("\\u0020iTALIANiTALIANiTALIANiTALI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: \\u0020iTALIANiTALIANiTALIANiTALI [at index 0]");
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
    }

    @Test
    public void test20761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20761");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", 20, "h)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR" + "'", str3, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
    }

    @Test
    public void test20762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20762");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!       allemandItalienischallemanditalian_ITALIAN_Eng    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test20763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20763");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.setLanguage("UND");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setExtension('n', "Franzosisch (Frankreich)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Franzosisch (Frankreich) [at index 0]");
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
    }

    @Test
    public void test20764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20764");
        java.util.Locale locale3 = new java.util.Locale("hi!", "English", "");
        java.lang.String str4 = locale3.getDisplayVariant();
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
        java.lang.String str18 = locale7.getScript();
        java.lang.String str19 = locale3.getDisplayLanguage(locale7);
        java.util.Locale locale20 = locale3.stripExtensions();
        java.lang.String str21 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "\\u005c");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "und" + "'", str21, "und");
    }

    @Test
    public void test20765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20765");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test20766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20766");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("n,eng\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\ualian (italiait", "cinese (Cina)\\u0069h...", "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "n,eng\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\ualian (italiait" + "'", str3, "n,eng\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\ualian (italiait");
    }

    @Test
    public void test20767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20767");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("zhazhzhzhzhzhzhzhzhzhzh_UND-CA", "gbr                                                                          ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20768");
        java.util.Locale locale3 = new java.util.Locale("aNIHc", "keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe", "de_DE");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for KEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHE");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "anihc_KEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHEAGAASHE_de_DE");
    }

    @Test
    public void test20769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20769");
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
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder14 = builder11.setLanguageTag("Italian");
        java.util.Locale locale15 = java.util.Locale.PRC;
        java.lang.String str16 = locale15.getDisplayName();
        java.util.Locale.Builder builder17 = builder11.setLocale(locale15);
        java.util.Locale.Builder builder18 = builder17.clear();
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder20 = builder18.setLocale(locale19);
        java.lang.String str21 = locale19.getDisplayName();
        java.util.Locale.setDefault(category0, locale19);
        java.lang.String str23 = locale19.getDisplayVariant();
        java.util.Locale locale27 = new java.util.Locale("\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0...", "Canada", "u005c");
        java.lang.String str28 = locale19.getDisplayLanguage(locale27);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "chinois (Chine)" + "'", str16, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "cor\351en" + "'", str21, "cor\351en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals(locale27.toString(), "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0..._CANADA_u005c");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Korean" + "'", str28, "Korean");
    }

    @Test
    public void test20770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("onailati", "AnihC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "onailati" + "'", str2, "onailati");
    }

    @Test
    public void test20771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20771");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=cccccccccccccanglais(canadaccccccccccccccccccccccccccccccccccccccc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20772");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("fffffffffffff", "ch", "DEUTSCH (DEUTSCHLAND)", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fffffffffffff" + "'", str4, "fffffffffffff");
    }

    @Test
    public void test20773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20773");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("E             g                          sh", "italien", 92);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test20774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20774");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                               italian  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italian" + "'", str1, "italian");
    }

    @Test
    public void test20775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20775");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', 'G');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test20776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20776");
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
        java.lang.String str25 = locale16.getScript();
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder26.clearExtensions();
        java.util.Locale.Builder builder29 = builder26.setLanguageTag("Italian");
        java.util.Locale locale30 = java.util.Locale.PRC;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale.Builder builder32 = builder26.setLocale(locale30);
        boolean boolean33 = locale16.equals((java.lang.Object) locale30);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italian" + "'", str3, "Italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chinese (China)" + "'", str31, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test20777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20777");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI", (int) (short) -1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI" + "'", str3, "ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI");
    }

    @Test
    public void test20778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20778");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test20779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20779");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20780");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getISO3Language();
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for italian");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test20781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e", "en-GB                                                                                                                ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test20782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("EEEEEEEEEEEEE", (int) 'F', "Frnz\366sisch(Knd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Frnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFEEEEEEEEEEEEE" + "'", str3, "Frnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFEEEEEEEEEEEEE");
    }

    @Test
    public void test20783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "...emandtalienischallemandi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\xtalxan_ITALIAN_Englxsh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\xtalxan_ITALIAN_Englxsh" + "'", str1, "\\xtalxan_ITALIAN_Englxsh");
    }

    @Test
    public void test20785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20785");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "Cinese (Cina)\\u0069h..", (int) 'g');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20786");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("2cinese (cina)italianitalianitalianital");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2cinese (cina)italianitalianitalianital" + "'", str1, "2cinese (cina)italianitalianitalianital");
    }

    @Test
    public void test20787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20787");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("##################    \\XTALXAN_gTALgAN_ENGLXSH    ###################", "FRTTAT_ITA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################    \\XTALXAN_gTALgAN_ENGLXSH    ###################" + "'", str2, "##################    \\XTALXAN_gTALgAN_ENGLXSH    ###################");
    }

    @Test
    public void test20788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20788");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u0069CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0069cccccccccccccccccccccccccccccccceGSCHcccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str1, "\\U0069cccccccccccccccccccccccccccccccceGSCHcccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test20789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(" italia", "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " italia" + "'", str2, " italia");
    }

    @Test
    public void test20790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! 5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch" + "'", str1, "hi! 5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch");
    }

    @Test
    public void test20791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("it_I", 25, "anglais (Canada");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais (Cit_Ianglais (Ca" + "'", str3, "anglais (Cit_Ianglais (Ca");
    }

    @Test
    public void test20792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20792");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20793");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("F", "", (int) '\r');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20794");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\\\U0020ITALIANITALIANITALIANITALI", "nglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)", "4444ALLEMAND 4444", 13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\\\U0020ITALIANITALIANITALIANITALI" + "'", str4, "   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\\\U0020ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test20795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20795");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "iTTAIT_ITALIAN_EGAISH          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20796");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("nailati", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale.Builder builder11 = builder8.setLocale(locale9);
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder13 = builder8.setLocale(locale12);
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet14, "ita");
        java.lang.String str17 = java.util.Locale.lookupTag(languageRangeList6, (java.util.Collection<java.lang.String>) strSet14);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale19.getExtension('h');
        java.lang.String str22 = locale18.getDisplayScript(locale19);
        java.util.Locale locale23 = locale18.stripExtensions();
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale24.getLanguage();
        java.lang.String str26 = locale18.getDisplayCountry(locale24);
        java.util.Set<java.lang.String> strSet27 = locale18.getUnicodeLocaleAttributes();
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
        java.lang.String str69 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList66);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap70 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList71 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strMap70);
        java.util.Locale locale72 = java.util.Locale.GERMAN;
        java.util.Locale locale73 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str74 = locale72.getDisplayName(locale73);
        java.util.Locale.Category category75 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale76 = java.util.Locale.getDefault(category75);
        java.lang.String str77 = locale73.getDisplayVariant(locale76);
        java.util.Locale locale78 = locale73.stripExtensions();
        java.util.Locale locale81 = new java.util.Locale("France", "       !IH");
        java.util.Locale locale82 = java.util.Locale.CHINESE;
        java.util.Locale locale83 = java.util.Locale.FRENCH;
        java.lang.String str84 = locale83.getDisplayName();
        java.lang.String str86 = locale83.getExtension('C');
        java.lang.String str87 = locale82.getDisplayLanguage(locale83);
        java.util.Locale.setDefault(locale82);
        java.lang.String str89 = locale81.getDisplayVariant(locale82);
        java.lang.String str90 = locale78.getDisplayVariant(locale82);
        java.util.Set<java.lang.String> strSet91 = locale78.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode92 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList71, (java.util.Collection<java.lang.String>) strSet91, filteringMode92);
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strSet27, filteringMode92);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (Canada)" + "'", str10, "French (Canada)");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "italian");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "italian" + "'", str25, "italian");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "France" + "'", str26, "France");
        org.junit.Assert.assertNotNull(strSet27);
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
        org.junit.Assert.assertNotNull(languageRangeList71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "de");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "allemand" + "'", str74, "allemand");
        org.junit.Assert.assertTrue("'" + category75 + "' != '" + java.util.Locale.Category.FORMAT + "'", category75.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale76);
// flaky:         org.junit.Assert.assertEquals(locale76.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale81.toString(), "france_       !IH");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "zh");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "French" + "'", str84, "French");
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "chinois" + "'", str87, "chinois");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertTrue("'" + filteringMode92 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode92.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(strList94);
    }

    @Test
    public void test20797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20797");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("GENCE", "\\u0041");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 133, "\\u0065                             a)                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0065                             a)                                                                                                " + "'", str3, "\\u0065                             a)                                                                                                ");
    }

    @Test
    public void test20799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20799");
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
        boolean boolean39 = locale5.hasExtensions();
        java.lang.String str40 = locale5.getCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test20800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                   HSadanacadanacGadanacE", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     HSadanacadanacGadanacE" + "'", str2, "                     HSadanacadanacGadanacE");
    }

    @Test
    public void test20801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20801");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777Italian (italian,english");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20802");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                      HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH", 45, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20803");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("FranzosischFranzosisch (Frankreich)", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test20804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20804");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.lang.String str7 = locale3.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test20805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20805");
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
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = locale19.getDisplayName(locale20);
        java.util.Locale.Category category22 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.lang.String str24 = locale20.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = locale25.getDisplayName(locale26);
        java.util.Locale locale28 = java.util.Locale.UK;
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = locale29.getDisplayName(locale30);
        java.util.Locale locale32 = locale29.stripExtensions();
        java.lang.String str33 = locale28.getDisplayVariant(locale29);
        java.lang.String str34 = locale26.getDisplayLanguage(locale29);
        java.lang.String str35 = locale23.getDisplayName(locale26);
        java.lang.String str36 = locale8.getDisplayVariant(locale26);
        java.util.Locale.Category category37 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale38 = java.util.Locale.getDefault(category37);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = locale39.getDisplayName(locale40);
        java.util.Locale.setDefault(category37, locale40);
        java.util.Locale locale45 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category37, locale45);
        java.lang.String str47 = locale45.getCountry();
        java.lang.String str48 = locale26.getDisplayVariant(locale45);
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
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "allemand" + "'", str21, "allemand");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.FORMAT + "'", category22.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "allemand" + "'", str27, "allemand");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "allemand" + "'", str31, "allemand");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Franz\366sisch" + "'", str34, "Franz\366sisch");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "cor\351en (Cor\351e du Sud)" + "'", str35, "cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + category37 + "' != '" + java.util.Locale.Category.FORMAT + "'", category37.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "allemand" + "'", str41, "allemand");
        org.junit.Assert.assertEquals(locale45.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ALLEMAND" + "'", str47, "ALLEMAND");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test20806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20806");
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
        java.util.Locale locale46 = builder9.build();
        boolean boolean48 = locale46.equals((java.lang.Object) "\\u0034\\u00 hcstud \\u0034\\u00");
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
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\uc601\uc5b4" + "'", str32, "\uc601\uc5b4");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "!IH" + "'", str33, "!IH");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale40.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str44, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test20807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20807");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HSAAGAekkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20808");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTAL", "\\u0061", (int) '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "cinese (Cina)");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "E             g");
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("ian\\u0020", strArray5);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("HCSTUED", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2cinese (Cina)iTALIANiTALIANiTALIANiTAL" + "'", str7, "2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2E             giTALIANiTALIANiTALIANiTAL" + "'", str9, "2E             giTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test20809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20809");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "ITALIAN (ITALIAN,ENGLCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR\311ENCOR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test20810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20810");
        java.util.Locale locale3 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale4.toLanguageTag();
        java.util.Locale locale8 = new java.util.Locale("en");
        boolean boolean9 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.lang.String str11 = locale4.getDisplayName(locale8);
        java.lang.String str12 = locale4.getDisplayVariant();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Italienisch#########################################################################################" + "'", str12, "Italienisch#########################################################################################");
    }

    @Test
    public void test20811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "         9hhhhhhhhhh_\\U0078");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20812");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                   ti444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ti444444444" + "'", str1, "ti444444444");
    }

    @Test
    public void test20813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20813");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0020TALIANTALIANTALIANiTALI", 'k');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!       ", "\u82f1\u8a9e");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\U0064", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\U0064" + "'", str7, "\\U0064");
    }

    @Test
    public void test20814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20814");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "\ub3c5\uc77c\uc5b4", "hcsineilati");
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getDisplayName(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ub3c5\uc77c\uc5b4_hcsineilati");
    }

    @Test
    public void test20815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20815");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("eAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Eagaash                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str1, "Eagaash                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test20816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("gggggggEagaashggggggg", "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...", "00000000000000coreen (Coree du Sud)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gggggggEagaashggggggg" + "'", str3, "gggggggEagaashggggggg");
    }

    @Test
    public void test20817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20817");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\u4e2d\u6587                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20818");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                         E    Italien");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20819");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I\\U0020ITALIANITALIANITALIANITALIIT", "hcstued", 67);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I\\U0020ITALIANITALIANITALIANITALIIT" + "'", str5, "I\\U0020ITALIANITALIANITALIANITALIIT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "I\\U0020ITALIANITALIANITALIANITALIIT" + "'", str6, "I\\U0020ITALIANITALIANITALIANITALIIT");
    }

    @Test
    public void test20820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20820");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("italian    ", "Fgence");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'E');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("en", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "N");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italiaE    " + "'", str5, "italiaE    ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test20821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20821");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test20822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20822");
        java.util.Locale locale3 = new java.util.Locale("hi!", "English", "");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale3.getUnicodeLocaleType("FgenceFgenceFgenceFgenceFgenceFgenceFgenc");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: FgenceFgenceFgenceFgenceFgenceFgenceFgenc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ENGLISH" + "'", str5, "ENGLISH");
    }

    @Test
    public void test20823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20823");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "\\u0034\\u00 hcstud \\u0034\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("francesefrancesefrancesefr\\u0075", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 francesefrancesefrancesefr\\u0075                  " + "'", str2, "                 francesefrancesefrancesefr\\u0075                  ");
    }

    @Test
    public void test20825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20825");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ITALIAN_italian_eNGLISH", "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhACor\351e du Sud", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20826");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("French", "eng");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20827");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("CHINESE (CHINA)", 57, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20828");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44d444", "hhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test20829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20829");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("en-CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Deutsch", 'n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deutsch" + "'", str2, "Deutsch");
    }

    @Test
    public void test20832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20832");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("HHH ITALIA", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("              TA...", "AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20834");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale1);
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Locale locale7 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str8 = locale1.getDisplayLanguage(locale7);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale11);
        java.lang.String str15 = locale11.getDisplayName();
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale19.getExtension('h');
        java.lang.String str22 = locale18.getDisplayScript(locale19);
        java.util.Locale locale23 = locale18.stripExtensions();
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category16, locale23);
        java.lang.String str26 = locale11.getDisplayLanguage(locale23);
        java.lang.String str27 = locale7.getDisplayCountry(locale23);
        java.lang.String str28 = locale23.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         italian_italian_english" + "'", str2, "         italian_italian_english");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertEquals(locale7.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese" + "'", str8, "Chinese");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\u0034" + "'", str14, "\\u0034");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "French (Canada)" + "'", str15, "French (Canada)");
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "...anitali");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fran\347ais" + "'", str26, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHHHHHHHH" + "'", str27, "HHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "FR" + "'", str28, "FR");
    }

    @Test
    public void test20835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20835");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fffffffffffff                                                                        ", "KOREAN (SOUTH KOREA)KORE     ", 40);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20836");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', 'k');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test20837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20837");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale9 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str10 = locale1.getDisplayCountry(locale9);
        java.lang.String str11 = locale9.getDisplayName();
        java.lang.String str13 = locale9.getExtension('i');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("iTALIAN                                                                 ", locale9);
        java.lang.String str15 = locale9.getVariant();
        java.util.Locale.setDefault(locale9);
        java.lang.String str17 = locale9.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italienisch#########################################################################################" + "'", str15, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!       " + "'", str17, "hi!       ");
    }

    @Test
    public void test20838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20838");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "AhzRAhzQAhzOAhzNAh", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20839");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!_\\U0020_itle########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20840");
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
        java.lang.String str46 = locale11.getISO3Country();
        java.util.Locale locale47 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet48 = locale47.getExtensionKeys();
        java.lang.String str49 = locale47.getVariant();
        java.lang.String str50 = locale47.getDisplayName();
        java.lang.String str51 = locale47.getDisplayLanguage();
        java.lang.String str52 = locale47.getDisplayCountry();
        java.lang.String str53 = locale11.getDisplayName(locale47);
        java.lang.String str54 = locale11.getVariant();
        java.lang.String str55 = locale11.toString();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it");
        org.junit.Assert.assertNotNull(charSet48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Italian" + "'", str50, "Italian");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Italian" + "'", str51, "Italian");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "italiano" + "'", str53, "italiano");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "it" + "'", str55, "it");
    }

    @Test
    public void test20841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20841");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "it_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20842");
        java.util.Locale locale3 = new java.util.Locale("32AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF", "FRENCH (CANADA)", "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
        org.junit.Assert.assertEquals(locale3.toString(), "32ahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarf             ahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarf             ahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarf             ahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarf_FRENCH (CANADA)_ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
    }

    @Test
    public void test20843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20843");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0038ZHO                          ", " NAILATI             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20844");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         u005c         ", "99999\\u0021");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test20845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20845");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale4 = new java.util.Locale("", "\\u0066");
        java.lang.String str5 = locale0.getDisplayScript(locale4);
        java.lang.String str6 = locale4.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals(locale4.toString(), "_\\U0066");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test20846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20846");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("KorezhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemandn (South Korea)", 115, 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...ARzhASzhAzhzhzhzhzhzhzemandn (South Korea)" + "'", str3, "...ARzhASzhAzhzhzhzhzhzhzemandn (South Korea)");
    }

    @Test
    public void test20847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20847");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("anglais (Cit_Ianglais (Ca", 200, 104);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais (Cit_Ianglais (Ca" + "'", str3, "anglais (Cit_Ianglais (Ca");
    }

    @Test
    public void test20848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20848");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Engliscu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eNGLISCU" + "'", str1, "eNGLISCU");
    }

    @Test
    public void test20849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20849");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada", "                 francesefrancesefrancesefr\\u0075                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20850");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("und", 16, "                                                 inglese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             und" + "'", str3, "             und");
    }

    @Test
    public void test20851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20851");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("Italienisch", '\u671d');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'I' + "'", char2 == 'I');
    }

    @Test
    public void test20852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20852");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh", "9hhhhhhhhhh 9hhhhhhhhhh", 537);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20853");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ko", '\\');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chinesisch (China", "hi!       ", (int) 'H');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "Italienisch#########################################################################################");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A", strArray6, strArray10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("2cinese (Cina...", strArray3, strArray10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinesisch (China" + "'", str12, "Chinesisch (China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2cinese (Cina..." + "'", str14, "2cinese (Cina...");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ko" + "'", str15, "ko");
    }

    @Test
    public void test20854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20854");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("2CINESE (CINA...", "...\r\r\r\r\r\r\r\r..", 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20855");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'x', 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test20856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20856");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                          FRANCESE (CANADA)                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test20857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20857");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                             de_de                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             de_de                                             " + "'", str1, "                                             de_de                                             ");
    }

    @Test
    public void test20858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0020iItalian\\u0020i                                                 ", "rnz\366sisch(Knd                                                                                                                                                                                                               ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test20859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20859");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('D');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20860");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\ud504\ub791\uc2a4HI!(\\U0020,ITALIENISCH#########################################################################################)", "it-IT", "Korean (South Korea)Korean (Songlish ...Korean (South Korea)Korean (So", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ud504\ub791\uc2a4HI!(\\U0020,ITALIENISCH#########################################################################################)" + "'", str4, "\ud504\ub791\uc2a4HI!(\\U0020,ITALIENISCH#########################################################################################)");
    }

    @Test
    public void test20861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20861");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getScript();
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale6);
        java.lang.String str10 = locale6.getExtension('x');
        java.lang.String str11 = locale0.getDisplayScript(locale6);
        java.lang.String str12 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!IH" + "'", str8, "!IH");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test20862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)", "Franz\366sisch (KanadaFranz\366sisch (KanadaFranz\366sischGerma");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)" + "'", str2, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)");
    }

    @Test
    public void test20863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20863");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("kor", "                                             hcstued", (int) '\u671d');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20864");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.lang.String str5 = locale1.getExtension('x');
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.lang.String str9 = locale1.getDisplayScript(locale8);
        java.util.Locale.setDefault(locale8);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test20865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20865");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("G", "TTAT_ITA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("     e                               e                               e            ", "gERMAN (gERMANY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     e                               e                               e" + "'", str2, "     e                               e                               e");
    }

    @Test
    public void test20867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL", "hhhhhhhhhhhhhran\347aisa(France)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL" + "'", str2, "NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL");
    }

    @Test
    public void test20868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20868");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
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
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale locale33 = builder32.build();
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str36 = locale33.getDisplayLanguage(locale35);
        java.lang.String str37 = locale20.getDisplayVariant(locale33);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.upperCase("Korean", locale20);
        java.util.Locale locale40 = new java.util.Locale("hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
        java.lang.String str41 = locale20.getDisplayScript(locale40);
        java.util.Locale.Builder builder42 = builder0.setLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder44 = builder42.setVariant("titititititit");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: titititititit [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
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
        org.junit.Assert.assertEquals(locale19.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
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
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "KOREAN" + "'", str38, "KOREAN");
        org.junit.Assert.assertEquals(locale40.toString(), "hi!       allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...allemand\\u0034allemandhi!allemanditalianallemand\\u0061allemand\\u0023allemandhi!allemanditalianallemandchinese (china)allemandhi!allemandzh_cnallemanditalianallemandenallemanditalienisch");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test20869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20869");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test20870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444ALLEMAND 4444", 374, "                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                     4444ALLEMAND 4444" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                     4444ALLEMAND 4444");
    }

    @Test
    public void test20871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20871");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Hi!       _\\U0020_Italienisch####################################################################          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20872");
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
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        java.lang.String str17 = locale16.getDisplayScript();
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "iTALIAN", (int) '#');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray21, 'e');
        boolean boolean24 = locale16.equals((java.lang.Object) str23);
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
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HI!" + "'", str23, "HI!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test20873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("ccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ccccccccccccccccccccccccccccccccccccccccccccc" + "'", str1, "ccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test20874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20874");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0039", "NC_HZ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("Chinesisch", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test20875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20875");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20876");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("United State                                                                                     ", "8600u\\                                 hsiAgE_NAILATI_TiATti8600u\\                     nglish (United Kingdom)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu", 314);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20878");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ')', 'b');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ')' + "'", char2 == ')');
    }

    @Test
    public void test20879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20879");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aitaitaitaitaitaitaitaitaita", "                                          hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20880");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test20881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20881");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("italian_ITALIAN_EnglisF", "anglais (Royaume-Uni)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20882");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Regno Unito", "FRANZ\326SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Regno Unito" + "'", str3, "Regno Unito");
    }

    @Test
    public void test20883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20883");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.setUnicodeLocaleKeyword("ALLEMAND", "hIAN\\U0020Ihi");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ALLEMAND [at index 0]");
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
    public void test20884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20884");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("AN\\U00FFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'A' + "'", char1 == 'A');
    }

    @Test
    public void test20885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20885");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("FRANZ\326SISCH\n(FRANKREICH)", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20886");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("fr_CA", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                     ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("         ", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr_CA" + "'", str4, "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr_CA" + "'", str5, "fr_CA");
    }

    @Test
    public void test20887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20887");
        java.util.Locale locale1 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranz\326sisch\n(frankreich)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals(locale1.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranz\326sisch\n(frankreich)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test20888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20888");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("         R", "", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test20889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20889");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             ", 17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...N4AO4AQ4AR4AS4AT4A...", "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...N4AO4AQ4AR4AS4AT4A..." + "'", str2, "...N4AO4AQ4AR4AS4AT4A...");
    }

    @Test
    public void test20891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20891");
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
        java.util.Locale locale31 = new java.util.Locale("\\u005c");
        java.util.Locale locale33 = java.util.Locale.CHINESE;
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale33);
        java.lang.String str35 = locale33.getVariant();
        java.lang.String str36 = locale31.getDisplayScript(locale33);
        java.lang.String str38 = locale31.getExtension('C');
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.lowerCase("italian (ITALIAN,English)", locale31);
        java.lang.String str40 = locale0.getDisplayVariant(locale31);
        java.lang.String str41 = locale31.getDisplayLanguage();
        java.util.Locale locale43 = new java.util.Locale("DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061");
        java.lang.String str44 = locale43.getISO3Country();
        java.lang.String str45 = locale43.getCountry();
        java.lang.String str46 = locale31.getDisplayLanguage(locale43);
        java.lang.String str47 = locale31.toString();
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
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
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
        org.junit.Assert.assertEquals(locale31.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "franz\366sisch (frankreich)" + "'", str34, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "italian (italian,english)" + "'", str39, "italian (italian,english)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\u005c" + "'", str41, "\\u005c");
        org.junit.Assert.assertEquals(locale43.toString(), "deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\\u005c" + "'", str46, "\\u005c");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\\u005c" + "'", str47, "\\u005c");
    }

    @Test
    public void test20892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test20893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20893");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("NNNNNNNNNNNNNNNNNN                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test20894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20894");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "2E             GITALIANITALIANITALIANITAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test20895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20895");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\u0035", "nailatiko");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Chine)", "\\u0044");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0044" + "'", str2, "\\u0044");
    }

    @Test
    public void test20897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaAnihCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAC", "\\u00de\\u00\\u\\u00de\\u00\\u", "                                                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaAnihCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAC" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaAnihCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAC");
    }

    @Test
    public void test20898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh" + "'", str1, "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test20899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20899");
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
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList25, filteringMode27);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList25, filteringMode29);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList37, filteringMode39);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        java.util.Locale.FilteringMode filteringMode71 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strList69, filteringMode71);
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList61, filteringMode71);
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList61);
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList61, filteringMode75);
        java.lang.String str78 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList61, 'd');
        java.lang.String str80 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList61, "2ITALIANITALIANITALIANITAL");
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList61);
        java.lang.String str83 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList81, "SUen_");
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
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode27.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode29.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode39.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + filteringMode71 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode71.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode75.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch" + "'", str78, "hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch" + "'", str80, "hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch");
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "en" + "'", str83, "en");
    }

    @Test
    public void test20900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20901");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("-RF", 'c');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '-' + "'", char2 == '-');
    }

    @Test
    public void test20902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                  \\u0068");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                  \\U0068" + "'", str1, "                                                                                                                  \\U0068");
    }

    @Test
    public void test20903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20903");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Chinesisch", "4");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "rankreich)00      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Rankreich)00      " + "'", str1, "Rankreich)00      ");
    }

    @Test
    public void test20905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20905");
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
        java.lang.Object obj11 = locale6.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italien" + "'", str5, "italien");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "inglese" + "'", str8, "inglese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "it");
    }

    @Test
    public void test20906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20906");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u0034\\u00                                             h!ih                            dallemanstuD                                             \\u0034\\u00", "inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20907");
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
        java.lang.Object obj19 = locale15.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
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
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
    }

    @Test
    public void test20908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20908");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("inglesehhhhhhhhh");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglesehhhhhhhhh" + "'", str2, "inglesehhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "inglesehhhhhhhhh" + "'", str3, "inglesehhhhhhhhh");
    }

    @Test
    public void test20909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("anglais", 223);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                            anglais                                                                                                            " + "'", str2, "                                                                                                            anglais                                                                                                            ");
    }

    @Test
    public void test20910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20910");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!       ", "zH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", 101);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20911");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                                                                                     englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ko_KR", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCC...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko_KR" + "'", str2, "ko_KR");
    }

    @Test
    public void test20913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20913");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\u0029fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0029fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran" + "'", str1, "\\u0029fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran");
    }

    @Test
    public void test20914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20914");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("....................................................................................... (italian,english)", 52, (int) '\u671d');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "................................... (italian,english)" + "'", str3, "................................... (italian,english)");
    }

    @Test
    public void test20915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20915");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("en_US                ita                ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\u0020_itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 804);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en_US                ita                " + "'", str3, "en_US                ita                ");
    }

    @Test
    public void test20916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20916");
        java.util.Locale locale2 = new java.util.Locale("", "");
        boolean boolean3 = locale2.hasExtensions();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder8 = builder6.setScript("");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder13 = builder10.removeUnicodeLocaleAttribute("francese");
        boolean boolean14 = locale2.equals((java.lang.Object) builder10);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20917");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("iTALIAN", 66);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20918");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("TALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         italian_ITALIAN_EnglisF");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20919");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('2');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test20920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20920");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "ZH_cn", 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cn" + "'", str3, "ZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cn");
    }

    @Test
    public void test20921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065", "                                             hcsfr-CueD                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065" + "'", str2, "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065");
    }

    @Test
    public void test20922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20922");
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
            java.util.Locale.Builder builder30 = builder27.setUnicodeLocaleKeyword("\r\rneilatI    E\r\r", "\\u0034\\u00                                             hcstueD                                             \\u0034\\u00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ??neilatI    E?? [at index 0]");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italian" + "'", str7, "Italian");
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
    public void test20923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish" + "'", str1, "hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
    }

    @Test
    public void test20924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20924");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("uuuuu", "                                                      Englisch                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test20925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20925");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("ANGLAIS (R                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ANGLAIS (R                                                                                                                     " + "'", str1, "ANGLAIS (R                                                                                                                     ");
    }

    @Test
    public void test20926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20926");
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
        java.lang.String str30 = locale0.getDisplayScript();
        java.util.Set<java.lang.String> strSet31 = locale0.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertEquals(locale16.toString(), "");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test20927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20927");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(".................................Italian (Italy)", "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKI", 163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20928");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC", 9, "I\\U0020ITALIANITALIANITALIANITALIIT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test20929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20929");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR", "TALIAN_italian_eNGLISH         ITAL");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRFRFRFRFRFRFRFRFRFRFRFRFdDEFRFRFRFRFRFRFRFRFRFRFRFRFR" + "'", str3, "FRFRFRFRFRFRFRFRFRFRFRFRFdDEFRFRFRFRFRFRFRFRFRFRFRFRFR");
    }

    @Test
    public void test20930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20930");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e", 74, "aNCHc");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e" + "'", str3, "e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e");
    }

    @Test
    public void test20931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20931");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                        ", "\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                        " + "'", str3, "                                                                        ");
    }

    @Test
    public void test20932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20932");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Chinesischitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoit", "HCSINEI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20933");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222allemand22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222", "4444444FRA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\HI!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\", "ADAEAFAGAI\\u0034\\u00                                             hcstueD                                             \\u0034\\u00XAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...", "LHcsineilat");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test20935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20935");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...hbi...", "  aNIHc   ", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test20936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20936");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHH", "Cor\351e du Sud");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test20937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                            fr_FR                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                            fr_FR                  " + "'", str1, "                                                                            fr_FR                  ");
    }

    @Test
    public void test20938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20938");
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = locale1.stripExtensions();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHI!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN" + "'", str5, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHI!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
    }

    @Test
    public void test20939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20939");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("8ian\\u0020i86", "                                                               \\U002");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test20940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20940");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!ih                            dalleman", 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20941");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "cor\351en (Cor\351e du Sud)", (java.lang.CharSequence) "EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20942");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\u0059", (java.lang.CharSequence) "hi!        (\\U0020,Italienisch#####Franzosisch (Kanada)##############################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20943");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "ITALIENISC", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "ITALIENISC" + "'", charSequence2, "ITALIENISC");
    }

    @Test
    public void test20944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20944");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("TALIAN\\u002", 574, "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRTALIAN\\u002" + "'", str3, "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRTALIAN\\u002");
    }

    @Test
    public void test20945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaAnihCaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                       \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaAnihCaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaAnihCaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test20946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20946");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...emandtalienischallemandi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20947");
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
        java.util.Locale locale13 = new java.util.Locale("\\U0078");
        java.lang.String str14 = locale13.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.setLocale(locale13);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: \\u0078 [at index 0]");
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
        org.junit.Assert.assertEquals(locale13.toString(), "\\u0078");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test20948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("1\\u0061\\u0061\\u0061", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20949");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder1.setLanguageTag("\\u0030");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: \\u0030 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test20950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20950");
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
        java.lang.String str39 = locale32.getScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test20951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20951");
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
        java.util.Locale.setDefault(locale7);
        java.lang.String str17 = locale7.getCountry();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FR" + "'", str17, "FR");
    }

    @Test
    public void test20952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20952");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "tenenco");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20953");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '!', 537);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 537 + "'", int2 == 537);
    }

    @Test
    public void test20954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20954");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC##############\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=cccccccccccccccccccccccccccccccccccccccccccccccccccc##############????????????????????????????????????????????????frn");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20955");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..                                                          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallemand", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test20956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ttttttttttttttttttttt                                                                                                              ITALIEITALtttttttttttttttttttttt", "Ital");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ttttttttttttttttttttt                                                                                                              ITALIEITALtttttttttttttttttttttt" + "'", str2, "ttttttttttttttttttttt                                                                                                              ITALIEITALtttttttttttttttttttttt");
    }

    @Test
    public void test20957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20957");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder6.setRegion("i\\u0020iTALIANiTALIANiTALIANiTALIit         \\     ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: i\\u0020iTALIANiTALIANiTALIANiTALIit         \\      [at index 0]");
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
    }

    @Test
    public void test20958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20958");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("KOR");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test20959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20959");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 103, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20960");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "\\u0066", 0);
        java.lang.String[] strArray5 = java.util.Locale.getISOCountries();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4", strArray4, strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\\U0078");
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str6, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str7, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test20961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20961");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIAN", '\u6cd5');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20962");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test20963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20963");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str5 = locale2.getExtension('C');
        java.lang.String str6 = locale1.getDisplayLanguage(locale2);
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale.setDefault(locale9);
        java.lang.String str11 = locale7.getDisplayCountry(locale9);
        java.lang.String str12 = locale7.getVariant();
        java.lang.String str13 = locale1.getDisplayScript(locale7);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("                                                               \\U002", locale1);
        java.lang.String str15 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais" + "'", str3, "fran\347ais");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chinois" + "'", str6, "chinois");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                               \\u002" + "'", str14, "                                                               \\u002");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh" + "'", str15, "zh");
    }

    @Test
    public void test20964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20964");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Chinese (China)", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", "x");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444!IH", strArray3, strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 395, 8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'c');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44444444444444444444444444444444!IH" + "'", str8, "44444444444444444444444444444444!IH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HI!" + "'", str14, "HI!");
    }

    @Test
    public void test20965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20965");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "i\\u0020iTALIANiTALIANiTALIANiTALIit         \\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("talian (FRA,Undetermined)", "nihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "talian (FRA,Undetermined)" + "'", str2, "talian (FRA,Undetermined)");
    }

    @Test
    public void test20967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20967");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("                                                                                                                                                                                                     englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)");
        java.lang.String str2 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20968");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("x", 'F');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20969");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("Italien");
        java.util.Locale.Builder builder7 = builder3.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder3.clear();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.util.Locale locale13 = locale10.stripExtensions();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("KorezhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemandn (South Korea)", locale13);
        java.util.Locale.Builder builder15 = builder8.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.setExtension('f', "nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati [at index 0]");
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "allemand" + "'", str12, "allemand");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "korezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)" + "'", str14, "korezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test20970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20970");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                                                                                                                          ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB                                                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20971");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ZH_NGGGGG", "...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH_HHHHHHHHHH" + "'", str1, "!IH_HHHHHHHHHH");
    }

    @Test
    public void test20973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str1, "Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test20974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("ANGLAIS (ROYAUME-UNI)FRA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ARF)INU-EMUAYOR( SIALGNA" + "'", str1, "ARF)INU-EMUAYOR( SIALGNA");
    }

    @Test
    public void test20975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20975");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))italian", "    ##########", "9hhhhhhhhhh          9hhhhhhhhhh   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))italian" + "'", str3, ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))italian");
    }

    @Test
    public void test20976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20976");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Fr ncG#########################################################################################eltI_0200U\\_!", "\\u005");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20977");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                        #u##2#iTALIANiTALIANiTALIANiT", "                                                                                         U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test20978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                            HCSTUD                                             \\U0034", (int) 'z');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 HCSTUD                                             \\U0034" + "'", str2, "                                                                 HCSTUD                                             \\U0034");
    }

    @Test
    public void test20979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20979");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0038zho                                                                     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test20980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20980");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("...       g                     ...", "\\u0038ZHO                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0038ZHO                          " + "'", str2, "\\u0038ZHO                          ");
    }

    @Test
    public void test20981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20981");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedfrance...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20982");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "\r");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                             hcstued                                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test20983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20983");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046", 98, "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa004600000000000000000000000000000000000000000000000000000000" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa004600000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test20984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20984");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("COR\311EN", "NNNNNNNNNNNNNNNNNN                                                                                 ", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test20985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                      ITALIAN (italian,eNGLISH)                                      ", '4', 'E');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      ITALIAN (italian,eNGLISH)                                      " + "'", str3, "                                      ITALIAN (italian,eNGLISH)                                      ");
    }

    @Test
    public void test20986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20986");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                          francese (Canada)                                           ", "Canada", (int) 'F');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("             HCSINEILATI             ", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "             HCSINEILATI             " + "'", str6, "             HCSINEILATI             ");
    }

    @Test
    public void test20987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20987");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)", "fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20988");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("anglais (canada)", "aaaaaaaaaaaaaaaaaaaaaaaaaaILATiNA...aaaaaaaaaaaaaaaaaaaaaaaaaa", "aitaitaitaitaitaitaitaitaita");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais (canada)" + "'", str3, "anglais (canada)");
    }

    @Test
    public void test20989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20989");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("E", "069\\u0069\\u0069\\u0069\\u0069\\");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 309, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test20990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20990");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.lang.Class<?> wildcardClass5 = locale4.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20991");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\u0020iTALIANiTALIANiTALIANiT", (java.lang.CharSequence) "\ub2e4\ub098\uce90\uc5b4\uc2a4\ub791\ud504");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test20992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20992");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("h");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                        ", (int) 'z', 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test20993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20993");
        java.util.Locale locale1 = new java.util.Locale("tedesco");
        java.lang.String str2 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "tedesco");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test20994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20994");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("g (FRANZ\366SISCH)", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test20995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20995");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                 ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test20996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20996");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale0.getDisplayCountry(locale2);
        java.lang.String str6 = locale2.toLanguageTag();
        java.lang.String str7 = locale2.getDisplayCountry();
        java.lang.String str8 = locale2.getDisplayScript();
        java.lang.String str9 = locale2.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test20997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20997");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r", "iiiiiiiiiiiFrankreich", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test20998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20998");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Eagaash");
        double double2 = languageRange1.getWeight();
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT       !ih", strArray5);
        boolean boolean7 = languageRange1.equals((java.lang.Object) "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT       !ih");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 79 + "'", int6 == 79);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test20999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20999");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getDisplayScript();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.lang.String str4 = locale1.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test21000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test21000");
        java.util.Locale locale1 = java.util.Locale.UK;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale locale5 = locale2.stripExtensions();
        java.lang.String str6 = locale1.getDisplayVariant(locale2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", locale1);
        java.lang.String str8 = locale1.getDisplayName();
        java.lang.String str9 = locale1.getISO3Language();
        java.lang.Object obj10 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str7, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English (United Kingdom)" + "'", str8, "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "eng" + "'", str9, "eng");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "en_GB");
    }
}
