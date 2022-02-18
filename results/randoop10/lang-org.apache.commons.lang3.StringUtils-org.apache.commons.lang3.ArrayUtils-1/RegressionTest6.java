import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test03001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03001");
        java.lang.Character[][] charArray0 = new java.lang.Character[][] {};
        java.lang.Character[][] charArray1 = new java.lang.Character[][] {};
        java.lang.Character[][] charArray2 = new java.lang.Character[][] {};
        java.lang.Character[][] charArray3 = new java.lang.Character[][] {};
        java.lang.Character[][] charArray4 = new java.lang.Character[][] {};
        java.lang.Character[][] charArray5 = new java.lang.Character[][] {};
        java.lang.Character[][][] charArray6 = new java.lang.Character[][][] { charArray0, charArray1, charArray2, charArray3, charArray4, charArray5 };
        java.lang.Character[] charArray10 = new java.lang.Character[] { 'u', ' ' };
        java.lang.Character[] charArray13 = new java.lang.Character[] { 'u', ' ' };
        java.lang.Character[] charArray16 = new java.lang.Character[] { 'u', ' ' };
        java.lang.Character[] charArray19 = new java.lang.Character[] { 'u', ' ' };
        java.lang.Character[] charArray22 = new java.lang.Character[] { 'u', ' ' };
        java.lang.Character[] charArray25 = new java.lang.Character[] { 'u', ' ' };
        java.lang.Character[][] charArray26 = new java.lang.Character[][] { charArray10, charArray13, charArray16, charArray19, charArray22, charArray25 };
        java.lang.Character[][] charArray27 = org.apache.commons.lang3.ArrayUtils.clone(charArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character[][][] charArray28 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 221, charArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 221, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03002");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", (java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03003");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("n", strMap1);
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
        java.lang.String[] strArray17 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList18);
        java.util.Locale.FilteringMode filteringMode21 = null;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList18, filteringMode21);
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        java.util.Locale locale26 = new java.util.Locale("Italian");
        java.util.Locale locale27 = java.util.Locale.ITALY;
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.util.Locale locale29 = java.util.Locale.US;
        java.lang.String str30 = locale29.toLanguageTag();
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.util.Locale locale32 = java.util.Locale.US;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.lang.String str34 = locale33.toLanguageTag();
        java.lang.String str35 = locale31.getDisplayScript(locale33);
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.util.Locale locale37 = java.util.Locale.ITALY;
        java.util.Locale locale38 = java.util.Locale.US;
        java.util.Locale locale39 = locale38.stripExtensions();
        java.lang.String str40 = locale39.toLanguageTag();
        java.lang.String str41 = locale37.getDisplayScript(locale39);
        java.lang.String str42 = locale37.getDisplayLanguage();
        java.util.Locale locale43 = java.util.Locale.ITALY;
        java.util.Locale locale44 = java.util.Locale.US;
        java.util.Locale locale45 = locale44.stripExtensions();
        java.lang.String str46 = locale45.toLanguageTag();
        java.lang.String str47 = locale43.getDisplayScript(locale45);
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale23, locale26, locale27, locale28, locale29, locale31, locale36, locale37, locale45 };
        java.util.ArrayList<java.util.Locale> localeList49 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList49, localeArray48);
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList49, filteringMode51);
        java.util.Locale locale53 = java.util.Locale.US;
        java.lang.String str54 = locale53.toLanguageTag();
        java.lang.String str55 = locale53.getScript();
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale53 };
        java.util.ArrayList<java.util.Locale> localeList57 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList57, localeArray56);
        java.util.Locale locale59 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap60);
        java.util.Locale locale62 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet63 = locale62.getUnicodeLocaleAttributes();
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet63, "KOR");
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags(languageRangeList61, (java.util.Collection<java.lang.String>) strSet63);
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strList66);
        java.lang.String str69 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList67, 'a');
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals(locale26.toString(), "italian");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en-US" + "'", str30, "en-US");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en-US" + "'", str34, "en-US");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "en-US" + "'", str40, "en-US");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Italian" + "'", str42, "Italian");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en-US" + "'", str46, "en-US");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(localeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + filteringMode51 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode51.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "en-US" + "'", str54, "en-US");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(localeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(locale59);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03004");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(byteArray16, (byte) 1);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray16, (int) (short) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.remove(byteArray21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03005");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.US;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale3.getLanguage();
        java.lang.String str5 = locale1.getDisplayScript(locale3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("\u82f1\u8a9e\u30a2en_US             ", locale1);
        java.lang.String str7 = locale1.getCountry();
        java.lang.String str8 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u8a9e\u30a2EN_US             " + "'", str6, "\u82f1\u8a9e\u30a2EN_US             ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FR" + "'", str7, "FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fr_FR" + "'", str8, "fr_FR");
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03006");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str5 = locale1.getExtension('a');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03007");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444france", 131);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03008");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray8, 2);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray8, (int) (short) 10, 3);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 5, 10, 32, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 5, 10, 32, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("-1.01.0-1.01.0", "naliait");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.01.0-1.01.0" + "'", str2, "-1.01.0-1.01.0");
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("51103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103", "ne");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "51103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103" + "'", str2, "51103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103");
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03011");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setUnicodeLocaleKeyword("{fulse,fulse,fulse,fulse,true", "anglais (Etats-Unis)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: {fulse,fulse,fulse,fulse,true [at index 0]");
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
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03012");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category6);
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale10.getScript();
        java.util.Locale.setDefault(category6, locale10);
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Locale.setDefault(category6, locale15);
        java.util.Locale locale18 = locale15.stripExtensions();
        java.util.Locale.Builder builder19 = builder5.setLocale(locale18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale locale22 = java.util.Locale.CHINA;
        java.lang.String str23 = locale20.getDisplayCountry(locale22);
        java.util.Locale locale24 = java.util.Locale.US;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.lang.String str27 = locale22.getDisplayCountry(locale25);
        java.util.Locale.Builder builder28 = builder5.setLocale(locale25);
        java.lang.Object obj29 = locale25.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en-US" + "'", str11, "en-US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en-US" + "'", str16, "en-US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en-US" + "'", str21, "en-US");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u7f8e\u56fd" + "'", str23, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "China" + "'", str27, "China");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "en_US");
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("france", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03014");
        java.lang.CharSequence charSequence0 = null;
        int int1 = org.apache.commons.lang3.StringUtils.length(charSequence0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03015");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("nglais (Etats-Unis)", "1-1.00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0", "\u65e5\u6587\u65e5\u672c)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str2, "100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03017");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)1 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03019");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\u5fb7\u56fd", (java.lang.CharSequence) "ja");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u5fb7\u56fd" + "'", charSequence2, "\u5fb7\u56fd");
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03020");
        short[] shortArray0 = null;
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) 0 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray4);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        java.lang.Short[] shortArray8 = new java.lang.Short[] { (short) 0 };
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray8, (short) (byte) 1);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray10);
        java.lang.Short[] shortArray13 = new java.lang.Short[] { (short) 0 };
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray13, (short) (byte) 1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray15);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray15);
        java.lang.Short[] shortArray19 = new java.lang.Short[] { (short) 0 };
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19, (short) (byte) 1);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray15, shortArray21);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray10, shortArray22);
        java.lang.Short[] shortArray25 = new java.lang.Short[] { (short) 0 };
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25, (short) (byte) 1);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray27);
        java.lang.Short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray27);
        java.lang.Short[] shortArray31 = new java.lang.Short[] { (short) 0 };
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray31, (short) (byte) 1);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray33);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.add(shortArray27, (short) (byte) -1);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray36, (short) (byte) 100);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray38, (short) 10);
        short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray10, shortArray38);
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.add(shortArray10, (short) 0);
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray10);
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (int) (short) 0, (short) 0);
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray48);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.clone(shortArray48);
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray50, (short) (byte) 1);
        short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray50);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray53);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[0]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[0]");
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[0]");
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[]");
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03021");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("japonais", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "Chinese (China)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03023");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray10 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList11);
        java.util.Locale.FilteringMode filteringMode14 = null;
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList11, filteringMode14);
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale locale19 = new java.util.Locale("Italian");
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale22 = java.util.Locale.US;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.ITALY;
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale26.toLanguageTag();
        java.lang.String str28 = locale24.getDisplayScript(locale26);
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.util.Locale locale31 = java.util.Locale.US;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.lang.String str33 = locale32.toLanguageTag();
        java.lang.String str34 = locale30.getDisplayScript(locale32);
        java.lang.String str35 = locale30.getDisplayLanguage();
        java.util.Locale locale36 = java.util.Locale.ITALY;
        java.util.Locale locale37 = java.util.Locale.US;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.lang.String str39 = locale38.toLanguageTag();
        java.lang.String str40 = locale36.getDisplayScript(locale38);
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale16, locale19, locale20, locale21, locale22, locale24, locale29, locale30, locale38 };
        java.util.ArrayList<java.util.Locale> localeList42 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList42, localeArray41);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList42, filteringMode44);
        java.util.Locale locale46 = java.util.Locale.US;
        java.lang.String str47 = locale46.toLanguageTag();
        java.lang.String str48 = locale46.getScript();
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale46 };
        java.util.ArrayList<java.util.Locale> localeList50 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList50, localeArray49);
        java.util.Locale locale52 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList50);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap53);
        java.util.Locale locale55 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleAttributes();
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet56, "KOR");
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags(languageRangeList54, (java.util.Collection<java.lang.String>) strSet56);
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet61 = locale60.getUnicodeLocaleKeys();
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet61, "{97,1,10,10,35,-1,35,-1}");
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags(languageRangeList54, (java.util.Collection<java.lang.String>) strSet61, filteringMode64);
        java.util.Locale locale66 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleAttributes();
        java.lang.String str69 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet67, ' ');
        java.lang.String str70 = java.util.Locale.lookupTag(languageRangeList54, (java.util.Collection<java.lang.String>) strSet67);
        java.util.Collection<java.lang.String> strCollection71 = null;
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags(languageRangeList54, strCollection71);
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList72, 'a');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals(locale19.toString(), "italian");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en-US" + "'", str23, "en-US");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en-US" + "'", str27, "en-US");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "en-US" + "'", str33, "en-US");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Italian" + "'", str35, "Italian");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en-US" + "'", str39, "en-US");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(localeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode44.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "en-US" + "'", str47, "en-US");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(localeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(locale52);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode64.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2\u8a9e\u82f1");
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03025");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale4.getDisplayVariant();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str7 = locale4.getScript();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder10 = builder3.setVariant("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder3.addUnicodeLocaleAttribute("\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063)it_it4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  ChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChi?? (??)it_it4ChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChi?? (??)it_it ChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChi?? (??)it_itaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChinaChi?? (??)it_it4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                                                                                                 {false,..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{false,.." + "'", str1, "{false,..");
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03028");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("truetruef4lse", "etruefalse");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03029");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("EN(US", "Japanese", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03030");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale.Category category9 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.util.Locale.Category[] categoryArray11 = new java.util.Locale.Category[] { category6, category9 };
        java.util.Locale.Category[][] categoryArray12 = new java.util.Locale.Category[][] { categoryArray11 };
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category13, locale14);
        java.util.Locale.Category category16 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale.Category[] categoryArray18 = new java.util.Locale.Category[] { category13, category16 };
        java.util.Locale.Category[][] categoryArray19 = new java.util.Locale.Category[][] { categoryArray18 };
        java.util.Locale.Category category20 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category20, locale21);
        java.util.Locale.Category category23 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale24 = java.util.Locale.getDefault(category23);
        java.util.Locale.Category[] categoryArray25 = new java.util.Locale.Category[] { category20, category23 };
        java.util.Locale.Category[][] categoryArray26 = new java.util.Locale.Category[][] { categoryArray25 };
        java.util.Locale.Category[][][] categoryArray27 = new java.util.Locale.Category[][][] { categoryArray12, categoryArray19, categoryArray26 };
        java.util.Locale.Category category29 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category30 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category31 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category32 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category33 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category33, locale34);
        java.util.Locale.Category category36 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale37 = java.util.Locale.getDefault(category36);
        java.util.Locale.Category[] categoryArray38 = new java.util.Locale.Category[] { category29, category30, category31, category32, category33, category36 };
        java.util.Locale.Category category39 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category40 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category41 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category42 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category43 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale44 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category43, locale44);
        java.util.Locale.Category category46 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale47 = java.util.Locale.getDefault(category46);
        java.util.Locale.Category[] categoryArray48 = new java.util.Locale.Category[] { category39, category40, category41, category42, category43, category46 };
        java.util.Locale.Category[][] categoryArray49 = new java.util.Locale.Category[][] { categoryArray38, categoryArray48 };
        java.util.Locale.Category[][] categoryArray52 = org.apache.commons.lang3.ArrayUtils.subarray(categoryArray49, (int) '#', 35);
        java.util.Locale.Category[][][] categoryArray53 = org.apache.commons.lang3.ArrayUtils.add(categoryArray27, 0, categoryArray52);
        java.lang.Cloneable[] cloneableArray54 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Cloneable[]) categoryArray27);
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray2, (java.lang.Object) cloneableArray54);
        double[] doubleArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) '#');
        double[] doubleArray58 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray59 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.FORMAT + "'", category9.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray11);
        org.junit.Assert.assertNotNull(categoryArray12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.FORMAT + "'", category16.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray18);
        org.junit.Assert.assertNotNull(categoryArray19);
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.FORMAT + "'", category20.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.FORMAT + "'", category23.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray25);
        org.junit.Assert.assertNotNull(categoryArray26);
        org.junit.Assert.assertNotNull(categoryArray27);
        org.junit.Assert.assertTrue("'" + category29 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category29.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.FORMAT + "'", category30.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category31 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category31.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category32 + "' != '" + java.util.Locale.Category.FORMAT + "'", category32.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.FORMAT + "'", category33.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.FORMAT + "'", category36.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray38);
        org.junit.Assert.assertTrue("'" + category39 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category39.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.FORMAT + "'", category40.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category41 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category41.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category42 + "' != '" + java.util.Locale.Category.FORMAT + "'", category42.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category43 + "' != '" + java.util.Locale.Category.FORMAT + "'", category43.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category46 + "' != '" + java.util.Locale.Category.FORMAT + "'", category46.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray48);
        org.junit.Assert.assertNotNull(categoryArray49);
        org.junit.Assert.assertNotNull(categoryArray52);
        org.junit.Assert.assertNotNull(categoryArray53);
        org.junit.Assert.assertNotNull(cloneableArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 10.0]");
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03031");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,..." + "'", str1, "{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...");
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("     ", 48, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu     " + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu     ");
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03033");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03034");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ja_J", "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2\u8a9e\u82f1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ja_J" + "'", str2, "ja_J");
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03036");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 1.0f, 10.0f, 100.0f, 1.0f, 100.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray9);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray9);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[100.0, 1.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03037");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray5);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) (short) -1, (double) (short) 100);
        double[] doubleArray10 = null;
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray10);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03038");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) "\u610f\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03039");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, 0);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("KR", "Italian (Italy)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KR" + "'", str2, "KR");
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03041");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0a-1", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("        {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ   ", "\u30a2\u30e1#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ   " + "'", str2, "        {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ   ");
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\u4e2d\u56fd\u8a9e", "}eur");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}eur" + "'", str2, "}eur");
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03044");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ja", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "true{false,f", "chinois (Chine)                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03046");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...", "                                                                                           {-1,35,0}", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03047");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "n-US   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03048");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "#tts-Unis");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03049");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "KR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03050");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  {false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (" + "'", str1, "{false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (");
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03051");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        boolean boolean5 = locale3.equals((java.lang.Object) locale4);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\u5229\u5927\u610f\u6587\u5229\u5927\u610f", 87);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5229\u5927\u610f\u6587\u5229\u5927\u610f" + "'", str2, "\u5229\u5927\u610f\u6587\u5229\u5927\u610f");
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03053");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        java.lang.String str10 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray5);
        boolean[] booleanArray16 = new boolean[] { false, false, false, false, true };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray16);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray16, true);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, (int) (short) 0, false);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray16);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray26, false);
        java.lang.Boolean[] booleanArray32 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray32);
        java.lang.Double[] doubleArray40 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray40, (double) (short) 0);
        double[] doubleArray43 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray42);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray32, (java.lang.Object) doubleArray42, 4);
        java.lang.Boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray32);
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray32);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray26, booleanArray47);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray48, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray52 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray48, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{false,false,false,false,true}" + "'", str10, "{false,false,false,false,true}");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[false, false, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03054");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str1, "\u82f1\u6587\u7f8e\u570b)");
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Chinatruetruefalsetruetruefal   JPNPfPfPfPf{        ", "", "france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinatruetruefalsetruetruefal   JPNPfPfPfPf{        " + "'", str3, "Chinatruetruefalsetruetruefal   JPNPfPfPfPf{        ");
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03056");
        int[] intArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 42, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("44444444444444444444444444france                ", "...e)4444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444france                " + "'", str2, "44444444444444444444444444france                ");
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("US", "  en-US   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  en-US   " + "'", str2, "  en-US   ");
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03059");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "fra");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03060");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("English (United States)", "Italy", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03061");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\u4e2d\u6587", "        ja_jp");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03062");
        float[] floatArray0 = null;
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, (float) (byte) 0);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        float[] floatArray10 = new float[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray10);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray12);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray9, floatArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray12, (float) 1);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray12, (float) '4');
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray12, (float) 2);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray12);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ", "cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    " + "'", str2, "                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ");
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03064");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "{FALSE,...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03065");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444ITALIEN (ITALIE)444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444ITALIEN (ITALIE)444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03067");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "united states", (java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (COREANO)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "united states" + "'", charSequence2, "united states");
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03068");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = java.util.Locale.US;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.lang.String str8 = locale3.getDisplayLanguage();
        java.lang.String str9 = locale3.getDisplayVariant();
        java.lang.String str10 = locale3.getDisplayLanguage();
        java.lang.String str11 = locale3.getDisplayName();
        java.lang.String str12 = locale2.getDisplayVariant(locale3);
        java.lang.String str13 = locale0.getDisplayLanguage(locale3);
        java.lang.String str14 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) locale0);
        java.lang.Object obj15 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-US" + "'", str6, "en-US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italian (Italy)" + "'", str11, "Italian (Italy)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "coreano" + "'", str13, "coreano");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ko_KR" + "'", str14, "ko_KR");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "ko_KR");
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\u82f1\u8a9e\u30a2EN_US             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2EN_US             " + "'", str1, "\u82f1\u8a9e\u30a2EN_US             ");
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03070");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AAAAADEAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("en-US", "         USA         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-" + "'", str2, "en-");
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03072");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (byte) 0);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, 98, 6);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("1-1.00", "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-1.00" + "'", str2, "1-1.00");
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03074");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "italie", (java.lang.CharSequence) "DEU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  {false,false,false,false,true}   ", "Chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  {false,false,false,false,true}   " + "'", str2, "  {false,false,false,false,true}   ");
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03076");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        long[] longArray1 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray1);
        boolean boolean3 = locale0.equals((java.lang.Object) longArray2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03077");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale.Category[] categoryArray10 = new java.util.Locale.Category[] { category0, category2, category3, category4, category6, category8 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray11 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray10);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray14 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray11, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray14);
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category19 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category20 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale21 = java.util.Locale.getDefault(category20);
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.util.Locale.Category category24 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale25 = java.util.Locale.getDefault(category24);
        java.util.Locale.Category[] categoryArray26 = new java.util.Locale.Category[] { category16, category18, category19, category20, category22, category24 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray27 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray26);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray28 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray26);
        boolean boolean29 = objMap15.containsKey((java.lang.Object) categoryEnumArray28);
        int int30 = objMap15.size();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category19.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category24.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertNotNull(categoryArray26);
        org.junit.Assert.assertNotNull(categoryEnumArray27);
        org.junit.Assert.assertNotNull(categoryEnumArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03078");
        java.lang.Iterable<java.lang.String> strIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(strIterable0, "aitalianaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03079");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("51103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103", "TRUETRUEFALSE", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03080");
        char[] charArray0 = null;
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        org.junit.Assert.assertNull(charArray1);
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03081");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u5927\u5229\u6587");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Giappone", 'u');
        float[] floatArray9 = new float[] { 100, (byte) -1, (-1) };
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray9);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.clone(floatArray9);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray12, (float) (byte) 0);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray12, (float) 3);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray5, (java.lang.Object) 3, 8);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("eNG", strArray2, strArray5);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "eNG" + "'", str19, "eNG");
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03082");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh_TWzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNz", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03083");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("{97,1,10", "etruefalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{97,1,10" + "'", str2, "{97,1,10");
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03085");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray5);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray5, (int) 'a', 12);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[]");
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03086");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf", (java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03087");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder0.build();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale4.getVariant();
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.lang.String str9 = locale4.getDisplayVariant(locale8);
        java.lang.String str10 = locale3.getDisplayCountry(locale8);
        java.lang.String str12 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) str10, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03088");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("anglais (Etats-Unis)", "TRUETRUEFALSE", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03089");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (coreano)", "\u5fb7\u6587\u5fb7\u56fd)", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("        {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ   ", "     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ" + "'", str2, "{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ");
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03091");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) (short) 0);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray3, (java.lang.Object) doubleArray13, 4);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Class<?> wildcardClass18 = booleanArray17.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03092");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray8, (long) (byte) -1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) (short) 0, (int) (short) 0);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray8);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 42);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray24 = org.apache.commons.lang3.ArrayUtils.add(longArray8, 756, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 756, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[10, 10, 35, -1, 35, -1, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("china", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "china" + "'", str2, "china");
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03094");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("97United States1United States10United States10United States35United States-1United States35United States-", (int) (byte) 0, "    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "97United States1United States10United States10United States35United States-1United States35United States-" + "'", str3, "97United States1United States10United States10United States35United States-1United States35United States-");
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03095");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03096");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("}EURT,ESL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}EURT,ESL" + "'", str1, "}EURT,ESL");
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03097");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "th Korea");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("france", "    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "france" + "'", str2, "france");
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03099");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.String str4 = locale2.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet5 = locale2.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03100");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray12 = new boolean[] { false, false, false, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (byte) -1, (int) '#');
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, 0, (int) (short) 1);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray20, false);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.add(booleanArray22, true);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, false, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray24, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[true]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03101");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 756);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("u uu", "}eurt,esl");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u uu" + "'", str2, "u uu");
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03103");
        int[] intArray0 = null;
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03104");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category6);
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale10.getScript();
        java.util.Locale.setDefault(category6, locale10);
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Locale.setDefault(category6, locale15);
        java.util.Locale locale18 = locale15.stripExtensions();
        java.util.Locale.Builder builder19 = builder5.setLocale(locale18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale locale22 = java.util.Locale.CHINA;
        java.lang.String str23 = locale20.getDisplayCountry(locale22);
        java.util.Locale locale24 = java.util.Locale.US;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.lang.String str27 = locale22.getDisplayCountry(locale25);
        java.util.Locale.Builder builder28 = builder5.setLocale(locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder5.setRegion("{1.0,-1.0,0.0,0.0}");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: {1.0,-1.0,0.0,0.0} [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en-US" + "'", str11, "en-US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en-US" + "'", str16, "en-US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en-US" + "'", str21, "en-US");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u7f8e\u56fd" + "'", str23, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "China" + "'", str27, "China");
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03105");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setRegion("en");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setExtension('#', "                                   English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03106");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale.Category[] categoryArray10 = new java.util.Locale.Category[] { category0, category2, category3, category4, category6, category8 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray11 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray10);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray14 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray11, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray14);
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category19 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category20 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale21 = java.util.Locale.getDefault(category20);
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.util.Locale.Category category24 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale25 = java.util.Locale.getDefault(category24);
        java.util.Locale.Category[] categoryArray26 = new java.util.Locale.Category[] { category16, category18, category19, category20, category22, category24 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray27 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray26);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray28 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray26);
        boolean boolean29 = objMap15.containsKey((java.lang.Object) categoryEnumArray28);
        float[] floatArray30 = null;
        float[] floatArray37 = new float[] { (byte) 10, 0, 100L, ' ', (byte) -1, (short) 0 };
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray37);
        float[] floatArray41 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray37, (int) (short) 0, (int) (byte) -1);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray30, floatArray37);
        boolean boolean43 = objMap15.containsKey((java.lang.Object) floatArray37);
        char[] charArray51 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray51, 'a', (int) (short) 10);
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray51, ' ');
        char[] charArray58 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray51, ' ');
        char[] charArray65 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray65, 'a', (int) (short) 10);
        char[] charArray75 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int78 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray75, 'a', (int) (short) 10);
        int int80 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray75, ' ');
        char[] charArray82 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray75, ' ');
        char[] charArray83 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray82);
        char[] charArray84 = org.apache.commons.lang3.ArrayUtils.addAll(charArray65, charArray82);
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray51, charArray65);
        char[] charArray88 = org.apache.commons.lang3.ArrayUtils.subarray(charArray51, 10, 100);
        int int90 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray88, 'a');
        char[] charArray91 = org.apache.commons.lang3.ArrayUtils.clone(charArray88);
        int int92 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "_", charArray88);
        java.lang.Object obj93 = null;
        java.lang.Object obj94 = objMap15.putIfAbsent((java.lang.Object) "_", obj93);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category19.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category24.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertNotNull(categoryArray26);
        org.junit.Assert.assertNotNull(categoryEnumArray27);
        org.junit.Assert.assertNotNull(categoryEnumArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 4 + "'", int68 == 4);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 4 + "'", int78 == 4);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray83), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray83), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray83), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray84), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray84), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray84), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray88), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray88), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray88), "[]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray91), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray91), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray91), "[]");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("TI_ti", "falsefalsefalsefalsetrue");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TI_ti" + "'", str2, "TI_ti");
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str1, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03109");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "it", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "it" + "'", charSequence2, "it");
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("france", "tru#tru#fals                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "france" + "'", str2, "france");
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03111");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray10 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList11);
        java.util.Locale.FilteringMode filteringMode14 = null;
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList11, filteringMode14);
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale locale19 = new java.util.Locale("Italian");
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale22 = java.util.Locale.US;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.ITALY;
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale26.toLanguageTag();
        java.lang.String str28 = locale24.getDisplayScript(locale26);
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.util.Locale locale31 = java.util.Locale.US;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.lang.String str33 = locale32.toLanguageTag();
        java.lang.String str34 = locale30.getDisplayScript(locale32);
        java.lang.String str35 = locale30.getDisplayLanguage();
        java.util.Locale locale36 = java.util.Locale.ITALY;
        java.util.Locale locale37 = java.util.Locale.US;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.lang.String str39 = locale38.toLanguageTag();
        java.lang.String str40 = locale36.getDisplayScript(locale38);
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale16, locale19, locale20, locale21, locale22, locale24, locale29, locale30, locale38 };
        java.util.ArrayList<java.util.Locale> localeList42 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList42, localeArray41);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList42, filteringMode44);
        java.util.Locale locale46 = java.util.Locale.US;
        java.lang.String str47 = locale46.toLanguageTag();
        java.lang.String str48 = locale46.getScript();
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale46 };
        java.util.ArrayList<java.util.Locale> localeList50 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList50, localeArray49);
        java.util.Locale locale52 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList50);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap53);
        java.util.Locale locale55 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleAttributes();
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet56, "KOR");
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags(languageRangeList54, (java.util.Collection<java.lang.String>) strSet56);
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet61 = locale60.getUnicodeLocaleKeys();
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet61, "{97,1,10,10,35,-1,35,-1}");
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags(languageRangeList54, (java.util.Collection<java.lang.String>) strSet61, filteringMode64);
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.lang.String[] strArray73 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, (java.util.Collection<java.lang.String>) strList74);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags(languageRangeList54, (java.util.Collection<java.lang.String>) strList76);
        java.lang.String str79 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList77, 'a');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals(locale19.toString(), "italian");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en-US" + "'", str23, "en-US");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en-US" + "'", str27, "en-US");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "en-US" + "'", str33, "en-US");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Italian" + "'", str35, "Italian");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en-US" + "'", str39, "en-US");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(localeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode44.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "en-US" + "'", str47, "en-US");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(localeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(locale52);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode64.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\u82f1\u8a9e\u30a2en_US", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2en_US" + "'", str2, "\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03113");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("   }eurt,eslaf,eslaf,eslaf,eslaf{  ", 7, 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03114");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03115");
        char[] charArray4 = new char[] { ' ', 'a' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray4);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("jpn", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = org.apache.commons.lang3.ArrayUtils.remove(charArray4, 221);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 221, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("t", "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03117");
        double[] doubleArray2 = new double[] { 'x', 0.0f };
        double[] doubleArray5 = new double[] { 'x', 0.0f };
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray5 };
        boolean[] booleanArray12 = new boolean[] { false, false, false, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (byte) -1, (int) '#');
        java.lang.String str17 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray12);
        boolean[] booleanArray23 = new boolean[] { false, false, false, false, true };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray23, true);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.add(booleanArray23, (int) (short) 0, false);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray12, booleanArray23);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        java.lang.Boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray12);
        double[][] doubleArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray6, (java.lang.Object) booleanArray34);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray34);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray34);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[120.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[120.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{false,false,false,false,true}" + "'", str17, "{false,false,false,false,true}");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "falsefalsefalsefalsetrue" + "'", str36, "falsefalsefalsefalsetrue");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, false, false, true]");
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03118");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "#tts-Unis");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03119");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray8, (long) (byte) -1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray8);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray20);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray20, (long) 2);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray20, (long) (short) 0);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.clone(longArray25);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.clone(longArray26);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.addAll(longArray8, longArray27);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray8, 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[10, 10, 35, -1, 35, -1, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[10, 10, 35, -1, 35, -1]");
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03120");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)1 1");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03121");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("{fPfPfPfPNPJ", "Italy");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03122");
        java.lang.Iterable<java.lang.String> strIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(strIterable0, "100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03123");
        java.lang.Byte[] byteArray0 = null;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03124");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray12);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray23, (byte) 10, (int) '#');
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.add(byteArray29, (byte) -1);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray23, byteArray29);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray23);
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.add(byteArray36, (byte) -1);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray38, (byte) 100, (-1));
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray23, byteArray38);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray23);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray12, (byte) 100);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.add(byteArray45, (int) (short) 1, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.remove(byteArray45, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[10, 1, 1, 0, 1, 10, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 0, 10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 10, 0]");
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03125");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "S", (java.lang.CharSequence) "\u65e5\u6587\u65e5\u5927\u5229\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03126");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "  {false,false,false,false,true}  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03127");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("51103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103", "n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03128");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale.Builder builder7 = builder4.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder4.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KOR" + "'", str6, "KOR");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03129");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, 1.0d);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 10.0d);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, 10.0d, (double) 0.0f);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray3);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray14);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray14, (double) (short) 1, 0.0d);
        double[] doubleArray19 = null;
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.add(doubleArray19, (double) (byte) 1);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray14, doubleArray21);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray14);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray14);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03130");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("china    ", "", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("true                                                                                                    true                                                                                                    false", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true                                                                                                    true                                                                                                    false" + "'", str2, "true                                                                                                    true                                                                                                    false");
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03132");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale.Category[] categoryArray10 = new java.util.Locale.Category[] { category0, category2, category3, category4, category6, category8 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray11 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray10);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray14 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray11, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray14);
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category19 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category20 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale21 = java.util.Locale.getDefault(category20);
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.util.Locale.Category category24 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale25 = java.util.Locale.getDefault(category24);
        java.util.Locale.Category[] categoryArray26 = new java.util.Locale.Category[] { category16, category18, category19, category20, category22, category24 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray27 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray26);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray28 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray26);
        boolean boolean29 = objMap15.containsKey((java.lang.Object) categoryEnumArray28);
        int[] intArray33 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray33);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.subarray(intArray33, (int) (short) 0, (int) (byte) 0);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray37);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray37, 250);
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        java.lang.Class[] classArray44 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        wildcardClassArray45[0] = wildcardClass42;
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        java.lang.Class[] classArray58 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray59 = (java.lang.Class<?>[]) classArray58;
        wildcardClassArray59[0] = wildcardClass56;
        java.lang.Class[][] classArray63 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray64 = (java.lang.Class<?>[][]) classArray63;
        wildcardClassArray64[0] = wildcardClassArray45;
        wildcardClassArray64[1] = wildcardClassArray52;
        wildcardClassArray64[2] = wildcardClassArray59;
        java.lang.Class<?>[][] wildcardClassArray72 = org.apache.commons.lang3.ArrayUtils.removeElement(wildcardClassArray64, (java.lang.Object) 'u');
        boolean boolean73 = objMap15.remove((java.lang.Object) int40, (java.lang.Object) 'u');
        java.util.Set<java.lang.Object> objSet74 = objMap15.keySet();
        java.util.Locale.Builder builder75 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder76 = builder75.clear();
        java.util.Locale.Builder builder77 = builder75.clear();
        java.util.Locale.Builder builder78 = builder75.clear();
        java.util.Locale.Builder builder79 = builder75.clearExtensions();
        java.lang.Object obj80 = objMap15.remove((java.lang.Object) builder79);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder83 = builder79.setUnicodeLocaleKeyword("-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "frChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr_ChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetrFR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: -1.0{0}10.0{0}1.0{0}100.0{0}1.0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category19.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category24.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertNotNull(categoryArray26);
        org.junit.Assert.assertNotNull(categoryEnumArray27);
        org.junit.Assert.assertNotNull(categoryEnumArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(objSet74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03133");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1", (int) (byte) 100, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03134");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        java.lang.String str10 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray5);
        boolean[] booleanArray16 = new boolean[] { false, false, false, false, true };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray16);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray16, true);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, (int) (short) 0, false);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray16);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        java.lang.Boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray27, true);
        java.lang.Boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray27);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray27);
        java.lang.Class<?> wildcardClass32 = booleanArray27.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{false,false,false,false,true}" + "'", str10, "{false,false,false,false,true}");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "falsefalsefalsefalsetrue" + "'", str31, "falsefalsefalsefalsetrue");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03135");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "truetruetruefalsetruetruetruefalsefalse", (java.lang.CharSequence) "                                                                     100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03136");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        boolean[] booleanArray17 = new boolean[] { false, false, false, false, true };
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray17, (int) (byte) -1, (int) '#');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray17);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03137");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (COREANO)", "ja                                        ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03138");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "EN(US", (java.lang.CharSequence) "\u5fb7\u56fd");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03139");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) 0);
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 0 };
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray9);
        java.lang.Short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray9);
        java.lang.Short[] shortArray13 = new java.lang.Short[] { (short) 0 };
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray13, (short) (byte) 1);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray9, shortArray15);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (short) (byte) -1);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray18, (short) -1);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray18, (short) (byte) 0, 3);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray18);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.remove(shortArray24, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 0, -1]");
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "444444444444444444444444444444444444{fPfPfPfPNPJ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "44444444444444444444444444france");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444france" + "'", str1, "44444444444444444444444444france");
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("cor\351en (Cor\351e du Sud)", (int) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                               cor\351en (Cor\351e du Sud)" + "'", str3, "                                                                               cor\351en (Cor\351e du Sud)");
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03143");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray4, 213, (int) 'x');
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 0, -1]");
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03144");
        double[] doubleArray4 = new double[] { 221, 8, 'a', 6 };
        double[][] doubleArray5 = new double[][] { doubleArray4 };
        double[] doubleArray10 = new double[] { 221, 8, 'a', 6 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        double[] doubleArray16 = new double[] { 221, 8, 'a', 6 };
        double[][] doubleArray17 = new double[][] { doubleArray16 };
        double[] doubleArray22 = new double[] { 221, 8, 'a', 6 };
        double[][] doubleArray23 = new double[][] { doubleArray22 };
        double[][][] doubleArray24 = new double[][][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23 };
        double[] doubleArray29 = new double[] { 221, 8, 'a', 6 };
        double[][] doubleArray30 = new double[][] { doubleArray29 };
        double[] doubleArray35 = new double[] { 221, 8, 'a', 6 };
        double[][] doubleArray36 = new double[][] { doubleArray35 };
        double[] doubleArray41 = new double[] { 221, 8, 'a', 6 };
        double[][] doubleArray42 = new double[][] { doubleArray41 };
        double[] doubleArray47 = new double[] { 221, 8, 'a', 6 };
        double[][] doubleArray48 = new double[][] { doubleArray47 };
        double[][][] doubleArray49 = new double[][][] { doubleArray30, doubleArray36, doubleArray42, doubleArray48 };
        double[][][][] doubleArray50 = new double[][][][] { doubleArray24, doubleArray49 };
        double[][][][] doubleArray53 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray50, (int) '4', 97);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[221.0, 8.0, 97.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[221.0, 8.0, 97.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[221.0, 8.0, 97.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[221.0, 8.0, 97.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[221.0, 8.0, 97.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[221.0, 8.0, 97.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[221.0, 8.0, 97.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[221.0, 8.0, 97.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(doubleArray53);
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03145");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "etruefalse                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03146");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\u4e2d\u56fd\u8a9e", "444444444444444444444444444444444444{fPfPfPfPNPJ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03147");
        java.lang.Object[] objArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(objArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03148");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale.Category[] categoryArray10 = new java.util.Locale.Category[] { category0, category2, category3, category4, category6, category8 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray11 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray10);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray14 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray11, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray14);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = objMap15.get(obj16);
        objMap15.clear();
        int int19 = objMap15.size();
        java.lang.Long[] longArray20 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray20);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray20);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray20);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray20, (long) 3);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.add(longArray25, (long) 0);
        java.util.Locale locale28 = java.util.Locale.US;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = locale29.toLanguageTag();
        java.util.Locale locale31 = java.util.Locale.JAPANESE;
        java.lang.String str32 = locale29.getDisplayName(locale31);
        java.lang.String str33 = locale29.getScript();
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList45);
        java.util.Locale.FilteringMode filteringMode48 = null;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList45, filteringMode48);
        java.util.Locale locale50 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet51 = locale50.getUnicodeLocaleAttributes();
        java.util.Locale locale53 = new java.util.Locale("Italian");
        java.util.Locale locale54 = java.util.Locale.ITALY;
        java.util.Locale locale55 = java.util.Locale.FRANCE;
        java.util.Locale locale56 = java.util.Locale.US;
        java.lang.String str57 = locale56.toLanguageTag();
        java.util.Locale locale58 = java.util.Locale.ITALY;
        java.util.Locale locale59 = java.util.Locale.US;
        java.util.Locale locale60 = locale59.stripExtensions();
        java.lang.String str61 = locale60.toLanguageTag();
        java.lang.String str62 = locale58.getDisplayScript(locale60);
        java.util.Locale locale63 = java.util.Locale.KOREA;
        java.util.Locale locale64 = java.util.Locale.ITALY;
        java.util.Locale locale65 = java.util.Locale.US;
        java.util.Locale locale66 = locale65.stripExtensions();
        java.lang.String str67 = locale66.toLanguageTag();
        java.lang.String str68 = locale64.getDisplayScript(locale66);
        java.lang.String str69 = locale64.getDisplayLanguage();
        java.util.Locale locale70 = java.util.Locale.ITALY;
        java.util.Locale locale71 = java.util.Locale.US;
        java.util.Locale locale72 = locale71.stripExtensions();
        java.lang.String str73 = locale72.toLanguageTag();
        java.lang.String str74 = locale70.getDisplayScript(locale72);
        java.util.Locale[] localeArray75 = new java.util.Locale[] { locale50, locale53, locale54, locale55, locale56, locale58, locale63, locale64, locale72 };
        java.util.ArrayList<java.util.Locale> localeList76 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList76, localeArray75);
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList76, filteringMode78);
        java.util.Locale locale80 = java.util.Locale.US;
        java.lang.String str81 = locale80.toLanguageTag();
        java.lang.String str82 = locale80.getScript();
        java.util.Locale[] localeArray83 = new java.util.Locale[] { locale80 };
        java.util.ArrayList<java.util.Locale> localeList84 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList84, localeArray83);
        java.util.Locale locale86 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList84);
        boolean boolean87 = objMap15.replace((java.lang.Object) longArray25, (java.lang.Object) str33, (java.lang.Object) locale86);
        int int89 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray25, 0L);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us_TRUE                                                                                                    TRUE                                                                                                    FALSE_kor");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[0]");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en-US" + "'", str30, "en-US");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str32, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals(locale53.toString(), "italian");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "en-US" + "'", str57, "en-US");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "en-US" + "'", str61, "en-US");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "en-US" + "'", str67, "en-US");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Italian" + "'", str69, "Italian");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "en-US" + "'", str73, "en-US");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(localeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode78.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "en-US" + "'", str81, "en-US");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(localeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNull(locale86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("false", "FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FR" + "'", str2, "FR");
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03150");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-ecnarf");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-ecnarf [at index 0]");
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
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03152");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03153");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("444444444444444444444444444444444444{fPfPfPfPNPJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444{fPfPfPfPNPJ" + "'", str1, "444444444444444444444444444444444444{fPfPfPfPNPJ");
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03154");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("true{false,f", "-1.01.0-1.01.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03155");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) 0);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.remove(byteArray19, (int) (short) 0);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray19, (byte) 10);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray30, (byte) 10, (int) '#');
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.add(byteArray36, (byte) -1);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray30, byteArray36);
        java.lang.Byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray36);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray40, (byte) 100);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray40, (byte) 10);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray19, byteArray44);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03156");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 131, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\u65e5\u6587\u65e5\u672c)0", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u6587\u65e5\u672c)0" + "'", str2, "\u65e5\u6587\u65e5\u672c)0");
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\u82f1\u8a9e\u30a2en_US", (int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2en_US" + "'", str2, "\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03159");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray14);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, '#', (int) (short) -1);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.add(charArray14, 2, 'u');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.subarray(charArray14, (int) 'u', 0);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray26, 'a', 35);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray26, '#', 1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4au 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4au 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, u,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("japonais (Japon)", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "japonais (Japon)" + "'", str2, "japonais (Japon)");
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03161");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Japanese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Japanese" + "'", str1, "Japanese");
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko" + "'", str1, "ko");
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("South Korea", "\u6cd5true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "South Korea" + "'", str2, "South Korea");
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("{1,0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{1,0}" + "'", str1, "{1,0}");
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03165");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("fra", 21, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03166");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("tru#tru#fal", "\u6cd5true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03167");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2EN_u" + "'", str1, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2EN_u");
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03168");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "italie");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03169");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "ja                                        ", (java.lang.CharSequence) "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03170");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510", "\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str1, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("10 32 10 5 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 32 10 5 1" + "'", str1, "10 32 10 5 1");
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03173");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444444444444444444444444FRANCE", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("[ , hi!, en-US,  ]   JPNPfPfPfPf{        []", "anglais (Etats-Unis)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ , hi!, en-US,  ]   JPNPfPfPfPf{        []" + "'", str2, "[ , hi!, en-US,  ]   JPNPfPfPfPf{        []");
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03175");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAAAADEAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03176");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "10321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03177");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, ' ');
        char[] charArray20 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray20, 'a', (int) (short) 10);
        char[] charArray30 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray30, 'a', (int) (short) 10);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray30, ' ');
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray30, ' ');
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray37);
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.addAll(charArray20, charArray37);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray20);
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, 10, 100);
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.add(charArray43, 'u');
        char[] charArray53 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray53, 'a', (int) (short) 10);
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray53, ' ');
        char[] charArray60 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray53, ' ');
        char[] charArray67 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int70 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray67, 'a', (int) (short) 10);
        char[] charArray77 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int80 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray77, 'a', (int) (short) 10);
        int int82 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray77, ' ');
        char[] charArray84 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray77, ' ');
        char[] charArray85 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray84);
        char[] charArray86 = org.apache.commons.lang3.ArrayUtils.addAll(charArray67, charArray84);
        boolean boolean87 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray53, charArray67);
        char[] charArray90 = org.apache.commons.lang3.ArrayUtils.subarray(charArray53, 10, 100);
        char[] charArray91 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray90);
        boolean boolean92 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Italian", charArray91);
        int int95 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray91, 'a', (int) '4');
        char[] charArray96 = org.apache.commons.lang3.ArrayUtils.addAll(charArray43, charArray91);
        boolean boolean97 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray43);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[u]");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 4 + "'", int56 == 4);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 4 + "'", int70 == 4);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 4 + "'", int80 == 4);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray84), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray84), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray84), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray90), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray90), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray90), "[]");
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray91), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray91), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray91), "[]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNotNull(charArray96);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray96), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray96), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray96), "[]");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03178");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXITALYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXITALYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03179");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (byte) 0);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.toObject(intArray3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray8);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 0]");
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("{false,false,false,false,true}", "44444444444444444444444444444444444444444444444444ITALIEN (ITALIE)444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{false,false,false,false,true}" + "'", str2, "{false,false,false,false,true}");
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03181");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("}EURT,ESL", "{false,...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}EURT,ESL" + "'", str2, "}EURT,ESL");
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03183");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.clone(byteArray2);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray2);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray2, (byte) 100, (int) 'a');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03184");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) " trutrufals");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03185");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("{fulse,fulse,fulse,fulse,tr", "japonais (Japon)", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03186");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, (long) (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray6);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, 1L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03187");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "}EURT,ESL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}EURT,ESL" + "'", str1, "}EURT,ESL");
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (COREANO)", "-1.01.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03189");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("truetruetruefalsetruetruetruefalsefalse", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03190");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setLanguage("\uc911\uad6d");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03191");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "  {FALSE,FALSE,FALSE,FALSE,TRUE}  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  {FALSE,FALSE,FALSE,FALSE,TRUE}  " + "'", str1, "  {FALSE,FALSE,FALSE,FALSE,TRUE}  ");
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03192");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setExtension('4', "97United States1United States10United States10United States35United States-1United States35United States-1");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03193");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 3, (int) '#');
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 0L);
        long[] longArray13 = new long[] { 'a' };
        long[] longArray20 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.addAll(longArray13, longArray20);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.add(longArray21, (int) (short) 1, (long) (byte) 1);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray21);
        java.lang.Long[] longArray26 = org.apache.commons.lang3.ArrayUtils.toObject(longArray21);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray26, (long) 35);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray28, (long) 4, (int) (short) 100);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[1, 100, 35, 10, 97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("        {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ   ", "de_D");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ   " + "'", str2, "        {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ   ");
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03195");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ja_J", (int) ' ', "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kokokokokokokokokokokokokokoja_J" + "'", str3, "kokokokokokokokokokokokokokoja_J");
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03196");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0", "                                                        {97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE                                                         ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03197");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Etats-Unis", "44444444444444444444444444france");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03198");
        byte[] byteArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03199");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray12 = new boolean[] { false, false, false, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (byte) -1, (int) '#');
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray12, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 87, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, false, false, true, false, false, false, false, true]");
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03200");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'u', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03201");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0", "\uc911\uad6d");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                true{false,f", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03203");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "uNITED sTATES", (java.lang.CharSequence) "en-US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03204");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("{uuu", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03205");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "44444444444444444444444444444444444444444444444444ITALIEN (ITALIE)444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03206");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "en");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03207");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Japan", "  en-US   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03208");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("t");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "t" + "'", str1, "t");
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03209");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "97United States1United States10United States10United States35United States-1United States35United States-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("corean44444444444444444444444444fRANCE", "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (China)" + "'", str2, "Chinese (China)");
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03211");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("eng", 2, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03212");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("T");
        java.lang.String str2 = languageRange1.getRange();
        boolean boolean4 = languageRange1.equals((java.lang.Object) "97United States1United States10United States10United States35United States-1United States35United States-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t" + "'", str2, "t");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03213");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("en_GB", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en_GB" + "'", str3, "en_GB");
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03214");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu     " + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu     ");
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03215");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03216");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("South Korea");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SouthKorea" + "'", str1, "SouthKorea");
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03217");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "en");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03218");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("TI_ti", (int) (short) -1, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TI_ti" + "'", str3, "TI_ti");
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03219");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) 'a');
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = org.apache.commons.lang3.ArrayUtils.remove(intArray1, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 117, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03220");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aitalianaa", "{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}", (int) (short) 100);
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) (short) 100);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, 1.0d, (double) 35);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) (byte) 100, (int) 'u', (double) 3);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray8);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray3, (java.lang.Object) doubleArray8);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 9, (double) 10);
        java.lang.Double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray8);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) doubleArray21);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "100.010.0" + "'", str22, "100.010.0");
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("97United States1United States10United States10United States35United States-1United States35United States-", "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97United States1United States10United States10United States35United States-1United States35United States-" + "'", str2, "97United States1United States10United States10United States35United States-1United States35United States-");
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03222");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "{false,fal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03223");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf", "SouthKorea", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03224");
        float[] floatArray3 = new float[] { 100, (byte) -1, (-1) };
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray6, (float) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray6, (int) (short) -1, (float) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 100.0]");
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("italianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalian", "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03226");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("-1", (int) 'u', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu-1" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu-1");
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03227");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("{false,false,false,false,tra", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03229");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u6cd5\u6587                                                 ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03230");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE", "\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229) ", 221);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03231");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 10, (int) '#');
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03232");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale4.getScript();
        java.util.Locale.setDefault(category0, locale4);
        java.lang.String str8 = locale4.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale4.getUnicodeLocaleType("0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-US" + "'", str5, "en-US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "US" + "'", str8, "US");
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03233");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray14 = org.apache.commons.lang3.ArrayUtils.remove(longArray8, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 98, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03234");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "corean44444444444444444444444444fRANCE", "RK_ok");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03235");
        int[] intArray0 = null;
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 23, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 23, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03236");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) -1);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 10);
        java.lang.String str22 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) byteArray16, "{}");
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{1,0}" + "'", str22, "{1,0}");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 0]");
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03237");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("en_GB", "\u4e2d\u6587\u53f0\u7063)", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03238");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray12 = new boolean[] { false, false, false, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (byte) -1, (int) '#');
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, 0, (int) (short) 1);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray20, false);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.add(booleanArray22, true);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, false, (int) (byte) 0);
        java.lang.Boolean[] booleanArray31 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray31);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray31, true);
        boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray34, true);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray34);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray34);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray24, booleanArray34);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray34, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[true]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[true, false]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03239");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("South Korea", 95, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuSouth Korea" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuSouth Korea");
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03240");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("france", "                                                      {false,..                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03241");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444ITALIEN (iTALIE)44444444444444444444444444444444444444444444444444", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "{fnlse,fnlse,fnlse,fnlse,trne");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{fnlse,fnlse,fnlse,fnlse,trne" + "'", str1, "{fnlse,fnlse,fnlse,fnlse,trne");
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03243");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "Japanese (Japan)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03244");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, 1.0d, (double) 35);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) (byte) 100, (int) 'u', (double) 3);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray12, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03245");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0}1.0{0}100.0{0}1.0", "\u65e5\u6587", 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u65e5\u65870}1.0{0}100.0{0}1.0" + "'", str4, "\u65e5\u65870}1.0{0}100.0{0}1.0");
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03246");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\u6587\u5229\u5927\u610f", "\u82f1\u8a9e\u30a2en_US             ", 756);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03247");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setRegion("en");
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.Locale.Builder builder10 = builder3.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03248");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { (-1.0f), 100.0f, (-1.0f) };
        java.lang.Float[] floatArray7 = new java.lang.Float[] { (-1.0f), 100.0f, (-1.0f) };
        java.lang.Float[] floatArray11 = new java.lang.Float[] { (-1.0f), 100.0f, (-1.0f) };
        java.lang.Float[][] floatArray12 = new java.lang.Float[][] { floatArray3, floatArray7, floatArray11 };
        java.lang.Float[][] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) '#', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float[][] floatArray17 = org.apache.commons.lang3.ArrayUtils.remove(floatArray15, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 39, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray15);
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03249");
        short[] shortArray1 = new short[] { (short) 10 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) 10, 35);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.add(shortArray1, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray1, (short) (byte) 1);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) 0 };
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10, (short) (byte) 1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray12);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray12);
        java.lang.Short[] shortArray16 = new java.lang.Short[] { (short) 0 };
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray16, (short) (byte) 1);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray12, shortArray18);
        java.lang.Short[] shortArray21 = new java.lang.Short[] { (short) 0 };
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray21, (short) (byte) 1);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray23);
        java.lang.Short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray23);
        java.lang.Short[] shortArray27 = new java.lang.Short[] { (short) 0 };
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray27, (short) (byte) 1);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray23, shortArray29);
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray18, shortArray30);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray18, (short) 0);
        java.lang.Short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray18);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray1, shortArray18);
        java.lang.Short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray18);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray18, (short) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[10]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03250");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ", 8, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ" + "'", str3, "{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ");
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03251");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063)it_it4", "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03252");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...", "france");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03253");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("South Korea", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03254");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) 1);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "                                                                         {fulse,fulse,fulse,fulse,tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03256");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray10, '#');
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal", charArray10);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "u uuu#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "u uuu#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[u,  , u, u, u, #]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03257");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 0L);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray6, (float) 2);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(floatArray6, (float) 'u');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03258");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("{}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range={}");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03259");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0", "                true{false,f", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("11003510", "\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927", "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11003510" + "'", str3, "11003510");
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03262");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "01530011");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01530011" + "'", str1, "01530011");
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03263");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, (long) (byte) -1);
        long[] longArray13 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray13, 0L);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray15, (long) (byte) 0);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray15);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray15);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.clone(longArray15);
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray22);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray23, (long) 13);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray25);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray15, (long) (byte) 10);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[1, 100, 35, 10, 1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03264");
        long[] longArray0 = null;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, (int) (short) 0, 37);
        org.junit.Assert.assertNull(longArray3);
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03265");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 13, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03266");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Japanese (Japan)", (java.lang.CharSequence) "\u5229\u5927\u610f\u6587\u5229\u5927\u610f");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\u6cd5\u6587                                                 ", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587                                                 " + "'", str2, "\u6cd5\u6587                                                 ");
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03268");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setLanguage("\u7f8e\u570b");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03269");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}", "corean", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03270");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  {FALSE,FALSE,FALSE,FALSE,TRUE}  ", (int) (byte) 10, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("KOR", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)", "\u65e5\u6587\u65e5\u672c)0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "K" + "'", str3, "K");
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03272");
        char[] charArray3 = new char[] { ' ', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray3, 'a', (int) (short) 0);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray3, ' ', 221);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , a]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , a, a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat(" FR", "", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR" + "'", str3, " FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR");
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03274");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("en_US", 3, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en_US" + "'", str3, "en_US");
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03275");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("it_IT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=it_it");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03276");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.toLanguageTag();
        java.util.Locale locale6 = java.util.Locale.US;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale4.getDisplayCountry(locale7);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.US;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale10.getDisplayScript(locale12);
        java.lang.String str15 = locale4.getDisplayName(locale10);
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str17 = locale10.getDisplayName(locale16);
        java.lang.String str18 = locale10.getISO3Country();
        java.util.Locale.Builder builder19 = builder0.setLocale(locale10);
        java.lang.String str20 = locale10.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-US" + "'", str5, "en-US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "United States" + "'", str9, "United States");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "anglais (Etats-Unis)" + "'", str15, "anglais (Etats-Unis)");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str17, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FRA" + "'", str18, "FRA");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fr_FR" + "'", str20, "fr_FR");
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03277");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, true);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true]");
        org.junit.Assert.assertNull(booleanArray3);
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03278");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray0, false);
        org.junit.Assert.assertNull(booleanArray2);
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA", "ED");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA" + "'", str2, "FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA");
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("jpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpn", "1 100 35 10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpn" + "'", str2, "jpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpn");
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03281");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                  ", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ne");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("US");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "  {FPFPFPFPNPJ   ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("n", strArray6, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "  {false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)", strArray3, strArray14);
        java.lang.String str17 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) strArray14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "n" + "'", str12, "n");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str16, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{S}" + "'", str17, "{S}");
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "truetruefalse");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03283");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 100, (-1));
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray4, (byte) 10);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, (int) (short) 1, (byte) 100);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) 10, (int) '#');
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.add(byteArray26, (byte) -1);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray20, byteArray26);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray20);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(byteArray30, (byte) 1);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray30, (int) (short) 100, (int) '#');
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray35);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray13, byteArray35);
        java.lang.Byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray35);
        java.lang.Byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray38);
        int[] intArray43 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray43);
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.subarray(intArray43, (int) (short) 0, (int) (byte) 0);
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.add(intArray43, (int) ' ');
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray43, 221);
        java.lang.Integer[] intArray52 = org.apache.commons.lang3.ArrayUtils.toObject(intArray43);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.contains(intArray43, (int) 'x');
        java.lang.String[] strArray56 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("US");
        java.lang.String[] strArray58 = org.apache.commons.lang3.StringUtils.stripAll(strArray56, "  {FPFPFPFPNPJ   ");
        java.lang.String[] strArray59 = org.apache.commons.lang3.StringUtils.stripAll(strArray56);
        int[] intArray63 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray63);
        int[] intArray67 = org.apache.commons.lang3.ArrayUtils.add(intArray63, 0, 4);
        java.lang.Integer[] intArray68 = org.apache.commons.lang3.ArrayUtils.toObject(intArray63);
        int int70 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray59, (java.lang.Object) intArray68, (int) (byte) 1);
        int[] intArray72 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray68, (int) (short) 0);
        int[] intArray73 = org.apache.commons.lang3.ArrayUtils.addAll(intArray43, intArray72);
        boolean boolean74 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray38, (java.lang.Object) intArray72);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 100, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 100, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 35, 0, 32]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 35, 0, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03284");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        char[] charArray17 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray17, 'a', (int) (short) 10);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray17, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray17, ' ');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray24);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.addAll(charArray7, charArray24);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(charArray7, '4');
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aitalianaa", charArray7);
        char[] charArray36 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray36, 'a', (int) (short) 10);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray36, ' ');
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray36, ' ');
        char[] charArray50 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray50, 'a', (int) (short) 10);
        char[] charArray60 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray60, 'a', (int) (short) 10);
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray60, ' ');
        char[] charArray67 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray60, ' ');
        char[] charArray68 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray67);
        char[] charArray69 = org.apache.commons.lang3.ArrayUtils.addAll(charArray50, charArray67);
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray36, charArray50);
        char[] charArray73 = org.apache.commons.lang3.ArrayUtils.subarray(charArray36, 10, 100);
        char[] charArray74 = org.apache.commons.lang3.ArrayUtils.addAll(charArray7, charArray73);
        char[] charArray75 = org.apache.commons.lang3.ArrayUtils.clone(charArray74);
        boolean boolean76 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray75);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray78 = org.apache.commons.lang3.ArrayUtils.remove(charArray75, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[]");
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03285");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray9);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.subarray(longArray9, 213, (int) (byte) 1);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray9, (long) 2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03286");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) -1);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 10);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(byteArray21, (byte) 10);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.clone(byteArray21);
        java.lang.Object obj25 = null;
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) byteArray24, obj25);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03287");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray4, 213, (int) 'x');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray4);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray4, 2, 213);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray13, 12, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, -1, 10]");
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03288");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Japanese (Japan)", "etruefalse                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03289");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ED", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03290");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("anglais (Etats-Unis)", "CN", "jpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpn", 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais (Etats-Unis)" + "'", str4, "anglais (Etats-Unis)");
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03291");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category3, locale4);
        java.lang.String str7 = locale4.getExtension('a');
        java.util.Locale.setDefault(category0, locale4);
        java.lang.String str9 = locale4.getISO3Country();
        java.lang.String str10 = locale4.getDisplayScript();
        java.lang.Integer[] intArray11 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray11, (int) (byte) -1);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray11);
        boolean boolean15 = locale4.equals((java.lang.Object) intArray11);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DEU" + "'", str9, "DEU");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03292");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray24, (byte) 10, (int) '#');
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.add(byteArray30, (byte) -1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray24, byteArray30);
        java.lang.Byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray30);
        java.lang.Byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray30);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray30);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.clone(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.remove(byteArray37, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 0]");
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("NG", "   {}   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NG" + "'", str2, "NG");
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03294");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(")enihC( sionihc", 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ")enihC( sionihc" + "'", str3, ")enihC( sionihc");
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03295");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "eng");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03296");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx", "51103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03297");
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray8 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a', (int) (short) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, ' ');
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray1, charArray15);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray1);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(charArray17, 'a');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.subarray(charArray17, 100, 7);
        char[] charArray29 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray29, 'a', (int) (short) 10);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray29, ' ');
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray29, ' ');
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray36);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray36);
        char[] charArray46 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray46, 'a', (int) (short) 10);
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray46, ' ');
        char[] charArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray46, ' ');
        char[] charArray60 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray60, 'a', (int) (short) 10);
        char[] charArray70 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int73 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray70, 'a', (int) (short) 10);
        int int75 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray70, ' ');
        char[] charArray77 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray70, ' ');
        char[] charArray78 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray77);
        char[] charArray79 = org.apache.commons.lang3.ArrayUtils.addAll(charArray60, charArray77);
        boolean boolean80 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray46, charArray60);
        boolean boolean81 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray60);
        boolean boolean82 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray36, charArray60);
        char[] charArray83 = org.apache.commons.lang3.ArrayUtils.addAll(charArray17, charArray36);
        boolean boolean84 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray17);
        boolean boolean85 = org.apache.commons.lang3.StringUtils.containsAny("fRENCH (fRANCE)", charArray17);
        boolean boolean87 = org.apache.commons.lang3.ArrayUtils.contains(charArray17, '#');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 4 + "'", int73 == 4);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray83), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray83), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray83), "[4, a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ENG", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EN" + "'", str2, "EN");
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03299");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("china", "#tts-Unis");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03300");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("n-US   ", 28, 250);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03301");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "{FPFPFPFPNPJ", (java.lang.CharSequence) "DEU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03302");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxItalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxItalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxItalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03303");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.util.Locale locale2 = java.util.Locale.US;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale1.getDisplayScript(locale3);
        java.lang.String str6 = locale1.getDisplayLanguage();
        java.lang.String str7 = locale1.getDisplayVariant();
        java.lang.String str8 = locale1.getDisplayLanguage();
        java.lang.String str9 = locale1.getDisplayName();
        java.lang.String str10 = locale0.getDisplayVariant(locale1);
        java.util.Locale locale12 = new java.util.Locale("Italian");
        java.util.Locale locale13 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        java.util.Locale locale15 = java.util.Locale.US;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale15.getDisplayCountry();
        java.lang.String str18 = locale12.getDisplayVariant(locale15);
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.lang.String str20 = locale19.getDisplayName();
        java.lang.String str21 = locale19.getLanguage();
        java.lang.String str22 = locale12.getDisplayLanguage(locale19);
        java.lang.String str23 = locale1.getDisplayCountry(locale12);
        java.lang.String str24 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-US" + "'", str4, "en-US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italiano" + "'", str6, "italiano");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italiano" + "'", str8, "italiano");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italiano (Italia)" + "'", str9, "italiano (Italia)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale12.toString(), "italian");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "italian" + "'", str14, "italian");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Stati Uniti" + "'", str17, "Stati Uniti");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "giapponese (Giappone)" + "'", str20, "giapponese (Giappone)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ja" + "'", str21, "ja");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "italian" + "'", str22, "italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Italy" + "'", str23, "Italy");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "it_IT" + "'", str24, "it_IT");
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03304");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\u5229\u5927\u610f\u6587\u5229\u5927\u610f", "South Korea");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03305");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[] shortArray1 = new java.lang.Short[] {};
        java.lang.Short[] shortArray2 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray3 = new java.lang.Short[][] { shortArray0, shortArray1, shortArray2 };
        java.lang.Short[][] shortArray4 = org.apache.commons.lang3.ArrayUtils.clone(shortArray3);
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) 0 };
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray6, (java.lang.Object) (byte) 10);
        java.lang.Short[][] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, shortArray6);
        java.lang.Short[] shortArray14 = new java.lang.Short[] { (short) 0 };
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14, (short) (byte) 1);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray16, (int) (short) 0, (int) 'u');
        java.lang.Short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short[][] shortArray23 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, 29, shortArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 29, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[0]");
        org.junit.Assert.assertNotNull(shortArray22);
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03307");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{false,false,false,false,true", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) 0 };
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray6, (java.lang.Object) (byte) 10);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray6);
        char[] charArray18 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray18, 'a', (int) (short) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, ' ');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray18, ' ');
        java.lang.Short[] shortArray27 = new java.lang.Short[] { (short) 0 };
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray27, (short) (byte) 1);
        java.lang.Cloneable[] cloneableArray30 = new java.lang.Cloneable[] { shortArray6, charArray18, shortArray29 };
        java.lang.Short[] shortArray32 = new java.lang.Short[] { (short) 0 };
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray32, (short) (byte) 1);
        java.lang.Cloneable[] cloneableArray35 = org.apache.commons.lang3.ArrayUtils.add(cloneableArray30, (java.lang.Cloneable) shortArray32);
        java.lang.String[] strArray36 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        int int37 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray36);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) cloneableArray30, (java.lang.Object[]) strArray36);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.replaceEach("united states", strArray4, strArray36);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0]");
        org.junit.Assert.assertNotNull(cloneableArray30);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0]");
        org.junit.Assert.assertNotNull(cloneableArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "united states" + "'", str39, "united states");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03308");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("-1.0", "Giappone", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03309");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "CHINA", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03311");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("it_IT", "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03312");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\u6cd5\u6587\u6cd5\u56fd)", "FR_fr", "United States");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("US                                                                                                  ", "AAAAADEAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03314");
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale1.getDisplayCountry(locale3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("en-US", locale3);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale.Builder builder10 = builder6.clear();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale11.getISO3Country();
        java.util.Locale.Builder builder13 = builder10.setLocale(locale11);
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale locale15 = builder13.build();
        boolean boolean16 = locale15.hasExtensions();
        java.lang.String str17 = locale3.getDisplayCountry(locale15);
        java.lang.String str18 = locale3.getDisplayScript();
        java.lang.String str20 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) locale3, "Japanese");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = locale3.getUnicodeLocaleType(" trutrufals");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:  trutrufals");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-US" + "'", str2, "en-US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u7f8e\u56fd" + "'", str4, "\u7f8e\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EN-US" + "'", str5, "EN-US");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "KOR" + "'", str12, "KOR");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\uc911\uad6d" + "'", str17, "\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zh_CN" + "'", str20, "zh_CN");
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03315");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range={{false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03316");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("10321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051", "etruefalse                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("u uu", "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u uu" + "'", str2, "u uu");
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03318");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("FRA", "  {false,false,false,false,true}   ", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA", "FRA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA" + "'", str2, "en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA");
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03320");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("97United States1United States10United States10United States35United States-1United States35United States-1", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=97unitedstates1unitedstates10unitedstates10unitedstates35unitedstates-1unitedstates35unitedstates-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03321");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) " ...", (java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) " FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03323");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, 250);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", (int) (short) -1, 756);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str3, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en...", "China");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03326");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.add(shortArray2, (short) 0);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03327");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, false);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, false);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true, 2);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, 32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("{false,false,false,false,tra", "{fulse,fulse,fulse,fulse,true");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{false,false,false,false,tra" + "'", str2, "{false,false,false,false,tra");
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03329");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("true}", "italien (Italie)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true}" + "'", str2, "true}");
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03331");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_CN" + "'", str2, "zh_CN");
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03332");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray12);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray23, (byte) 10, (int) '#');
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.add(byteArray29, (byte) -1);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray23, byteArray29);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray23);
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.add(byteArray36, (byte) -1);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray38, (byte) 100, (-1));
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray23, byteArray38);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray23);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray12, (byte) 100);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray52, (byte) 10, (int) '#');
        byte[] byteArray56 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray52);
        byte[] byteArray57 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray12, byteArray56);
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray57, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray62 = org.apache.commons.lang3.ArrayUtils.add(byteArray57, (int) (short) -1, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[10, 1, 1, 0, 1, 10, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 0, 10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1, 0, 10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 6 + "'", int59 == 6);
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03333");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setLanguage("German");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("{97,1,10");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: {97,1,10 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Chinese (China)", "anglais(Etats-Unis)                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (China)" + "'", str2, "Chinese (China)");
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\u52a0\u62ff\u5927", "KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u52a0\u62ff\u5927" + "'", str2, "\u52a0\u62ff\u5927");
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("{97,1,10,10,35,-1,35,-1}", "{");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{97,1,10,10,35,-1,35,-1}" + "'", str2, "{97,1,10,10,35,-1,35,-1}");
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03337");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\u5fb7\u56fd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u5fb7\u56fd" + "'", str1, "\u5fb7\u56fd");
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03339");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("{nglais (Etats-Unis)}", "                                                                                                                                                                                                                                                 {false,..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US" + "'", str2, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03341");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US" + "'", str1, "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03342");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "en_US", (java.lang.CharSequence) "#tts-Unis");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03343");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("united states", "97United States1United States10United States10United States35United States-1United States35United States-1", "coreanoaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03344");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("FR_fr", "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                       aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    " + "'", str2, "                                                                       aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ");
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03346");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Japanese (Japan)", " italien (Italie)hi!italien (Italie)en-USitalien (Italie) ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03347");
        long[] longArray0 = new long[] {};
        long[] longArray5 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray7, (long) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray0, longArray7);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray7, (long) 10, (int) (short) 1);
        java.lang.Long[] longArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray14);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray15);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray16, (long) 13);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.clone(longArray18);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) (short) 1, (java.lang.Object) longArray19);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03348");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 1.0f);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0]");
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03349");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("IT", "##", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03350");
        double[] doubleArray0 = null;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) '#');
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03351");
        java.lang.Boolean[] booleanArray0 = null;
        boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0);
        org.junit.Assert.assertNull(booleanArray1);
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03352");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.remove(floatArray0, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03354");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0", "United States", (int) (byte) 100);
        java.lang.String str4 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) "United States");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "United States" + "'", str4, "United States");
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03355");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale.Category[] categoryArray10 = new java.util.Locale.Category[] { category0, category2, category3, category4, category6, category8 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray11 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray10);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray14 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray11, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray14);
        java.lang.Short[] shortArray17 = new java.lang.Short[] { (short) 0 };
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17, (short) (byte) 1);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray17, (java.lang.Object) (byte) 10);
        java.lang.Short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        java.lang.Boolean[] booleanArray26 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray26);
        java.lang.Boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray27);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray22, (java.lang.Object) booleanArray27, (int) (byte) 1);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray27);
        char[] charArray39 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray39, 'a', (int) (short) 10);
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray39, ' ');
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray39, ' ');
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray46);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray46);
        boolean boolean49 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray46);
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray46, '#', (int) (short) -1);
        char[] charArray55 = org.apache.commons.lang3.ArrayUtils.add(charArray46, 2, 'u');
        java.lang.Object obj56 = objMap15.replace((java.lang.Object) booleanArray27, (java.lang.Object) charArray55);
        float[] floatArray57 = new float[] {};
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray57);
        float[] floatArray59 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray57);
        float[] floatArray60 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray59);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray60);
        float[] floatArray62 = org.apache.commons.lang3.ArrayUtils.clone(floatArray60);
        float[] floatArray65 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray60, (int) '4', (int) ' ');
        float[] floatArray68 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray65, 7, 4);
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.contains(floatArray68, 0.0f);
        java.lang.Object obj71 = objMap15.remove((java.lang.Object) 0.0f);
        java.util.Locale locale72 = java.util.Locale.ROOT;
        java.lang.String str73 = locale72.getDisplayCountry();
        java.util.Locale locale74 = java.util.Locale.US;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.lang.String str76 = locale74.getDisplayCountry();
        java.lang.Object obj77 = objMap15.getOrDefault((java.lang.Object) locale72, (java.lang.Object) str76);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[true, true, false]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4, a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "4au 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "4au 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[4, a, u,  , 4,  ]");
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[]");
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray60), "[]");
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[]");
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray68), "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Stati Uniti" + "'", str76, "Stati Uniti");
// flaky:         org.junit.Assert.assertEquals("'" + obj77 + "' != '" + "Stati Uniti" + "'", obj77, "Stati Uniti");
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03356");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("France", "ja                                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03357");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444444444italien (Italie)44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03358");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("zh-cn", 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03359");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03360");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\u5229\u5927\u610f\u6587\u5229\u5927\u610f", "giapponese (Giappone)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03361");
        java.util.Locale locale2 = new java.util.Locale("100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "truetruefalsetruetruefalsetruetruefalsetruetruefalsetruetChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr");
        org.junit.Assert.assertEquals(locale2.toString(), "100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0_TRUETRUEFALSETRUETRUEFALSETRUETRUEFALSETRUETRUEFALSETRUETCHINATRUETRUEFALSETRUETRUEFALSETRUETRUEFALSETRUETRUEFALSETRUETR");
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03362");
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("eng", locale1);
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.toLanguageTag();
        java.util.Locale locale6 = java.util.Locale.US;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale4.getDisplayCountry(locale7);
        java.lang.String str10 = locale1.getDisplayVariant(locale7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zh_CN");
        float[] floatArray13 = new float[] {};
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray13);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray13);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray15);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray16);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.clone(floatArray16);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray16, (int) '4', (int) ' ');
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, 7, 4);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, 23, 98);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray12, (java.lang.Object) 98);
        boolean boolean29 = locale7.equals((java.lang.Object) int28);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ENG" + "'", str3, "ENG");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-US" + "'", str5, "en-US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "United States" + "'", str9, "United States");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03363");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("fr_FR", "100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03364");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "RK_ok{fnlse,fnlse,fnlse,fnlse,trne", 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03365");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 2, 0, (double) 100);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (-1.0d), 42, 1.0d);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray5, 10, (int) (short) 1);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 10L);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03366");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229) ", "Giappone", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        " + "'", str2, "        ");
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03368");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("cor\351en (Cor\351e du Sud)", 2, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cor\351en (Cor\351e du Sud)" + "'", str3, "cor\351en (Cor\351e du Sud)");
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03369");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd", "{");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03370");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale4.getDisplayVariant();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str7 = locale4.getScript();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale4);
        boolean boolean9 = locale4.hasExtensions();
        java.lang.String str10 = locale4.getScript();
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale11.toLanguageTag();
        java.util.Locale locale13 = java.util.Locale.US;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.lang.String str16 = locale11.getDisplayCountry(locale14);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale locale18 = java.util.Locale.US;
        java.util.Locale locale19 = locale18.stripExtensions();
        java.lang.String str20 = locale19.getLanguage();
        java.lang.String str21 = locale17.getDisplayScript(locale19);
        java.lang.String str22 = locale11.getDisplayName(locale17);
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str24 = locale17.getDisplayName(locale23);
        java.lang.String str25 = locale17.getVariant();
        java.util.Locale locale26 = locale17.stripExtensions();
        java.lang.String str27 = locale4.getDisplayLanguage(locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = locale4.getUnicodeLocaleType("france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en-US" + "'", str12, "en-US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "United States" + "'", str16, "United States");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "anglais (Etats-Unis)" + "'", str22, "anglais (Etats-Unis)");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str24, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "chinois" + "'", str27, "chinois");
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03371");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale.Category[] categoryArray10 = new java.util.Locale.Category[] { category0, category2, category3, category4, category6, category8 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray11 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray10);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray14 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray11, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray14);
        int int16 = objMap15.size();
        java.lang.Short[] shortArray17 = new java.lang.Short[] {};
        java.lang.Short[] shortArray18 = new java.lang.Short[] {};
        java.lang.Short[] shortArray19 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray20 = new java.lang.Short[][] { shortArray17, shortArray18, shortArray19 };
        java.lang.Short[][] shortArray21 = org.apache.commons.lang3.ArrayUtils.clone(shortArray20);
        boolean[] booleanArray27 = new boolean[] { false, false, false, false, true };
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray27);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray27, (int) (byte) -1, (int) '#');
        java.lang.String str32 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray27);
        java.lang.Object obj33 = objMap15.replace((java.lang.Object) shortArray20, (java.lang.Object) booleanArray27);
        float[] floatArray40 = new float[] { 10, '#', 3, (byte) -1, 0, (byte) 0 };
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray40);
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray40, (int) (short) 1, 10);
        float[] floatArray46 = org.apache.commons.lang3.ArrayUtils.add(floatArray44, 10.0f);
        boolean boolean47 = objMap15.equals((java.lang.Object) 10.0f);
        java.lang.String[] strArray51 = org.apache.commons.lang3.StringUtils.split("RK_ok{fnlse,fnlse,fnlse,fnlse,trne", "  {FPFPFPFPNPJ   ", 39);
        java.lang.Object obj52 = objMap15.remove((java.lang.Object) "  {FPFPFPFPNPJ   ");
        java.lang.Short[] shortArray54 = new java.lang.Short[] { (short) 0 };
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray54, (short) (byte) 1);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray56);
        java.lang.Short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray56);
        java.lang.Short[] shortArray60 = new java.lang.Short[] { (short) 0 };
        short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray60, (short) (byte) 1);
        short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray56, shortArray62);
        short[] shortArray65 = org.apache.commons.lang3.ArrayUtils.add(shortArray56, (short) (byte) -1);
        short[] shortArray67 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray65, (short) (byte) 100);
        int int69 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray67, (short) 10);
        short[] shortArray70 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray67);
        short[] shortArray72 = org.apache.commons.lang3.ArrayUtils.add(shortArray70, (short) 100);
        short[] shortArray73 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean74 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray73);
        boolean boolean75 = objMap15.remove((java.lang.Object) shortArray72, (java.lang.Object) boolean74);
        double[] doubleArray76 = new double[] {};
        int int79 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray76, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray80 = null;
        double[] doubleArray81 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray76, doubleArray80);
        boolean boolean82 = objMap15.containsKey((java.lang.Object) doubleArray76);
        java.lang.Double[] doubleArray86 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray88 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray86, (double) (short) 100);
        java.lang.Float[] floatArray93 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray95 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray93, (float) 0L);
        int int97 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray95, (float) 2);
        int int98 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray86, (java.lang.Object) 2);
        boolean boolean99 = objMap15.remove((java.lang.Object) "EN-US", (java.lang.Object) 2);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{false,false,false,false,true}" + "'", str32, "{false,false,false,false,true}");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0, 35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[35.0, 3.0, -1.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[0]");
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray67), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[0, -1, 100]");
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray93);
        org.junit.Assert.assertNotNull(floatArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray95), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03372");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, (long) (byte) -1);
        long[] longArray13 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray13, 0L);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray15, (long) (byte) 0);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray15);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray15);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.clone(longArray15);
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray22);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray23, (long) 13);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray25);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.add(longArray26, (long) 100);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray26, (long) 10);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[1, 100, 35, 10, 1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[1, 100, 35, 10, 100]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03373");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale4.getDisplayVariant();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str7 = locale4.getScript();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setRegion("tr#tr#fals                                    ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: tr#tr#fals                                     [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03374");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444444444444444444444444fRANCE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("  {false,false,false,false,true}  ", "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  {false,false,false,false,true}  " + "'", str2, "  {false,false,false,false,true}  ");
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\u82f1\u8a9e\u30a2EN_US             ", "fra", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a2EN_US             " + "'", str3, "\u82f1\u8a9e\u30a2EN_US             ");
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("u uu ", 42, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03378");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "italien");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("{false,fal", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\u65e5\u6587\u65e5\u672c)0", "...e)4444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u6587\u65e5\u672c)0" + "'", str2, "\u65e5\u6587\u65e5\u672c)0");
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03380");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                       aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03381");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, (double) (short) 100);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray7, 1.0d, (double) 35);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray7, (double) 0);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray7, (double) 100, (double) (byte) 10);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray7);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray7, (double) 3, (int) 'u');
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) 221);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) 4, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03382");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510", "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03383");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) (short) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray6, (java.lang.Object) "TRUETRUEFALSE");
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6);
        java.lang.Double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray15 = new double[] { 4, 100L };
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray15, (int) '4', 5);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 2, 0, (double) 100);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray12, (java.lang.Object) 100, (int) (short) 100);
        java.lang.Double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray12);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray25, (double) 42);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray11, doubleArray27);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray11, (double) 'u');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03384");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str1 = locale0.getVariant();
        java.lang.Class<?> wildcardClass2 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03385");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("-1.01.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1.01.0" + "'", str1, "-1.01.0");
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str1, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  {FALSE,FALSE,FALSE,FALSE,TRUE}  ", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  {FALSE,FALSE,FALSE,FALSE,TRUE}  " + "'", str2, "  {FALSE,FALSE,FALSE,FALSE,TRUE}  ");
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03388");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("USA", "{S}", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03389");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (coreano)", "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2e_US", (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd" + "'", str4, "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03390");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u65e5\u6587\u65e5\u5927\u5229\u6587", "        {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ   ", 5);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03391");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA", "10321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03392");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2e_US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(?e_us??(?e_us??(?e_us??(?e_us??(?e_us??(?e_us??(?e_us??(?e_us??(?e_us??(?e_us");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\u6cd5\u6587\u6cd5\u56fd)", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03394");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE", "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03395");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale3.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03396");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) 'a');
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, 131, 95);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 35, 0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03397");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setRegion("IT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.addUnicodeLocaleAttribute("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927" + "'", str1, "\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927");
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03399");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)", 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03400");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray12 = new boolean[] { false, false, false, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (byte) -1, (int) '#');
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, 0, (int) (short) 1);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray20, false);
        java.lang.String str24 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray22, "\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03401");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("Etats-Unis");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03402");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "1 100 35 10aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03403");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                      {false,..                                                      ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927", "\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927" + "'", str2, "\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927");
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03405");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("{FPFPFPFPNPJ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range={fpfpfpfpnpj");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03406");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) (short) 0);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray3, (java.lang.Object) doubleArray13, 4);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 7, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03407");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        int[] intArray10 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray10);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray10, (int) '4');
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray14);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 35, 0, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("  en-US   ", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US   " + "'", str2, "  en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US   ");
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03409");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'u');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, 'u');
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.toObject(charArray13);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray15, 'x');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  , 4,  , a, 4]");
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03410");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("}eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt", (int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03411");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Italian (Italy)", "\u7f8e\u570b");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian (Italy)" + "'", str2, "Italian (Italy)");
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03413");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\u5229\u5927\u610f\u6587\u5229\u5927\u610f", "44444444444444444444444444fRANCE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03414");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, 21, 42);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("fRENCH (fRANCE)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fRENCH (fRANCE)" + "'", str1, "fRENCH (fRANCE)");
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("tru#tru#fal", 2, "nglais (Etats-Unis)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tru#tru#fal" + "'", str3, "tru#tru#fal");
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03417");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("{false,...", "US", (-1));
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal", "fra");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03419");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str1, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03420");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("44444444444444444444444444fRANCE", "italien", (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03421");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        char[] charArray16 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray16, 'a', (int) (short) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray16, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray23);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.add(charArray23, 'a');
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray23, 'u');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " 4 a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " 4 a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ , 4,  , a, 4, a]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03422");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray2);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 100);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03423");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str1, "100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03424");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                               cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cor\351en (Cor\351e du Sud)" + "'", str1, "cor\351en (Cor\351e du Sud)");
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03425");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale.Category[] categoryArray10 = new java.util.Locale.Category[] { category0, category2, category3, category4, category6, category8 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray11 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray10);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray14 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray11, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray14);
        int int16 = objMap15.size();
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleKeys();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet18, ' ');
        java.lang.Object obj21 = objMap15.get((java.lang.Object) strSet18);
        char[] charArray28 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray28, 'a', (int) (short) 10);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray28, ' ');
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray28, ' ');
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray35, 'u', (int) '4');
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.subarray(charArray35, 23, (int) (byte) 1);
        long[] longArray43 = new long[] { 'a' };
        long[] longArray50 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.addAll(longArray43, longArray50);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.add(longArray51, (int) (short) 1, (long) (byte) 1);
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.subarray(longArray54, (-1), (-1));
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.subarray(longArray57, (int) (byte) 100, 0);
        long[] longArray62 = new long[] { 'a' };
        long[] longArray69 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray70 = org.apache.commons.lang3.ArrayUtils.addAll(longArray62, longArray69);
        long[] longArray72 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray70, (long) '4');
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray57, longArray72);
        long[] longArray78 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray80 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray78, 0L);
        int int82 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray80, (long) (byte) 0);
        boolean boolean83 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray80);
        long[] longArray84 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray80);
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray57, longArray80);
        java.lang.Object obj86 = objMap15.replace((java.lang.Object) charArray41, (java.lang.Object) boolean85);
        boolean boolean87 = objMap15.isEmpty();
        java.util.Collection<java.lang.Object> objCollection88 = objMap15.values();
        java.util.Locale.LanguageRange languageRange90 = new java.util.Locale.LanguageRange("zh-CN");
        java.lang.String str91 = languageRange90.getRange();
        boolean boolean93 = objMap15.remove((java.lang.Object) languageRange90, (java.lang.Object) 6);
        java.lang.Class<?> wildcardClass94 = languageRange90.getClass();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[97]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(objCollection88);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "zh-cn" + "'", str91, "zh-cn");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03426");
        char[] charArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03427");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 2, 0, (double) 100);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        double[] doubleArray11 = null;
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray10, doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.add(doubleArray12, 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03428");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) 0, (short) 0 };
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 0, (short) 0 };
        java.lang.Short[] shortArray8 = new java.lang.Short[] { (short) 0, (short) 0 };
        java.lang.Short[] shortArray11 = new java.lang.Short[] { (short) 0, (short) 0 };
        java.lang.Short[] shortArray14 = new java.lang.Short[] { (short) 0, (short) 0 };
        java.lang.Short[][] shortArray15 = new java.lang.Short[][] { shortArray2, shortArray5, shortArray8, shortArray11, shortArray14 };
        java.lang.Short[][] shortArray18 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray15, 10, 100);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray18);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "1 100 35 10aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03430");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "{uuu", "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("en-", "kor");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-" + "'", str2, "en-");
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str1, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03433");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray4 = null;
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) (byte) 10);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, 7, (int) 'x');
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03434");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("{fnlse,fnlse,fnlse,fnlse,trne");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: {fnlse,fnlse,fnlse,fnlse,trne [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03435");
        short[] shortArray0 = null;
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) 0 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray4);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        java.lang.Short[] shortArray8 = new java.lang.Short[] { (short) 0 };
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray8, (short) (byte) 1);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray10);
        java.lang.Short[] shortArray13 = new java.lang.Short[] { (short) 0 };
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray13, (short) (byte) 1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray15);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray15);
        java.lang.Short[] shortArray19 = new java.lang.Short[] { (short) 0 };
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19, (short) (byte) 1);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray15, shortArray21);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray10, shortArray22);
        java.lang.Short[] shortArray25 = new java.lang.Short[] { (short) 0 };
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25, (short) (byte) 1);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray27);
        java.lang.Short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray27);
        java.lang.Short[] shortArray31 = new java.lang.Short[] { (short) 0 };
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray31, (short) (byte) 1);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray33);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.add(shortArray27, (short) (byte) -1);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray36, (short) (byte) 100);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray38, (short) 10);
        short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray10, shortArray38);
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.add(shortArray10, (short) 0);
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray10);
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (int) (short) 0, (short) 0);
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray48);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.clone(shortArray48);
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray50, (short) (byte) 1);
        short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray50);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray53);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.contains(shortArray0, (short) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[0]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[0]");
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[0]");
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[]");
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03436");
        short[] shortArray0 = null;
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) 0 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray4);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        java.lang.Short[] shortArray8 = new java.lang.Short[] { (short) 0 };
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray8, (short) (byte) 1);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray10);
        java.lang.Short[] shortArray13 = new java.lang.Short[] { (short) 0 };
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray13, (short) (byte) 1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray15);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray15);
        java.lang.Short[] shortArray19 = new java.lang.Short[] { (short) 0 };
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19, (short) (byte) 1);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray15, shortArray21);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray10, shortArray22);
        java.lang.Short[] shortArray25 = new java.lang.Short[] { (short) 0 };
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25, (short) (byte) 1);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray27);
        java.lang.Short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray27);
        java.lang.Short[] shortArray31 = new java.lang.Short[] { (short) 0 };
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray31, (short) (byte) 1);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray33);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.add(shortArray27, (short) (byte) -1);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray36, (short) (byte) 100);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray38, (short) 10);
        short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray10, shortArray38);
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.add(shortArray10, (short) 0);
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray10);
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) 1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[0]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03437");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("English", "tru#tru#fals                                    ", 32, (int) '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Englishtru#tru#fals                                    " + "'", str4, "Englishtru#tru#fals                                    ");
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03438");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2EN_u", (int) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2EN_u" + "'", str3, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2EN_u");
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03439");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03440");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) (byte) 0);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray9 = new float[] {};
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray9);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray11);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray11, (float) 1);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray11, (float) '4');
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray11, (float) 2);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (float) 21);
        java.lang.Float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray21);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.remove(floatArray21, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 98, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[21.0]");
        org.junit.Assert.assertNotNull(floatArray22);
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03441");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "naliait");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03443");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) (short) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray6, (java.lang.Object) "TRUETRUEFALSE");
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) 250);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) 23);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03444");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute(" FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03445");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2EN_u", (java.lang.CharSequence) "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2EN_u" + "'", charSequence2, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2EN_u");
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03446");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[] shortArray1 = new java.lang.Short[] {};
        java.lang.Short[] shortArray2 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray3 = new java.lang.Short[][] { shortArray0, shortArray1, shortArray2 };
        java.lang.Short[][] shortArray4 = org.apache.commons.lang3.ArrayUtils.clone(shortArray3);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][] objArray8 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[][]) shortArray4, (java.lang.Object[]) doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: [Ljava.lang.Double;");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("chinois (Chine)                                                                                     ", 756, "EN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENchinois (Chine)                                                                                     ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENEN" + "'", str3, "ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENchinois (Chine)                                                                                     ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENEN");
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03448");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "{false,false,false,false,tru", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0" + "'", str3, "100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "{-1,35,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03450");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US   ", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03451");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = java.util.Locale.US;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.String str5 = locale0.getDisplayCountry(locale3);
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.US;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale8.getLanguage();
        java.lang.String str10 = locale6.getDisplayScript(locale8);
        java.lang.String str11 = locale0.getDisplayName(locale6);
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str13 = locale6.getDisplayName(locale12);
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.util.Locale locale15 = java.util.Locale.US;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale16.toLanguageTag();
        java.lang.String str18 = locale14.getDisplayScript(locale16);
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        java.lang.String str21 = locale16.getDisplayCountry(locale20);
        java.lang.String str22 = locale6.getDisplayName(locale20);
        java.util.Locale.Category category23 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale24 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category23, locale24);
        java.lang.String str27 = locale24.getExtension('a');
        java.lang.String str28 = locale20.getDisplayScript(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = locale24.getUnicodeLocaleType("}eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: }eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-US" + "'", str1, "en-US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "United States" + "'", str5, "United States");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "anglais (Etats-Unis)" + "'", str11, "anglais (Etats-Unis)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str13, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-US" + "'", str17, "en-US");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "United States" + "'", str21, "United States");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "French (France)" + "'", str22, "French (France)");
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.FORMAT + "'", category23.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de_DE");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03452");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\u65e5\u65870}1.0{0}100.0{0}1.0", "Etats-Unis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Etats-Unis" + "'", str2, "Etats-Unis");
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03453");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                     100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                     100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str1, "                                                                     100.0#-1.0#10.0#1.0#100.0#1.0");
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03455");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("TRUETRUEFALSE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUETRUEFALSE" + "'", str1, "TRUETRUEFALSE");
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "IT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\u65e5\u6587\u65e5\u5927\u5229\u6587", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u6587\u65e5\u5927\u5229\u6587" + "'", str2, "\u65e5\u6587\u65e5\u5927\u5229\u6587");
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03458");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray3);
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 0 };
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) 1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray9);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (short) (byte) -1);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray12, (short) (byte) 100);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(shortArray14, (short) (byte) 10);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray14);
        java.lang.Short[] shortArray19 = new java.lang.Short[] { (short) 0 };
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19, (short) (byte) 1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray21);
        java.lang.Short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray21);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray21, (int) (short) 0, (int) 'u');
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray14, shortArray21);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.add(shortArray21, 5, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, -1, 0]");
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03459");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("e", "Chine");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03460");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("United St", 37, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03461");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, false);
        java.lang.Boolean[] booleanArray17 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray17);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17, true);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray20);
        java.lang.Boolean[] booleanArray25 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray25);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, true);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray28, true);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray30);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray21, booleanArray31);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.add(booleanArray32, (int) (byte) 10, false);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray32, true);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[true, false, false, false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, false]");
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[true, false]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[true, false, false, false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[true, false, false, false, false, true, true, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03462");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("eng", "{FALSE,...", 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03463");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("IT", (int) 'u');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   " + "'", str1, "                                   ");
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03465");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", "TRUETRUEFALSE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US" + "'", str2, "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                true{false,f", "44444444444444444444444444France                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                true{false,f" + "'", str2, "                true{false,f");
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03467");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) (byte) 0);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (int) (short) 0, (float) 0);
        java.lang.Float[] floatArray17 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray17, (float) (byte) 0);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray19);
        float[] floatArray21 = new float[] {};
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray21);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray23);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray20, floatArray23);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray23, (float) 1);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray23);
        float[] floatArray29 = new float[] {};
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray29);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.add(floatArray29, 1.0f);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray28, floatArray29);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray34);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03468");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("{FPFPFPFPNPJ", (int) 'x');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03469");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{false,false,false,false,true}", "", (int) 'u');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03470");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category6);
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale10.getScript();
        java.util.Locale.setDefault(category6, locale10);
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Locale.setDefault(category6, locale15);
        java.util.Locale locale18 = locale15.stripExtensions();
        java.util.Locale.Builder builder19 = builder5.setLocale(locale18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale locale22 = java.util.Locale.CHINA;
        java.lang.String str23 = locale20.getDisplayCountry(locale22);
        java.util.Locale locale24 = java.util.Locale.US;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.lang.String str27 = locale22.getDisplayCountry(locale25);
        java.util.Locale.Builder builder28 = builder5.setLocale(locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder5.setScript("        {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:         {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ    [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en-US" + "'", str11, "en-US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en-US" + "'", str16, "en-US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en-US" + "'", str21, "en-US");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u7f8e\u56fd" + "'", str23, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "China" + "'", str27, "China");
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03471");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aitalianaa", "{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}", (int) (short) 100);
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) (short) 100);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, 1.0d, (double) 35);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) (byte) 100, (int) 'u', (double) 3);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray8);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray3, (java.lang.Object) doubleArray8);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray8, 10.0d, (double) (byte) 0);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) 13, (double) 17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                 {false,..", "                true{false,f");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                 {false,.." + "'", str2, "                                                                                                                                                                                                                                                 {false,..");
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03473");
        float[] floatArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03474");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray5);
        java.lang.Short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        java.lang.Short[] shortArray9 = new java.lang.Short[] { (short) 0 };
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray9, (short) (byte) 1);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray11);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.add(shortArray5, (short) (byte) -1);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray14, (short) (byte) 100);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray14);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray14);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) -1);
        java.util.Locale locale24 = new java.util.Locale("0", "{false,false,false,false,tru", "truetruefalse");
        java.lang.String str25 = locale24.getScript();
        java.lang.Short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.Short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray26);
        java.lang.Short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray27);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray27);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (byte) 1, "}eur", shortArray18, str25, shortArray27 };
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder32 = builder31.clearExtensions();
        java.util.Locale.Builder builder34 = builder31.removeUnicodeLocaleAttribute("JPN");
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray30, (java.lang.Object) builder34, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder38 = builder34.setVariant("                                                ENG                                                 ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                                                 ENG                                                  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, -1]");
        org.junit.Assert.assertEquals(locale24.toString(), "0_{FALSE,FALSE,FALSE,FALSE,TRU_truetruefalse");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1, }eur, [0, -1], , []]");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03475");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray10 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList11);
        java.util.Locale.FilteringMode filteringMode14 = null;
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList11, filteringMode14);
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale locale19 = new java.util.Locale("Italian");
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale22 = java.util.Locale.US;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.ITALY;
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale26.toLanguageTag();
        java.lang.String str28 = locale24.getDisplayScript(locale26);
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.util.Locale locale31 = java.util.Locale.US;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.lang.String str33 = locale32.toLanguageTag();
        java.lang.String str34 = locale30.getDisplayScript(locale32);
        java.lang.String str35 = locale30.getDisplayLanguage();
        java.util.Locale locale36 = java.util.Locale.ITALY;
        java.util.Locale locale37 = java.util.Locale.US;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.lang.String str39 = locale38.toLanguageTag();
        java.lang.String str40 = locale36.getDisplayScript(locale38);
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale16, locale19, locale20, locale21, locale22, locale24, locale29, locale30, locale38 };
        java.util.ArrayList<java.util.Locale> localeList42 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList42, localeArray41);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList42, filteringMode44);
        java.util.Locale locale46 = java.util.Locale.US;
        java.lang.String str47 = locale46.toLanguageTag();
        java.lang.String str48 = locale46.getScript();
        java.util.Locale[] localeArray49 = new java.util.Locale[] { locale46 };
        java.util.ArrayList<java.util.Locale> localeList50 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList50, localeArray49);
        java.util.Locale locale52 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList50);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap53);
        java.util.Locale locale55 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleAttributes();
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet56, "KOR");
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags(languageRangeList54, (java.util.Collection<java.lang.String>) strSet56);
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet61 = locale60.getUnicodeLocaleKeys();
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet61, "{97,1,10,10,35,-1,35,-1}");
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags(languageRangeList54, (java.util.Collection<java.lang.String>) strSet61, filteringMode64);
        java.lang.String str67 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList65, "DEUuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals(locale19.toString(), "italian");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en-US" + "'", str23, "en-US");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en-US" + "'", str27, "en-US");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "en-US" + "'", str33, "en-US");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Italian" + "'", str35, "Italian");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en-US" + "'", str39, "en-US");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(localeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode44.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "en-US" + "'", str47, "en-US");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(localeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(locale52);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode64.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "ko-KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ko-KR" + "'", str1, "Ko-KR");
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03477");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("italie", "{");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444444444444444italie4444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444italie4444444444444444" + "'", str1, "444444444444444italie4444444444444444");
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03479");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", (java.lang.CharSequence) "anglais (Etats-Unis)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd" + "'", str1, "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03482");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray16, (java.lang.Object) 4, 4);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 1);
        java.lang.Byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray16);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray23);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray24);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03483");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("JPN", "\u82f1\u8a9e\u30a2en_US", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03484");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u6cd5true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse", "United# #States", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03485");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("  {FALSE,FALSE,FALSE,FALSE,TRUE}  ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("44444444444444444444444444France", "true                                                                                                    true                                                                                                    false", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444France" + "'", str3, "44444444444444444444444444France");
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03487");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 0, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        java.lang.Boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, 21, 3);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[]");
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\u610f\u5927\u5229\u6587\u610f\u5927\u5229", 95);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229                                                                                       " + "'", str2, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229                                                                                       ");
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03489");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_CN" + "'", str1, "zh_CN");
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03490");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("Giappone");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setRegion("\u30a2\u30e1");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: (?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03491");
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2e_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2e_US" + "'", str1, "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2e_US");
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03492");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "en");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03493");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray11 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList12);
        java.util.Locale.FilteringMode filteringMode15 = null;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList12, filteringMode15);
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleAttributes();
        java.util.Locale locale20 = new java.util.Locale("Italian");
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Locale locale23 = java.util.Locale.US;
        java.lang.String str24 = locale23.toLanguageTag();
        java.util.Locale locale25 = java.util.Locale.ITALY;
        java.util.Locale locale26 = java.util.Locale.US;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.lang.String str28 = locale27.toLanguageTag();
        java.lang.String str29 = locale25.getDisplayScript(locale27);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = java.util.Locale.ITALY;
        java.util.Locale locale32 = java.util.Locale.US;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.lang.String str34 = locale33.toLanguageTag();
        java.lang.String str35 = locale31.getDisplayScript(locale33);
        java.lang.String str36 = locale31.getDisplayLanguage();
        java.util.Locale locale37 = java.util.Locale.ITALY;
        java.util.Locale locale38 = java.util.Locale.US;
        java.util.Locale locale39 = locale38.stripExtensions();
        java.lang.String str40 = locale39.toLanguageTag();
        java.lang.String str41 = locale37.getDisplayScript(locale39);
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale17, locale20, locale21, locale22, locale23, locale25, locale30, locale31, locale39 };
        java.util.ArrayList<java.util.Locale> localeList43 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList43, localeArray42);
        java.util.Locale.FilteringMode filteringMode45 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList43, filteringMode45);
        java.util.Locale locale47 = java.util.Locale.US;
        java.lang.String str48 = locale47.toLanguageTag();
        java.lang.String str49 = locale47.getScript();
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale47 };
        java.util.ArrayList<java.util.Locale> localeList51 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList51, localeArray50);
        java.util.Locale locale53 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap54 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap54);
        java.util.Locale locale56 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleAttributes();
        java.lang.String str59 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet57, "KOR");
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags(languageRangeList55, (java.util.Collection<java.lang.String>) strSet57);
        java.util.Locale locale61 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet62 = locale61.getUnicodeLocaleKeys();
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet62, "{97,1,10,10,35,-1,35,-1}");
        java.util.Locale.FilteringMode filteringMode65 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags(languageRangeList55, (java.util.Collection<java.lang.String>) strSet62, filteringMode65);
        java.util.Locale locale67 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet68 = locale67.getUnicodeLocaleAttributes();
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet68, ' ');
        java.lang.String str71 = java.util.Locale.lookupTag(languageRangeList55, (java.util.Collection<java.lang.String>) strSet68);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap72 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList73 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList55, strMap72);
        java.util.Collection<java.util.Locale> localeCollection74 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.parse("n", strMap76);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap78 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList79 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList77, strMap78);
        java.util.Locale locale80 = java.util.Locale.ITALY;
        java.util.Locale locale81 = java.util.Locale.US;
        java.util.Locale locale82 = locale81.stripExtensions();
        java.lang.String str83 = locale82.toLanguageTag();
        java.lang.String str84 = locale80.getDisplayScript(locale82);
        java.lang.String str85 = locale82.getISO3Language();
        java.util.Set<java.lang.String> strSet86 = locale82.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode87 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags(languageRangeList79, (java.util.Collection<java.lang.String>) strSet86, filteringMode87);
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter(languageRangeList55, localeCollection74, filteringMode87);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale90 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals(locale20.toString(), "italian");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en-US" + "'", str24, "en-US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en-US" + "'", str28, "en-US");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en-US" + "'", str34, "en-US");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Italian" + "'", str36, "Italian");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "en-US" + "'", str40, "en-US");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(localeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + filteringMode45 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode45.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "en-US" + "'", str48, "en-US");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(localeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(locale53);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + filteringMode65 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode65.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(languageRangeList73);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertNotNull(languageRangeList79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "en-US" + "'", str83, "en-US");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "eng" + "'", str85, "eng");
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertTrue("'" + filteringMode87 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode87.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(localeList89);
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("{false,false,false,false,tra", "        ja_JP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{false,false,false,false,tra" + "'", str2, "{false,false,false,false,tra");
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03495");
        float[] floatArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03496");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("51103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103", "11003510");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03497");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray3);
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 0 };
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) 1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray9);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (short) (byte) -1);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray12, (short) (byte) 100);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray14, (short) 10);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray14);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.add(shortArray17, (short) 100);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray19);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, 213, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 213, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, -1, 100]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, -1, 100]");
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("ZH_CN", "Chine");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZH_CN" + "'", str2, "ZH_CN");
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03499");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("frChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr_ChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetrFR", "china    ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03500");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) " italien (Italie)hi!italien (Italie)en-USitalien (Italie) ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}
