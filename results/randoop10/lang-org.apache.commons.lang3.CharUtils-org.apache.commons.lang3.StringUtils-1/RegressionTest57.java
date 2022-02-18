import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest57 {

    public static boolean debug = false;

    @Test
    public void test28501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28501");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('\351');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28502");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray14 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("HI!", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0068", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence3, charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0054", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "iT_ITALIAN_EgAish", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "9hhhhhhhhhh 9hhhhhhhhhh", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37 + "'", int18 == 37);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test28503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28503");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("France", "       !IH");
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getDisplayName();
        java.lang.String str14 = locale11.getExtension('C');
        java.lang.String str15 = locale10.getDisplayLanguage(locale11);
        java.util.Locale.setDefault(locale10);
        java.lang.String str17 = locale9.getDisplayVariant(locale10);
        java.lang.String str18 = locale6.getDisplayVariant(locale10);
        java.util.Set<java.lang.String> strSet19 = locale6.getUnicodeLocaleKeys();
        java.lang.Class<?> wildcardClass20 = strSet19.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale9.toString(), "france_       !IH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fran\347ais" + "'", str12, "fran\347ais");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chinois" + "'", str15, "chinois");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test28504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("#########################################################################################eltI_0200U\\_!", "\\u0032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################################################################eltI_0200U\\_!" + "'", str2, "#########################################################################################eltI_0200U\\_!");
    }

    @Test
    public void test28505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28505");
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
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str3, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test28506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28506");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ermany)German (G                                                                                     ", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh99999\\u0021hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28507");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.String str5 = locale0.getDisplayScript();
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test28508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28508");
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
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList14, "azhzhzhzhzhzhzhzhzhzh");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList14, "FRDzhEzhFzhGzhIzhLzhMzhNzhOzhQzhRzhSzheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList14, 'D');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test28509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28509");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("frnz\366sisch#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzlafrnz\366sisch ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=frnzo?sisch#########################################)ylati(nailatizzzc)ylati(nailatizzzne)ylati(nailatizzzlafrnzo?sisch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28510");
        java.util.Locale locale3 = new java.util.Locale("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEa", "e             g                                                                                     ", "\\U0078");
        java.lang.String str4 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeea_E             G                                                                                     _\\U0078");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0078" + "'", str4, "\\U0078");
    }

    @Test
    public void test28511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HCSINEI", "RoyaumeDeutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Un");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HCSINEI" + "'", str2, "HCSINEI");
    }

    @Test
    public void test28512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ITALIAN4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28513");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('l', 262);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 262 + "'", int2 == 262);
    }

    @Test
    public void test28514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28514");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28515");
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Canada", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng", charArray11);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test28516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28516");
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
        java.lang.String str13 = locale12.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str3, "\u6cd5\u6587\u52a0\u62ff\u5927)");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
    }

    @Test
    public void test28517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28517");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\n", (int) '8', 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test28518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Regno Unito");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RegnoUnito" + "'", str1, "RegnoUnito");
    }

    @Test
    public void test28519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28519");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDi...", "zh_cnggggg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28520");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("NC_H", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=nc_h");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28521");
        char[] charArray9 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("CINESE (cINA)", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test28522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28522");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("HCSTUED");
        java.util.Locale.Builder builder8 = builder4.setLanguage("anihc");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder4.removeUnicodeLocaleAttribute("ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA????????\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie????????????????\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie????????????????\\u0061ItalienischI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str3, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test28523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28523");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("cinese) )()C)ina)))\\)u)0069)h)...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28524");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28525");
        java.util.Locale locale1 = new java.util.Locale("italy");
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale5 = new java.util.Locale("", "");
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale1.getDisplayLanguage(locale5);
        java.lang.String str9 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "italy");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italy" + "'", str8, "italy");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test28526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28526");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale locale6 = builder3.build();
        java.lang.String str7 = locale6.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test28527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28527");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...                                             g             e", (int) 'J', ")modgniK detinU( hsilgnE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                             g             e)modgniK de" + "'", str3, "...                                             g             e)modgniK de");
    }

    @Test
    public void test28528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28528");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("francefrancefrancefrancefrancefrancefrancefrancef                 \\u0069hhhhhhhhhh                 ", "italian    ", (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28529");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("\\u0069 (    )");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: \\u0069 (    ) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test28530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28530");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Italienisch", "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28531");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = locale2.stripExtensions();
        java.lang.String str5 = locale4.getVariant();
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleAttributes();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("F", strMap8);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("E");
        java.lang.String str14 = languageRange13.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] { languageRange11, languageRange13 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = locale18.stripExtensions();
        java.lang.String str21 = locale18.getLanguage();
        java.util.Set<java.lang.String> strSet22 = locale18.getUnicodeLocaleKeys();
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet22, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strSet22, filteringMode25);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList38, filteringMode42);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags(languageRangeList28, (java.util.Collection<java.lang.String>) strList38, filteringMode44);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strList26, filteringMode44);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet6, filteringMode44);
        java.util.Locale locale49 = new java.util.Locale("...ANiTALI");
        java.util.Set<java.lang.String> strSet50 = locale49.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet50);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str3, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "e" + "'", str14, "e");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str19, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "it" + "'", str21, "it");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode25.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode44.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertEquals(locale49.toString(), "...anitali");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(strList51);
    }

    @Test
    public void test28532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28532");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...\r\r\r\r\r\r\r\r..", "uD                                             \\U0034", (int) 'z');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28533");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################G");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28534");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Franz\366sisch (KanadaFranz\366sisch (KanadaFranz\366sischGerma");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28535");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "e             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh", "GENCE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28536");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test28537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28537");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      ...", "\\u000d");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("esenihc", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", 367, 804);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test28538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("..................jp", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         u005c         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..................jp" + "'", str2, "..................jp");
    }

    @Test
    public void test28539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28539");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!", 'H');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0020iItalian\\u008600u\\U\\u0020iItalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uitalian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test28540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                        #U##2#ITALIANITALIANITALIANIT", "       !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        #U##2#ITALIANITALIANITALIANIT" + "'", str2, "                                        #U##2#ITALIANITALIANITALIANIT");
    }

    @Test
    public void test28541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28541");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMB9hhhhhhhhhh9hhhhhhhhhhaDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMB", "HHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test28542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44d444", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                       44d444" + "'", str2, "                                                                       44d444");
    }

    @Test
    public void test28543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28543");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("Ttat_ita", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ttat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_ita" + "'", str2, "Ttat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_itaTtat_ita");
    }

    @Test
    public void test28544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28544");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("nglish (United Kingdom)", "...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA", (int) 'E');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("NA", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nglish (United Kingdom)" + "'", str8, "nglish (United Kingdom)");
    }

    @Test
    public void test28545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...........................................................................................................................................................................................................................................................................................................................................................................eselgni", 'i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...........................................................................................................................................................................................................................................................................................................................................................................eselgn" + "'", str2, "...........................................................................................................................................................................................................................................................................................................................................................................eselgn");
    }

    @Test
    public void test28546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28546");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCCCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW", "                                                 ", (int) 'D', (int) '5');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVB                                                 HCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW" + "'", str4, "DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVB                                                 HCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW");
    }

    @Test
    public void test28547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                               en", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                " + "'", str2, "                                                ");
    }

    @Test
    public void test28548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28548");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!5italienisch5italian_italian_english5hi!5hi!5adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...5\\u00345hi!5italian5\\u00615\\u00235hi!5italian5chinese(china)5hi!5zh_cn5italian5en5italienisch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28549");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("                                                                             zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                                                             zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28550");
        java.util.Locale locale3 = new java.util.Locale("hcstued", "ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT", "                                      italian (ITALIAN,English)                                      ");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, '4');
        org.junit.Assert.assertEquals(locale3.toString(), "hcstued_ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT_                                      italian (ITALIAN,English)                                      ");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test28551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28551");
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
        java.util.Locale.Builder builder13 = builder10.clearExtensions();
        java.util.Locale.Builder builder14 = builder10.clear();
        java.util.Locale.Builder builder15 = builder10.clearExtensions();
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
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test28552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28552");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("und-CA", "8ian\\u0020i86 (ITALIAN (ITALIAN,ENGLISH))");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28553");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Eng", "                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Eng" + "'", str2, "Eng");
    }

    @Test
    public void test28554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28554");
        java.util.Locale locale1 = new java.util.Locale("nc_HZnc_HZnc_HZnc_HZnc_ zhAzhzhzhzhzhzhzhzhzhzh nc_HZnc_HZnc_HZnc_HZnc_");
        org.junit.Assert.assertEquals(locale1.toString(), "nc_hznc_hznc_hznc_hznc_ zhazhzhzhzhzhzhzhzhzhzh nc_hznc_hznc_hznc_hznc_");
    }

    @Test
    public void test28555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28555");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...hbi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!       2italianitalianitalianitaliTALIENISCH2iADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!       2ITALIANITALIANITALIANITALItalienisch2Iadaeafagaialamanaoaqarasaauawaxazbabb" + "'", str1, "!       2ITALIANITALIANITALIANITALItalienisch2Iadaeafagaialamanaoaqarasaauawaxazbabb");
    }

    @Test
    public void test28557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28557");
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
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, "");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, "hzhzhzhzhzhzhzhzhzhzahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarfhzhzhzhzhzhzhzhzhzhz");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test28558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28558");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("zh-TW", "ed", "", 98);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-TW" + "'", str4, "zh-TW");
    }

    @Test
    public void test28559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28559");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.Locale.FilteringMode filteringMode21 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList19, filteringMode21);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList25);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.Locale.FilteringMode filteringMode36 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList34, filteringMode36);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList40);
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList40);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList40, '\\');
        java.lang.String str46 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList40);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap49);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + filteringMode21 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode21.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + filteringMode36 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode36.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(languageRangeList50);
    }

    @Test
    public void test28560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28560");
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
        java.lang.String str17 = locale7.getExtension('a');
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test28561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28561");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28562");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("########################################################Franz\366sisc########################################################", "             HCSINEILATI             ", (int) 'n');
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################", strArray4, strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################" + "'", str6, "alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test28563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("francese", "aaaaaaaaaaaaaaaaaaaaaaaaaaAnihCaaaaaaaaaaaaaaaaaaaaaaaaaa", "z..alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese" + "'", str3, "francese");
    }

    @Test
    public void test28564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28564");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0020hi!       _\\U0020_Italienisch#########################################################################################TALIANhi!       _\\U0020_Italienisch#########################################################################################TALIANhi!       _\\U0020_Italienisch#########################################################################################TALIANiTALI", "                                                       hi!                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28565");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Deutscdhi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dEUTSCDHI!       5iTALIENISCH5ITALIAN_italian_eNGLISH5hi!5HI!5adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...5\\U00345hi!5iTALIAN5\\U00615\\U00235HI!5Italian5cHINESE (cHINA)5HI!5ZH_cn5Italian5EN5iTALIENISCH" + "'", str1, "dEUTSCDHI!       5iTALIENISCH5ITALIAN_italian_eNGLISH5hi!5HI!5adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...5\\U00345hi!5iTALIAN5\\U00615\\U00235HI!5Italian5cHINESE (cHINA)5HI!5ZH_cn5Italian5EN5iTALIENISCH");
    }

    @Test
    public void test28566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28566");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (int) 'g');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28567");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\u0034\\u00                                   en_C\\u0034\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0034\\U00                                   EN_C\\U0034\\U00" + "'", str1, "\\U0034\\U00                                   EN_C\\U0034\\U00");
    }

    @Test
    public void test28568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28568");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("NC_HZ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28569");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("T");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "T" + "'", str1, "T");
    }

    @Test
    public void test28570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
    }

    @Test
    public void test28571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28571");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("nglish (united kingdom)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '0', (int) 'C', (int) 'D');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 67");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28572");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                      und-iTALIAN", "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)", 309);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                      und-iTALIAN" + "'", str3, "                                                                      und-iTALIAN");
    }

    @Test
    public void test28573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28573");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\u0020_itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 151);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28574");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("FFFF", "", 108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test28575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28575");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("fran\347ais (France)fr-CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fran\347ais (France)fr-CA" + "'", str1, "fran\347ais (France)fr-CA");
    }

    @Test
    public void test28576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i", "nauruan");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i" + "'", str2, "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i");
    }

    @Test
    public void test28577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u0038", "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGkorezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0038" + "'", str2, "\\u0038");
    }

    @Test
    public void test28578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28578");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\XTALXAN_ITALIAN_ENGLXSH                                                 ", 0, "UND-ITTAIT-ITALIAN-EGAISH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH                                                 " + "'", str3, "\\XTALXAN_ITALIAN_ENGLXSH                                                 ");
    }

    @Test
    public void test28579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28579");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "I\\u0020iTALIANiTALIANiTALIANiTALIit", (java.lang.CharSequence) "\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCO");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str2, "...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test28581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28581");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "fr-C                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28582");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Katalanisch\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", (int) 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str2, "            444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
    }

    @Test
    public void test28584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28584");
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
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale locale14 = builder12.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder12.setLanguageTag("Cen-G\\u0038zho                         CHD");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: G\\u0038zho                         CHD [at index 4]");
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "anglais__hcstued");
    }

    @Test
    public void test28585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28585");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test28586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28586");
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28587");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str3 = locale1.getExtension('x');
        java.lang.String str4 = locale1.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale1.getUnicodeLocaleType("                                                                    .................................Italian (Italy)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:                                                                     .................................Italian (Italy)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fran\347ais" + "'", str4, "fran\347ais");
    }

    @Test
    public void test28588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Japonais", "n Italienisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japonais" + "'", str2, "Japonais");
    }

    @Test
    public void test28589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28589");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ttttttttttttttttttttt                                                                                                              ITALIEITALtttttttttttttttttttttt", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", (int) 'z');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                     g             ", 70, "ittait_italian_egaish                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                     g             " + "'", str3, "                                                                                     g             ");
    }

    @Test
    public void test28591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28591");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\U0069\\U0069\\U", "FRANZ\326SISCH2(FRANKREICH)", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28592");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28593");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!(\\U0020,Italienisch#########################################################################################", "\\u0035", (int) 'E');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28594");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u006e", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("cinese (Cina)                                                               ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test28595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u0065");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u0065" + "'", str1, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u0065");
    }

    @Test
    public void test28596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28596");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) 'N');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28597");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setExtension('Y', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder4.addUnicodeLocaleAttribute("ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test28598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28598");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale1);
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.String str12 = locale8.getExtension('E');
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale8.getDisplayName(locale13);
        java.lang.String str16 = locale1.getDisplayLanguage(locale8);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         italian_italian_english" + "'", str2, "         italian_italian_english");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "chinois" + "'", str3, "chinois");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale8.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITALIAN" + "'", str9, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "China" + "'", str10, "China");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-US" + "'", str14, "en-US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italian (ITALIAN,English)" + "'", str15, "italian (ITALIAN,English)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
    }

    @Test
    public void test28599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28599");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale3.getDisplayLanguage();
        java.lang.String str6 = locale3.toLanguageTag();
        java.lang.String str7 = locale3.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italian" + "'", str5, "italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italian" + "'", str6, "italian");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test28600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\u0020", "\\U002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020" + "'", str2, "\\u0020");
    }

    @Test
    public void test28601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28601");
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getLanguage();
        java.lang.String str5 = locale3.getScript();
        java.lang.String str6 = locale3.getISO3Country();
        java.lang.String str7 = locale3.getCountry();
        java.lang.String str8 = locale3.getCountry();
        java.lang.String str9 = locale1.getDisplayScript(locale3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("CA", locale3);
        java.lang.String str11 = locale3.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italien" + "'", str2, "italien");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr" + "'", str4, "fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CAN" + "'", str6, "CAN");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CA" + "'", str7, "CA");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CA" + "'", str8, "CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CA" + "'", str10, "CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test28602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28602");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u00de\\u00\\u\\u00de\\u00\\u");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("ITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIA", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28603");
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
        java.util.Locale.Builder builder45 = builder0.setExtension('t', "ESENIHC");
        java.util.Locale.Builder builder47 = builder0.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder50 = builder0.setExtension('I', "\\U005");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: \\U005 [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
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
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test28604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28604");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", "\u82f1\u56fd", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
    }

    @Test
    public void test28605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28605");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("DE\rDJ\rDK\rDM\rDO\rDZ\rEC\rEE\rEG\rEH\rER\rES\rET\rFI\rFJ\rFK\rFM\rFO\rFR\rGA\rGB\rGD\rGE\rGF\rGG\rGH\rGI\rGL\rGM\rGN\rGP\rGQ", "u0049", (int) 'G');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28606");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ", "", 31);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("ITALIAN_italian_eNGLISH", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ" + "'", str7, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ");
    }

    @Test
    public void test28607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28607");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", "\\u0065                             a)                                                                                                ", 83);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28608");
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
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clearExtensions();
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = locale20.getDisplayName();
        java.util.Locale.Builder builder22 = builder19.setLocale(locale20);
        java.util.Locale.Builder builder23 = builder22.clear();
        java.util.Locale.Builder builder25 = builder23.setLanguage("ITALIAN");
        java.util.Locale locale26 = builder23.build();
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                        ", locale26);
        java.util.Set<java.lang.String> strSet28 = locale26.getUnicodeLocaleAttributes();
        java.lang.String str29 = locale26.getVariant();
        java.util.Locale.setDefault(category0, locale26);
        java.util.Locale locale31 = java.util.Locale.getDefault(category0);
        java.util.Locale locale32 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fran\347ais (Canada)" + "'", str21, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                                                                                        " + "'", str27, "                                                                                                        ");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "italian");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "italian");
    }

    @Test
    public void test28609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28609");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("ital", 114, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                               iTALIE                                                                                                                        ", "FRNZ\326SISCH(KND)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               iTALIE                                                                                                                        " + "'", str2, "                                                                                               iTALIE                                                                                                                        ");
    }

    @Test
    public void test28611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28611");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test28612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28612");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'n', 20, 163);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28613");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                                 EEEEEEEEEEEEEEEEEfr_fr                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                                 EEEEEEEEEEEEEEEEE", "CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28614");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", "AN\\U00FFFFFFFFFFFFFFFFFFFFFFFFFF", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28615");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444allemand4444                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28616");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("und_CA", "English (United States)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28617");
        java.util.Locale locale4 = new java.util.Locale("...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALI", "fRENCH (fRANCE)", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("!ih                            dllm!ih                            dllm!ih                          ", locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali_FRENCH (FRANCE)_ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!IH                            DLLM!IH                            DLLM!IH                          " + "'", str5, "!IH                            DLLM!IH                            DLLM!IH                          ");
    }

    @Test
    public void test28618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28618");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("de-DE", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\ud504\ub791\uc2a4", "\u52a0\u62ff\u5927");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28620");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddFranzosisch (Frankreich)", "                                         Deutsch (Deutschland)                                          ", 68);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28621");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("franc", locale6);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRANC" + "'", str7, "FRANC");
    }

    @Test
    public void test28622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!       _\\U0020_Italienisch#################################\\u0038zho                          ", "4444444fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444fra" + "'", str2, "4444444fra");
    }

    @Test
    public void test28623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28623");
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
        java.util.Locale locale54 = new java.util.Locale("44444444444444NAILATI44444444444444");
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleKeys();
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet55, 'A');
        java.lang.String str58 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap59 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap59);
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
        org.junit.Assert.assertEquals(locale54.toString(), "44444444444444nailati44444444444444");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(languageRangeList60);
    }

    @Test
    public void test28624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28624");
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
            java.util.Locale.Builder builder12 = builder5.setLanguageTag("...9\\ENGLISC#");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ...9\\ENGLISC# [at index 0]");
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
    public void test28625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28625");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.lang.String str7 = locale5.getDisplayCountry();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale8.getDisplayCountry(locale10);
        java.lang.String str14 = locale10.toLanguageTag();
        java.lang.String str15 = locale10.getDisplayLanguage();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale.Builder builder20 = builder17.setLocale(locale18);
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder17.setLocale(locale21);
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale21.getVariant();
        java.util.Locale locale25 = locale21.stripExtensions();
        java.util.Locale locale26 = locale21.stripExtensions();
        java.lang.String str27 = locale10.getDisplayLanguage(locale26);
        java.util.Set<java.lang.Character> charSet28 = locale26.getExtensionKeys();
        java.lang.String str29 = locale5.getDisplayName(locale26);
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.lang.String str31 = locale30.getScript();
        java.lang.String str32 = locale30.getDisplayCountry();
        boolean boolean33 = locale30.hasExtensions();
        java.util.Locale.setDefault(locale30);
        boolean boolean35 = locale30.hasExtensions();
        java.lang.String str36 = locale30.getISO3Country();
        java.lang.String str37 = locale5.getDisplayScript(locale30);
        java.lang.String str38 = locale5.getLanguage();
        java.lang.String str40 = locale5.getExtension('h');
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italien" + "'", str9, "italien");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "it" + "'", str14, "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italien" + "'", str15, "italien");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fran\347ais (Canada)" + "'", str19, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Italienisch" + "'", str27, "Italienisch");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Italie" + "'", str32, "Italie");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ITA" + "'", str36, "ITA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test28626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28626");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale3.getDisplayLanguage();
        java.lang.String str6 = locale3.toLanguageTag();
        java.lang.String str7 = locale3.getLanguage();
        boolean boolean8 = locale3.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italian" + "'", str5, "italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italian" + "'", str6, "italian");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italian" + "'", str7, "italian");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test28627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28627");
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
        java.lang.String str17 = locale15.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr-FR" + "'", str17, "fr-FR");
    }

    @Test
    public void test28628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28628");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         u005c         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         u005c         " + "'", str1, "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         u005c         ");
    }

    @Test
    public void test28629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28629");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                  \\U0068", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28630");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh", " Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...N4AO4AQ4AR4AS4AT4A...", 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...AT4AS4AR4AQ4AO4A...N4" + "'", str2, "...AT4AS4AR4AQ4AO4A...N4");
    }

    @Test
    public void test28632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("FRANZ\326", "hi!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRANZ\326" + "'", str2, "FRANZ\326");
    }

    @Test
    public void test28633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28633");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\u00de\\u00                                                         HCSTUED                                                         ", 71, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...UED                                                     ..." + "'", str3, "...UED                                                     ...");
    }

    @Test
    public void test28634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28634");
        char[] charArray6 = new char[] { ' ', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!       _\\U0020_Italienisch#########################################################################################", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444FR", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test28635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28635");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("en-G\\u0038zho                         CHD", '\u671d');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'e' + "'", char2 == 'e');
    }

    @Test
    public void test28636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28636");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("azhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzh", "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28637");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222FRANCESE (cANADA)", "HI!HI     \\u005c");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28638");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CA" + "'", str1, "CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-CA" + "'", str2, "fr-CA");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test28639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28639");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "IT", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn", "\\u0068", "\\U0020I...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn");
    }

    @Test
    public void test28641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28641");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                 44444444444444444444444444444444", "                                             hcstued                                            ", 111, (int) 'E');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                 44444444444444444444444444444444                                             hcstued                                            " + "'", str4, "                                 44444444444444444444444444444444                                             hcstued                                            ");
    }

    @Test
    public void test28642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28642");
        java.util.Locale locale1 = new java.util.Locale("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hen");
        org.junit.Assert.assertEquals(locale1.toString(), "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hen");
    }

    @Test
    public void test28643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28643");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "! 2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch" + "'", str1, "! 2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch");
    }

    @Test
    public void test28644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    ", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    " + "'", str2, "Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    ");
    }

    @Test
    public void test28645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Franz\366sisch (Kanada)", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franz\366sisch (Kanada)" + "'", str2, "Franz\366sisch (Kanada)");
    }

    @Test
    public void test28646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28646");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setLanguageTag("anglais");
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder12 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.setExtension('Y', "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: FRFRFRFRFRFRFRFRFRFRFRFRFde [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test28647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                          French");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          fRENCH" + "'", str1, "                          fRENCH");
    }

    @Test
    public void test28648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28648");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("italieitalNC_hzitalieital", (int) (short) 10, 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28649");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("5", (double) 88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=88.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28650");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!zH_CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!zh_cn");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28651");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii              ", "                                                          nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28652");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("Cinese (cina)\\u0069h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cinese (cina)\\u0069h..." + "'", str1, "Cinese (cina)\\u0069h...");
    }

    @Test
    public void test28653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28653");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################G");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################G" + "'", str1, "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################G");
    }

    @Test
    public void test28654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28654");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("deutsch", "Deutsch");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'x', (int) 'e', 11);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("talian (FRA,Undetermined)", (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
    }

    @Test
    public void test28655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28655");
        java.lang.String[] strArray1 = java.util.Locale.getISOCountries();
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("zh", (java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'i', 120, 3);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str3, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW" + "'", str5, "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str6, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str12, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
    }

    @Test
    public void test28656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ja", "CHN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ja" + "'", str2, "ja");
    }

    @Test
    public void test28657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("TALY", "ZH_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TALY" + "'", str2, "TALY");
    }

    @Test
    public void test28658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28658");
        java.util.Locale locale3 = new java.util.Locale("\\!u!00!de!\\!u!0", "                                                 Frnz\366sisch(Knd                                                  ", "");
        org.junit.Assert.assertEquals(locale3.toString(), "\\!u!00!de!\\!u!0_                                                 FRNZ\366SISCH(KND                                                  ");
    }

    @Test
    public void test28659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28659");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC", " hi!       _\\U0020...", (int) 'l');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                              it", "German");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              it" + "'", str2, "                              it");
    }

    @Test
    public void test28661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28661");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("iTALIAN                                                                ALLEMAND", "       !ih", 574);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28663");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "x-lvariant-CAN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28664");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                ian\\u00208ian\\u0020i868ian\\u00", (java.lang.CharSequence) "                                                                                                                      \\u006bCinese (Cina)\\u0069h..                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                ian\\u00208ian\\u0020i868ian\\u00" + "'", charSequence2, "                                                                                ian\\u00208ian\\u0020i868ian\\u00");
    }

    @Test
    public void test28665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28665");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh", "          ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test28666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28666");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("                       r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                       r-fraaaaaaaaaaaaaaaaaaaaaaaaaaa                        ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", (int) '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str2, "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test28668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("ECANADA                                      ...g             ...", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\u0020_itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28669");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ADA\\AFAGA0A5AMANAOAQARASA6A0AWAXAZBABBBDB\\BFBGBHB0BJB5BMBNBOBQBRBSB6BVBWBYBZCACCCDCFCGCHC0CKC5CMCNCOCRC0CVCWCXCYCZD\\Dh...", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28670");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTU005CTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "##################    \\XTALXAN_gTALgAN_ENGLXSH    ###################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28671");
        java.util.Locale locale2 = new java.util.Locale("gERMAN (gERMANY)", "it_IT");
        boolean boolean3 = locale2.hasExtensions();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        boolean boolean11 = locale2.equals((java.lang.Object) strArray7);
        org.junit.Assert.assertEquals(locale2.toString(), "german (germany)_IT_IT");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test28672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28672");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Locale.setDefault(category0, locale11);
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
        java.util.Locale locale14 = java.util.Locale.getDefault(category0);
        java.lang.String str15 = locale14.getDisplayScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
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
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test28673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28673");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("talian\\u0032talian");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "talian\\u0032talian" + "'", str1, "talian\\u0032talian");
    }

    @Test
    public void test28674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28674");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Italian__#e-deutsch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian__#e-deutsch" + "'", str1, "Italian__#e-deutsch");
    }

    @Test
    public void test28675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28675");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale9 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str10 = locale1.getDisplayCountry(locale9);
        java.lang.String str11 = locale9.getDisplayName();
        java.lang.String str13 = locale9.getExtension('i');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("iTALIAN                                                                 ", locale9);
        java.lang.String str15 = locale9.getDisplayLanguage();
        boolean boolean16 = locale9.hasExtensions();
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.lang.String str18 = locale17.getDisplayVariant();
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str22 = locale19.getDisplayVariant(locale20);
        java.lang.String str23 = locale17.getDisplayScript(locale20);
        java.lang.String str24 = locale9.getDisplayLanguage(locale20);
        java.util.Locale locale28 = new java.util.Locale("                                             hcsfr-CueD                                             ", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "CCCCCCIAN\\U0020ICCCCCCC");
        java.lang.String str29 = locale20.getDisplayVariant(locale28);
        java.lang.String str30 = locale20.getDisplayName();
        boolean boolean31 = locale20.hasExtensions();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!       " + "'", str15, "hi!       ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!       " + "'", str24, "hi!       ");
        org.junit.Assert.assertEquals(locale28.toString(), "                                             hcsfr-cued                                             _CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCENGLISCHCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC_CCCCCCIAN\\U0020ICCCCCCC");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "anglais" + "'", str30, "anglais");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test28676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28676");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                 francesefrancesefrancesefr\\u0075                  ", "", 262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
    }

    @Test
    public void test28677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28677");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fr_FR", "E gl");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28678");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("f", '#', 'f');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "f" + "'", str3, "f");
    }

    @Test
    public void test28679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28679");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28680");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_EGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEG_                                                                    \\u0020iTALIAiTALIAiTALIAiTALI", 129, 'F');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_EGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEG_                                                                    \\u0020iTALIAiTALIAiTALIAiTALI" + "'", str3, "\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_EGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEG_                                                                    \\u0020iTALIAiTALIAiTALIAiTALI");
    }

    @Test
    public void test28681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28681");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                        ", "...........................................................................................................................................................................................................................................................................................................................................................................eselgn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28682");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("aNCHc", (double) 103);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=103.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28683");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                    FR-                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE       O");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hcierknarFEshcierknarFhcierknarFghcierknarFEdnucierknarFEshcierknarFhcierknarFghcierknarFE", "fr_CA                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hcierknarFEshcierknarFhcierknarFghcierknarFEdnucierknarFEshcierknarFhcierknarFghcierknarFE" + "'", str2, "hcierknarFEshcierknarFhcierknarFghcierknarFEdnucierknarFEshcierknarFhcierknarFghcierknarFE");
    }

    @Test
    public void test28686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28686");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                  \\u005c                                                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28687");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HSIAGE_NAILATI_TIATTIHI!_NAILATI HSILGNE_NAILATI_NAILAT", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28688");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        boolean boolean5 = locale0.hasExtensions();
        java.lang.String str6 = locale0.getVariant();
        java.lang.String str7 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleKeys();
        java.lang.String str9 = locale0.getVariant();
        java.lang.String str10 = locale0.getDisplayScript();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = locale11.toLanguageTag();
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.lang.String str15 = locale14.getScript();
        java.lang.String str16 = locale14.getDisplayCountry();
        boolean boolean17 = locale14.hasExtensions();
        java.util.Locale.setDefault(locale14);
        java.lang.String str19 = locale11.getDisplayLanguage(locale14);
        java.lang.String str20 = locale14.getDisplayVariant();
        java.lang.String str21 = locale0.getDisplayName(locale14);
        java.util.Locale locale22 = locale0.stripExtensions();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "de" + "'", str13, "de");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italien" + "'", str16, "Italien");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tedesco" + "'", str19, "tedesco");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "francese (Francia)" + "'", str21, "francese (Francia)");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
    }

    @Test
    public void test28689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("italiC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)an_egaishegshegshegshegshegshegshegsheg", 70, "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italiC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)an_egaishegshegshegshegshegshegshegsheg" + "'", str3, "italiC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)an_egaishegshegshegshegshegshegshegsheg");
    }

    @Test
    public void test28690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("       DE_DE            ", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       DE_DE            " + "'", str2, "       DE_DE            ");
    }

    @Test
    public void test28691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28691");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 62, (int) 'Y');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("FranzosischFranzosisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FranzosischFranzosisch (Frankreich" + "'", str1, "FranzosischFranzosisch (Frankreich");
    }

    @Test
    public void test28693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28693");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("h", "                                                                                               EN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test28694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28694");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = new java.util.Locale("...ANiTALI");
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale9.getExtension('h');
        java.lang.String str12 = locale8.getDisplayScript(locale9);
        java.util.Locale locale13 = locale8.stripExtensions();
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale5.getDisplayScript(locale13);
        java.lang.String str16 = locale13.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale2.toString(), "...anitali");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "...anitali");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "...anitali");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test28695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28695");
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
        java.util.Locale.Builder builder18 = builder17.clear();
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
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test28696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28696");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("       !i.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28697");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\U000ITALIANITALIANITALIANITALI\\U000ITALIANITALIANITALIANITALHcsineilatI");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test28698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28698");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale locale3 = locale0.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getUnicodeLocaleType("...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisc");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
    }

    @Test
    public void test28699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28699");
        java.util.Locale locale3 = new java.util.Locale("\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065", "i", "FRENCH                     ");
        java.util.Locale locale7 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("...anitali");
        java.lang.String str10 = locale7.getDisplayName(locale9);
        boolean boolean11 = locale7.hasExtensions();
        java.lang.String str12 = locale3.getDisplayCountry(locale7);
        java.lang.Object obj13 = locale7.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065_I_FRENCH                     ");
        org.junit.Assert.assertEquals(locale7.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0023 (ITALIENISCH,iTALIAN)" + "'", str10, "\\u0023 (ITALIENISCH,iTALIAN)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "I" + "'", str12, "I");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "\\u0023_ITALIENISCH_iTALIAN");
    }

    @Test
    public void test28700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28700");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "8600u\\                                 hsiAgE_NAILATI_TiATti                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28701");
        java.util.Locale locale1 = new java.util.Locale("\\u005c");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale3);
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale1.getDisplayScript(locale3);
        java.lang.String str7 = locale3.getVariant();
        java.lang.String str8 = locale3.getISO3Country();
        java.util.Locale locale11 = new java.util.Locale("zhAzhzhzhzhzhzhzhzhzhzh", "und-CA");
        java.lang.String str12 = locale3.getDisplayLanguage(locale11);
        java.lang.String str13 = locale11.getDisplayVariant();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test28702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28702");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("fran\347ais (France)", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 17 + "'", int6 == 17);
    }

    @Test
    public void test28703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28703");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale locale6 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("RoyaumeDeutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: RoyaumeDeutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test28704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28704");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('J', 395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 395 + "'", int2 == 395);
    }

    @Test
    public void test28705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28705");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\\u0042");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0042" + "'", str1, "\\u0042");
    }

    @Test
    public void test28706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28706");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                          hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                          hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch                                           " + "'", str1, "                                          hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch                                           ");
    }

    @Test
    public void test28707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28707");
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
        java.lang.String str19 = locale16.getCountry();
        java.lang.String str20 = locale16.getScript();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\U0020" + "'", str19, "\\U0020");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test28708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28708");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                               france                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28709");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "fr-ca");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-ca" + "'", str1, "fr-ca");
    }

    @Test
    public void test28710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28710");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=97.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28711");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "anglais (royaume-uni)fra", 713, 53);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais (royaume-uni)fra" + "'", str4, "anglais (royaume-uni)fra");
    }

    @Test
    public void test28712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28712");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!_\\u0020_italien", "Taiwan", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28713");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28714");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("zhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz" + "'", str1, "zhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz");
    }

    @Test
    public void test28715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28715");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'F');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("069\\u0069\\u0069\\u0069\\u0069\\", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRANZ\326SISCHF(FRANKREICH)" + "'", str6, "FRANZ\326SISCHF(FRANKREICH)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test28716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28716");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!       2italianitalianitalianitaliTALIENISCH2iADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB", "                                             hcstueD                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28717");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222allemand222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222", "hIEnglish                                 (                United                                 Kingdom                )!English                                 (                United                                 Kingdom                )       ", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28718");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\uad6d)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uad6d)" + "'", str1, "\uad6d)");
    }

    @Test
    public void test28719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28719");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ian\\u0020", "aaaaaaaaaaaaaaaaaaaaaaaaaaILATiNA...aaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ian\\u0020" + "'", str3, "ian\\u0020");
    }

    @Test
    public void test28720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28720");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("CN", "e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28721");
        char[] charArray14 = new char[] { ' ', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Canada", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020iItalian\\u008600u\\", charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("HCSTUD \\U0034", charArray14);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "r0                                               nailati", charArray14);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "GENCE", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test28722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28722");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3", "\\0020!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28723");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\u005c", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0030\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 'd');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test28725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("okokok", "                              it");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28726");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "zh-TW", "Englisch");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28727");
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Canada", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray11);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test28728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28728");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale2);
        boolean boolean6 = locale2.hasExtensions();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("");
        java.lang.String str9 = locale2.getDisplayName(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale8.getUnicodeLocaleType("tanochnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: tanochnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0034" + "'", str5, "\\u0034");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French (Canada)" + "'", str9, "French (Canada)");
    }

    @Test
    public void test28729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28729");
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
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder28 = builder27.clearExtensions();
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale.Builder builder31 = builder28.setLocale(locale29);
        java.util.Locale.Builder builder32 = builder31.clear();
        java.util.Locale.Builder builder34 = builder32.setLanguage("ITALIAN");
        java.util.Locale locale35 = builder32.build();
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                        ", locale35);
        java.util.Set<java.lang.String> strSet37 = locale35.getUnicodeLocaleAttributes();
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet37, "italiae");
        java.lang.String str40 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet37);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet37, "\\CCglisch");
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
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "French (Canada)" + "'", str30, "French (Canada)");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "                                                                                                        " + "'", str36, "                                                                                                        ");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test28730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28730");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("EN_US", "aaaaaaaaaaaaaaaaaaaaaaaaFranzos...", (int) 'e');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "na)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (C" + "'", str2, "na)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (C");
    }

    @Test
    public void test28732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28732");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "X", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("Korean", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "NAC", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test28733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati" + "'", str2, "    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati");
    }

    @Test
    public void test28734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28734");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setScript("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH [at index 0]");
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
    }

    @Test
    public void test28735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28735");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("SH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SH" + "'", str1, "SH");
    }

    @Test
    public void test28736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("zh_cnggggg", "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_cnggggg" + "'", str2, "zh_cnggggg");
    }

    @Test
    public void test28737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28737");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", 74, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
    }

    @Test
    public void test28738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28738");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "korean (south korea) (N)", "                                 44444444444444444444444444444444                                             hcstued                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28739");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLIHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "1\\u0061\\u0061\\u0061                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I\\u0020iTALIANiTALIANiTALIANiTALIit", "", "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I\\u0020iTALIANiTALIANiTALIANiTALIit" + "'", str3, "I\\u0020iTALIANiTALIANiTALIANiTALIit");
    }

    @Test
    public void test28741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\u0020hi!       _\\U0020_Italienisch################anihc", (int) 't');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020hi!       _\\U0020_Italienisch################anihc" + "'", str2, "\\u0020hi!       _\\U0020_Italienisch################anihc");
    }

    @Test
    public void test28742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28742");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" zhAzhzhzhzhzhzhzhzhzhzh ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28743");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!_\\U0020...", 83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0038", 47, 151);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0038" + "'", str3, "\\u0038");
    }

    @Test
    public void test28745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28745");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("x-lvariant-zh", 21, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "x-lvariant-zhIIIIIIII" + "'", str3, "x-lvariant-zhIIIIIIII");
    }

    @Test
    public void test28746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28746");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder4.setExtension('I', "");
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.addUnicodeLocaleAttribute("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz [at index 0]");
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
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test28747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhITALIENISCHHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhh", 262);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28748");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       _\\U0020_Italienisch#########################################################################################", "ian\\u0020i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28749");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Chinese", 81, 70);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", (int) 'G', '!');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 " + "'", str3, "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
    }

    @Test
    public void test28751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28751");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("u Italia u", "german (germany)german (germany)german (gC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)(germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28752");
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
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = locale17.stripExtensions();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.upperCase("ko", locale19);
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str23 = locale22.getCountry();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale locale25 = builder24.build();
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str28 = locale25.getDisplayLanguage(locale27);
        java.lang.String str29 = locale22.getDisplayLanguage(locale25);
        java.lang.String str30 = locale22.getDisplayVariant();
        java.lang.String str31 = locale22.getDisplayName();
        java.lang.String str32 = locale19.getDisplayCountry(locale22);
        java.util.Locale.Builder builder33 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder34 = builder33.clearExtensions();
        java.util.Locale locale35 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str36 = locale35.getDisplayName();
        java.util.Locale.Builder builder37 = builder34.setLocale(locale35);
        java.util.Locale.Builder builder38 = builder37.clear();
        java.util.Locale.Builder builder40 = builder38.setLanguage("ITALIAN");
        java.util.Locale locale41 = builder38.build();
        java.util.Locale.Builder builder42 = builder38.clearExtensions();
        java.util.Locale locale43 = java.util.Locale.ROOT;
        java.lang.String str44 = locale43.getISO3Country();
        java.util.Set<java.lang.String> strSet45 = locale43.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder46 = builder42.setLocale(locale43);
        java.util.Locale.Builder builder47 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder48 = builder47.clearExtensions();
        java.util.Locale.Builder builder50 = builder47.setLanguageTag("Italian");
        java.util.Locale.Builder builder51 = builder47.clearExtensions();
        java.util.Locale.Builder builder52 = builder47.clear();
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder55 = builder47.setLocale(locale54);
        java.util.Locale.Builder builder56 = builder55.clear();
        java.util.Locale.Builder builder57 = builder55.clear();
        java.util.Locale.Builder builder58 = builder57.clear();
        java.util.Locale locale59 = builder57.build();
        java.util.Locale.Builder builder60 = builder46.setLocale(locale59);
        java.lang.String str61 = locale22.getDisplayCountry(locale59);
        java.util.Locale locale62 = java.util.Locale.GERMANY;
        java.util.Locale locale63 = locale62.stripExtensions();
        java.lang.String str65 = locale63.getExtension('G');
        java.lang.String str66 = locale22.getDisplayScript(locale63);
        java.util.Locale.setDefault(category0, locale22);
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
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "anglais" + "'", str18, "anglais");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "KO" + "'", str20, "KO");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "fran\347ais (Canada)" + "'", str36, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "italian");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "de_DE");
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test28753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28753");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setLanguage("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh..");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh.. [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test28754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28754");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..", "hi! 5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28755");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("eRI    E", "englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)", 88);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28756");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale8 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str9 = locale0.getDisplayCountry(locale8);
        java.util.Locale.setDefault(locale0);
        java.lang.String str11 = locale0.getISO3Country();
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.lang.String str13 = locale12.getDisplayVariant();
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale14.getDisplayVariant(locale15);
        java.lang.String str18 = locale12.getDisplayScript(locale15);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = locale20.getDisplayScript(locale21);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.lang.String str26 = locale24.getExtension('h');
        java.lang.String str27 = locale23.getDisplayScript(locale24);
        java.lang.String str28 = locale23.getISO3Country();
        java.lang.String str29 = locale21.getDisplayVariant(locale23);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale21);
        java.lang.String str31 = locale15.getDisplayCountry(locale21);
        java.util.Locale.setDefault(locale15);
        java.lang.String str33 = locale0.getDisplayVariant(locale15);
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("fra");
        java.lang.String str37 = locale36.getDisplayLanguage();
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.upperCase("", locale36);
        java.lang.String str39 = locale36.getDisplayCountry();
        boolean boolean40 = locale15.equals((java.lang.Object) locale36);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FRA" + "'", str11, "FRA");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "FRA" + "'", str28, "FRA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str30, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "fra" + "'", str37, "fra");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test28757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        " + "'", str2, "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ");
    }

    @Test
    public void test28758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("FRENCH (CANADA)", "italiaE    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiaE    " + "'", str2, "italiaE    ");
    }

    @Test
    public void test28759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28759");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28760");
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
        java.util.Set<java.lang.String> strSet29 = locale18.getUnicodeLocaleKeys();
        java.lang.String str30 = locale18.getCountry();
        java.util.Locale locale31 = locale18.stripExtensions();
        java.util.Locale.Builder builder32 = builder0.setLocale(locale31);
        java.util.Locale locale34 = java.util.Locale.forLanguageTag("!IH_HHHHHHHHHH");
        java.util.Locale.Builder builder35 = builder32.setLocale(locale34);
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
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
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
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FR" + "'", str30, "FR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test28761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28761");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(HI!       G", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(china)chinesisch(hi!g");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28762");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale0.getDisplayCountry();
        java.lang.String str5 = locale0.getScript();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.lang.String str7 = locale6.getLanguage();
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.lang.String str9 = locale0.getDisplayName();
        java.lang.String str10 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ko" + "'", str7, "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str8, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fran\347ais" + "'", str9, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test28763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28763");
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
        java.lang.String str49 = locale33.getVariant();
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test28764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("ITALIE", " hi!       _\\U0020...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIE" + "'", str2, "ITALIE");
    }

    @Test
    public void test28765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28765");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("ko-kr                                                                                                    ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28766");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("9hhhhhhhhhh_\\U0078");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'N');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9hhhhhhhhhh_\\U0078" + "'", str3, "9hhhhhhhhhh_\\U0078");
    }

    @Test
    public void test28767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28767");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("#AAAAA");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1 == '#');
    }

    @Test
    public void test28768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28768");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                             frn\347is(frnce)(CHINESE(CHINA)", 264);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28769");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly", "AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28770");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("coreano (Corea del Sud)                                                       ", "44444444444444444444444444444444444444444444it                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28771");
        java.util.Locale locale1 = new java.util.Locale("francese");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet2, "           \\u");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet2, '7');
        org.junit.Assert.assertEquals(locale1.toString(), "francese");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test28772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\u7fa9\u5927\u5229\u6587          ", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28773");
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
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale12.toLanguageTag();
        java.util.Locale.Builder builder15 = builder11.setLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.setExtension('0', "            \\u0020iItalian\\u0020i                                                 ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 0 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test28774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28774");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...E_NAILATI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28775");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "chi069\\U0069\\U0069\\U0069\\U0069\\chin");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chi069\\U0069\\U0069\\U0069\\U0069\\chin" + "'", str1, "chi069\\U0069\\U0069\\U0069\\U0069\\chin");
    }

    @Test
    public void test28776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28776");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.util.Locale locale5 = locale3.stripExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "italian");
    }

    @Test
    public void test28777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28777");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                     fr         ITALIAN_italian_eNGLISHn\347         ITALIAN_italian_eNGLISHis (Fr         ITALIAN_italian_eNGLISHnce)                                      ", "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("          HI!           ", "italian (italian,english)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28779");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28780");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Fr-caNINININININININININININININININININININININININININININININININININININININININININININININININ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28781");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hfffffffffcanad");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28782");
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
        java.lang.String str15 = locale9.getCountry();
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
        java.util.Locale locale48 = new java.util.Locale("italian (ITALIAN,English)", "                                                                                                         ");
        java.lang.String str49 = locale35.getDisplayLanguage(locale48);
        java.util.Set<java.lang.Character> charSet50 = locale48.getExtensionKeys();
        java.lang.String str51 = locale9.getDisplayCountry(locale48);
        java.lang.String str52 = locale9.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "anglais" + "'", str36, "anglais");
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
        org.junit.Assert.assertEquals(locale48.toString(), "italian (italian,english)_                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "English" + "'", str49, "English");
        org.junit.Assert.assertNotNull(charSet50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test28783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28783");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                ZH_CNGGGGG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28785");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("ADYAEYAFYAGYAIYALYAMYANYAOYAQYARYASYATYAUYAWYAXYAZYBAYBBYBDYBEYBFYBGYBHYBIYBJYBLYBMYBNYBOYBQYBRYBSYBTYBVYBWYBYYBZYCAYCCYCDYCFYCGYCHYCIYCKYCLYCMYCNYCOYCRYCUYCVYCWYCXYCYYCZYDEYDJYDKYDMYDOYDZYECYEEYEGYEHYERYESYETYFIYFJYFKYFMYFOYFRYGAYGBYGDYGEYGFYGGYGHYGIYGLYGMYGNYGPYGQYGRYGSYGTYGUYGWYGYYHKYHMYHNYHRYHTYHUYIDYIEYILYIMYINYIOYIQYIRYISYITYJEYJMYJOYJPYKEYKGYKHYKIYKMYKNYKPYKRYKWYKYYKZYLAYLBYLCYLIYLKYLRYLSYLTYLUYLVYLYYMAYMCYMDYMEYMFYMGYMHYMKYMLYMMYMNYMOYMPYMQYMRYMSYMTYMUYMVYMWYMXYMYYMZYNAYNCYNEYNFYNGYNIYNLYNOYNPYNRYNUYNZYOMYPAYPEYPFYPGYPHYPKYPLYPMYPNYPRYPSYPTYPWYPYYQAYREYROYRSYRUYRWYSAYSBYSCYSDYSEYSGYSHYSIYSJYSKYSLYSMYSNYSOYSRYSSYSTYSVYSXYSYYSZYTCYTDYTFYTGYTHYTJYTKYTLYTMYTNYTOYTRYTTYTVYTWYTZYUAYUGYUMYUSYUYYUZYVAYVCYVEYVGYVIYVNYVUYWFYWSYYEYYTYZAYZMYZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADYAEYAFYAGYAIYALYAMYANYAOYAQYARYASYATYAUYAWYAXYAZYBAYBBYBDYBEYBFYBGYBHYBIYBJYBLYBMYBNYBOYBQYBRYBSYBTYBVYBWYBYYBZYCAYCCYCDYCFYCGYCHYCIYCKYCLYCMYCNYCOYCRYCUYCVYCWYCXYCYYCZYDEYDJYDKYDMYDOYDZYECYEEYEGYEHYERYESYETYFIYFJYFKYFMYFOYFRYGAYGBYGDYGEYGFYGGYGHYGIYGLYGMYGNYGPYGQYGRYGSYGTYGUYGWYGYYHKYHMYHNYHRYHTYHUYIDYIEYILYIMYINYIOYIQYIRYISYITYJEYJMYJOYJPYKEYKGYKHYKIYKMYKNYKPYKRYKWYKYYKZYLAYLBYLCYLIYLKYLRYLSYLTYLUYLVYLYYMAYMCYMDYMEYMFYMGYMHYMKYMLYMMYMNYMOYMPYMQYMRYMSYMTYMUYMVYMWYMXYMYYMZYNAYNCYNEYNFYNGYNIYNLYNOYNPYNRYNUYNZYOMYPAYPEYPFYPGYPHYPKYPLYPMYPNYPRYPSYPTYPWYPYYQAYREYROYRSYRUYRWYSAYSBYSCYSDYSEYSGYSHYSIYSJYSKYSLYSMYSNYSOYSRYSSYSTYSVYSXYSYYSZYTCYTDYTFYTGYTHYTJYTKYTLYTMYTNYTOYTRYTTYTVYTWYTZYUAYUGYUMYUSYUYYUZYVAYVCYVEYVGYVIYVNYVUYWFYWSYYEYYTYZAYZMYZW" + "'", str1, "ADYAEYAFYAGYAIYALYAMYANYAOYAQYARYASYATYAUYAWYAXYAZYBAYBBYBDYBEYBFYBGYBHYBIYBJYBLYBMYBNYBOYBQYBRYBSYBTYBVYBWYBYYBZYCAYCCYCDYCFYCGYCHYCIYCKYCLYCMYCNYCOYCRYCUYCVYCWYCXYCYYCZYDEYDJYDKYDMYDOYDZYECYEEYEGYEHYERYESYETYFIYFJYFKYFMYFOYFRYGAYGBYGDYGEYGFYGGYGHYGIYGLYGMYGNYGPYGQYGRYGSYGTYGUYGWYGYYHKYHMYHNYHRYHTYHUYIDYIEYILYIMYINYIOYIQYIRYISYITYJEYJMYJOYJPYKEYKGYKHYKIYKMYKNYKPYKRYKWYKYYKZYLAYLBYLCYLIYLKYLRYLSYLTYLUYLVYLYYMAYMCYMDYMEYMFYMGYMHYMKYMLYMMYMNYMOYMPYMQYMRYMSYMTYMUYMVYMWYMXYMYYMZYNAYNCYNEYNFYNGYNIYNLYNOYNPYNRYNUYNZYOMYPAYPEYPFYPGYPHYPKYPLYPMYPNYPRYPSYPTYPWYPYYQAYREYROYRSYRUYRWYSAYSBYSCYSDYSEYSGYSHYSIYSJYSKYSLYSMYSNYSOYSRYSSYSTYSVYSXYSYYSZYTCYTDYTFYTGYTHYTJYTKYTLYTMYTNYTOYTRYTTYTVYTWYTZYUAYUGYUMYUSYUYYUZYVAYVCYVEYVGYVIYVNYVUYWFYWSYYEYYTYZAYZMYZW");
    }

    @Test
    public void test28786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28786");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("de_DE", locale1);
        java.lang.String str3 = locale1.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DE_DE" + "'", str2, "DE_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28787");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("e                         iItal", "royaume-uni", "ttfr-c                 ttttttt");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test28788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28788");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder0.setLanguageTag("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?????????????????????????????????????????????????????????????????????????????????????????????????fra [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
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
    }

    @Test
    public void test28789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28789");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("Canada", locale1);
        java.lang.Object obj4 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CANADA" + "'", str3, "CANADA");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "ko_KR");
    }

    @Test
    public void test28790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28790");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444fra", "22222222222222222222222222222222222222222222222222FRANCESE (cANADA)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28791");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getISO3Country();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("hi!deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061_\\u0020_italienisch#########################################################################################");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi!deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061_\\u0020_italienisch######################################################################################### [at index 0]");
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
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test28792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b" + "'", str1, "\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b");
    }

    @Test
    public void test28793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28793");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("French (France)", (double) 77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=77.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...FDEDZCYCXCWCVCUCRCOCNCMCLCKCIIIIIIIIIICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIIIIIIIIIIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIIIIIIIIIIAGAFAEADA", "R0                                               nailati                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...FDEDZCYCXCWCVCUCRCOCNCMCLCKCIIIIIIIIIICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIIIIIIIIIIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIIIIIIIIIIAGAFAEADA" + "'", str2, "...FDEDZCYCXCWCVCUCRCOCNCMCLCKCIIIIIIIIIICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIIIIIIIIIIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIIIIIIIIIIAGAFAEADA");
    }

    @Test
    public void test28795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28795");
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
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder42.clear();
        java.util.Locale locale44 = java.util.Locale.UK;
        java.util.Locale.Builder builder45 = builder42.setLocale(locale44);
        java.util.Set<java.lang.String> strSet46 = locale44.getUnicodeLocaleAttributes();
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet46, "HI!HI!");
        java.lang.String str49 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap50);
        java.util.Locale locale52 = java.util.Locale.PRC;
        java.lang.String str53 = locale52.getDisplayVariant();
        java.util.Locale locale54 = java.util.Locale.FRENCH;
        java.util.Locale locale55 = java.util.Locale.ENGLISH;
        java.lang.String str56 = locale55.getDisplayCountry();
        java.lang.String str57 = locale54.getDisplayVariant(locale55);
        java.lang.String str58 = locale52.getDisplayScript(locale55);
        java.util.Set<java.lang.String> strSet59 = locale52.getUnicodeLocaleAttributes();
        java.lang.String str60 = java.util.Locale.lookupTag(languageRangeList51, (java.util.Collection<java.lang.String>) strSet59);
        java.lang.String str62 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet59, '5');
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
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test28796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28796");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                ita                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)", 164);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)F..." + "'", str2, "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)F...");
    }

    @Test
    public void test28798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28798");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\uce90\ub098\ub2e4", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRdeRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("              nglish ...              ", "italian(italian,eng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              nglish ...              " + "'", str2, "              nglish ...              ");
    }

    @Test
    public void test28800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28800");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\HI!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28801");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI", 210);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28802");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "fr_CA                             ...HI!fr_CA                             ...!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\!u!00!de!\\!u!0", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\!u!00!de!\\!u!0" + "'", str2, "\\!u!00!de!\\!u!0");
    }

    @Test
    public void test28804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28804");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTtat_itaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28805");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28806");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "itTAiT_ITA", 52);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "English");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', 101, 40);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("italieital", strArray6);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ITALIE", 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("\\italian_ITALIAN_English", strArray6, strArray16);
        int int18 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("FRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", strArray16);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray16, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                         ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\italian_ITALIAN_English" + "'", str17, "\\italian_ITALIAN_English");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test28807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28807");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("en_USita", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28808");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", (int) 'J');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28809");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("eNGLISH", "                                             Deutsch                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28810");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444ALLEMAND 4444", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\xtalxan_ITALIAN_EnglxshCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28811");
        java.util.Locale locale1 = new java.util.Locale("French (France)");
        java.util.Locale locale5 = new java.util.Locale("f", "Korean");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("itTAiT_ITALIAN_EgAish                                                                                ", locale5);
        java.util.Locale locale9 = new java.util.Locale("\\u0045", "");
        boolean boolean10 = locale9.hasExtensions();
        java.lang.String str11 = locale9.getDisplayScript();
        java.lang.String str12 = locale5.getDisplayName(locale9);
        java.util.Set<java.lang.String> strSet13 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale1.getDisplayLanguage(locale5);
        org.junit.Assert.assertEquals(locale1.toString(), "french (france)");
        org.junit.Assert.assertEquals(locale5.toString(), "f_KOREAN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITTAIT_ITALIAN_EGAISH                                                                                " + "'", str6, "ITTAIT_ITALIAN_EGAISH                                                                                ");
        org.junit.Assert.assertEquals(locale9.toString(), "\\u0045");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "f (KOREAN)" + "'", str12, "f (KOREAN)");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "french (france)" + "'", str14, "french (france)");
    }

    @Test
    public void test28812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28812");
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
        java.lang.String str11 = locale8.getISO3Language();
        java.lang.String str12 = locale8.getISO3Language();
        java.lang.String str13 = locale8.getISO3Language();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "kor" + "'", str11, "kor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "kor" + "'", str12, "kor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "kor" + "'", str13, "kor");
    }

    @Test
    public void test28813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28813");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clear();
        java.util.Locale.Builder builder9 = builder5.removeUnicodeLocaleAttribute("chinois");
        java.util.Locale locale10 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setScript("DEUTSCH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: DEUTSCH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
    }

    @Test
    public void test28814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28814");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                         ...", (java.lang.CharSequence) "aNCHc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28815");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0045", "");
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str10 = locale8.getDisplayScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0045");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test28816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28816");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "rankreich)00      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28817");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray10 = new char[] { ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("itTAiT_ITALIAN_EgAish", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "china", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\ritalieital", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray10);
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
    public void test28818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28818");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("talHan", (int) 'k');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28819");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("fra");
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale6 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str10 = locale8.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fra");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fra");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test28820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28820");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "Francia                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 264 + "'", int1 == 264);
    }

    @Test
    public void test28821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28821");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("fr-C                 ", 'a', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-C                 " + "'", str3, "fr-C                 ");
    }

    @Test
    public void test28822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28822");
        java.util.Locale locale2 = new java.util.Locale("       !ih", "tedesco");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "       !ih_TEDESCO");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TEDESCO" + "'", str3, "TEDESCO");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test28823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28823");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Fgence", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0020GermanTALIANGermanTALIANGermanTALIANiTALI", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28824");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("       !IH", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u007", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("fr_FR                  ", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test28825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                         dalleman!ih                            dalleman!ih                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         dalleman!ih                            dalleman!ih                          " + "'", str1, "                         dalleman!ih                            dalleman!ih                          ");
    }

    @Test
    public void test28826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28826");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc  E                         IIT L, t          ", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28827");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", '\r');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("HI!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("iTALIAN", (java.lang.Object[]) strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HHHHHHHHHH", strArray4, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str6, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HHHHHHHHHH" + "'", str11, "HHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str13, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
    }

    @Test
    public void test28828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                     fr         ITALIAN_italian_eNGLISHn\347         ITALIAN_italian_eNGLISHis (Fr         ITALIAN_italian_eNGLISHnce)                                      ", "                                                               \\u002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     fr         ITALIAN_italian_eNGLISHn\347         ITALIAN_italian_eNGLISHis (Fr         ITALIAN_italian_eNGLISHnce)                                      " + "'", str2, "                                     fr         ITALIAN_italian_eNGLISHn\347         ITALIAN_italian_eNGLISHis (Fr         ITALIAN_italian_eNGLISHnce)                                      ");
    }

    @Test
    public void test28829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28829");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("tTAT_ITA                                                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28830");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                               )))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                               )))))))))))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "                                                                                                               )))))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test28831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28831");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r8600u\\U\\u0\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?????????????????????????????????????8600u\\u\\u0?????????????????????????????????????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28832");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444FRA", 0, 71);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444FRA" + "'", str3, "4444444FRA");
    }

    @Test
    public void test28833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28833");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "cinese (cina)\\u0069h...", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Chinese", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0075", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                         ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test28834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                     g             ", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     g             " + "'", str2, "                                                                                     g             ");
    }

    @Test
    public void test28835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28835");
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
        java.util.Set<java.lang.String> strSet10 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale14 = new java.util.Locale("zhzhzhzhzhzhzhzhzhzhE             ", "hi!       _\\U0020_Italienisch####################################################################", "aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa");
        java.lang.String str15 = locale4.getDisplayVariant(locale14);
        java.lang.String str16 = locale14.getDisplayVariant();
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
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals(locale14.toString(), "zhzhzhzhzhzhzhzhzhzhe             _HI!       _\\U0020_ITALIENISCH####################################################################_aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa" + "'", str16, "aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28836");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'c', 241);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                         dalleman!ih                            dalleman!ih                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28838");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale2.getCountry();
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("IIIIIIIIII", locale2);
        java.util.Locale locale7 = new java.util.Locale("en");
        java.lang.String str8 = locale2.getDisplayName(locale7);
        java.util.Set<java.lang.Character> charSet9 = locale2.getExtensionKeys();
        java.lang.String str10 = locale2.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "iiiiiiiiii" + "'", str5, "iiiiiiiiii");
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test28839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("French", "HEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
    }

    @Test
    public void test28840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28840");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("German (Germany)", 0, 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)", "\u97d3\u6587\u5357\u97d3)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China");
    }

    @Test
    public void test28842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28842");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder13 = builder10.setLanguageTag("Italian");
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = builder13.build();
        java.lang.String str16 = locale8.getDisplayCountry(locale15);
        java.lang.String str18 = locale8.getExtension('S');
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test28843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28843");
        java.util.Locale locale1 = new java.util.Locale("\\XTALXAN_ITALIAN_ENGLXSH                                                 ");
        org.junit.Assert.assertEquals(locale1.toString(), "\\xtalxan_italian_englxsh                                                 ");
    }

    @Test
    public void test28844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28844");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HCSINEI", (java.lang.CharSequence) "U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28845");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCO", 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28846");
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
        java.lang.String str11 = locale8.getISO3Language();
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale13 = java.util.Locale.getDefault(category12);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str16 = locale14.getDisplayName(locale15);
        java.util.Locale.setDefault(category12, locale15);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale19 = java.util.Locale.getDefault(category18);
        java.lang.String str21 = locale19.getExtension('x');
        java.util.Locale.setDefault(category12, locale19);
        java.util.Locale locale23 = java.util.Locale.getDefault(category12);
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category12, locale25);
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
        java.util.Locale.Builder builder56 = new java.util.Locale.Builder();
        java.util.Locale locale57 = builder56.build();
        java.util.Locale locale59 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str60 = locale57.getDisplayLanguage(locale59);
        java.lang.String str61 = locale44.getDisplayVariant(locale57);
        java.util.Locale.setDefault(category12, locale57);
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.lang.String str64 = locale63.getDisplayScript();
        java.util.Locale locale65 = java.util.Locale.FRANCE;
        java.util.Locale locale66 = java.util.Locale.ITALIAN;
        java.lang.String str68 = locale66.getExtension('h');
        java.lang.String str69 = locale65.getDisplayScript(locale66);
        boolean boolean70 = locale65.hasExtensions();
        java.lang.String str71 = locale65.getVariant();
        java.util.Set<java.lang.Character> charSet72 = locale65.getExtensionKeys();
        java.lang.String str73 = locale65.toLanguageTag();
        java.lang.String str74 = locale63.getDisplayCountry(locale65);
        java.lang.String str75 = locale65.getScript();
        java.util.Locale.setDefault(category12, locale65);
        java.util.Locale locale77 = java.util.Locale.getDefault(category12);
        java.lang.String str78 = locale8.getDisplayName(locale77);
        boolean boolean79 = locale8.hasExtensions();
        java.lang.String str80 = locale8.getCountry();
        java.lang.String str81 = locale8.getDisplayCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Korean" + "'", str10, "Korean");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "kor" + "'", str11, "kor");
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "allemand" + "'", str16, "allemand");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
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
        org.junit.Assert.assertEquals(locale43.toString(), "");
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
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "de");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "it");
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(charSet72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "fr-FR" + "'", str73, "fr-FR");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "cor\351en" + "'", str78, "cor\351en");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test28847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28847");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEFEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28848");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH", "       !IH", (int) (byte) 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("CHINESE (CHINA", strArray5);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AC_ne", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!IH" + "'", str7, "!IH");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test28849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222", (int) '\ud504');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str2, "zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test28850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28850");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("NnnnnnnnnnnnnnnnnnnnnnnnnnnnnnEN_CA", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "fran\347ais (France)fr-CA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28851");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..." + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
    }

    @Test
    public void test28852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28852");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa", "Zh_CNfRENCH (cANADA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\U0020IiTALIAN\\U0020I                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "ti");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28854");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hcsilgnE     ", "9hhhhhhhhhh          9hhhhhhhhhh   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("iiiiiiiiiiiiiiiiiiiiiiiiiiiihI!       iiiiiiiiiiiiiiiiiiiiiiiiiiiii", "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiihI!       iiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiihI!       iiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test28856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28856");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("NGLISH (uNITED kINGDOM)FRENCH (nc_hz)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NGLISH (uNITED kINGDOM)FRENCH (nc_hz)" + "'", str1, "NGLISH (uNITED kINGDOM)FRENCH (nc_hz)");
    }

    @Test
    public void test28857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28857");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28858");
        char[] charArray9 = new char[] { 'f', '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "frankreich", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "z...Frn", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "talian_ITALIAN_English         ital", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test28859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28859");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "FRNZ\326SISCH (KND)", "de-DE");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28860");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("ti");
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setVariant("fran\347ais (france) (CHINESE (CHINA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: franc?ais (france) (CHINESE (CHINA) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test28861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28861");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "D  \\u007");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28862");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("d", "franz\326sisch\n(frankreich)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("an\\u00", 40, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "an\\u00##################################" + "'", str3, "an\\u00##################################");
    }

    @Test
    public void test28864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28864");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_", "hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch", 18);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Eagaash", "h", (int) 'f');
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray11);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ...", strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray11);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chinese (China)", "", (int) 'z');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, "EN_CA");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, 'B');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng", strArray5, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ChineseEN_CA(China)" + "'", str22, "ChineseEN_CA(China)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ChineseB(China)" + "'", str24, "ChineseB(China)");
    }

    @Test
    public void test28865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28865");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Francia                                                                                                                                                                                                                                                                 ", "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28866");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati", "!_\\u0020_iTLE#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28867");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!_\\U0020_Italienisch#########################################################################################", "EFrankreichgFrankreichFrankreichs", 48);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test28868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28868");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("h");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean11 = languageRange1.equals((java.lang.Object) int10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test28869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28869");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("NC_hz");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                          French", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28870");
        java.util.Locale locale2 = new java.util.Locale("\\u0045", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.getLanguage();
        java.lang.String str5 = locale2.getLanguage();
        java.lang.String str6 = locale2.getDisplayName();
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0045" + "'", str4, "\\u0045");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0045" + "'", str5, "\\u0045");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0045" + "'", str6, "\\u0045");
    }

    @Test
    public void test28871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28871");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL" + "'", str1, "ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL");
    }

    @Test
    public void test28872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28872");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str3 = locale1.getExtension('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getUnicodeLocaleType("                                        itTAiT_ITALIAN_EgAish                                 \\u0068");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:                                         itTAiT_ITALIAN_EgAish                                 \\u0068");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                          4444allemand4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                          4444allemand4444" + "'", str1, "                                                          4444allemand4444");
    }

    @Test
    public void test28874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28874");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Japanese", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test28875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("Chinesischitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoit", "    \\     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinesischitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoit" + "'", str2, "Chinesischitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoit");
    }

    @Test
    public void test28876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28876");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('J');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("NAILATI", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NAILATI                     " + "'", str2, "NAILATI                     ");
    }

    @Test
    public void test28878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28878");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4300U\\                                             DUTSCH                                            ", "\\AuA0046");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28879");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n     Englisch");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\n' + "'", char1 == '\n');
    }

    @Test
    public void test28880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28880");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZHZHZHZ2222222222222222222222222222222222222222222222222222222222222222222222222", 'S');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'Z' + "'", char2 == 'Z');
    }

    @Test
    public void test28881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28881");
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
        java.util.Locale.Builder builder12 = builder7.clear();
        java.util.Locale locale13 = builder7.build();
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale16.getExtension('h');
        java.lang.String str19 = locale15.getDisplayScript(locale16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale15);
        java.lang.String str21 = locale15.getDisplayLanguage();
        java.lang.String str22 = locale13.getDisplayCountry(locale15);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!       " + "'", str20, "hi!       ");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "French" + "'", str21, "French");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test28882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28882");
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
        java.util.Locale locale45 = builder44.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder48 = builder44.setExtension('B', "            444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value:             444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en [at index 0]");
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
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
    }

    @Test
    public void test28883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28883");
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale.setDefault(locale1);
        boolean boolean6 = locale1.hasExtensions();
        java.lang.String str7 = locale1.getISO3Country();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("hIAN\\U0020Ihi", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italy" + "'", str3, "Italy");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ITA" + "'", str7, "ITA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HIAN\\U0020IHI" + "'", str8, "HIAN\\U0020IHI");
    }

    @Test
    public void test28884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28884");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setScript("                                                                              ##########################");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                                                               ########################## [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test28885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28885");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "    ##########", "                                             Deutsch                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test28886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28886");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "na)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (C", (java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhe              (HI!       _\\U0020_ITALIENISCH####################################################################,aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28887");
        java.util.Locale locale1 = new java.util.Locale("tedesco");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet2, '7');
        org.junit.Assert.assertEquals(locale1.toString(), "tedesco");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test28888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28888");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", (java.lang.CharSequence) "\\u0065                             a)                                                                                                ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", charSequence2, "iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test28889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28889");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("nnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        java.lang.String str2 = locale1.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!       fr_FR                  Italienischfr_FR                  italian_ITALIAN_Englishfr_FR                  HI!fr_FR                  hi!fr_FR                  ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...fr_FR                  \\u0034fr_FR                  HI!fr_FR                  Italianfr_FR                  \\u0061fr_FR                  \\u0023fr_FR                  hi!fr_FR                  iTALIANfr_FR                  Chinese (China)fr_FR                  hi!fr_FR                  zh_CNfr_FR                  iTALIANfr_FR                  enfr_FR                  Italienisch", "\\u0023 (ITALIENISCH,iTALIAN)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!       fr_FR                  Italienischfr_FR                  italian_ITALIAN_Englishfr_FR                  HI!fr_FR                  hi!fr_FR                  ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...fr_FR                  \\u0034fr_FR                  HI!fr_FR                  Italianfr_FR                  \\u0061fr_FR                  \\u0023fr_FR                  hi!fr_FR                  iTALIANfr_FR                  Chinese (China)fr_FR                  hi!fr_FR                  zh_CNfr_FR                  iTALIANfr_FR                  enfr_FR                  Italienisch" + "'", str2, "hi!       fr_FR                  Italienischfr_FR                  italian_ITALIAN_Englishfr_FR                  HI!fr_FR                  hi!fr_FR                  ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...fr_FR                  \\u0034fr_FR                  HI!fr_FR                  Italianfr_FR                  \\u0061fr_FR                  \\u0023fr_FR                  hi!fr_FR                  iTALIANfr_FR                  Chinese (China)fr_FR                  hi!fr_FR                  zh_CNfr_FR                  iTALIANfr_FR                  enfr_FR                  Italienisch");
    }

    @Test
    public void test28891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("France", 78, 'T');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FranceTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" + "'", str3, "FranceTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
    }

    @Test
    public void test28892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u0034\\u0034\\u0034\\u0034\\u003", '7');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0034\\u0034\\u0034\\u0034\\u003" + "'", str2, "\\u0034\\u0034\\u0034\\u0034\\u003");
    }

    @Test
    public void test28893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("tDtttFtttttttMtttOtQtRtttttUtWtXtZBtBBBDBtBFBtBtBtBJBtBMBtBOBQBRBtBtBVBWBYBZCtCCCDCFCtCtCtCKCtCMCtCOCRCUCVCWCXCYCZDtDF...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tDtttFtttttttMtttOtQtRtttttUtWtXtZBtBBBDBtBFBtBtBtBJBtBMBtBOBQBRBtBtBVBWBYBZCtCCCDCFCtCtCtCKCtCMCtCOCRCUCVCWCXCYCZDtDF..." + "'", str2, "tDtttFtttttttMtttOtQtRtttttUtWtXtZBtBBBDBtBFBtBtBtBJBtBMBtBOBQBRBtBtBVBWBYBZCtCCCDCFCtCtCtCKCtCMCtCOCRCUCVCWCXCYCZDtDF...");
    }

    @Test
    public void test28894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28894");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getExtension('h');
        java.lang.String str9 = locale5.getDisplayScript(locale6);
        java.lang.String str10 = locale5.getISO3Country();
        java.lang.String str11 = locale3.getDisplayVariant(locale5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale3);
        java.util.Locale locale14 = new java.util.Locale("en");
        java.lang.String str15 = locale3.getDisplayLanguage(locale14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("                                                         HCSTUED                                                         ", locale14);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FRA" + "'", str10, "FRA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str12, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "French" + "'", str15, "French");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                         hcstued                                                         " + "'", str16, "                                                         hcstued                                                         ");
    }

    @Test
    public void test28895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28895");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                               ))))))))))))))))))))))))))))))))))))))))))))))))))", "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHH", "                                                      Englisch                                                       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test28896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("i\\u0020iTALIANiTALIANiTALIANiTALIit         \\", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII00000000...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII00000000..." + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII00000000...");
    }

    @Test
    public void test28897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28897");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("italian (italian,english)", "l");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28898");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale2.getDisplayCountry(locale4);
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.util.Locale locale10 = new java.util.Locale("i\\u0020iTALIANiTALIANiTALIANiTALIit", "Hhhhhhhhhh");
        java.lang.String str11 = locale4.getDisplayName(locale10);
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getScript();
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale12.getCountry();
        java.util.Locale.setDefault(locale12);
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale18);
        java.lang.String str21 = locale18.getCountry();
        java.lang.String str22 = locale18.getCountry();
        java.lang.String str23 = locale12.getDisplayLanguage(locale18);
        java.lang.String str24 = locale18.getDisplayLanguage();
        java.lang.String str25 = locale18.getDisplayScript();
        java.lang.String str26 = locale4.getDisplayScript(locale18);
        java.lang.String str28 = locale18.getExtension('H');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiano" + "'", str1, "italiano");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale10.toString(), "i\\u0020italianitalianitalianitaliit_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "US" + "'", str15, "US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "English" + "'", str19, "English");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "!IH" + "'", str20, "!IH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "English" + "'", str23, "English");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "English" + "'", str24, "English");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test28899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28899");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!       _\\u0020_iTALIENISCH####################################################################...", "!ih", "                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!       _\\u0020_iTALIENISCH####################################################################..." + "'", str3, "HI!       _\\u0020_iTALIENISCH####################################################################...");
    }

    @Test
    public void test28900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28900");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "cinese (Cina)                                                               ", 499, (int) '\351');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinese (Cina)                                                               " + "'", str4, "cinese (Cina)                                                               ");
    }

    @Test
    public void test28901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28901");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "       !IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       !IH" + "'", str1, "       !IH");
    }

    @Test
    public void test28902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("n       nn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "n       nn" + "'", str1, "n       nn");
    }

    @Test
    public void test28903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28903");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test28904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28904");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("franc");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'f' + "'", char1 == 'f');
    }

    @Test
    public void test28905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28905");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("hcstued-e#__nailati");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hcstued-e#__nailati [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test28906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                               ", "\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               " + "'", str3, "                               ");
    }

    @Test
    public void test28907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28907");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28908");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ZZZITALIAN (ITALY)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aitaitaitaitaitaitaitaitaita");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aitaitaitaitaitaitaitaitaita" + "'", str1, "aitaitaitaitaitaitaitaitaita");
    }

    @Test
    public void test28910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28910");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ZH_cnFrench (Canada)HHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_", "                                                 Frnz\366sisch(Knd                                                  ", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ZH_eCCaaa)HHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_" + "'", str3, "HHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ZH_eCCaaa)HHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_ITAHHHHHHHHHHtTAHHHHHHHHHHT_");
    }

    @Test
    public void test28911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28911");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\uCinese (Cina)\\u0069h..\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u", 64, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28912");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                               \\U002", (java.lang.CharSequence) "gERMAN (gERMANY)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28913");
        char[] charArray11 = new char[] { 'f', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "d", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ITA", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "fran\347ais (France)", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "iTALIE                         ", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4)", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "5555555555", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test28914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28914");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        double double2 = languageRange1.getWeight();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.Locale.FilteringMode filteringMode21 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList19, filteringMode21);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList25);
        java.lang.String str28 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList25);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleKeys();
        java.lang.String str31 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet30);
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet33 = locale32.getExtensionKeys();
        java.lang.String str34 = locale32.getVariant();
        java.lang.String str35 = locale32.getDisplayName();
        java.lang.String str36 = locale32.getCountry();
        java.util.Set<java.lang.String> strSet37 = locale32.getUnicodeLocaleKeys();
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet37, '.');
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet37);
        java.util.Locale locale41 = java.util.Locale.ITALIAN;
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.util.Locale locale43 = locale41.stripExtensions();
        java.lang.String str44 = locale41.getLanguage();
        java.lang.String str45 = locale41.getDisplayName();
        java.util.Set<java.lang.String> strSet46 = locale41.getUnicodeLocaleAttributes();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.parse("it                   ", strMap48);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.lang.String>) strList56, filteringMode58);
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.util.Locale.LanguageRange[] languageRangeArray82 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList83 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83, languageRangeArray82);
        java.lang.String[] strArray87 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        java.util.Locale.FilteringMode filteringMode90 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList83, (java.util.Collection<java.lang.String>) strList88, filteringMode90);
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.lang.String>) strList80, filteringMode90);
        java.util.Locale.FilteringMode filteringMode93 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags(languageRangeList49, (java.util.Collection<java.lang.String>) strList80, filteringMode93);
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet46, filteringMode93);
        boolean boolean96 = languageRange1.equals((java.lang.Object) strList95);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + filteringMode21 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode21.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertNotNull(charSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Italian" + "'", str35, "Italian");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Italian" + "'", str42, "Italian");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "it" + "'", str44, "it");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Italian" + "'", str45, "Italian");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode58.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(languageRangeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + filteringMode90 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode90.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertTrue("'" + filteringMode93 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode93.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test28915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28915");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                            fRENCH (fRANCE)                                                \\u0068", "ESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI", "                                                         \\u0046                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            fRENCH (fRANCE)                                                \\u0068" + "'", str3, "                                            fRENCH (fRANCE)                                                \\u0068");
    }

    @Test
    public void test28916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################", "TALIAN\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################" + "'", str2, "##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################");
    }

    @Test
    public void test28917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28917");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayCountry(locale4);
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale7.getDisplayName();
        java.lang.String str9 = locale4.getDisplayName(locale7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIAN" + "'", str5, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English (United States)" + "'", str8, "English (United States)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italian (ITALIAN,English)" + "'", str9, "italian (ITALIAN,English)");
    }

    @Test
    public void test28918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28918");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\ud504           fr_FR                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ud504           fr_FR                  " + "'", str1, "\ud504           fr_FR                  ");
    }

    @Test
    public void test28919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28919");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!       _\\U0020_Italienisch####################################################################          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!_\\u0020_italienisch####################################################################");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28920");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap65);
        java.util.Locale locale67 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.lang.String str69 = locale67.getVariant();
        java.lang.String str70 = locale67.getDisplayName();
        java.lang.String str71 = locale67.getCountry();
        java.util.Set<java.lang.String> strSet72 = locale67.getUnicodeLocaleKeys();
        java.lang.String str73 = java.util.Locale.lookupTag(languageRangeList66, (java.util.Collection<java.lang.String>) strSet72);
        java.lang.String str75 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet72, "X");
        java.util.Locale.LanguageRange languageRange77 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange79 = new java.util.Locale.LanguageRange("E");
        java.lang.String str80 = languageRange79.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray81 = new java.util.Locale.LanguageRange[] { languageRange77, languageRange79 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList82 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList82, languageRangeArray81);
        java.util.Locale locale84 = java.util.Locale.ITALIAN;
        java.lang.String str85 = locale84.getDisplayLanguage();
        java.util.Locale locale86 = locale84.stripExtensions();
        java.lang.String str87 = locale84.getLanguage();
        java.util.Set<java.lang.String> strSet88 = locale84.getUnicodeLocaleKeys();
        java.lang.String str90 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet88, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode91 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList82, (java.util.Collection<java.lang.String>) strSet88, filteringMode91);
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet72, filteringMode91);
        java.util.Locale locale94 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet95 = locale94.getUnicodeLocaleAttributes();
        java.lang.String str96 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet95);
        java.lang.String str98 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet95, ' ');
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
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Italian" + "'", str70, "Italian");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "e" + "'", str80, "e");
        org.junit.Assert.assertNotNull(languageRangeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "it");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Italian" + "'", str85, "Italian");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "it");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "it" + "'", str87, "it");
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + filteringMode91 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode91.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "en");
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNull(str96);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test28921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28921");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getISO3Country();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        boolean boolean7 = locale4.hasExtensions();
        java.lang.String str8 = locale4.getDisplayCountry();
        java.lang.String str9 = locale4.getDisplayName();
        java.util.Locale locale10 = locale4.stripExtensions();
        java.lang.String str11 = locale10.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CAN" + "'", str5, "CAN");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Canada" + "'", str8, "Canada");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English (Canada)" + "'", str9, "English (Canada)");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test28922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28922");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("French", "x-lvariant-zh", 111);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str1, "cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test28924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", "hi!_\\u0020_italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\" + "'", str2, "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
    }

    @Test
    public void test28925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28925");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                             Deutsch                                             ", "ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28926");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "FRANZ\326SISCH(FRANKREICH)", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Franzosisch (Frankreich)", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("french", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test28927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28927");
        java.util.Locale locale3 = new java.util.Locale("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY", "fr_CA", "");
        org.junit.Assert.assertEquals(locale3.toString(), "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy_FR_CA");
    }

    @Test
    public void test28928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Italian__#e-deutsch", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHINESE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian__#e-deutsch" + "'", str2, "Italian__#e-deutsch");
    }

    @Test
    public void test28929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28929");
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
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
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
        org.junit.Assert.assertNotNull(charSet12);
    }

    @Test
    public void test28930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28930");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28931");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hi!        (\\U0020,Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!        (\\U0020,Italienisch#########################################################################################" + "'", str1, "Hi!        (\\U0020,Italienisch#########################################################################################");
    }

    @Test
    public void test28932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...ISH ...", "                                                                                                         German (Germany)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...ISH ..." + "'", str2, "...ISH ...");
    }

    @Test
    public void test28933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28933");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                  \\u005c                                                         ", 48, "#########################################################################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                  \\u005c                                                         " + "'", str3, "                                  \\u005c                                                         ");
    }

    @Test
    public void test28934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28934");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getScript();
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale6.getDisplayName(locale7);
        java.util.Locale.setDefault(category4, locale7);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.lang.String str13 = locale11.getExtension('x');
        java.util.Locale.setDefault(category4, locale11);
        java.util.Locale locale18 = new java.util.Locale("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "", "                                      )hsilgne,nailati( ");
        java.lang.String str19 = locale18.getISO3Country();
        java.util.Locale.setDefault(category4, locale18);
        java.util.Locale locale21 = java.util.Locale.US;
        java.lang.String str22 = locale21.getScript();
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale21.getCountry();
        java.util.Locale.setDefault(locale21);
        java.util.Locale.setDefault(category4, locale21);
        java.lang.String str27 = locale0.getDisplayScript(locale21);
        java.lang.String str28 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French" + "'", str1, "French");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "allemand" + "'", str8, "allemand");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals(locale18.toString(), "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca__                                      )hsilgne,nailati( ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "US" + "'", str24, "US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "French" + "'", str28, "French");
    }

    @Test
    public void test28935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28935");
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
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale locale14 = builder12.build();
        java.util.Locale.Builder builder15 = builder12.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder12.setRegion("\\u0067");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: \\u0067 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "anglais__hcstued");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test28936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28936");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!        (\\U0020,Italienisch#########################################################################################)", "Eagaash", 129, (int) '9');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!        (\\U0020,Italienisch###########################Eagaash" + "'", str4, "hi!        (\\U0020,Italienisch###########################Eagaash");
    }

    @Test
    public void test28937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28937");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FKCV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FKCV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FKCV CW CX CY CZ DE DJ DK 8300u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28938");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("und");
        java.lang.String str7 = locale6.getScript();
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str11 = locale10.getCountry();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str16 = locale13.getDisplayLanguage(locale15);
        java.lang.String str17 = locale10.getDisplayLanguage(locale13);
        java.lang.String str18 = locale10.toLanguageTag();
        java.lang.String str19 = locale10.getDisplayName();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str24 = locale21.getExtension('F');
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder25.clear();
        java.util.Locale.Builder builder27 = builder25.clear();
        java.util.Locale.Builder builder28 = builder27.clear();
        java.util.Locale locale29 = java.util.Locale.CHINESE;
        java.lang.String str30 = locale29.getCountry();
        java.util.Locale.Builder builder31 = builder28.setLocale(locale29);
        java.util.Locale locale32 = builder31.build();
        java.lang.String str33 = locale21.getDisplayLanguage(locale32);
        java.util.Locale.setDefault(category0, locale21);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "und" + "'", str18, "und");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "English" + "'", str22, "English");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u82f1\u6587" + "'", str33, "\u82f1\u6587");
    }

    @Test
    public void test28939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28939");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28940");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'T', 'S');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'T' + "'", char2 == 'T');
    }

    @Test
    public void test28941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28941");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("         ITALIAN_italian_eNGLISH");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'n', (int) 'I', (int) '8');
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0034", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test28942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "99");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test28943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28943");
        java.util.Locale locale1 = new java.util.Locale("EDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkED");
        org.junit.Assert.assertEquals(locale1.toString(), "edkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkked");
    }

    @Test
    public void test28944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28944");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444ITALIAN4444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28945");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#AAAAA", 'N');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test28946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28946");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale1);
        java.lang.String str7 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet8 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale1.getExtension('E');
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale11.getScript();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale11.getCountry();
        java.util.Locale.setDefault(locale11);
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale17);
        java.lang.String str20 = locale17.getCountry();
        java.lang.String str21 = locale17.getCountry();
        java.lang.String str22 = locale11.getDisplayLanguage(locale17);
        java.util.Set<java.lang.String> strSet23 = locale11.getUnicodeLocaleKeys();
        java.lang.String str24 = locale1.getDisplayName(locale11);
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("iTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish");
        java.lang.String str28 = locale26.getExtension('A');
        java.util.Locale locale32 = new java.util.Locale("hi!       _\\U0020_Italienisch####################################################################...", "italian_ITALIAN_English", "hcsineilatI");
        java.lang.String str33 = locale32.getDisplayVariant();
        java.lang.String str34 = locale32.getDisplayScript();
        java.lang.String str35 = locale32.getLanguage();
        boolean boolean36 = locale32.hasExtensions();
        java.lang.String str37 = locale26.getDisplayVariant(locale32);
        java.lang.String str38 = locale1.getDisplayName(locale32);
        java.lang.Class<?> wildcardClass39 = locale1.getClass();
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "US" + "'", str14, "US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English" + "'", str18, "English");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!IH" + "'", str19, "!IH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "English" + "'", str22, "English");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "French (France)" + "'", str24, "French (France)");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals(locale32.toString(), "hi!       _\\u0020_italienisch####################################################################..._ITALIAN_ITALIAN_ENGLISH_hcsineilatI");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hcsineilatI" + "'", str33, "hcsineilatI");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!       _\\u0020_italienisch####################################################################..." + "'", str35, "hi!       _\\u0020_italienisch####################################################################...");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "French (France)" + "'", str38, "French (France)");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test28947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28947");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale0.getDisplayLanguage(locale4);
        java.lang.String str6 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-US" + "'", str1, "en-US");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test28948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                             de_de                                             ", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             de_de                                             " + "'", str2, "                             de_de                                             ");
    }

    @Test
    public void test28949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28949");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALI", "Cen-G\\u0038zho                         CHD");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28950");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'k', 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test28951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28951");
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
        java.util.Locale.Category category14 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale15 = java.util.Locale.getDefault(category14);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale17.getExtension('h');
        java.lang.String str20 = locale16.getDisplayScript(locale17);
        java.lang.String str21 = locale16.getISO3Country();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale22);
        java.lang.String str24 = locale16.getDisplayName(locale22);
        java.lang.String str25 = locale16.getScript();
        java.util.Locale.setDefault(category14, locale16);
        java.util.Set<java.lang.String> strSet27 = locale16.getUnicodeLocaleKeys();
        java.lang.String str28 = locale16.getCountry();
        java.util.Locale locale30 = new java.util.Locale("en");
        boolean boolean31 = locale30.hasExtensions();
        java.util.Set<java.lang.String> strSet32 = locale30.getUnicodeLocaleKeys();
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        java.lang.String str34 = locale33.getDisplayLanguage();
        java.util.Locale locale35 = locale33.stripExtensions();
        java.lang.String str36 = locale35.getVariant();
        java.lang.String str37 = locale30.getDisplayLanguage(locale35);
        java.util.Locale.setDefault(locale35);
        java.lang.String str39 = locale16.getDisplayLanguage(locale35);
        java.lang.String str40 = locale35.getDisplayName();
        java.util.Locale.setDefault(category0, locale35);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fra");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0045" + "'", str10, "\\u0045");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0045" + "'", str11, "\\u0045");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "\\u0045");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category14.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FRA" + "'", str21, "FRA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str24, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "FR" + "'", str28, "FR");
        org.junit.Assert.assertEquals(locale30.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "italien" + "'", str34, "italien");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "inglese" + "'", str37, "inglese");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "francese" + "'", str39, "francese");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "italiano" + "'", str40, "italiano");
    }

    @Test
    public void test28952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28952");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("nglish (united kingdom", "2iT hi!       _\\U0020_Italienisch####################################################################            2i");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("           \\u", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test28953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28953");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28954");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("TALIAN\\u0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE", "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28955");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("tit", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test28956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                          hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch                                           ", "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati", "EnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglisch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "llllllllllllllllllllllllllllllllllllllllllhc!lllllll2ITALIANITALIANITALIANITALInshceicsEh2ITALIANITALIANITALIANITALcnshcsi_ITALIAN_Eighcsh2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhc!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZnAnnnDnFnGnHnInKnLnMnNnOnRnUnVnWnXnYnZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALInshcsi2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhc!2ITALIANITALIANITALIANITALcTALIAN2ITALIANITALIANITALIANITALnhciesel(nhcis)2ITALIANITALIANITALIANITALhc!2ITALIANITALIANITALIANITALzh_nN2ITALIANITALIANITALIANITALcTALIAN2ITALIANITALIANITALIANITALei2ITALIANITALIANITALIANITALInshceicsEhlllllllllllllllllllllllllllllllllllllllllll" + "'", str3, "llllllllllllllllllllllllllllllllllllllllllhc!lllllll2ITALIANITALIANITALIANITALInshceicsEh2ITALIANITALIANITALIANITALcnshcsi_ITALIAN_Eighcsh2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhc!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZnAnnnDnFnGnHnInKnLnMnNnOnRnUnVnWnXnYnZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALInshcsi2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhc!2ITALIANITALIANITALIANITALcTALIAN2ITALIANITALIANITALIANITALnhciesel(nhcis)2ITALIANITALIANITALIANITALhc!2ITALIANITALIANITALIANITALzh_nN2ITALIANITALIANITALIANITALcTALIAN2ITALIANITALIANITALIANITALei2ITALIANITALIANITALIANITALInshceicsEhlllllllllllllllllllllllllllllllllllllllllll");
    }

    @Test
    public void test28957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28957");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("fr_CA", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                     ");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("Italian (italian,english", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fr_CA" + "'", str6, "fr_CA");
    }

    @Test
    public void test28958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28958");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("germa", "AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh", "\\u0052");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gm" + "'", str3, "gm");
    }

    @Test
    public void test28959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28959");
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
        java.util.Locale locale14 = builder13.build();
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.lang.String str16 = locale14.toString();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
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
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test28960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28960");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder8 = builder5.setExtension('i', "");
        java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("Engl");
        java.util.Locale.Builder builder11 = builder8.clear();
        java.util.Locale locale12 = builder11.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test28961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28961");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test28962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\u0034\\u00hcstud\\u0034\\u00", "FR-C                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("gERMAN  gERMANY");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "gERMAN  gERMANY" + "'", str1, "gERMAN  gERMANY");
    }

    @Test
    public void test28964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28964");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital", "                                               nailati                                                ", 120);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital" + "'", str4, "italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital");
    }

    @Test
    public void test28965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28965");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("ANGLAIS (R                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ANGLAIS (R                                                                                                                     " + "'", str1, "ANGLAIS (R                                                                                                                     ");
    }

    @Test
    public void test28966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28966");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getLanguage();
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleKeys();
        java.lang.String str10 = locale7.getDisplayName();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
        org.junit.Assert.assertNotNull(strSet9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ind\351termin\351 (Canada)" + "'", str10, "Ind\351termin\351 (Canada)");
    }

    @Test
    public void test28967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28967");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("okokok", "Royame-Uniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28968");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\\u0065                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28969");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("I\\U0020ITALIANITALIANITALIANITALIIT", "hi!        (\\U0020,Italienisch#####Franzosisch (Kanada)##############################################################################", "2CINESE (CINA)ITALIANITALIANITALIANITAL");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I\\U0020ITALIANITALIANITALIANITALIIT" + "'", str3, "I\\U0020ITALIANITALIANITALIANITALIIT");
    }

    @Test
    public void test28970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28970");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("itFranz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA", "                                               nailati                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28971");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0034\\u00                                             h!ih                            dallemanstuD                                             \\u0034\\u00", 'H');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ", "\ud504\ub791\uc2a4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        " + "'", str2, "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ");
    }

    @Test
    public void test28973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28973");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AND4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28974");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                         \\u005c                                                         ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)", "                          en                          ", 406);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                         \\u005c                                                         " + "'", str4, "                                                         \\u005c                                                         ");
    }

    @Test
    public void test28975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28975");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("italie                          (\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r)", "dnaHhhhhhhhhdnam");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28976");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD", "hi! 5italienisch5italian_italian_english5hi!5hi!5adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...5\\u00345hi!5italian5\\u00615\\u00235hi!5italian5chinese (china)5hi!5zh_cn5italian5en5italienisch", 28, 215);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GBDEUTSCHDEUTSCHDEUTSCHDEhi! 5italienisch5italian_italian_english5hi!5hi!5adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...5\\u00345hi!5italian5\\u00615\\u00235hi!5italian5chinese (china)5hi!5zh_cn5italian5en5italienisch" + "'", str4, "en-GBDEUTSCHDEUTSCHDEUTSCHDEhi! 5italienisch5italian_italian_english5hi!5hi!5adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...5\\u00345hi!5italian5\\u00615\\u00235hi!5italian5chinese (china)5hi!5zh_cn5italian5en5italienisch");
    }

    @Test
    public void test28977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28977");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hic!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28978");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("i", "iTALIAN (ITALIAN,ENGLISH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28979");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                                           z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    italian_ITALIAN_EnglisF", (java.lang.CharSequence) "iTALIAN (ITALIAN,ENGLISH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28980");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale0.getDisplayCountry();
        java.lang.String str5 = locale0.getScript();
        java.lang.String str7 = locale0.getExtension('d');
        java.lang.String str8 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test28981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28981");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "#u##2#iTALIANiTALIANiTALIANiT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#u##2#iTALIANiTALIANiTALIANiT" + "'", str1, "#u##2#iTALIANiTALIANiTALIANiT");
    }

    @Test
    public void test28982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28982");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("1\\u0061\\u0061\\u0061", "Korean (South Kor");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("tttttt\\u0049", "888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28984");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\\!u!00!de!\\!u!0", (java.lang.CharSequence) "...                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351", "CCCC\\CCCCC                                                             ", "...EnglishEnYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italianE(italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351" + "'", str3, "italianE(italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351");
    }

    @Test
    public void test28986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28986");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "z...", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAA)aHI0200U\\NAIHAAAAAAAAAAAAAAAAAAAAAAAAAA)a");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "z..." + "'", charSequence2, "z...");
    }

    @Test
    public void test28987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("2CINESE (CINA)ITALIANITALIANITALIANITAL", "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CAFR-CAFR-CAFR-C8600U\\FR-CAFFR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CAFR-CAFR-CAFR-C8600U\\FR-CAF");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2CINESE (CINA)ITALIANITALIANITALIANITAL" + "'", str2, "2CINESE (CINA)ITALIANITALIANITALIANITAL");
    }

    @Test
    public void test28988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("9500u\\", "FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9500u\\" + "'", str2, "9500u\\");
    }

    @Test
    public void test28989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28989");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("         italian_ITALIAN_English", "ITALIAN_ITALIAN_ENGLISH", 314);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28990");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444444444!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444!IH" + "'", str1, "44444444444444444444444444444444!IH");
    }

    @Test
    public void test28991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28991");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "FRANZ\326SISCH2(FRANKREICH)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28992");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale locale7 = builder3.build();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayVariant(locale10);
        java.lang.String str13 = locale9.getDisplayCountry();
        java.lang.String str14 = locale9.getScript();
        java.lang.String str15 = locale9.getScript();
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str19 = locale16.getDisplayVariant(locale17);
        java.lang.String str20 = locale16.getDisplayCountry();
        java.lang.String str21 = locale16.getScript();
        java.lang.String str22 = locale16.getScript();
        java.lang.String str23 = locale9.getDisplayCountry(locale16);
        java.util.Locale.Category category24 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale25 = java.util.Locale.getDefault(category24);
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.util.Locale locale27 = java.util.Locale.ITALIAN;
        java.lang.String str29 = locale27.getExtension('h');
        java.lang.String str30 = locale26.getDisplayScript(locale27);
        java.lang.String str31 = locale26.getISO3Country();
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale32);
        java.lang.String str34 = locale26.getDisplayName(locale32);
        java.lang.String str35 = locale26.getScript();
        java.util.Locale.setDefault(category24, locale26);
        java.lang.String str37 = locale9.getDisplayCountry(locale26);
        java.util.Locale.Builder builder38 = new java.util.Locale.Builder();
        java.util.Locale locale39 = builder38.build();
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str42 = locale39.getDisplayLanguage(locale41);
        java.lang.String str43 = locale26.getDisplayVariant(locale39);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.upperCase("                                                       hi!                                                              ", locale26);
        java.lang.String str45 = locale7.getDisplayName(locale26);
        java.lang.String str46 = locale7.getCountry();
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category24.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "FRA" + "'", str31, "FRA");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str34, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "                                                       HI!                                                              " + "'", str44, "                                                       HI!                                                              ");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test28993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("French", "iTTAIT_ITALIAN_EGAISH          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28994");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("franz\366sisch (frankreich)", strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "2");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test28995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28995");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(" \\U0078 ", "\\u006b");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " \\U0078 " + "'", str2, " \\U0078 ");
    }

    @Test
    public void test28996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28996");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("italian (italian,english)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italian(italian");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28997");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "    ", "D  \\u007");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                     \\u005c        ", "...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhfrancese (Canada)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     \\u005" + "'", str2, "                                                     \\u005");
    }

    @Test
    public void test28999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28999");
        java.util.Locale locale1 = new java.util.Locale("!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "!_\\u0020_itle#####################################!_\\u0020_itle######################################");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "!_\\u0020_itle#####################################!_\\u0020_itle######################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!_\\u0020_itle#####################################!_\\u0020_itle######################################" + "'", str3, "!_\\u0020_itle#####################################!_\\u0020_itle######################################");
    }

    @Test
    public void test29000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test29000");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...444444444444444444444444444444444444444444444444444                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}
