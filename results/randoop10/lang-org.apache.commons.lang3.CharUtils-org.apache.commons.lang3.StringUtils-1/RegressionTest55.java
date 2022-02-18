import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest55 {

    public static boolean debug = false;

    @Test
    public void test27501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27501");
        java.util.Locale locale1 = new java.util.Locale("\\u005c");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale3);
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale1.getDisplayScript(locale3);
        java.util.Locale.setDefault(locale1);
        java.lang.String str8 = locale1.getCountry();
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.util.Locale locale11 = java.util.Locale.getDefault(category9);
        java.lang.String str12 = locale11.getDisplayVariant();
        java.lang.String str13 = locale1.getDisplayName(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale1.getUnicodeLocaleType("##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################G");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################G");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "franz\366sisch (frankreich)" + "'", str4, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "\\u005c");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u005c" + "'", str13, "\\u005c");
    }

    @Test
    public void test27502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ko");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27503");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italian_ITALIAN_EnglisF", (double) 221);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=221.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27504");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "FRENCH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRENCH" + "'", str1, "FRENCH");
    }

    @Test
    public void test27505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27505");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u7fa9\u5927\u5229\u6587", 14, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u7fa9\u5927\u5229\u6587          " + "'", str3, "\u7fa9\u5927\u5229\u6587          ");
    }

    @Test
    public void test27506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27506");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("chinoisf(Chine)", '\n');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'c' + "'", char2 == 'c');
    }

    @Test
    public void test27507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27508");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "eagaash                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test27510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27510");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...", "FR...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("A)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaDzh_CNfRENCH (cANA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaDzh_CNfRENCH (cANA" + "'", str1, "A)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaDzh_CNfRENCH (cANA");
    }

    @Test
    public void test27512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27512");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                          nnnnnnnnnnnnnnnnnnne                               ", "\\u0061ItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalif");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27513");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList11, filteringMode13);
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList11, filteringMode15);
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList11, filteringMode17);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList25, filteringMode27);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList31);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList40, filteringMode42);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList46);
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap50);
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleAttributes();
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet53, "\\u005c");
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet53, "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strSet53);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap59 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap59);
        java.util.Locale.Builder builder61 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder62 = builder61.clearExtensions();
        java.util.Locale locale63 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str64 = locale63.getDisplayName();
        java.util.Locale.Builder builder65 = builder62.setLocale(locale63);
        java.util.Locale locale66 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder67 = builder62.setLocale(locale66);
        java.util.Set<java.lang.String> strSet68 = locale66.getUnicodeLocaleAttributes();
        java.lang.String str69 = locale66.getVariant();
        java.util.Locale locale70 = java.util.Locale.ITALIAN;
        java.lang.String str71 = locale70.getDisplayLanguage();
        java.lang.String str72 = locale66.getDisplayLanguage(locale70);
        java.util.Set<java.lang.String> strSet73 = locale66.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strSet73);
        java.lang.String str75 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet73);
        java.util.Collection<java.util.Locale> localeCollection76 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale77 = java.util.Locale.lookup(languageRangeList1, localeCollection76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode13.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + filteringMode15 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode15.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + filteringMode17 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode17.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode27.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode42.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(languageRangeList60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "French (Canada)" + "'", str64, "French (Canada)");
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Italian" + "'", str71, "Italian");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "tedesco" + "'", str72, "tedesco");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test27514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27514");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                      und-iTALIAN", "                                               TALY                                                ", 804);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "f_KOREAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "F_KOREAN" + "'", str1, "F_KOREAN");
    }

    @Test
    public void test27516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27516");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\ud55c\uad6d\uc5b4KR", "8IAN\\U0020I86");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27517");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "Koreanisch (S\374dkorea)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27518");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HHHHHHHHH", (java.lang.CharSequence) "\rRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27519");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "!ih_HHHHHHHHHHDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27520");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!_\\U0020_Itle########################################################################################", 'h');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27521");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "Azhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0cinese0(cina)Uu!!i9h..France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)A");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("nnnnnnn                                                                                               en", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test27522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27522");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 9, "!ih_HHHHHHHHHHDxxxxxxxxxxxxxxxxxxx                             ...titxxxxxxxxxxxxxxxxxx                             ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test27523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("... g ...", "\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064\\u0064");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... g ..." + "'", str2, "... g ...");
    }

    @Test
    public void test27524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                    \\U0020ItalianItalianItalianItali", "tttttttfr-C                 ttttttt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    \\U0020ItalianItalianItalianItali" + "'", str2, "                                                                    \\U0020ItalianItalianItalianItali");
    }

    @Test
    public void test27525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27525");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("EN_US", 264);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27526");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", "Italia                                                  ", 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test27528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27528");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                    ITALIAN (italian,eNGLISH)", ".................................Italian (Italy)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27529");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguage("ITALIAN");
        java.util.Locale locale9 = builder6.build();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale9);
        java.lang.String str11 = locale9.getCountry();
        java.lang.String str12 = locale9.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale9.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for italian");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "French (Canada)" + "'", str4, "French (Canada)");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italian" + "'", str12, "italian");
    }

    @Test
    public void test27530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27530");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ko", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ko" + "'", str3, "ko");
    }

    @Test
    public void test27531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27531");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "ti444444444", (java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n     Englisch");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "ti444444444" + "'", charSequence2, "ti444444444");
    }

    @Test
    public void test27532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27532");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ADA\\A\\AGA0A5AMANAOAQARASA6A0AWAXAZBABBBDB\\B\\BGBHB0BJB5BMBNBOBQBRBSB6BVBWBYBZCACCCDC\\CGCHC0CKC5CMCNCOCRC0CVCWCXCYCZD\\D\\...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27533");
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
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category0, locale14);
        boolean boolean16 = locale14.hasExtensions();
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale20.getExtension('h');
        java.lang.String str23 = locale19.getDisplayScript(locale20);
        java.util.Locale locale24 = locale19.stripExtensions();
        java.util.Locale.setDefault(category17, locale19);
        java.util.Locale locale26 = java.util.Locale.getDefault(category17);
        java.util.Locale locale27 = java.util.Locale.US;
        java.lang.String str28 = locale27.getScript();
        java.util.Set<java.lang.String> strSet29 = locale27.getUnicodeLocaleAttributes();
        java.lang.String str30 = locale27.getCountry();
        java.util.Locale.setDefault(locale27);
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.lang.String str34 = locale33.getDisplayLanguage();
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale33);
        java.lang.String str36 = locale33.getCountry();
        java.lang.String str37 = locale33.getCountry();
        java.lang.String str38 = locale27.getDisplayLanguage(locale33);
        java.util.Locale.setDefault(category17, locale33);
        java.lang.String str40 = locale14.getDisplayName(locale33);
        java.lang.String str41 = locale33.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u005c");
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
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.FORMAT + "'", category17.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "US" + "'", str30, "US");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "English" + "'", str34, "English");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "!IH" + "'", str35, "!IH");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "English" + "'", str38, "English");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "en" + "'", str41, "en");
    }

    @Test
    public void test27534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27534");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("u0049", "                                               ##########                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27535");
        java.util.Locale locale3 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str8 = locale6.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iTALIAN" + "'", str4, "iTALIAN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIENISCH" + "'", str5, "ITALIENISCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u0023 (ITALIENISCH,iTALIAN)" + "'", str7, "\\u0023 (ITALIENISCH,iTALIAN)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u0023_ITALIENISCH_iTALIAN" + "'", str8, "\\u0023_ITALIENISCH_iTALIAN");
    }

    @Test
    public void test27536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27536");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('b', (int) 'N');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78 + "'", int2 == 78);
    }

    @Test
    public void test27537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27537");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HCSTUD \\U0034", (int) (byte) 0, '-');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HCSTUD \\U0034" + "'", str3, "HCSTUD \\U0034");
    }

    @Test
    public void test27538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27538");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = new java.util.Locale("\\u005c");
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale17);
        java.lang.String str19 = locale17.getVariant();
        java.lang.String str20 = locale15.getDisplayScript(locale17);
        java.util.Locale.setDefault(locale15);
        java.util.Locale.setDefault(category13, locale15);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str27 = locale25.getExtension('h');
        java.lang.String str28 = locale24.getDisplayScript(locale25);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale24);
        java.lang.String str31 = locale24.getExtension('z');
        java.util.Locale.setDefault(category13, locale24);
        java.util.Locale locale33 = java.util.Locale.getDefault(category13);
        java.util.Locale locale34 = java.util.Locale.getDefault(category13);
        java.util.Locale.Builder builder35 = builder11.setLocale(locale34);
        java.lang.String str36 = locale34.getDisplayVariant();
        java.lang.String str37 = locale34.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale15.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "franz\366sisch (frankreich)" + "'", str18, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!       " + "'", str29, "hi!       ");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "fr-FR" + "'", str37, "fr-FR");
    }

    @Test
    public void test27539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                     ", "\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     " + "'", str2, "                                                     ");
    }

    @Test
    public void test27540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27540");
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
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u005c");
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
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
    }

    @Test
    public void test27541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27541");
        java.util.Locale locale2 = new java.util.Locale("French", "NC_HZ");
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("8ian\\u0020i86");
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale2.getDisplayLanguage(locale5);
        org.junit.Assert.assertEquals(locale2.toString(), "french_NC_HZ");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "french" + "'", str7, "french");
    }

    @Test
    public void test27542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                h                                 ", "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                h                                 " + "'", str2, "                                h                                 ");
    }

    @Test
    public void test27543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27543");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch", 'i');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("iFtlnz\\sisc02", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engliFtlnz\\sisc02sch" + "'", str4, "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engliFtlnz\\sisc02sch");
    }

    @Test
    public void test27544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27544");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046", "ESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Cor\351e du Sud");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cor\351e du Sud" + "'", str1, "Cor\351e du Sud");
    }

    @Test
    public void test27546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27546");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setRegion("FRANZ\326SISCH2(FRANKREICH)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRANZO?SISCH2(FRANKREICH) [at index 0]");
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
    public void test27547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27547");
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
        java.lang.String str16 = locale0.getVariant();
        java.util.Set<java.lang.Character> charSet17 = locale0.getExtensionKeys();
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale19.getExtension('h');
        java.lang.String str22 = locale18.getDisplayScript(locale19);
        java.util.Locale locale26 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str27 = locale18.getDisplayCountry(locale26);
        java.util.Locale.setDefault(locale18);
        java.lang.String str29 = locale18.getISO3Country();
        java.lang.String str30 = locale18.getISO3Country();
        java.util.Locale locale31 = java.util.Locale.US;
        java.lang.String str32 = locale31.toLanguageTag();
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleKeys();
        java.util.Locale.Category category34 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale35 = java.util.Locale.getDefault(category34);
        java.lang.String str36 = locale31.getDisplayLanguage(locale35);
        java.lang.String str37 = locale18.getDisplayVariant(locale35);
        java.util.Set<java.lang.Character> charSet38 = locale35.getExtensionKeys();
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = locale39.getDisplayScript(locale40);
        java.lang.String str42 = locale40.getVariant();
        java.lang.String str44 = locale40.getExtension('i');
        java.util.Locale.setDefault(locale40);
        java.lang.String str46 = locale40.getDisplayCountry();
        java.lang.String str47 = locale35.getDisplayScript(locale40);
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("44444444444444444444444444444444");
        java.lang.String str50 = locale40.getDisplayVariant(locale49);
        java.lang.String str51 = locale0.getDisplayVariant(locale40);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals(locale26.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "France" + "'", str27, "France");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FRA" + "'", str29, "FRA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FRA" + "'", str30, "FRA");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "en-US" + "'", str32, "en-US");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + category34 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category34.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "anglais" + "'", str36, "anglais");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charSet38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Canada" + "'", str46, "Canada");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test27548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27548");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ermanglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII(nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIermaynglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII)nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                 nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIANnglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                  ", "ian\\u0020", 371);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27549");
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
        java.lang.String str47 = locale11.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "anglais" + "'", str32, "anglais");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "!IH" + "'", str33, "!IH");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale40.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "italien" + "'", str44, "italien");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "italien" + "'", str47, "italien");
    }

    @Test
    public void test27550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27550");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("Italien");
        java.util.Locale.Builder builder7 = builder3.setLanguage("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setScript("\\u00de\\u00\\u00de\\u00\\u00d         INGLESE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: \\u00de\\u00\\u00de\\u00\\u00d         INGLESE [at index 0]");
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
    public void test27551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\0020iTALIANiTALIANiTALIANiTALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\0020italianitalianitalianitalzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", str1, "\\0020italianitalianitalianitalzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test27552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27552");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HSAAGAekkkkkkkkkkkkkkkkk", '7');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HSAAGAekkkkkkkkkkkkkkkkk" + "'", str3, "HSAAGAekkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test27553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("EFrankreichgFrankreichFrankreichsEFrankreicundEFrankreichgFrankreichFrankreichsEFrankreich", 20, "0020iIalian\\u008600u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EFrankreichgFrankreichFrankreichsEFrankreicundEFrankreichgFrankreichFrankreichsEFrankreich" + "'", str3, "EFrankreichgFrankreichFrankreichsEFrankreicundEFrankreichgFrankreichFrankreichsEFrankreich");
    }

    @Test
    public void test27554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27554");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("de", "itTAiT_ITALIAN_EgAish");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("4", (java.lang.Object[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "de" + "'", str4, "de");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "de" + "'", str6, "de");
    }

    @Test
    public void test27555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("TTAT_ITA", 194, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TTAT_ITA444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TTAT_ITA444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test27556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HCSINEI", "...........................................................................................................................................................................................z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r.......................................................................................................................................................................h.hzhhn_.AL.AN_ngzhsF");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HCSINEI" + "'", str2, "HCSINEI");
    }

    @Test
    public void test27557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27557");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27558");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)", "\\italian_ITALIAN_English");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '\r', 6, 0);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\", '8');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("####...", strArray3, strArray10);
        java.lang.Class<?> wildcardClass12 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "####..." + "'", str11, "####...");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test27559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)A", "de-DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27560");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "HHHHHHHHH         ITAL\\u0020iItalian\\u008600u\\HHHHHHHHH         ITAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27561");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                           U0020ITALIANITALIANITALIANITALI", "fffffffffffff                                                                        ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("g             E", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                eselgni                               ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test27562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27562");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)", "\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27563");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("u", 'A');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Korean", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test27564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27564");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "RNZ\326SISCH(KND                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27565");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("iTALIAN");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk)hcierknarF( hcsisoznarFhcsis\366znarF");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test27566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALI" + "'", str1, "...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALI");
    }

    @Test
    public void test27567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27567");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\uCinese (Cina)\\u0069h..\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u004a\\u", "\u97e9\u56fd");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27568");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("                                                                                          \\u005c         ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u005c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27569");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("r0                                               nailati                                                ", "KOREAN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                               ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########" + "'", str1, "##########");
    }

    @Test
    public void test27571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27571");
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
            java.util.Locale.Builder builder17 = builder15.setVariant("...EnglishEn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ...EnglishEn [at index 0]");
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
    public void test27572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27572");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("       !i.", "It_", "E    Italien");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       !i." + "'", str3, "       !i.");
    }

    @Test
    public void test27573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27573");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23", (int) 'Y');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("FRFRFRFRFRFRFRFRFRFRFRFRFdDEFRFRFRFRFRFRFRFRFRFRFRFRFR", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACfr-CAWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRFRFRFRFRFRFRFRFRFRFRFRFd" + "'", str2, "FRFRFRFRFRFRFRFRFRFRFRFRFd");
    }

    @Test
    public void test27575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27575");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("nglish (United Kingdom)french (NC_HZ)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NGLISH (uNITED kINGDOM)FRENCH (nc_hz)" + "'", str1, "NGLISH (uNITED kINGDOM)FRENCH (nc_hz)");
    }

    @Test
    public void test27576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27576");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder8 = builder5.setExtension('i', "");
        java.util.Locale locale12 = new java.util.Locale("", "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", "hi!       _\\U0020_Italienisch####################################################################...");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder5.setLocale(locale12);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHATZHAUZHAWZHAXZHAZZHBAZHBBZHBDZHBEZHBFZHBGZHBHZHBIZHBJZHBLZHBMZHBNZHBOZHBQZHBRZHBSZHBTZHBVZHBWZHBYZHBZZHCAZHCCZHCDZHCFZHCGZHCHZHCIZHCKZHCLZHCMZHCNZHCOZHCRZHCUZHCVZHCWZHCXZHCYZHCZZHDEZHDJZHDKZHDMZHDOZHDZZHECZHEEZHEGZHEHZHERZHESZHETZHFIZHFJZHFKZHFMZHFOZHFRZHGAZHGBZHGDZHGEZHGFZHGGZHGHZHGIZHGLZHGMZHGNZHGPZHGQZHGRZHGSZHGTZHGUZHGWZHGYZHHKZHHMZHHNZHHRZHHTZHHUZHIDZHIEZHILZHIMZHINZHIOZHIQZHIRZHISZHITZHJEZHJMZHJOZHJPZHKEZHKGZHKHZHKIZHKMZHKNZHKPZHKRZHKWZHKYZHKZZHLAZHLBZHLCZHLIZHLKZHLRZHLSZHLTZHLUZHLVZHLYZHMAZHMCZHMDZHMEZHMFZHMGZHMHZHMKZHMLZHMMZHMNZHMOZHMPZHMQZHMRZHMSZHMTZHMUZHMVZHMWZHMXZHMYZHMZZHNAZHNCZHNEZHNFZHNGZHNIZHNLZHNOZHNPZHNRZHNUZHNZZHOMZHPAZHPEZHPFZHPGZHPHZHPKZHPLZHPMZHPNZHPRZHPSZHPTZHPWZHPYZHQAZHREZHROZHRSZHRUZHRWZHSAZHSBZHSCZHSDZHSEZHSGZHSHZHSIZHSJZHSKZHSLZHSMZHSNZHSOZHSRZHSSZHSTZHSVZHSXZHSYZHSZZHTCZHTDZHTFZHTGZHTHZHTJZHTKZHTLZHTMZHTNZHTOZHTRZHTTZHTVZHTWZHTZZHUAZHUGZHUMZHUSZHUYZHUZZHVAZHVCZHVEZHVGZHVIZHVNZHVUZHWFZHWSZHYEZHYTZHZAZHZMZHZW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test27577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27577");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "AD\rAE\rAF\rAG\rAI\rAL\rAM\rAN\rAO\rAQ\rAR\rAS\rAT\rAU\rAW\rAX\rAZ\rBA\rBB\rBD\rBE\rBF\rBG\rBH\rBI\rBJ\rBL\rBM\rBN\rBO\rBQ\rBR\rBS\rBT\rBV\rBW\rBY\rBZ\rCA\rCC\rCD\rCF\rCG\rCH\rCI\rCK\rCL\rCM\rCN\rCO\rCR\rCU\rCV\rCW\rCX\rCY\rCZ\rDE\rDJ\rDK\rDM\rDO\rDZ\rEC\rEE\rEG\rEH\rER\rES\rET\rFI\rFJ\rFK\rFM\rFO\rFR\rGA\rGB\rGD\rGE\rGF\rGG\rGH\rGI\rGL\rGM\rGN\rGP\rGQ\rGR\rGS\rGT\rGU\rGW\rGY\rHK\rHM\rHN\rHR\rHT\rHU\rID\rIE\rIL\rIM\rIN\rIO\rIQ\rIR\rIS\rIT\rJE\rJM\rJO\rJP\rKE\rKG\rKH\rKI\rKM\rKN\rKP\rKR\rKW\rKY\rKZ\rLA\rLB\rLC\rLI\rLK\rLR\rLS\rLT\rLU\rLV\rLY\rMA\rMC\rMD\rME\rMF\rMG\rMH\rMK\rML\rMM\rMN\rMO\rMP\rMQ\rMR\rMS\rMT\rMU\rMV\rMW\rMX\rMY\rMZ\rNA\rNC\rNE\rNF\rNG\rNI\rNL\rNO\rNP\rNR\rNU\rNZ\rOM\rPA\rPE\rPF\rPG\rPH\rPK\rPL\rPM\rPN\rPR\rPS\rPT\rPW\rPY\rQA\rRE\rRO\rRS\rRU\rRW\rSA\rSB\rSC\rSD\rSE\rSG\rSH\rSI\rSJ\rSK\rSL\rSM\rSN\rSO\rSR\rSS\rST\rSV\rSX\rSY\rSZ\rTC\rTD\rTF\rTG\rTH\rTJ\rTK\rTL\rTM\rTN\rTO\rTR\rTT\rTV\rTW\rTZ\rUA\rUG\rUM\rUS\rUY\rUZ\rVA\rVC\rVE\rVG\rVI\rVN\rVU\rWF\rWS\rYE\rYT\rZA\rZM\rZW");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27578");
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
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList37, filteringMode39);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList43);
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
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList58);
        java.util.Locale.FilteringMode filteringMode62 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList61, filteringMode62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap65);
        java.util.Locale locale67 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.lang.String str69 = locale67.getVariant();
        java.lang.String str70 = locale67.getDisplayName();
        java.lang.String str71 = locale67.getCountry();
        java.util.Set<java.lang.String> strSet72 = locale67.getUnicodeLocaleKeys();
        java.lang.String str73 = java.util.Locale.lookupTag(languageRangeList66, (java.util.Collection<java.lang.String>) strSet72);
        java.util.Locale.LanguageRange[] languageRangeArray74 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList75 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList75, languageRangeArray74);
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        java.lang.String[] strArray82 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strList83, filteringMode85);
        java.util.Locale.FilteringMode filteringMode87 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList75, (java.util.Collection<java.lang.String>) strList83, filteringMode87);
        java.util.Collection<java.util.Locale> localeCollection89 = null;
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList75, localeCollection89);
        java.util.Locale locale91 = java.util.Locale.lookup(languageRangeList66, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap93 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList94 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap93);
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
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode39.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
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
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertTrue("'" + filteringMode62 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode62.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "italien" + "'", str70, "italien");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(languageRangeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode85.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertTrue("'" + filteringMode87 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode87.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(localeList90);
        org.junit.Assert.assertNull(locale91);
        org.junit.Assert.assertNotNull(localeList92);
        org.junit.Assert.assertNotNull(languageRangeList94);
    }

    @Test
    public void test27579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27579");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hIAN\\U0020Ih");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("ECANADAgCANADACANADAsh                                                                                                  ", strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)A");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test27580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27580");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTALI", "English", 4);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD", "                                                                                           U0020", 262);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", strArray5, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD" + "'", str10, "en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD");
    }

    @Test
    public void test27581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27581");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        java.lang.String str5 = locale1.getDisplayVariant();
        java.lang.String str6 = locale1.getLanguage();
        java.util.Locale locale7 = locale1.stripExtensions();
        java.lang.String str8 = locale7.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test27582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27582");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Frnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFEEEEEEEEEEEEE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27583");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        java.lang.String str8 = languageRange1.getRange();
        double double9 = languageRange1.getWeight();
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A", "", (int) (byte) 100);
        boolean boolean14 = languageRange1.equals((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e" + "'", str7, "e");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "e" + "'", str8, "e");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test27584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27584");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("       !ih", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNEnglisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27585");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  " + "'", str1, "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  ");
    }

    @Test
    public void test27586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27586");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ZH_cn", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                      i (italian,english)                                      ", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23", "ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23" + "'", str2, "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
    }

    @Test
    public void test27588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27588");
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
            java.util.Locale.Builder builder19 = builder17.setLanguageTag("anglais (Royaume-Uni)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: anglais (Royaume [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italien" + "'", str12, "italien");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test27589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27589");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u82f1\u6587\u82f1\u56fd)", "        \\u005c         canadacanadacanadacan");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27590");
        char[] charArray7 = new char[] { ' ' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("FRENCH (CANADA)", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("en_CA", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "2E             GITALIANITALIANITALIANITAL", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("french", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test27591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "                                                                                                              ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR" + "'", str2, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
    }

    @Test
    public void test27592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27592");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRTALIAN\\u002", 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27593");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str1, "Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test27595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27595");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("hzhzhzhzhz", "\\u0029");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hzhzhzhzhz [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test27596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27596");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("nailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatiko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatiko" + "'", str1, "nailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatiko");
    }

    @Test
    public void test27597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\u0038ZHO                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0038ZHO" + "'", str1, "\\u0038ZHO");
    }

    @Test
    public void test27598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27598");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("CHNtttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt", "ZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cn");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27599");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d", "hi!allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...allemand\\u0034allemandhi!allemanditalianallemand\\u0061allemand\\u0023allemandhi!allemanditalianallemandchinese(china)allemandhi!allemandzh_cnallemanditalianallemandenallemanditalienisch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27600");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale locale6 = builder0.build();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale6.getExtension('N');
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test27601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\\u0020iTALIANiTALIANiTALIANiTALI", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str2, "\\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test27602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27602");
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
        java.lang.String str16 = locale0.getVariant();
        java.util.Set<java.lang.Character> charSet17 = locale0.getExtensionKeys();
        java.util.Set<java.lang.String> strSet18 = locale0.getUnicodeLocaleKeys();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test27603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27603");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("italienisch", 109, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italienisch                                                                                                  " + "'", str3, "italienisch                                                                                                  ");
    }

    @Test
    public void test27604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27604");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u006c", 574);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR" + "'", str2, "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR");
    }

    @Test
    public void test27606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27606");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("italy");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setUnicodeLocaleKeyword("HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAis", "8600u\\                                 hsiAgE_NAILATI_TiATti                                        ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAis [at index 0]");
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
    }

    @Test
    public void test27607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27607");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=44444444444444444444444444444444ihaaaaaaaaaaaaaaaaaaaaaaaafranzo?sisch(frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa????????????????????????????????????????????????z...?????????????????????????????????????????????????????????????????????????????????????????????????z...?????????????????????????????????????????????????????????????????????????????????????????????????z...??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\Ueutsc\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U", ")NAILATi,HCSINEILATI( 3200u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\Ueutsc\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U" + "'", str2, "\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\Ueutsc\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U");
    }

    @Test
    public void test27609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27609");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        boolean boolean11 = languageRange1.equals((java.lang.Object) builder8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fran\347ais (Canada)" + "'", str7, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test27610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27610");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "        h!ih            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        h!ih            " + "'", str1, "        h!ih            ");
    }

    @Test
    public void test27611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27611");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("itChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TAChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)iChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)_Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)ITA", 812);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27612");
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
        java.lang.String str14 = locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italien" + "'", str5, "italien");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh" + "'", str7, "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test27613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27613");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setExtension('E', "DEUTSCH");
        java.util.Locale locale8 = builder3.build();
        java.util.Locale.Builder builder9 = builder3.clear();
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setExtension('a', "\\_ITALIAN_English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: \\ [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test27614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27614");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getScript();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale0.getCountry();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale6);
        java.lang.String str9 = locale6.getCountry();
        java.lang.String str10 = locale6.getCountry();
        java.lang.String str11 = locale0.getDisplayLanguage(locale6);
        java.lang.String str12 = locale6.getDisplayLanguage();
        java.lang.String str13 = locale6.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "US" + "'", str3, "US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!IH" + "'", str8, "!IH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English" + "'", str11, "English");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
    }

    @Test
    public void test27615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27615");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("anglais");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        java.lang.String str8 = languageRange1.getRange();
        java.lang.String str9 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais" + "'", str3, "anglais");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "anglais" + "'", str7, "anglais");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "anglais" + "'", str8, "anglais");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "anglais" + "'", str9, "anglais");
    }

    @Test
    public void test27616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hsilgne,nailati( nailati", ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))iTALIAN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27617");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaFranzos...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27618");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                         \\     ", "IT44444444444444444EN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27619");
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
        java.util.Set<java.lang.String> strSet15 = locale12.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet16 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet16, 'a');
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
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ALLEMAND" + "'", str13, "ALLEMAND");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test27620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27620");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "             DE_DE            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27621");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale3.getISO3Language();
        java.lang.String str5 = locale3.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "deu" + "'", str4, "deu");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de" + "'", str5, "de");
    }

    @Test
    public void test27622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27622");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27623");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "COR\311EN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRTALIAN\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrtalian\\u002" + "'", str1, "frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrfrfrfrfr###############################################frfrfrfrfrfrfrfrfrfrfrfrfde_defrfrfrfrfrfrfrfrfrtalian\\u002");
    }

    @Test
    public void test27625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27625");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("it");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27626");
        java.util.Locale locale3 = new java.util.Locale("                                             Deutsch                                            ", "         HITALIANH_HitalianH_HeHNGLISH                                                         ", "...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...");
        org.junit.Assert.assertEquals(locale3.toString(), "                                             deutsch                                            _         HITALIANH_HITALIANH_HEHNGLISH                                                         _...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...");
    }

    @Test
    public void test27627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27627");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("KOKOKO", "xxxxxxxxxxxxxxxxxxx                             ...titxxxxxxxxxxxxxxxxxx                             ...", "                                                                                                                  8");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KOKOKO" + "'", str3, "KOKOKO");
    }

    @Test
    public void test27628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27628");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getExtension('h');
        java.lang.String str8 = locale4.getDisplayScript(locale5);
        java.util.Locale locale9 = locale4.stripExtensions();
        java.util.Locale.setDefault(category2, locale4);
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Locale.setDefault(category2, locale11);
        boolean boolean14 = locale0.equals((java.lang.Object) category2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test27629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27629");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                           ", 83, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27630");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################################################################", "z (IFRANZOSISCH)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27631");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44d48600u\\", (int) 'Y', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("EnglishI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIIT(I\\U0020ITALIANITALIANITALIANITALIITUnitedI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIITKingdomI\\U0020ITALIANITALIANITALIANITALIIT)", "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27633");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...hzhzhzhzhE             g                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27634");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH", "       !IH", (int) (byte) 1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Deutsch");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "franz\366sisch (frankreich)");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("It_I", strArray4, strArray10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'g');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!IH" + "'", str6, "!IH");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "It_I" + "'", str15, "It_I");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "!IH" + "'", str17, "!IH");
    }

    @Test
    public void test27635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("U005C", "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U005C" + "'", str2, "U005C");
    }

    @Test
    public void test27636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27636");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "ECANADAgCANADACANADAsh                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Royaume-Uniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Royame-Uniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "Royame-Uniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test27638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27639");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("china");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder9.setLanguageTag("Italian");
        java.util.Locale locale13 = builder9.build();
        java.util.Locale.Builder builder14 = builder8.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder8.setVariant("fR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fR [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "italian");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test27640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27640");
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
        java.lang.String str29 = locale7.getDisplayVariant();
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
    public void test27641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27641");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\u0038 (FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0038 (FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF)" + "'", str1, "\\u0038 (FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF)");
    }

    @Test
    public void test27642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27642");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale10.getScript();
        java.util.Set<java.lang.String> strSet12 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale10.getCountry();
        java.util.Locale.setDefault(locale10);
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale16);
        java.lang.String str19 = locale16.getCountry();
        java.lang.String str20 = locale16.getCountry();
        java.lang.String str21 = locale10.getDisplayLanguage(locale16);
        java.util.Locale.setDefault(category0, locale16);
        java.util.Locale locale23 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "US" + "'", str13, "US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "English" + "'", str17, "English");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "!IH" + "'", str18, "!IH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English" + "'", str21, "English");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
    }

    @Test
    public void test27643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27643");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                    ITALIAN (italian,eNGLISH)", '5');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27645");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!IH!IH\\\\\\\\\\\\\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27646");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27647");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("fr_FR", (int) 'F', 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test27648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27648");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '!', 309);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 309 + "'", int2 == 309);
    }

    @Test
    public void test27649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27649");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("coreano", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", 223, "                                               nailati                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD" + "'", str3, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
    }

    @Test
    public void test27651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str2, "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test27652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27652");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################", "2aiTALIANiTALIANiTALIANiTAL", 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 'N');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str8, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test27653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27653");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'A' + "'", char1 == 'A');
    }

    @Test
    public void test27654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27654");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\u0022(ROYAUME-UNI)", "NAC", "!_\\U0020_Itle########################################################################################", (int) '7');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0022(ROYAUME-UNI)" + "'", str4, "\\u0022(ROYAUME-UNI)");
    }

    @Test
    public void test27655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27655");
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
        java.lang.String str12 = locale0.getCountry();
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
    public void test27656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27656");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "                              ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test27657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test27658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27658");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("kkkkkkkkkkkkkkkkkkkk)dnk(hcsis\366znrfkkkkkkkkkkkkkkkkkkkk", 'R');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test27659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27659");
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
        java.util.Locale.setDefault(locale9);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
    }

    @Test
    public void test27660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27660");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Englisch (Vereinigtes K\366nigreich)", "Fgence");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("talian (FRA,Undetermined)", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("8600u\\                                 hsiAgE_NAILATI_TiATti", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test27661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27661");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setExtension('f', "tTAT_ITA");
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguageTag("tttttttfr-c                 ttttttt");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: tttttttfr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test27662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27662");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setLanguageTag("anglais");
        java.util.Locale.Builder builder12 = builder10.setVariant("hcstued");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setUnicodeLocaleKeyword("\u97d3\u6587\u5357\u97d3", "t");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? (?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str5, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test27663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27663");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eng" + "'", str1, "eng");
    }

    @Test
    public void test27664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27664");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\u0062");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27665");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getScript();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
        java.util.Locale locale4 = java.util.Locale.getDefault(category2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category2);
        boolean boolean6 = locale5.hasExtensions();
        java.lang.String str7 = locale0.getDisplayCountry(locale5);
        java.lang.String str8 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italien" + "'", str7, "Italien");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italienisch (Italien)" + "'", str8, "Italienisch (Italien)");
    }

    @Test
    public void test27666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27666");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444ALLEMAND 4444", (java.lang.CharSequence) "                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27667");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        double double8 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "e" + "'", str6, "e");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test27668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27668");
        java.util.Locale locale1 = new java.util.Locale("\\u005c");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale3);
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale1.getDisplayScript(locale3);
        java.lang.String str8 = locale1.getExtension('C');
        java.lang.String str9 = locale1.getVariant();
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        java.util.Locale.setDefault(category10, locale13);
        java.util.Locale locale18 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category10, locale18);
        java.lang.String str20 = locale18.getCountry();
        java.util.Set<java.lang.Character> charSet21 = locale18.getExtensionKeys();
        java.lang.String str22 = locale18.getDisplayLanguage();
        java.lang.String str23 = locale1.getDisplayVariant(locale18);
        java.lang.String str24 = locale18.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "franz\366sisch (frankreich)" + "'", str4, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "allemand" + "'", str14, "allemand");
        org.junit.Assert.assertEquals(locale18.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ALLEMAND" + "'", str20, "ALLEMAND");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital" + "'", str22, "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ALLEMAND" + "'", str24, "ALLEMAND");
    }

    @Test
    public void test27669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27669");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("fran\347ais (Canaaa)", 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27670");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("iTALIAN (ITALIAN,NGLIH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4444allemand4444", (int) 'J');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                          4444allemand4444" + "'", str2, "                                                          4444allemand4444");
    }

    @Test
    public void test27672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27672");
        java.lang.String[] strArray1 = java.util.Locale.getISOCountries();
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'H', (int) (byte) 100, (int) '\\');
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("cefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancef", strArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str3, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test27673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27673");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Francia                                                                                                                                                                                                                                                                 ", "\\atalaaa_ITALIAN_Eaglaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27674");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("bbbbbbbbbb   cor\351en    ", "NI         D00U\\00U\\ED00U\\00U\\ED00U\\G        ESEL");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27675");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("F", "             FRANZ\326SISCH (KANADA)              ", 327);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27676");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("en-G\\u0038zho                         CHD", 56, "fRHfR)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fRHfR)fRHfR)fRHen-G\\u0038zho                         CHD" + "'", str3, "fRHfR)fRHfR)fRHen-G\\u0038zho                         CHD");
    }

    @Test
    public void test27677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27677");
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
        java.lang.String str14 = locale13.toString();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "de_DE" + "'", str14, "de_DE");
    }

    @Test
    public void test27678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27678");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("korean (south korea) (N)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "korean (south korea) (N)" + "'", str1, "korean (south korea) (N)");
    }

    @Test
    public void test27679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("z (IFRANZOSISCH)", (int) 'Y');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z (IFRANZOSISCH)" + "'", str2, "z (IFRANZOSISCH)");
    }

    @Test
    public void test27680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27680");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", "HI!HI     \\u005c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27681");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "R0                                               nailati             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!_\\u0020_italienisch#########################################################################################", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!_\\u0020_italien" + "'", str2, "hi!_\\u0020_italien");
    }

    @Test
    public void test27683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                             zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str1, "zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test27684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27684");
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
        java.util.Locale.Builder builder11 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setLanguage("u");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: u [at index 0]");
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
    }

    @Test
    public void test27685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AtwAtzAuaAugAumAusAuyAuzAvaAvcAveAvgAviAvnAvuAwfAwsAyeAytAzaAzmAzw", "f_KOREAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AtwAtzAuaAugAumAusAuyAuzAvaAvcAveAvgAviAvnAvuAwfAwsAyeAytAzaAzmAzw" + "'", str2, "AtwAtzAuaAugAumAusAuyAuzAvaAvcAveAvgAviAvnAvuAwfAwsAyeAytAzaAzmAzw");
    }

    @Test
    public void test27686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27686");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))\\u0039", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China4 hi! zh_CN iTALIAN en Italienisch", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China4 hi! zh_CN iTALIAN en Italienisch" + "'", str2, "Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China4 hi! zh_CN iTALIAN en Italienisch");
    }

    @Test
    public void test27688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\uc601\uc5b4                                                           ", "2iT hi!       _\\U0020_Italienisch####################################################################            2i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2iT hi!       _\\U0020_Italienisch####################################################################            2i" + "'", str2, "2iT hi!       _\\U0020_Italienisch####################################################################            2i");
    }

    @Test
    public void test27689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27689");
        java.util.Locale locale1 = new java.util.Locale("fra");
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.util.Locale.setDefault(category2, locale5);
        java.util.Set<java.lang.String> strSet8 = locale5.getUnicodeLocaleKeys();
        java.lang.String str9 = locale5.getLanguage();
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.getDefault(category11);
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale14.getExtension('h');
        java.lang.String str17 = locale13.getDisplayScript(locale14);
        java.util.Locale locale18 = locale13.stripExtensions();
        java.util.Locale.setDefault(category11, locale13);
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale.setDefault(category11, locale20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("E             g                                                                                     ", locale20);
        java.lang.String str24 = locale20.getLanguage();
        java.lang.String str25 = locale20.getDisplayScript();
        java.lang.String str26 = locale5.getDisplayName(locale20);
        java.lang.String str27 = locale1.getDisplayScript(locale20);
        java.lang.String str28 = locale20.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "allemand" + "'", str6, "allemand");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "e             g                                                                                     " + "'", str23, "e             g                                                                                     ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "de" + "'", str24, "de");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Franz\366sisch (Kanada)" + "'", str26, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test27690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27690");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiT", "...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2iTALIANiTALIANiTALIANiT" + "'", str3, "2iTALIANiTALIANiTALIANiT");
    }

    @Test
    public void test27691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27691");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HHHHHHHHH         ITAL\\u0020iItalian\\...", (java.lang.CharSequence) "HARZHASZHAZHZHZHZHZHZHZHZHZHZ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HHHHHHHHH         ITAL\\u0020iItalian\\..." + "'", charSequence2, "HHHHHHHHH         ITAL\\u0020iItalian\\...");
    }

    @Test
    public void test27692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27692");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'l');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'l' + "'", char1 == 'l');
    }

    @Test
    public void test27693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27693");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getISO3Country();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale.Builder builder12 = builder9.setLocale(locale10);
        java.util.Locale.Builder builder13 = builder12.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CAN" + "'", str5, "CAN");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr-CA" + "'", str11, "fr-CA");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test27694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27694");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                       nglish ...nglish ...nglish ...nglichinoisf(Chine)                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27695");
        char[] charArray12 = new char[] { ' ', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Canada", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "FR", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "e...", charArray12);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "        \\u005c         ", charArray12);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test27696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("44444444444444ITALIAN4444444444444hhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444ITALIAN4444444444444hhhhhhhhhhhhhhhhhhh" + "'", str1, "44444444444444ITALIAN4444444444444hhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test27697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27697");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAChineAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "CA", 163);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test27698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27698");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\U0020IiTALIAN\\U0020I", "ITALIA");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                 it", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27699");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Chinesisch (China");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinesisch (China" + "'", str1, "Chinesisch (China");
    }

    @Test
    public void test27700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27700");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap1);
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale3.getDisplayName();
        java.lang.String str7 = locale3.getCountry();
        java.util.Set<java.lang.String> strSet8 = locale3.getUnicodeLocaleKeys();
        java.lang.String str9 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet8);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray15 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags(languageRangeList11, (java.util.Collection<java.lang.String>) strList16);
        java.util.Locale.FilteringMode filteringMode19 = null;
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList18, filteringMode19);
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder21.clearExtensions();
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = locale23.getDisplayName();
        java.util.Locale.Builder builder25 = builder22.setLocale(locale23);
        java.util.Locale.Builder builder26 = builder22.clear();
        java.util.Locale.Builder builder28 = builder22.setLanguage("eng");
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale locale31 = builder30.build();
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str34 = locale31.getDisplayLanguage(locale33);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.upperCase("", locale33);
        java.lang.String str36 = locale33.getScript();
        java.util.Locale.Builder builder37 = builder28.setLocale(locale33);
        java.util.Set<java.lang.String> strSet38 = locale33.getUnicodeLocaleKeys();
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet38, 'I');
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet38);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italienisch" + "'", str6, "Italienisch");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Franz\366sisch (Kanada)" + "'", str24, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strList41);
    }

    @Test
    public void test27701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27701");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\\u0074");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27702");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZhsxlgne_n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish" + "'", str2, "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
    }

    @Test
    public void test27703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27703");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setVariant("jp");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: jp [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test27704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27704");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", "...lian (italian,e...                                                                                          ", 71);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'R');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand" + "'", str5, "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
    }

    @Test
    public void test27705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                           U0020", "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0020" + "'", str2, "U0020");
    }

    @Test
    public void test27706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)", "                       r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27707");
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
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str18 = locale17.getDisplayScript();
        java.lang.String str19 = locale15.getDisplayCountry(locale17);
        java.util.Set<java.lang.String> strSet20 = locale17.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet21 = locale17.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale23 = java.util.Locale.getDefault(category0);
        java.lang.String str24 = locale23.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de");
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
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "italien" + "'", str14, "italien");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test27708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27708");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "00000000000000cor\351en (Cor\351e du Sud)", (java.lang.CharSequence) "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test27709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27709");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("zh");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("Deutsch");
        java.lang.String str12 = locale11.getDisplayCountry();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale16.getExtension('h');
        java.lang.String str19 = locale15.getDisplayScript(locale16);
        java.lang.String str20 = locale15.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale21);
        java.lang.String str23 = locale15.getDisplayName(locale21);
        java.lang.String str24 = locale14.getDisplayLanguage(locale21);
        java.lang.String str25 = locale11.getDisplayVariant(locale21);
        java.util.Locale.Builder builder26 = builder8.setLocale(locale21);
        java.lang.Class<?> wildcardClass27 = locale21.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FRA" + "'", str20, "FRA");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str23, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test27710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("it_IT", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         it_IT                                                         " + "'", str2, "                                                         it_IT                                                         ");
    }

    @Test
    public void test27711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27711");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Frnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFEEEEEEEEEEEEE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27712");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("italian (italian,english)");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "\\U005");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian\\U005(italian,english)" + "'", str3, "italian\\U005(italian,english)");
    }

    @Test
    public void test27713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27713");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("iTALIAN (ITALIAN,ENGLISH", (int) 'F');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27714");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\ud504\ub791\uc2a4\uc5b4", "\\xtalxan_ITALIAN_Englxsh", (int) (byte) 1);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                              deutsch", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test27715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27715");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\\u610f\u5927\u5229\u6587", "\\U");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27716");
        char[] charArray13 = new char[] { ' ', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("ran\347ais (France)                                      f                                     ", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  \\u0020iTALIANiTALIANiTALIANiTAL  ", charArray13);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444it                   ", charArray13);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i\\u0020italianitalianitalianitaliit         \\", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 44 + "'", int23 == 44);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test27717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27717");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test27718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27718");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("iFranzosisch ", "FR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FR", 27);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27719");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("English");
        java.lang.String[] strArray3 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...", strArray2, strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "fFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF                                                                                                                  \\u0068FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", 264, 102);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded..." + "'", str4, "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test27720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "englishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27721");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en-GB");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap4);
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
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet17, "\\u00de\\u00");
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strSet17);
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = locale22.getDisplayVariant();
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale25.getDisplayCountry();
        java.lang.String str27 = locale24.getDisplayVariant(locale25);
        java.lang.String str28 = locale22.getDisplayScript(locale25);
        java.util.Locale locale30 = java.util.Locale.FRANCE;
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.util.Locale locale34 = java.util.Locale.ITALIAN;
        java.lang.String str36 = locale34.getExtension('h');
        java.lang.String str37 = locale33.getDisplayScript(locale34);
        java.lang.String str38 = locale33.getISO3Country();
        java.lang.String str39 = locale31.getDisplayVariant(locale33);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale31);
        java.lang.String str41 = locale25.getDisplayCountry(locale31);
        java.util.Locale locale42 = locale25.stripExtensions();
        java.util.Set<java.lang.String> strSet43 = locale25.getUnicodeLocaleAttributes();
        java.lang.String str44 = java.util.Locale.lookupTag(languageRangeList3, (java.util.Collection<java.lang.String>) strSet43);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "FRA" + "'", str38, "FRA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str40, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test27722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27722");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FR-caFR-caFR-c8600U\\FR-caFR-caFR-ca" + "'", str1, "FR-caFR-caFR-c8600U\\FR-caFR-caFR-ca");
    }

    @Test
    public void test27723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27723");
        java.util.Locale locale3 = new java.util.Locale("ZH_CNGGGGG", "fr-C                 ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("2", locale3);
        java.lang.String str5 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "zh_cnggggg_FR-C                 ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2" + "'", str4, "2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test27724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AC_ne" + "'", str1, "AC_ne");
    }

    @Test
    public void test27725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...                             xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27726");
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
        java.util.Locale locale28 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet29 = locale28.getExtensionKeys();
        java.lang.String str30 = locale28.getVariant();
        java.lang.String str31 = locale28.getDisplayName();
        java.lang.String str32 = locale28.getVariant();
        java.lang.String str33 = locale9.getDisplayVariant(locale28);
        java.util.Locale.setDefault(locale9);
        java.lang.String str35 = locale9.getVariant();
        java.util.Locale locale36 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        boolean boolean38 = locale36.hasExtensions();
        java.lang.String str39 = locale9.getDisplayLanguage(locale36);
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
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fran\347ais" + "'", str27, "fran\347ais");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertNotNull(charSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Italienisch" + "'", str31, "Italienisch");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en");
        org.junit.Assert.assertNotNull(charSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "French" + "'", str39, "French");
    }

    @Test
    public void test27727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27727");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ihienischallemanditalian_ITNLINN_EnglishallemandHI!allemandhi!allemandNDNENFNGNIN...ienischallemanditalian_ITNLINN_EnglishallemandHI!allemandhi!allemandNDNENFNGNIN...ienischall", "Italienisch (Italien)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27728");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str4 = locale0.getExtension('A');
        java.lang.String str5 = locale0.getLanguage();
        java.util.Locale locale9 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("...anitali");
        java.lang.String str12 = locale9.getDisplayName(locale11);
        java.lang.String str13 = locale0.getDisplayLanguage(locale11);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertEquals(locale9.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\u0023 (ITALIENISCH,iTALIAN)" + "'", str12, "\\u0023 (ITALIENISCH,iTALIAN)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
    }

    @Test
    public void test27729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27729");
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
        java.util.Locale locale17 = java.util.Locale.US;
        java.lang.String str18 = locale17.getScript();
        java.util.Set<java.lang.String> strSet19 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str20 = locale17.getCountry();
        java.util.Locale.setDefault(locale17);
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale25.getDisplayCountry();
        java.lang.String str27 = locale24.getDisplayVariant(locale25);
        java.lang.String str28 = locale24.getDisplayCountry();
        java.lang.String str29 = locale24.getScript();
        java.lang.String str30 = locale24.getScript();
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.lang.String str33 = locale32.getDisplayCountry();
        java.lang.String str34 = locale31.getDisplayVariant(locale32);
        java.lang.String str35 = locale31.getDisplayCountry();
        java.lang.String str36 = locale31.getScript();
        java.lang.String str37 = locale31.getScript();
        java.lang.String str38 = locale24.getDisplayCountry(locale31);
        java.util.Locale.Category category39 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale40 = java.util.Locale.getDefault(category39);
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.lang.String str44 = locale42.getExtension('h');
        java.lang.String str45 = locale41.getDisplayScript(locale42);
        java.lang.String str46 = locale41.getISO3Country();
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale47);
        java.lang.String str49 = locale41.getDisplayName(locale47);
        java.lang.String str50 = locale41.getScript();
        java.util.Locale.setDefault(category39, locale41);
        java.lang.String str52 = locale24.getDisplayCountry(locale41);
        java.lang.String str53 = locale41.getCountry();
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.upperCase("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", locale41);
        java.util.Locale locale55 = locale41.stripExtensions();
        java.util.Locale.setDefault(category0, locale55);
        java.util.Locale locale57 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet58 = locale57.getUnicodeLocaleKeys();
        java.lang.String str59 = locale57.toLanguageTag();
        java.lang.String str60 = locale57.getDisplayCountry();
        java.lang.String str61 = locale57.getCountry();
        java.util.Locale.setDefault(category0, locale57);
        java.util.Locale.Builder builder63 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder64 = builder63.clearExtensions();
        java.util.Locale.Builder builder66 = builder63.setLanguageTag("Italian");
        java.util.Locale.Builder builder67 = builder66.clearExtensions();
        boolean boolean68 = locale57.equals((java.lang.Object) builder66);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
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
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "US" + "'", str20, "US");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + category39 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category39.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "FRA" + "'", str46, "FRA");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str49, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "FR" + "'", str53, "FR");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\" + "'", str54, "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "fr-CA" + "'", str59, "fr-CA");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Canada" + "'", str60, "Canada");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "CA" + "'", str61, "CA");
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test27730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27730");
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
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet18, 'A');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet18, "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet18, 'G');
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
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test27731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27731");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale0.getDisplayCountry(locale2);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet7 = locale2.getUnicodeLocaleKeys();
        java.lang.String str8 = locale2.getLanguage();
        java.util.Set<java.lang.String> strSet9 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "it" + "'", str8, "it");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test27732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27732");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESELalhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", "\\u0020hi!       _\\U0020_Italienisch#########################################################################################TALIANhi!       _\\U0020_Italienisch#########################################################################################TALIANhi!       _\\U0020_Italienisch#########################################################################################TALIANiTALI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27733");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("dddddddddddddddddddddddddddddddddddddddddddddddddeddddddddddddddddddddddddddddddddddddddddddddddddd", "francesefrancesefrancesefr\\u007", 753);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "dddddddddddddddddddddddddddddddddddddddddddddddddeddddddddddddddddddddddddddddddddddddddddddddddddd" + "'", str3, "dddddddddddddddddddddddddddddddddddddddddddddddddeddddddddddddddddddddddddddddddddddddddddddddddddd");
    }

    @Test
    public void test27734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27734");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('b', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test27735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27735");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\\u0063");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0063" + "'", str1, "\\u0063");
    }

    @Test
    public void test27736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27736");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("\\U0020", "allemand");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0020", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("ITALIAN", (java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("HI!       ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\U0020" + "'", str7, "\\U0020");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\U0020" + "'", str8, "\\U0020");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test27737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27737");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhiHnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "FRANZ\326SISCHF(FRANKREICH)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27738");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('-');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27739");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("DE_DE");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "italian (italian,english", 309, (int) 'b');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DE_DE" + "'", str2, "DE_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test27740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27740");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", (java.lang.CharSequence) "ZHO                               44\\U002344  \\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27741");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ital", 'i');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("e ITALIAN,ENGLISHa", "", "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "e ITALIAN,ENGLISHa" + "'", str3, "e ITALIAN,ENGLISHa");
    }

    @Test
    public void test27743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27743");
        java.util.Locale locale4 = new java.util.Locale("ZH_CNGGGGG", "fr-C                 ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("2", locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("", locale4);
        java.lang.String str8 = locale4.getExtension('D');
        java.util.Set<java.lang.String> strSet9 = locale4.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale4.toString(), "zh_cnggggg_FR-C                 ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2" + "'", str5, "2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test27744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27744");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("und_CA", "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee8ian\\u0020i86 (ITALIAN (ITALIAN,ENGLISH))eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27745");
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
        java.util.Locale locale47 = java.util.Locale.ITALIAN;
        java.lang.String str48 = locale47.getDisplayLanguage();
        java.util.Locale locale49 = locale47.stripExtensions();
        java.lang.String str50 = locale47.getDisplayVariant();
        java.util.Set<java.lang.String> strSet51 = locale47.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet51);
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("8ian\\u0020i86");
        java.lang.String str55 = locale54.getVariant();
        java.lang.String str56 = locale54.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet57 = locale54.getUnicodeLocaleKeys();
        java.lang.String str58 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet57);
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
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "italien" + "'", str48, "italien");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test27746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27746");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap13);
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale locale17 = locale15.stripExtensions();
        java.lang.String str18 = locale15.getLanguage();
        java.util.Set<java.lang.String> strSet19 = locale15.getUnicodeLocaleKeys();
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet19, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.lang.String str22 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet19);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.Locale.FilteringMode filteringMode31 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList29, filteringMode31);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.Locale.FilteringMode filteringMode41 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList39, filteringMode41);
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList45);
        java.lang.String str48 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList45);
        java.util.Locale locale49 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet50 = locale49.getExtensionKeys();
        java.util.Locale locale52 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale54 = new java.util.Locale("");
        java.util.Locale locale55 = java.util.Locale.FRANCE;
        java.util.Locale locale56 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str57 = locale55.getDisplayScript(locale56);
        java.util.Locale locale58 = java.util.Locale.ENGLISH;
        java.lang.String str59 = locale58.getDisplayCountry();
        java.util.Locale locale60 = java.util.Locale.PRC;
        java.util.Locale locale61 = java.util.Locale.US;
        java.util.Locale locale62 = java.util.Locale.FRANCE;
        java.util.Locale locale63 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str64 = locale62.getDisplayScript(locale63);
        java.util.Locale locale65 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet66 = locale65.getExtensionKeys();
        java.util.Locale locale67 = java.util.Locale.ITALIAN;
        java.lang.String str68 = locale67.getDisplayLanguage();
        java.util.Locale locale69 = java.util.Locale.FRENCH;
        java.util.Locale locale70 = java.util.Locale.US;
        java.util.Locale locale71 = java.util.Locale.ITALIAN;
        java.lang.String str72 = locale71.getDisplayLanguage();
        java.util.Locale locale73 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray74 = new java.util.Locale[] { locale49, locale52, locale54, locale55, locale58, locale60, locale61, locale63, locale65, locale67, locale69, locale70, locale71, locale73 };
        java.util.ArrayList<java.util.Locale> localeList75 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList75, localeArray74);
        java.util.Locale locale77 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList75);
        java.util.List<java.util.Locale> localeList78 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList75);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList80 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray84 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags(languageRangeList80, (java.util.Collection<java.lang.String>) strList85);
        java.lang.String str88 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList87);
        java.lang.String str90 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList87, 'J');
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
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "italien" + "'", str16, "italien");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "it" + "'", str18, "it");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + filteringMode31 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode31.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + filteringMode41 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode41.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertNotNull(charSet50);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "it");
        org.junit.Assert.assertNotNull(charSet66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "italien" + "'", str68, "italien");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "it");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "italien" + "'", str72, "italien");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(locale77);
        org.junit.Assert.assertNotNull(localeList78);
        org.junit.Assert.assertNotNull(languageRangeList80);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test27747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27747");
        java.util.Locale.Category category0 = null;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getExtension('h');
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.util.Locale locale8 = locale3.stripExtensions();
        java.util.Locale.setDefault(category1, locale3);
        java.util.Locale locale10 = java.util.Locale.getDefault(category1);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder14 = builder11.setLanguageTag("Italian");
        java.util.Locale locale15 = builder14.build();
        java.util.Locale.Builder builder18 = builder14.setExtension('E', "DEUTSCH");
        java.util.Locale locale19 = builder14.build();
        java.util.Locale.Builder builder20 = builder14.clear();
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = locale21.getCountry();
        java.lang.String str23 = locale21.toLanguageTag();
        java.util.Locale.Builder builder24 = builder14.setLocale(locale21);
        java.lang.String str25 = locale10.getDisplayVariant(locale21);
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder26.clearExtensions();
        java.util.Locale locale28 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str29 = locale28.getDisplayName();
        java.util.Locale.Builder builder30 = builder27.setLocale(locale28);
        java.util.Locale.Builder builder31 = builder27.clear();
        java.util.Locale.Builder builder33 = builder27.setLanguage("RA");
        java.util.Locale.Builder builder35 = builder33.setLanguage("");
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.lang.String str38 = locale37.getLanguage();
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale37);
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.lang.String str44 = locale42.getExtension('h');
        java.lang.String str45 = locale41.getDisplayScript(locale42);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale41);
        java.lang.String str47 = locale37.getDisplayVariant(locale41);
        java.util.Locale.Builder builder48 = builder33.setLocale(locale37);
        java.lang.String str49 = locale10.getDisplayLanguage(locale37);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "italian");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "italian__#e-deutsch");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CA" + "'", str22, "CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fr-CA" + "'", str23, "fr-CA");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "fran\347ais (Canada)" + "'", str29, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ko" + "'", str38, "ko");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "TALIAN\\U0023" + "'", str39, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!       " + "'", str46, "hi!       ");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str49, "\ud504\ub791\uc2a4\uc5b4");
    }

    @Test
    public void test27748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27748");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "gERMAN (gERMANY)", (java.lang.CharSequence) "italie                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27749");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\r", "it_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27750");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "francia", (java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "francia" + "'", charSequence2, "francia");
    }

    @Test
    public void test27751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27751");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet1);
    }

    @Test
    public void test27752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27752");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("(italian,eNGLISH) ITALIAN", "44d48600u\\", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("#u##2#iTALIANiTALIANiTALIANiT", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\riTALIAN                                                                 \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#u##2#iTALIANiTALIANiTALIANiT" + "'", str2, "#u##2#iTALIANiTALIANiTALIANiT");
    }

    @Test
    public void test27754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000", "Franz\366sischFranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000" + "'", str2, "00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test27755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27755");
        java.util.Locale locale3 = new java.util.Locale("!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALA", "\\U000A", "tala");
        org.junit.Assert.assertEquals(locale3.toString(), "!       allemandtalienischallemanditalian_talan_eng    \\     adaeafagaala_\\U000A_tala");
    }

    @Test
    public void test27756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27756");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 574, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Frnz\366sischt(Knd)", "\351encor\351encor\351encor\351");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Frnz\366sischt(Knd)" + "'", str2, "Frnz\366sischt(Knd)");
    }

    @Test
    public void test27758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27758");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00hFranzosischFranzosisch(Frankreich)\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00(\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 210 + "'", int1 == 210);
    }

    @Test
    public void test27759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27759");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CA", "Eallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmand", (int) 'G');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27760");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CAN");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "ITALIAN                                                                 ");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("(C)ALANALANALANAL", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CAN" + "'", str3, "CAN");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test27761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27761");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("         ITALIAN_italian_eNGLISH         ITALIAN_!IH");
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.lang.String str5 = locale1.getExtension('a');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test27762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27762");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("e             g", 221, (int) 'g');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "e             g" + "'", str3, "e             g");
    }

    @Test
    public void test27763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  \\u007a555555555555555555555555555555555", 264, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \\u007a5555555555555555555555555555555557777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777" + "'", str3, "  \\u007a5555555555555555555555555555555557777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test27764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27764");
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
        char[] charArray28 = new char[] { ' ', '4' };
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray28);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray28);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray28);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray28);
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray28);
        int int34 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "8600u\\", charArray28);
        int int35 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0078", charArray28);
        boolean boolean36 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "KOR", charArray28);
        boolean boolean37 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\italian_ITALIAN_English", charArray28);
        boolean boolean38 = locale13.equals((java.lang.Object) charArray28);
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "france");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "tedesco    " + "'", str14, "tedesco    ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "france" + "'", str16, "france");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test27765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27765");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("...!       \\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=...!\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27766");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Chine)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\\u0069hhhhhhhhhh", 122);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                          \\u0069hhhhhhhhhh" + "'", str2, "                                                                                                          \\u0069hhhhhhhhhh");
    }

    @Test
    public void test27768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27768");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                                                                                     etatS detinU", "fR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test27769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27769");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0034\\u00", "2CINESE(CINA...", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCC...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test27770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("########################################################################################eltI_0200U\\_!", "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################################################################eltI_0200U\\_!" + "'", str2, "########################################################################################eltI_0200U\\_!");
    }

    @Test
    public void test27771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27771");
        java.util.Locale locale3 = new java.util.Locale("\\U0020", "", "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
        java.lang.String str4 = locale3.getISO3Country();
        java.util.Locale locale5 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0020__AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "\\u0020__AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
    }

    @Test
    public void test27772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27772");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test27773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27773");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("fRENCH (fRANCE)", "ALLEMAND");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27774");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("Chinese (China)hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese (China)hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "Chinese (China)hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test27775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                             hcsfr-CueD                                             ", (int) '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             hcsfr-CueD                                             " + "'", str2, "                                             hcsfr-CueD                                             ");
    }

    @Test
    public void test27776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27776");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.setDefault(category6, locale9);
        java.util.Locale locale14 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category6, locale14);
        java.util.Locale locale16 = java.util.Locale.getDefault(category6);
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = locale17.getDisplayName(locale18);
        java.util.Locale.setDefault(locale18);
        java.util.Locale.setDefault(category6, locale18);
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.lang.String str24 = locale23.getDisplayName();
        java.lang.String str26 = locale23.getExtension('C');
        java.lang.String str27 = locale22.getDisplayLanguage(locale23);
        java.lang.String str28 = locale22.getScript();
        java.util.Locale.setDefault(category6, locale22);
        java.util.Locale.Builder builder30 = builder2.setLocale(locale22);
        java.lang.String str31 = locale22.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "france");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "allemand" + "'", str10, "allemand");
        org.junit.Assert.assertEquals(locale14.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "allemand" + "'", str19, "allemand");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fran\347ais" + "'", str24, "fran\347ais");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "chinois" + "'", str27, "chinois");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test27777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27777");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("\u6cd5\u570b", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27778");
        java.util.Locale locale3 = new java.util.Locale("gERMAN (gERMANY", "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                 ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...");
        org.junit.Assert.assertEquals(locale3.toString(), "german (germany_         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                 _\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...");
    }

    @Test
    public void test27779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27779");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("FR_fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rf_RF" + "'", str1, "rf_RF");
    }

    @Test
    public void test27780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g", "\\\\\\\\\\\\\\HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g" + "'", str2, "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g");
    }

    @Test
    public void test27781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27781");
        char[] charArray9 = new char[] { 'f', '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "d", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                               INGLESE                                ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("ko-KR                                                                                                    ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "LIAN_EgAish                                 \\u0068", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0034\\u00 hcstud \\u0034\\u00", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test27782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27782");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'J', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test27783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27783");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("2aiTALIANiTALIANiTALIANiTAL");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale6 = new java.util.Locale("hi!", "English", "");
        java.util.Locale locale10 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str11 = locale6.getDisplayScript(locale10);
        java.util.Locale locale12 = locale6.stripExtensions();
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str17 = locale16.getDisplayName();
        java.util.Locale.Builder builder18 = builder15.setLocale(locale16);
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale.Builder builder21 = builder19.setLanguage("ITALIAN");
        java.util.Locale.Builder builder22 = builder21.clear();
        java.util.Locale locale23 = builder21.build();
        java.util.Locale.Builder builder25 = builder21.setLanguageTag("italien");
        java.util.Locale.Builder builder26 = builder25.clearExtensions();
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.lang.String str29 = locale28.getDisplayCountry();
        java.lang.String str30 = locale27.getDisplayVariant(locale28);
        java.lang.String str31 = locale27.getDisplayCountry();
        java.lang.String str32 = locale27.getScript();
        java.lang.String str33 = locale27.getScript();
        java.util.Locale locale34 = java.util.Locale.FRENCH;
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.lang.String str36 = locale35.getDisplayCountry();
        java.lang.String str37 = locale34.getDisplayVariant(locale35);
        java.lang.String str38 = locale34.getDisplayCountry();
        java.lang.String str39 = locale34.getScript();
        java.lang.String str40 = locale34.getScript();
        java.lang.String str41 = locale27.getDisplayCountry(locale34);
        java.util.Locale.Category category42 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale43 = java.util.Locale.getDefault(category42);
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.util.Locale locale45 = java.util.Locale.ITALIAN;
        java.lang.String str47 = locale45.getExtension('h');
        java.lang.String str48 = locale44.getDisplayScript(locale45);
        java.lang.String str49 = locale44.getISO3Country();
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale50);
        java.lang.String str52 = locale44.getDisplayName(locale50);
        java.lang.String str53 = locale44.getScript();
        java.util.Locale.setDefault(category42, locale44);
        java.lang.String str55 = locale27.getDisplayCountry(locale44);
        java.lang.String str56 = locale44.getCountry();
        java.util.Locale.Builder builder57 = builder25.setLocale(locale44);
        java.lang.String str58 = locale12.getDisplayVariant(locale44);
        java.lang.String str59 = locale1.getDisplayName(locale12);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals(locale10.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fran\347ais (Canada)" + "'", str17, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + category42 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category42.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "FRA" + "'", str49, "FRA");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "de");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str52, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "FR" + "'", str56, "FR");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test27784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27784");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                     englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)", 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27785");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "8600u\\", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test27786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27786");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        boolean boolean3 = locale0.hasExtensions();
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale0.getDisplayLanguage(locale5);
        java.lang.String str8 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italie" + "'", str2, "Italie");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien (Italie)" + "'", str4, "italien (Italie)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italian" + "'", str7, "Italian");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "it_IT" + "'", str8, "it_IT");
    }

    @Test
    public void test27787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27787");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "English(UnitedKingdom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27788");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\U0023", ")modgniK detinU( hsilgnE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27789");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0059", 'e', 't');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0059" + "'", str3, "\\u0059");
    }

    @Test
    public void test27790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27790");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder9.setLanguage(" Italia ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:  Italia  [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test27791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                " + "'", str1, "                                ");
    }

    @Test
    public void test27792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\ub2e4\ub098\uce90\uc5b4\uc2a4\ub791\ud504");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ub2e4\ub098\uce90\uc5b4\uc2a4\ub791\ud504" + "'", str1, "\ub2e4\ub098\uce90\uc5b4\uc2a4\ub791\ud504");
    }

    @Test
    public void test27793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27793");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" italian  ", "ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("n", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("\u671d");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC", strArray5, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC" + "'", str9, "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC");
    }

    @Test
    public void test27794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh..." + "'", str1, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...");
    }

    @Test
    public void test27795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27795");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("italian");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale6);
        java.util.Set<java.lang.Character> charSet9 = locale6.getExtensionKeys();
        java.lang.String str10 = locale6.getDisplayVariant();
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
        java.util.Locale locale34 = new java.util.Locale("G", "Franz\366sisch");
        java.util.Locale locale36 = java.util.Locale.FRANCE;
        java.util.Locale locale37 = java.util.Locale.ITALIAN;
        java.lang.String str39 = locale37.getExtension('h');
        java.lang.String str40 = locale36.getDisplayScript(locale37);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale36);
        java.lang.String str42 = locale36.getDisplayLanguage();
        java.util.Locale locale44 = java.util.Locale.CHINESE;
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale44);
        java.lang.String str46 = locale44.getDisplayName();
        java.lang.String str47 = locale36.getDisplayCountry(locale44);
        java.lang.String str48 = locale34.getDisplayVariant(locale44);
        java.lang.String str49 = locale26.getDisplayLanguage(locale34);
        java.lang.String str50 = locale6.getDisplayVariant(locale26);
        java.lang.String str51 = locale2.getDisplayLanguage(locale26);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "anglais" + "'", str7, "anglais");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!IH" + "'", str8, "!IH");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italien" + "'", str12, "italien");
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
        org.junit.Assert.assertEquals(locale34.toString(), "g_FRANZ\366SISCH");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!       " + "'", str41, "hi!       ");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Franz\366sisch" + "'", str42, "Franz\366sisch");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "franz\366sisch (frankreich)" + "'", str45, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Chinesisch" + "'", str46, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u6cd5\u56fd" + "'", str47, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "German" + "'", str49, "German");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "italian" + "'", str51, "italian");
    }

    @Test
    public void test27796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27796");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", "2italianitalianitalianitali", (int) 'b');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27797");
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
            java.util.Locale.Builder builder13 = builder6.setLanguage("fr-CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: fr-CA [at index 0]");
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
    public void test27798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27798");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw", (java.lang.CharSequence) "5555555555");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27799");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        java.lang.String str8 = languageRange1.getRange();
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra");
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("gERMAN (gERMANY)", strArray12);
        boolean boolean14 = languageRange1.equals((java.lang.Object) int13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gbr" + "'", str7, "gbr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "gbr" + "'", str8, "gbr");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test27800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27800");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "2E             GITALIANITALIANITALIANITAL", "Deutschland");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27801");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "KO", (java.lang.CharSequence) "EN_ca...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "KO" + "'", charSequence2, "KO");
    }

    @Test
    public void test27802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("gERMAN  gERMANY", "\\u0023 (ITALIENISCH,iTALIAN)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gERMAN  gERMANY" + "'", str2, "gERMAN  gERMANY");
    }

    @Test
    public void test27803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27803");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", 'i');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "allemand");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "e...");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                           FR_frGGGGG", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIH" + "'", str7, "Hhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIH");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test27804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27804");
        java.util.Locale locale3 = new java.util.Locale("Italie                         ", "", "aaaaaaaaaaaaaaaaaaaaaaaaaaILaaaaaaaaaaaaaaaaaaaaaaaaaaIL");
        java.lang.String str4 = locale3.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for italie                         ");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "italie                         __aaaaaaaaaaaaaaaaaaaaaaaaaaILaaaaaaaaaaaaaaaaaaaaaaaaaaIL");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test27805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
    }

    @Test
    public void test27806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27806");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                          ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB                                                                                                                                           ", "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh..", "    \\XTALXAN_ITALIAN_ENGLXSH    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                          ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB                                                                                                                                           " + "'", str3, "                                                                                                                                          ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB                                                                                                                                           ");
    }

    @Test
    public void test27807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27807");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("corn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "corn" + "'", str1, "corn");
    }

    @Test
    public void test27808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27808");
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
            java.util.Locale.Builder builder11 = builder9.setScript("ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZHZHZHZ2222222222222222222222222222222222222222222222222222222222222222222222222");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZHZHZHZ2222222222222222222222222222222222222222222222222222222222222222222222222 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test27809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("coreano (Corea del Sud)", (int) 'N', "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coreano (Corea del Sud)                                                       " + "'", str3, "coreano (Corea del Sud)                                                       ");
    }

    @Test
    public void test27810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27810");
        java.util.Locale locale2 = new java.util.Locale("kkkkkkkkkkkkkkkkkeAGAASH", "Chinesisch(China)");
        org.junit.Assert.assertEquals(locale2.toString(), "kkkkkkkkkkkkkkkkkeagaash_CHINESISCH(CHINA)");
    }

    @Test
    public void test27811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27811");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("9500u\\");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test27812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27812");
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
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale locale17 = builder16.build();
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale18.getDisplayVariant(locale19);
        java.lang.String str22 = locale18.getDisplayCountry();
        java.lang.String str23 = locale18.getScript();
        java.lang.String str24 = locale18.getScript();
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.util.Locale locale26 = java.util.Locale.ENGLISH;
        java.lang.String str27 = locale26.getDisplayCountry();
        java.lang.String str28 = locale25.getDisplayVariant(locale26);
        java.lang.String str29 = locale25.getDisplayCountry();
        java.lang.String str30 = locale25.getScript();
        java.lang.String str31 = locale25.getScript();
        java.lang.String str32 = locale18.getDisplayCountry(locale25);
        java.lang.String str33 = locale17.getDisplayVariant(locale25);
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale35);
        java.lang.String str38 = locale35.getCountry();
        java.lang.String str39 = locale35.getCountry();
        java.lang.String str40 = locale25.getDisplayCountry(locale35);
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str43 = locale41.getDisplayName(locale42);
        java.util.Locale locale44 = locale41.stripExtensions();
        java.lang.String str45 = locale35.getDisplayVariant(locale44);
        boolean boolean46 = locale44.hasExtensions();
        java.util.Locale.Builder builder47 = builder15.setLocale(locale44);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder50 = builder47.setExtension('\u671d', "cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: ? [at index 0]");
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
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Englisch" + "'", str36, "Englisch");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "!IH" + "'", str37, "!IH");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "allemand" + "'", str43, "allemand");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "de");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test27813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27813");
        char[] charArray7 = new char[] { ' ' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Canada", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0052", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222FRANCESE (cANADA)", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test27814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27814");
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
        java.util.Locale.Builder builder17 = builder7.clear();
        java.util.Locale locale18 = builder17.build();
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
    }

    @Test
    public void test27815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27815");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27816");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE", "          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                         GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA", 216, 264);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                         GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA" + "'", str3, "                                                                                                                                                         GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA");
    }

    @Test
    public void test27818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27818");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "nglish (united kingdom", (java.lang.CharSequence) "JP");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "nglish (united kingdom" + "'", charSequence2, "nglish (united kingdom");
    }

    @Test
    public void test27819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27819");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "FrancGa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27820");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u", '0');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27821");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Engl");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27822");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setExtension('f', "tTAT_ITA");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test27823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u0068", "NAILAT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068" + "'", str2, "\\u0068");
    }

    @Test
    public void test27824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27824");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("allemand", "zh_CN", (int) '\r');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.substringsBetween("", "anglais", "Korean (South Korea)");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("US", strArray5, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("franc", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "US" + "'", str10, "US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test27825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27825");
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
        java.util.Locale locale20 = java.util.Locale.getDefault(category0);
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = locale23.getDisplayName(locale24);
        java.util.Locale locale26 = locale23.stripExtensions();
        java.util.Locale locale27 = locale23.stripExtensions();
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.upperCase("", locale23);
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = locale29.getDisplayScript(locale30);
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        java.lang.String str35 = locale33.getExtension('h');
        java.lang.String str36 = locale32.getDisplayScript(locale33);
        java.lang.String str37 = locale32.getISO3Country();
        java.lang.String str38 = locale30.getDisplayVariant(locale32);
        java.lang.String str39 = locale32.getCountry();
        java.lang.String str40 = locale23.getDisplayLanguage(locale32);
        java.util.Locale.setDefault(category0, locale32);
        java.util.Locale locale45 = new java.util.Locale("iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  ", "", " hi!       _\\U0020_Italienisch####################################################################           ");
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
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "allemand" + "'", str25, "allemand");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "FRA" + "'", str37, "FRA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "FR" + "'", str39, "FR");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "allemand" + "'", str40, "allemand");
        org.junit.Assert.assertEquals(locale45.toString(), "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii                                             hcsfr-cued                                                                                          hcsfr-cued  __ hi!       _\\U0020_Italienisch####################################################################           ");
    }

    @Test
    public void test27826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27826");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setLanguage("8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\83RA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\83RA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test27827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("444444444it                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444it                   " + "'", str1, "444444444it                   ");
    }

    @Test
    public void test27828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL", "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL" + "'", str2, "NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL");
    }

    @Test
    public void test27829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27829");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "!!!!!!!!!!!!!!!!!!!!!\\u0020hi!       _\\U0020_Italienisch################anihc!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("Germa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germa" + "'", str2, "Germa");
    }

    @Test
    public void test27831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27831");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI44444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati44444444444444" + "'", str1, "4444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati444444444444444444444444nailati44444444444444");
    }

    @Test
    public void test27832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27832");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\u0044");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0044" + "'", str1, "\\u0044");
    }

    @Test
    public void test27833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR       ", "                                                                            FR_fr                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR       " + "'", str2, "fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR       ");
    }

    @Test
    public void test27834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27834");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("TALIAN\\u0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27835");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                              ECANADAgCANADACANADAsh                                                                              ECANADAgCANADACANADAsh                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27836");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('d', (int) 'e');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test27837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27837");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56 + "'", int1 == 56);
    }

    @Test
    public void test27838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################" + "'", str2, "alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################");
    }

    @Test
    public void test27839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27839");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                               e");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27840");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale1);
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getExtension('h');
        java.lang.String str9 = locale5.getDisplayScript(locale6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale5);
        java.lang.String str11 = locale1.getDisplayVariant(locale5);
        java.lang.String str12 = locale1.getDisplayLanguage();
        java.lang.String str13 = locale1.getDisplayScript();
        java.lang.Class<?> wildcardClass14 = locale1.getClass();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Korean" + "'", str12, "Korean");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test27841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("z...", 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z..." + "'", str2, "z...");
    }

    @Test
    public void test27842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("E             G                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "E             G                                                                                     " + "'", str1, "E             G                                                                                     ");
    }

    @Test
    public void test27843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00000000...", 'T', 'J');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000..." + "'", str3, "00000000...");
    }

    @Test
    public void test27844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27844");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Rnz\366sisch(Knd                                                                                                                                                                                                               ", "FR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FR", 215);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27845");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale4);
        java.lang.String str7 = locale4.getScript();
        java.lang.String str8 = locale4.getDisplayName();
        char[] charArray16 = new char[] { 'f', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "d", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Azhzhzhzhzhzhzhzhzhzh", charArray16);
        boolean boolean22 = locale4.equals((java.lang.Object) "Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italian" + "'", str8, "italian");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test27846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27846");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', '8');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test27847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27847");
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
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder32.clearExtensions();
        java.util.Locale locale34 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str35 = locale34.getDisplayName();
        java.util.Locale.Builder builder36 = builder33.setLocale(locale34);
        java.util.Locale.Builder builder38 = builder33.setLanguage("und");
        java.util.Locale locale39 = builder38.build();
        java.util.Locale locale40 = builder38.build();
        java.util.Locale locale41 = builder38.build();
        java.lang.String str42 = locale41.getDisplayCountry();
        java.lang.String str43 = locale41.getCountry();
        java.util.Locale.Builder builder44 = builder1.setLocale(locale41);
        java.util.Locale.Builder builder46 = builder1.addUnicodeLocaleAttribute("U005C");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Korean" + "'", str29, "Korean");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Korean" + "'", str30, "Korean");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "French (Canada)" + "'", str35, "French (Canada)");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Canada" + "'", str42, "Canada");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CA" + "'", str43, "CA");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test27848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27848");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("TALIAN_ITALIAN_ENGLISH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TALIAN_ITALIAN_ENGLISH" + "'", str1, "TALIAN_ITALIAN_ENGLISH");
    }

    @Test
    public void test27849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27849");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" + "'", str1, "HcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
    }

    @Test
    public void test27850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27850");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("\\U0023");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: \\U0023 [at index 0]");
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
    public void test27851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27851");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIECANADAgCANADACANADAshIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "chinois (chine) (\\ITALIAN_ITALIAN_ENGLISH)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test27852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hsxlgnE_NAILATI_naxlatx\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27853");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("#########################################################################################eltI_0200U\\_!", 'Y');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 126 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test27854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27854");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aEEEEEEEEEEEEE)", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27855");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ih dalleman", "chinesexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_    IIIIIIIIII_.Korean (South Korea)Korean (So", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27856");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27857");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.addUnicodeLocaleAttribute("\ub300\ud55c\ubbfc\uad6d");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ??????????? [at index 0]");
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
    public void test27858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27858");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder6 = builder2.setExtension('D', "Deutsc");
        java.util.Locale.Builder builder7 = builder2.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test27859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27859");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("nnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str1, "nnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test27860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27860");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale locale8 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.clearExtensions();
        java.util.Locale.Builder builder10 = builder9.clear();
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test27861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27861");
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
        java.lang.String str32 = locale18.getDisplayLanguage();
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
        org.junit.Assert.assertEquals(locale17.toString(), "\\u005c");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "fran\347ais" + "'", str32, "fran\347ais");
    }

    @Test
    public void test27862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaa...ANiTALIaaaaaaaaaaaaaaaaaaaaaaaaaa", "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27863");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                                                                                                                                                                                     cHN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cHN" + "'", str1, "cHN");
    }

    @Test
    public void test27864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27864");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("It_I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "It_I" + "'", str1, "It_I");
    }

    @Test
    public void test27865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27865");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    ITALIAN_ITALIAN_ENGLISF", "ITALIAE", (int) 'f');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27866");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("latIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", " tli                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27867");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance" + "'", str1, "francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance");
    }

    @Test
    public void test27868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27868");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'z', '0');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'z' + "'", char2 == 'z');
    }

    @Test
    public void test27869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27869");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                     KOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKO\\u0023                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKO\\u0023" + "'", str1, "KOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKO\\u0023");
    }

    @Test
    public void test27870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27870");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch", "FRFRFRFRFRFRFRFRFRFRFRFRFdDEFRFRFRFRFRFRFRFRFRFRFRFRFR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27871");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888" + "'", str1, "888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888");
    }

    @Test
    public void test27872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27872");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\u0030UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 241);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27873");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia", "en-CA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27874");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("NC_H", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 32);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27875");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("korezhzhzhzhzhzhzhzhzhzhfraadzhaezTtat_itahagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)", "Hhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIH", "ta...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "korezhzhzhzhzhzhzhzhzhzhfraadzhaezTtat_itahagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)" + "'", str3, "korezhzhzhzhzhzhzhzhzhzhfraadzhaezTtat_itahagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)");
    }

    @Test
    public void test27876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27876");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("ian\\u00208ian\\u0020i868ian\\u00");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'i' + "'", char1 == 'i');
    }

    @Test
    public void test27877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27877");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada", "aaaaaaaaaaaaaaaaaaaaaaaaaaILATiNA...aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27878");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("IIIIIIIIII");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=iiiiiiiiii");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0030", 102, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0030\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0030\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test27880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27880");
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
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("YBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHER", "uhUthUrhUohUihUehUahUvgUugUngUlgUdgUagUyfUrfUofUjfUifUffUafUueUteUseU");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: YBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHER [at index 0]");
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
    public void test27881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27881");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "francese", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "CINESE (cINA)", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ZZZITALIAN (ITALY)", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test27882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27882");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Deutsch");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "franz\366sisch (frankreich)");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("ENGLISCH", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", (java.lang.Object[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                     ", 27, 537);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test27883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27883");
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
        java.util.Locale.setDefault(locale5);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
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
    }

    @Test
    public void test27884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27884");
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = locale1.stripExtensions();
        java.util.Locale locale5 = locale1.stripExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("\\u0034\\u00hcstuD\\u0034\\u00", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\U0034\\U00HCSTUD\\U0034\\U00" + "'", str6, "\\U0034\\U00HCSTUD\\U0034\\U00");
    }

    @Test
    public void test27885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27885");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\u0023_ITALIENISCH_iTALIAN", (java.lang.CharSequence) "HI!       G");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27886");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("\uc911\uad6d) \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\uc911\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: (??????) ?????????????????????????????????????????????????????? [at index 0]");
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
    public void test27887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27887");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("R", "Chinois (chine)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27888");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('i', 406);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 406 + "'", int2 == 406);
    }

    @Test
    public void test27889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27889");
        java.util.Locale locale3 = new java.util.Locale("Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz", "ccccccccccccccccccccccccccccccccccccccccccccccc\\u00de\\u00ccccccccccccccccccccccccccccccccccccccccccccccc", "...FDEDZCYCXCWCVCUCRCOCNCMCLCKCIIIIIIIIIICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIIIIIIIIIIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIIIIIIIIIIAGAFAEADA");
    }

    @Test
    public void test27890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27890");
        java.util.Locale locale3 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for HHHHHHHHH");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
    }

    @Test
    public void test27891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27891");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("FRANZ\326SISCHFRANZOSISCH (FRANKREICFRANZ\326SISCHFRANZOSISCH (FRANKREICH", "AND4444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27892");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444ITALIAN44444444444444", "tedesco");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("itTAiT_ITA");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061", strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("8600u\\", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("cinese (cina)\\u0069h..", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test27893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27893");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getScript();
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.String str4 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test27894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27894");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZOSISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                               france                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc (E                         IITAL,italian    )", "\\u0035");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc (E                         IITAL,italian    )" + "'", str2, "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc (E                         IITAL,italian    )");
    }

    @Test
    public void test27896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27896");
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
        java.lang.Class<?> wildcardClass14 = builder13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test27897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27897");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("    \\    ", "hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27898");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLC", "!_\\u0020_itle########################################################################################", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("It_", 720);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                      It_                                                                                                                                                                                                                                                                                                                                                                       " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                      It_                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test27900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27900");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!(\\U0020,Italienisch############################################hi!       ", "                                                                                                                  \\u0068");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test27901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27901");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "       2cinese (cina)italianitalianitalianital       ", (java.lang.CharSequence) "a700u\\  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27902");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444italian44444444444444", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 98);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\u006bCinese (Cina)\\u0069h..", "United Kingdom");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27904");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", (int) 'l', "italian (italian,e...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "italCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test27905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27905");
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
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet16 = locale15.getExtensionKeys();
        java.lang.String str17 = locale15.getVariant();
        java.lang.String str18 = locale15.getDisplayScript();
        java.util.Locale.setDefault(category14, locale15);
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str22 = locale21.getCountry();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale locale24 = builder23.build();
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str27 = locale24.getDisplayLanguage(locale26);
        java.lang.String str28 = locale21.getDisplayLanguage(locale24);
        boolean boolean29 = locale24.hasExtensions();
        java.lang.String str30 = locale15.getDisplayScript(locale24);
        java.lang.String str31 = locale15.getVariant();
        java.lang.String str32 = locale15.getISO3Country();
        java.util.Locale.Builder builder33 = builder10.setLocale(locale15);
        java.util.Locale.Builder builder34 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder36 = builder34.setRegion("EDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkED");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: EDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkED [at index 0]");
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
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test27906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27906");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ITALIAN_ITALIAN_ENGLISHITALIAN_!IHITTAIT_ITALIAN_EGAISHEGSHEGSHEGSHEGSHEGSHEGSHEGSHEG", "E g");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27907");
        java.util.Locale locale2 = new java.util.Locale("FRANZ\326SISCH", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!frankreich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals(locale2.toString(), "franz\326sisch_!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!FRANKREICH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test27908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27908");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        double double2 = languageRange1.getWeight();
        boolean boolean4 = languageRange1.equals((java.lang.Object) ")ADANAc( ESECNARF");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\u7fa9\u5927\u5229\u6587          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u7fa9\u5927\u5229\u6587          " + "'", str1, "\u7fa9\u5927\u5229\u6587          ");
    }

    @Test
    public void test27910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27910");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('\u6cd5');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27911");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hhhhhhhhH");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("44444444444444ITALIAN44444444444444");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("fr-c                 ", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("             DE_DE             ", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "             DE_DE             " + "'", str10, "             DE_DE             ");
    }

    @Test
    public void test27912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27912");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23" + "'", str1, "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
    }

    @Test
    public void test27913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27913");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("zhzhzhzhzhzhzhzhzhzhE             g", "(ROYAUME-UNI)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27914");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "z (IFRANZOSISCH)", (java.lang.CharSequence) "            zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "z (IFRANZOSISCH)" + "'", charSequence2, "z (IFRANZOSISCH)");
    }

    @Test
    public void test27915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27915");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                ITA                ", "                                                                                                         German (Germany)");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
    }

    @Test
    public void test27916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27916");
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
        java.util.Locale locale18 = locale5.stripExtensions();
        java.lang.String str19 = locale5.toString();
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
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fr_FR" + "'", str19, "fr_FR");
    }

    @Test
    public void test27917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27917");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...", "AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test27919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27919");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("fr-cafr-cafr-c8600u\\fr-cafr-cafr-caEEEEEE", "nglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27920");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("TALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIAN", "SUen_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27921");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN", (int) 't');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27922");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.clear();
        java.util.Locale.Builder builder11 = builder6.addUnicodeLocaleAttribute("44d444");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder6.setExtension('C', "Chinesisch(China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Chinesisch(China) [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test27923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27923");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222zh", "englisch", 314);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27924");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Eagaas\\\\\\\\\\\\\\HI!HI!", "                                eselgni                               ", "                                  !ih                            dalleman");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Eahaa \\\\\\\\\\\\\\HI!HI!" + "'", str3, "Eahaa \\\\\\\\\\\\\\HI!HI!");
    }

    @Test
    public void test27925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27925");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         u005c         ", "iTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", "royaume-uni");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                         u005c         " + "'", str3, "                                                                         u005c         ");
    }

    @Test
    public void test27926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27926");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder8 = builder5.setExtension('i', "");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("Engl");
        java.util.Locale.Builder builder11 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setScript("ermany)German (G                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ermany)German (G                                                                                      [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test27927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27927");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", '5');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27928");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ITALIAN_it  i  _ NGLISHITALIAN_ IHitTAiT_ITALIAN_EgAish", "                             kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk", "                \\     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITALIAN_it  i  _ NGLISHITALIAN_ IHitTAiT_ITALIAN_EgAish" + "'", str3, "ITALIAN_it  i  _ NGLISHITALIAN_ IHitTAiT_ITALIAN_EgAish");
    }

    @Test
    public void test27929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27929");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("Royaume-Uniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27930");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("itTAiT_ITALIAN_EgAish", (java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'e');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch");
        java.lang.Class<?> wildcardClass10 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                    " + "'", str6, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test27931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27931");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.lang.String str6 = locale1.getISO3Country();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale7);
        java.lang.String str9 = locale1.getDisplayName(locale7);
        java.lang.String str10 = locale1.getScript();
        java.lang.String str11 = locale1.getLanguage();
        java.lang.String str12 = locale1.getISO3Language();
        java.util.Set<java.lang.String> strSet13 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale1.getDisplayVariant();
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
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                           ", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRA" + "'", str6, "FRA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str9, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr" + "'", str11, "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fra" + "'", str12, "fra");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "France" + "'", str41, "France");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "                                                                                                                                                                                                                                                                           " + "'", str42, "                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test27932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("PPPPPPPPPPPPPPPPPPP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PPPPPPPPPPPPPPPPPPP" + "'", str1, "PPPPPPPPPPPPPPPPPPP");
    }

    @Test
    public void test27933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27933");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                  \\U0069HHHHHHHHHH", 200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27934");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("ti");
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
        java.util.Locale locale19 = java.util.Locale.getDefault(category3);
        java.util.Locale locale20 = java.util.Locale.getDefault(category3);
        java.lang.String str21 = locale20.getCountry();
        java.util.Locale.Builder builder22 = builder0.setLocale(locale20);
        java.util.Locale.Builder builder23 = builder22.clear();
        java.util.Locale.Builder builder24 = builder22.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder24.setLanguage("                                                                                        e                        ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                                                                         e                         [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
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
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CA" + "'", str21, "CA");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test27935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27935");
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
        java.util.Locale.Builder builder13 = builder11.setVariant("Fgence");
        java.util.Locale.Builder builder14 = builder13.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder13.setUnicodeLocaleKeyword("hi!iiiiiii_\\U0020_Italienisch#########################################################################################", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTU005CTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: hi!iiiiiii_\\U0020_Italienisch######################################################################################### [at index 0]");
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
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test27936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27936");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Italie                         ", "                                           fRENCH (fRANCE)                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Chinese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
    }

    @Test
    public void test27938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27938");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0078", "ENGLISCH", (int) '\\');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("hI!       ", strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCO", strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0078" + "'", str6, "\\u0078");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test27939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27939");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.lang.String str9 = locale0.getScript();
        java.lang.String str10 = locale0.getLanguage();
        java.lang.String str11 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet12 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale0.getDisplayVariant();
        java.util.Set<java.lang.String> strSet14 = locale0.getUnicodeLocaleKeys();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fra" + "'", str11, "fra");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test27940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27940");
        java.util.Locale locale2 = new java.util.Locale("                                                                              ECANADAgCANADACANADAsh                                                                              ECANADAgCANADACANADAsh                                                              ", "allemand                                         ");
        org.junit.Assert.assertEquals(locale2.toString(), "                                                                              ecanadagcanadacanadash                                                                              ecanadagcanadacanadash                                                              _ALLEMAND                                         ");
    }

    @Test
    public void test27941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27941");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ITALIAN", "\\u0075");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 31, (int) (byte) 1);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITALIAN" + "'", str3, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITALIAN" + "'", str9, "ITALIAN");
    }

    @Test
    public void test27942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("jp", 20, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..................jp" + "'", str3, "..................jp");
    }

    @Test
    public void test27943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27943");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("C                       ", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27944");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILAT", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hsiage_nailati_tiattihi!_nailatihsilgne_nailati_nailat");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27945");
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
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("\\u0020italianitalianitalianitali\\u0020italianitalianitalianitalhcsineilati");
        java.util.Locale.Builder builder22 = builder0.setLocale(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder0.setVariant("Cina");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Cina [at index 0]");
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
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test27946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27946");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhfrancese (Canada)", "ILATiNA...", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27947");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!_\\U0020_Itle", "Deutsch (Deutschland)", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!_\\U0020_Itle" + "'", str3, "!_\\U0020_Itle");
    }

    @Test
    public void test27948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27948");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("eee", 105, 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eee" + "'", str3, "eee");
    }

    @Test
    public void test27949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27949");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hcsnela", (int) '7', "                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hcsnela                                                " + "'", str3, "hcsnela                                                ");
    }

    @Test
    public void test27950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                          g             E", "######################################ELTi_0200u\\_!#####################################ELTi_0200u\\_!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          g             E" + "'", str2, "                          g             E");
    }

    @Test
    public void test27951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27951");
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
        java.util.Locale locale27 = builder26.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder29 = builder26.addUnicodeLocaleAttribute("Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzhfranc?ais (France)Azhzhzhzhzhzhzhzhzhzh [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italienisch" + "'", str9, "Italienisch");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italienisch" + "'", str10, "Italienisch");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italienisch" + "'", str11, "Italienisch");
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
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "france");
    }

    @Test
    public void test27952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) " rnz\366sisch(nd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " rnz\366sisch(nd)" + "'", str1, " rnz\366sisch(nd)");
    }

    @Test
    public void test27953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!(\\U0020,Italienisch############################################hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!(\\U0020,Italienisch############################################hi!" + "'", str1, "hi!(\\U0020,Italienisch############################################hi!");
    }

    @Test
    public void test27954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27954");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27955");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "8");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27956");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!ih                            dalleman!ih                            dalleman!ih                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27957");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("N");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "N" + "'", str1, "N");
    }

    @Test
    public void test27958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27958");
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
        java.util.Locale locale11 = builder10.build();
        java.lang.String str12 = locale11.toLanguageTag();
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ko" + "'", str12, "ko");
    }

    @Test
    public void test27959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27959");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("french (NC_HZ)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "french (NC_HZ)" + "'", str1, "french (NC_HZ)");
    }

    @Test
    public void test27960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27960");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUADAEALAMANAOAQARASATAJEAJMAJOAJPAKEAKGAKHAKAKMAKNAKPAKRAKWAKYAKZALAALBALCALALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVAVNAVUAWFAWSAYEAYTAZAAZMAZW", "cccc\\cccc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27961");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", "\\U0020ItalianItalianItalianItali\\U0020ItalianItalianItalianItal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27962");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Korean (South Kor");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0021", '4');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   h", "!_\\U0020_Itle#########################################################################################", (int) 'F');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("erma (ermay)                                                 TALIAN                                                  ", strArray6, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("itChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TAChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)iChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)_Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)ITA", strArray2, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "erma (ermay)                                                 TALIAN                                                  " + "'", str11, "erma (ermay)                                                 TALIAN                                                  ");
    }

    @Test
    public void test27963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27963");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                      ", (java.lang.CharSequence) "HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH" + "'", charSequence2, "HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH");
    }

    @Test
    public void test27964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                           U0020ITALIANITALIANITALIANITALI", 'k');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                           U0020ITALIANITALIANITALIANITALI" + "'", str2, "                                                                                           U0020ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test27965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27965");
        java.util.Locale locale2 = new java.util.Locale("fran\347ais (Canaaa)", "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz");
        java.lang.String str3 = locale2.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "fran\347ais (canaaa)_ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZHZHZHZ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (canaaa)" + "'", str3, "fran\347ais (canaaa)");
    }

    @Test
    public void test27966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27966");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("    ZH_CN    South Korea");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aeroK htuoS    NC_HZ    " + "'", str1, "aeroK htuoS    NC_HZ    ");
    }

    @Test
    public void test27967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN", "hcstued");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN");
    }

    @Test
    public void test27968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 'S');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", str2, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test27969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27969");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("443200u\\44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "443200u\\44" + "'", str1, "443200u\\44");
    }

    @Test
    public void test27970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27970");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("dnamezhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARFhzhzhzhzhzhzhzhzhzhz", "r0                                               nailati                                                ", 56);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("english", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test27971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27971");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.getDefault(category11);
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.util.Locale.setDefault(category11, locale14);
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.lang.String str20 = locale18.getExtension('x');
        java.util.Locale.setDefault(category11, locale18);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder22.clearExtensions();
        java.util.Locale.Builder builder25 = builder22.setLanguageTag("Italian");
        java.util.Locale locale26 = java.util.Locale.PRC;
        java.lang.String str27 = locale26.getDisplayName();
        java.util.Locale.Builder builder28 = builder22.setLocale(locale26);
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder31 = builder29.setLocale(locale30);
        java.lang.String str32 = locale30.getDisplayName();
        java.util.Locale.setDefault(category11, locale30);
        java.util.Locale.Builder builder34 = builder8.setLocale(locale30);
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("iTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish");
        java.lang.String str38 = locale36.getExtension('A');
        java.util.Locale locale42 = new java.util.Locale("hi!       _\\U0020_Italienisch####################################################################...", "italian_ITALIAN_English", "hcsineilatI");
        java.lang.String str43 = locale42.getDisplayVariant();
        java.lang.String str44 = locale42.getDisplayScript();
        java.lang.String str45 = locale42.getLanguage();
        boolean boolean46 = locale42.hasExtensions();
        java.lang.String str47 = locale36.getDisplayVariant(locale42);
        java.util.Locale.Builder builder48 = builder8.setLocale(locale36);
        java.lang.Object obj49 = locale36.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "allemand" + "'", str15, "allemand");
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.FORMAT + "'", category17.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "chinois (Chine)" + "'", str27, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko");
        org.junit.Assert.assertNotNull(builder31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "cor\351en" + "'", str32, "cor\351en");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals(locale42.toString(), "hi!       _\\u0020_italienisch####################################################################..._ITALIAN_ITALIAN_ENGLISH_hcsineilatI");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hcsineilatI" + "'", str43, "hcsineilatI");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!       _\\u0020_italienisch####################################################################..." + "'", str45, "hi!       _\\u0020_italienisch####################################################################...");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "");
    }

    @Test
    public void test27972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                            fr_FR                  ", (java.lang.CharSequence) ")dnK( hcsis\366znrF                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27973");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "United State");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27974");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi!Italsch", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27975");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Franz\366sisch", " ", 104);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0061ItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalifnischItalif", strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Franz\366sisch" + "'", str6, "Franz\366sisch");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test27976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27976");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder9 = builder7.setLanguage("FRA");
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder13 = builder7.setExtension('F', "eNGLISCU");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder7.setScript("... g ...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ... g ... [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test27977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "Und-iTALIAN");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27978");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.lang.String str5 = locale2.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-FR" + "'", str3, "fr-FR");
        org.junit.Assert.assertNotNull(strSet4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fran\347ais" + "'", str5, "fran\347ais");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais (France)" + "'", str6, "fran\347ais (France)");
    }

    @Test
    public void test27979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################", "                                                                              INGLESE                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################" + "'", str2, "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################");
    }

    @Test
    public void test27980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27980");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27981");
        java.util.Locale locale2 = new java.util.Locale("        FRA         ", "");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "        fra         ");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test27982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!aNCHc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 114);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!aNCHc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!aNCHc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test27983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27983");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("      ", "\\u0020)TALIAN)TALIAN)TALIANiTALI", "aNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHc");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      " + "'", str3, "      ");
    }

    @Test
    public void test27984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27984");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "TA...", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                               8300u\\                                                ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " ...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test27985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27985");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("G");
        java.lang.String str2 = locale1.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("                                      )hsilgne,nailati( ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:                                       )hsilgne,nailati( ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27986");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                  IT44444444444444444EN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27987");
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
        java.util.Locale locale51 = java.util.Locale.getDefault(category0);
        java.util.Locale locale54 = new java.util.Locale(")modgniK detinU( hsilgnE", "IIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        java.util.Locale.setDefault(category0, locale54);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
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
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "fr_CA");
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
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals(locale54.toString(), ")modgnik detinu( hsilgne_IIIIIIIIIIIN44444444444444ALIA44444444444444ITIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test27988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("English (United States)", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (United States)" + "'", str2, "English (United States)");
    }

    @Test
    public void test27989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27989");
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
        java.util.Locale.Builder builder59 = builder58.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder62 = builder59.setExtension('n', "A");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: A [at index 0]");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "italien" + "'", str14, "italien");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "fran\347ais" + "'", str39, "fran\347ais");
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
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test27990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27990");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("United Kingdom", "             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(" (ITALIAN,ENGLISH)", 11, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NGLISH)" + "'", str3, "NGLISH)");
    }

    @Test
    public void test27992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27992");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList10, filteringMode12);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList25, filteringMode27);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList31);
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = locale35.getScript();
        java.util.Set<java.lang.String> strSet37 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet37, 'A');
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet37);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList40, 'u');
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.Locale.FilteringMode filteringMode54 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList52, filteringMode54);
        java.util.Locale.FilteringMode filteringMode56 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList52, filteringMode56);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList67, filteringMode69);
        java.util.Locale.FilteringMode filteringMode71 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.lang.String>) strList67, filteringMode71);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.lang.String[] strArray78 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        java.util.Locale.FilteringMode filteringMode81 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList82 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList79, filteringMode81);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList72, filteringMode81);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strList40, filteringMode81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap85 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList86 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap85);
        java.util.Collection<java.lang.String> strCollection87 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags(languageRangeList3, strCollection87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode27.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + filteringMode54 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode54.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertTrue("'" + filteringMode56 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode56.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode69.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertTrue("'" + filteringMode71 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode71.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + filteringMode81 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode81.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(languageRangeList86);
    }

    @Test
    public void test27993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\uc601\uc5b4", "ZH_CNGGGGG");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27994");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                          inglesehhhhhhhhh                                          ", '8');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27995");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozho", 12, (int) 'I');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              " + "'", str2, "                              ");
    }

    @Test
    public void test27997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("44444444444444ITALIAN4444444444", "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444ITALIAN4444444444" + "'", str2, "44444444444444ITALIAN4444444444");
    }

    @Test
    public void test27998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27998");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                         \\u005");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u005" + "'", str1, "\\u005");
    }

    @Test
    public void test27999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27999");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca", 71, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test28000");
        java.util.Locale locale1 = new java.util.Locale("\\U0078");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale locale5 = new java.util.Locale("9hhhhhhhhhh", "\\u0078");
        java.lang.String str6 = locale5.getCountry();
        java.lang.String str7 = locale1.getDisplayScript(locale5);
        java.lang.String str8 = locale1.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0078");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale5.toString(), "9hhhhhhhhhh_\\U0078");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\U0078" + "'", str6, "\\U0078");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
    }
}
