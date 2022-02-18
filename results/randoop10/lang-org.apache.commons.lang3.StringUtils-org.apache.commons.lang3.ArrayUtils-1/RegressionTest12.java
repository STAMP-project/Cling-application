import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test06001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06001");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\uc911\uad6d", "NG");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hsilgnE                                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "{tru,tru,fals}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("English (United Kingdom)FALSE,FALSE,FALSE,TRU,truetruefalse)", "German (Germany", 0, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "German (GermanyEnglish (United Kingdom)FALSE,FALSE,FALSE,TRU,truetruefalse)" + "'", str4, "German (GermanyEnglish (United Kingdom)FALSE,FALSE,FALSE,TRU,truetruefalse)");
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale0.getDisplayVariant(locale4);
        java.lang.String str6 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1, 100);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = org.apache.commons.lang3.ArrayUtils.remove(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10]");
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.subarray(longArray15, (int) (byte) 100, 0);
        long[] longArray20 = new long[] { 'a' };
        long[] longArray27 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.addAll(longArray20, longArray27);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray28, (long) '4');
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray15, longArray30);
        long[] longArray36 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray36, 0L);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray38, (long) (byte) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray38);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray38, (long) (short) 10, 100);
        long[] longArray45 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray38);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray38);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray38);
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray38);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray51 = org.apache.commons.lang3.ArrayUtils.add(longArray15, (int) '#', (long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[1, 100, 35, 10]");
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        char[] charArray8 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a', (int) (short) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, ' ');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray15);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray15);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.add(charArray15, 'u');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u610f\u5927\u5229\u6587\u610f\u5927\u5229", charArray15);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4a 4 u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4a 4 u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, a,  , 4,  , u]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\u82f1\u8a9e\u30a2EN_US             ", "e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2EN_US             " + "'", str2, "\u82f1\u8a9e\u30a2EN_US             ");
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("1-1.00", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1-1.00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Unitedetruefalse etruefalseStates");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getScript();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.toLanguageTag();
        java.util.Locale locale6 = java.util.Locale.US;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale3.getDisplayLanguage(locale7);
        java.lang.String str9 = locale2.getDisplayCountry(locale3);
        java.lang.String str10 = locale0.getDisplayCountry(locale3);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.util.Locale locale13 = java.util.Locale.US;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale14.toLanguageTag();
        java.lang.String str16 = locale12.getDisplayScript(locale14);
        java.lang.String str17 = locale12.getDisplayLanguage();
        java.lang.String str18 = locale12.getDisplayVariant();
        java.lang.String str19 = locale12.getDisplayLanguage();
        java.lang.String str20 = locale12.getDisplayName();
        java.lang.String str21 = locale11.getDisplayVariant(locale12);
        java.util.Locale locale23 = java.util.Locale.TAIWAN;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.upperCase("eng", locale23);
        java.lang.String str26 = locale11.getDisplayName(locale23);
        java.lang.String str27 = locale11.getDisplayScript();
        java.lang.String str28 = locale0.getDisplayScript(locale11);
        java.util.Locale locale29 = null;
        java.lang.String str30 = locale11.getDisplayVariant(locale29);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-US" + "'", str4, "en-US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-US" + "'", str5, "en-US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "English" + "'", str8, "English");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "South Korea" + "'", str10, "South Korea");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en-US" + "'", str15, "en-US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str17, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str19, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)" + "'", str20, "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ENG" + "'", str25, "ENG");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u6cd5\u6587" + "'", str26, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale4.getScript();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale8 = java.util.Locale.US;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale9.toLanguageTag();
        java.util.Locale.setDefault(category0, locale9);
        java.util.Set<java.lang.String> strSet12 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, "tru4tru4fals");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-US" + "'", str5, "en-US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-US" + "'", str10, "en-US");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("kor", " trutrufals");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 15, 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 3, (int) '#');
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 0L);
        long[] longArray16 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray16, 0L);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray18);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray6, longArray18);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray18, (long) 98);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray18, (long) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(longArray18, 10L);
        java.lang.Object obj27 = null;
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) boolean26, obj27);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u6cd510)32)10)5)1)5", "\u5927");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf", "  {false,false,false,false,true}  ", (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{false,fa  {false,false,false,false,true}  laf,eslaf" + "'", str3, "{false,fa  {false,false,false,false,true}  laf,eslaf");
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10.0100.01.0100.00.0", "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\uc77c\ubcf8\uc5b4false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "FR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                     100.0#-1.0#10.0#1.0#100.0#1.0", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                     100.0#-1.0#10.0#1.0#100.0#" + "'", str2, "                                                                     100.0#-1.0#10.0#1.0#100.0#");
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                    ", (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ..." + "'", str3, "       ...");
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("truetruetruefalsetruetruetruefalsefalse");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "truetruetruefalsetruetruetruefalsefalse" + "'", str1, "truetruetruefalsetruetruetruefalsefalse");
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("naliait", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      naliait" + "'", str2, "      naliait");
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
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
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, false, 213);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, false);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, true);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, false, false, false]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("{FALSE,FALSE,FALSE,FALSE,TRU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{FALSE,FALSE,FALSE,FALSE,TRU" + "'", str1, "{FALSE,FALSE,FALSE,FALSE,TRU");
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("{false,false,false,false,tru", 87, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...lse,tru" + "'", str3, "...lse,tru");
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("German (GermanyEnglish (United Kingdom)FALSE,FALSE,FALSE,TRU,truetruefalse)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "German (GermanyEnglish (United Kingdom)FALSE,FALSE,FALSE,TRU,truetruefalse)" + "'", str1, "German (GermanyEnglish (United Kingdom)FALSE,FALSE,FALSE,TRU,truetruefalse)");
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\u6cd5true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5" + "'", str1, "\u6cd5");
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("anglais(Etats-Unis)", "anglais (Etats-Unis)", "RK_ok");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "444444444444444444444ITALIEN (iTALIE)44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444ITALIEN (iTALIE)44444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444ITALIEN (iTALIE)44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("CN", "JPN", 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCN" + "'", str3, "CNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCN");
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "7", (java.lang.CharSequence) "zh-cn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("de-DE", 3, 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DE" + "'", str3, "DE");
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                    ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuUED", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "{fPfPfPfPNPJ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{fPfPfPfPNPJ" + "'", str1, "{fPfPfPfPNPJ");
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "{0,35,-1}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u82f1\u6587{FPFPFPFPNPJ{FPFPFPFP", "\u5229\u5927\u610f\u6587\u5229\u5927\u610f\u5229\u5927\u610f\u6587\u5229\u5927\u610f\u5229\u5927\u610f\u6587\u5229\u5927\u610f", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" ", (int) (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
        int[] intArray0 = null;
        int[] intArray6 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, (int) (short) 100);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.add(intArray6, 5);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.clone(intArray14);
        java.lang.String str16 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray15);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray0, intArray15);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[5, 1, 5, 10, 32, 10]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{10,32,10,5,1,5}" + "'", str16, "{10,32,10,5,1,5}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("{fPfPfPfPNPJ", "\u30a2\u30e1#", ")SINu-STATe( SIALGNA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "}EURT,ESL");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray3);
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 0 };
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) 1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray9);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (short) (byte) -1);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray12, (short) -1);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray12, 0, 0);
        java.lang.Short[] shortArray19 = new java.lang.Short[] { (short) 0 };
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19, (short) (byte) 1);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(shortArray21, (short) 0);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray21, (short) -1);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray25, (short) -1);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray25, (int) (short) 1, 213);
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray25);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray25, (short) 0);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray12, shortArray25);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.add(shortArray12, 13, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 2");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
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
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray3, (short) 100, (int) 'a');
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (short) (byte) 100);
        java.lang.Short[] shortArray31 = new java.lang.Short[] { (short) 0 };
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray31, (short) (byte) 1);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray33);
        java.lang.Short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray33);
        java.lang.Short[] shortArray37 = new java.lang.Short[] { (short) 0 };
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray37, (short) (byte) 1);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray33, shortArray39);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.add(shortArray33, (short) (byte) -1);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray42, (short) -1);
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray42, 0, 0);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray47);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) (byte) -1);
        short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray50, (int) (short) 1, 2);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray50, (int) 'u', 0);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 100]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[0]");
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[0]");
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[]");
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUNITED STATESUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                                                      {false,..                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  {false,false,false,false,true}  ", "{97,1,10,10,35,-1,35,-1}");
        java.lang.String[] strArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap5 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '  ', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  falsefalsefalsefalsetrue  " + "'", str4, "  falsefalsefalsefalsetrue  ");
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\u5927");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray6);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.clone(longArray10);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray10, (long) 39);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray10, (long) 97, 17);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\u82f1\u8a9e");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 10);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray18);
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
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 1, 1, 0, 1, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("etruefalse                                          ", "se,false,false,tru{false,false,false,false", 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "etruefalse                                          " + "'", str3, "etruefalse                                          ");
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("United Statesslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurtu", "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    ", (int) 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "na    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    " + "'", str2, "na    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    ");
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) 1, (short) -1 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray3, (short) -1, (int) (byte) 100);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) (byte) 100);
        short[] shortArray9 = null;
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (short) -1);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) shortArray9);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("e");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] { languageRange1 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode7 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strSet6, filteringMode7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList12, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Collection<java.util.Locale> localeCollection18 = null;
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.lang.String[] strArray29 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.FilteringMode filteringMode33 = null;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList30, filteringMode33);
        java.util.Locale locale35 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        java.util.Locale locale38 = new java.util.Locale("Italian");
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.util.Locale locale40 = java.util.Locale.FRANCE;
        java.util.Locale locale41 = java.util.Locale.US;
        java.lang.String str42 = locale41.toLanguageTag();
        java.util.Locale locale43 = java.util.Locale.ITALY;
        java.util.Locale locale44 = java.util.Locale.US;
        java.util.Locale locale45 = locale44.stripExtensions();
        java.lang.String str46 = locale45.toLanguageTag();
        java.lang.String str47 = locale43.getDisplayScript(locale45);
        java.util.Locale locale48 = java.util.Locale.KOREA;
        java.util.Locale locale49 = java.util.Locale.ITALY;
        java.util.Locale locale50 = java.util.Locale.US;
        java.util.Locale locale51 = locale50.stripExtensions();
        java.lang.String str52 = locale51.toLanguageTag();
        java.lang.String str53 = locale49.getDisplayScript(locale51);
        java.lang.String str54 = locale49.getDisplayLanguage();
        java.util.Locale locale55 = java.util.Locale.ITALY;
        java.util.Locale locale56 = java.util.Locale.US;
        java.util.Locale locale57 = locale56.stripExtensions();
        java.lang.String str58 = locale57.toLanguageTag();
        java.lang.String str59 = locale55.getDisplayScript(locale57);
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale35, locale38, locale39, locale40, locale41, locale43, locale48, locale49, locale57 };
        java.util.ArrayList<java.util.Locale> localeList61 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList61, localeArray60);
        java.util.Locale.FilteringMode filteringMode63 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList61, filteringMode63);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, localeCollection18, filteringMode63);
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.lang.String[] strArray73 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, (java.util.Collection<java.lang.String>) strList74);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList74);
        java.util.Locale locale78 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet79 = locale78.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strSet79);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap81 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList82 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap81);
        java.util.Locale locale83 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet84 = locale83.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strSet84, filteringMode85);
        java.lang.String str87 = java.util.Locale.lookupTag(languageRangeList14, (java.util.Collection<java.lang.String>) strList86);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + filteringMode7 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode7.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals(locale38.toString(), "italian");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "en-US" + "'", str42, "en-US");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en-US" + "'", str46, "en-US");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "en-US" + "'", str52, "en-US");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str54, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "en-US" + "'", str58, "en-US");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(localeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + filteringMode63 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode63.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList64);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNotNull(languageRangeList82);
        org.junit.Assert.assertNotNull(locale83);
// flaky:         org.junit.Assert.assertEquals(locale83.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode85.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNull(str87);
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray8, (byte) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray8, (byte) 0);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray19, (byte) 10, (int) '#');
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.add(byteArray25, (byte) -1);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray19, byteArray25);
        java.lang.Byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray25);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray8, byteArray25);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray37, (byte) 10, (int) '#');
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.add(byteArray43, (byte) -1);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray37, byteArray43);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray25, byteArray43);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int57 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray54, (byte) 10, (int) '#');
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray62 = org.apache.commons.lang3.ArrayUtils.add(byteArray60, (byte) -1);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray54, byteArray60);
        java.lang.Byte[] byteArray64 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray60);
        java.lang.Byte[] byteArray65 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray60);
        byte[] byteArray67 = org.apache.commons.lang3.ArrayUtils.add(byteArray60, (byte) 0);
        byte[] byteArray68 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray43, byteArray67);
        byte[] byteArray69 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray68);
        int int72 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray68, (byte) 0, (int) 'x');
        byte[] byteArray73 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray2, byteArray68);
        int int76 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray73, (byte) 100, (int) 'a');
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray73);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 5 + "'", int57 == 5);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[1, 0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[1, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[100, 1, 0, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (short) 100, 2);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, false, 42);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray15);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray15);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.add(booleanArray15, true);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[]");
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("Giappone");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("de-de", "0-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "\u30a4\u30bf\u30ea\u30a2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                               cor\351en (Cor\351e du Sud)", "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587                                                 -1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
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
        float[] floatArray22 = new float[] { (byte) 10, 0, 100L, ' ', (byte) -1, (short) 0 };
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray22);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray22, (float) 10, (int) (short) 10);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.clone(floatArray22);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray22, 42, 0);
        boolean boolean31 = objMap15.equals((java.lang.Object) 0);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.add(byteArray34, (byte) -1);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray36, 213, (int) 'x');
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray36);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray36, 2, 213);
        java.lang.Short[] shortArray45 = new java.lang.Short[] { (short) 0 };
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray45, (short) (byte) 1);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray47);
        java.lang.Short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray47);
        java.lang.Short[] shortArray51 = new java.lang.Short[] { (short) 0 };
        short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray51, (short) (byte) 1);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray47, shortArray53);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.add(shortArray47, (short) (byte) -1);
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray56, (short) (byte) 100);
        short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.clone(shortArray56);
        short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray59, (short) (byte) 0);
        short[] shortArray64 = org.apache.commons.lang3.ArrayUtils.add(shortArray59, (int) (byte) 0, (short) 100);
        short[] shortArray65 = org.apache.commons.lang3.ArrayUtils.clone(shortArray64);
        java.lang.Object obj66 = objMap15.getOrDefault((java.lang.Object) 213, (java.lang.Object) shortArray64);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet67 = objMap15.entrySet();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "ja");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "ja");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-1]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[0]");
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[-1]");
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[100, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[100, 0, -1]");
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(objEntrySet67);
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) -1 };
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        short[] shortArray3 = null;
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray2, shortArray3);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1]");
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("10 32 10 5 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 32 10 5 1" + "'", str1, "10 32 10 5 1");
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "United# #States", (java.lang.CharSequence) ")SINu-STATe( SIALGNA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("AAAAADEAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=aaaaadeaaaaaa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("etruefalse      0-1                ", (int) (short) 100, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("United States", (int) (byte) 10, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "United States" + "'", str3, "United States");
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
        java.util.Locale locale3 = new java.util.Locale("en-US", "  {false,false,false,false,true}  ", "  {false,false,false,false,true}  ");
        java.util.Locale.setDefault(locale3);
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale6.getDisplayCountry(locale8);
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale8.getDisplayCountry(locale10);
        java.util.Locale.setDefault(category5, locale10);
        java.lang.String str13 = locale10.getCountry();
        java.lang.String str14 = locale3.getDisplayCountry(locale10);
        java.lang.String str15 = locale10.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "en-us_  {FALSE,FALSE,FALSE,FALSE,TRUE}  _  {false,false,false,false,true}  ");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-US" + "'", str7, "en-US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u7f8e\u56fd" + "'", str9, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CN" + "'", str13, "CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "  {FALSE,FALSE,FALSE,FALSE,TRUE}  " + "'", str14, "  {FALSE,FALSE,FALSE,FALSE,TRUE}  ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese" + "'", str15, "Chinese");
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
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
        boolean[] booleanArray23 = new boolean[] { false, false, false, false, true };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray23);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray23, (int) (byte) -1, (int) '#');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray23);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray23);
        boolean[] booleanArray35 = new boolean[] { false, false, false, false, true };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray35);
        boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray35, (int) (byte) -1, (int) '#');
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray35);
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray35);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray41);
        java.lang.Object obj43 = objMap15.get((java.lang.Object) booleanArray41);
        java.util.Locale.Builder builder44 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder45 = builder44.clearExtensions();
        java.util.Locale.Builder builder47 = builder44.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder49 = builder47.setLanguageTag("eng");
        boolean boolean50 = objMap15.containsKey((java.lang.Object) builder47);
        java.lang.Boolean[] booleanArray54 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray55 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray54);
        boolean[] booleanArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray54, true);
        boolean[] booleanArray58 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray54);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray54);
        int int61 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray59, false);
        int int64 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray59, false, 100);
        boolean[] booleanArray70 = new boolean[] { false, false, false, false, true };
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray70);
        boolean[] booleanArray74 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray70, (int) (byte) -1, (int) '#');
        int int76 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray74, false);
        boolean[] booleanArray77 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray59, booleanArray74);
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray77);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray77);
        boolean boolean80 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) builder47, (java.lang.Object) booleanArray77);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder83 = builder47.setExtension('4', "\u97d3\u6587\u5357\u97d3)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en-us_  {FALSE,FALSE,FALSE,FALSE,TRUE}  _  {false,false,false,false,true}  ");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_  {FALSE,FALSE,FALSE,FALSE,TRUE}  _  {false,false,false,false,true}  ");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en-us_  {FALSE,FALSE,FALSE,FALSE,TRUE}  _  {false,false,false,false,true}  ");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en-us_  {FALSE,FALSE,FALSE,FALSE,TRUE}  _  {false,false,false,false,true}  ");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false, false, false, false, true]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertNotNull(booleanArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray57), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertNotNull(booleanArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray70), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(booleanArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray74), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 3 + "'", int76 == 3);
        org.junit.Assert.assertNotNull(booleanArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray77), "[true, false, false, false, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\u65e5\u6587\u65e5\u672c)", "                                               en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u6587\u65e5\u672c)" + "'", str2, "\u65e5\u6587\u65e5\u672c)");
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("italien", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "itlien" + "'", str2, "itlien");
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "ja_JP");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("{0,-1}", "France", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  {FPFPFPFPNPJ   ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(")SINu-STATe( SIALGNA", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "UED", "japonais");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
        float[] floatArray6 = new float[] { 10, '#', 3, (byte) -1, 0, (byte) 0 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray6);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray6, (int) (short) 1, 10);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray6, (float) (short) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray12, (float) (byte) 0, 98);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray17, (float) (byte) -1);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 0.0, -1.0, 3.0, 35.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[0.0, 0.0, -1.0, 3.0, 35.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 100.0f);
        java.lang.Double[] doubleArray16 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray16, (double) (short) 0);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray16, (java.lang.Object) "TRUETRUEFALSE");
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray16);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray16, (double) (short) 0);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray9, doubleArray23);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray24, (double) 32, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 1.0, 100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("{97,1,10", 95, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
        char[] charArray3 = new char[] { ' ', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = org.apache.commons.lang3.ArrayUtils.remove(charArray3, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                   UNITED STATES", "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2e_");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("10 32 10 5 1", "uuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "United# #States", (java.lang.CharSequence) "USA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanglais(Etats-Unis)", "CN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray12 = new boolean[] { false, false, false, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (byte) -1, (int) '#');
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.add(booleanArray12, 743, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 743, Length: 5");
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
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
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
        boolean boolean57 = objMap15.isEmpty();
        double[] doubleArray60 = new double[] { 4, 100L };
        double[] doubleArray63 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray60, (int) '4', 5);
        int int67 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray63, (double) 2, 0, (double) 100);
        int int71 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray63, (-1.0d), 42, 1.0d);
        double[] doubleArray74 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray63, 10, (int) (short) 1);
        java.lang.Object obj75 = objMap15.get((java.lang.Object) (short) 1);
        objMap15.clear();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en-us_  {FALSE,FALSE,FALSE,FALSE,TRUE}  _  {false,false,false,false,true}  ");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en-us_  {FALSE,FALSE,FALSE,FALSE,TRUE}  _  {false,false,false,false,true}  ");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en-us_  {FALSE,FALSE,FALSE,FALSE,TRUE}  _  {false,false,false,false,true}  ");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en-us_  {FALSE,FALSE,FALSE,FALSE,TRUE}  _  {false,false,false,false,true}  ");
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("  {false,false,false,false,true}  ");
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category2, locale3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category2);
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale6.toLanguageTag();
        java.lang.String str8 = locale6.getScript();
        java.util.Locale.setDefault(category2, locale6);
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.lang.String str12 = locale11.toLanguageTag();
        java.util.Locale.setDefault(category2, locale11);
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale locale16 = builder14.build();
        java.util.Locale.setDefault(category2, locale16);
        java.util.Locale locale18 = locale16.stripExtensions();
        java.lang.String str19 = locale16.getISO3Language();
        java.lang.String str20 = locale1.getDisplayName(locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = locale16.getUnicodeLocaleType("\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4????aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-US" + "'", str7, "en-US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en-US" + "'", str12, "en-US");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet1, "e");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "  en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US     en-US   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
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
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) byteArray16);
        java.lang.Byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray16);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray25, (byte) -1);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray25, (byte) 0);
        java.lang.Byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray29);
        java.util.Locale.Category category31 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale32 = java.util.Locale.getDefault(category31);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray30, (java.lang.Object) locale32, 0);
        java.lang.String str35 = locale32.toLanguageTag();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + category31 + "' != '" + java.util.Locale.Category.FORMAT + "'", category31.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "und" + "'", str35, "und");
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "de_DE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
        float[] floatArray6 = new float[] { (byte) 10, 0, 100L, ' ', (byte) -1, (short) 0 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray6, (float) 10, (int) (short) 10);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.clone(floatArray6);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray6, 42, 0);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(floatArray6, (float) 7);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray6, (float) 34, (int) (short) 100);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("44444444444444444444444444FRANCE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'u');
        java.lang.Character[] charArray13 = org.apache.commons.lang3.ArrayUtils.toObject(charArray7);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray13);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13, '#');
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray17, '4');
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray19, 'a', 756);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray19);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh_CN", charArray19);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "   a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "   a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ ,  ,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ARF", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
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
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray20);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u65e5\u6587\u65e5\u672c)", "                                                                                                                                                                                                                                                 {false,..");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "   Etats-Unis    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray0, "{false,false,false,false,tru");
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray0, (java.lang.Object) doubleArray4, (int) (short) 0);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray7);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7, (double) 0);
        java.lang.Double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray7);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) 5);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray7, 0.0d, (int) (byte) 100);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, 1.0d);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) 43);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 0.0, 5.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 0.0, 5.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "TI_TI", (java.lang.CharSequence) "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
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
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray30 = org.apache.commons.lang3.ArrayUtils.remove(longArray26, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2" + "'", str1, "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2");
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("CHINOIS", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           CHINOIS" + "'", str2, "                           CHINOIS");
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) (short) 0);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray3, (java.lang.Object) doubleArray13, 4);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray13);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.add(doubleArray13, (double) (byte) 100);
        java.lang.Double[] doubleArray22 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray22, (double) (byte) -1);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray22);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray25, (int) (short) 1);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray19, doubleArray25);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray28, 1.0d, (int) 'x', (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.add(doubleArray28, 87, (double) 743);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 87, Length: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0, 100.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("}eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt", "                           CHINOIS");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt" + "'", str2, "}eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt");
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray4);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0, 4);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray4);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 0, (int) '4');
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray12, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale0.getDisplayCountry(locale3);
        java.util.Set<java.lang.Character> charSet6 = locale0.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u65e5\u6587\u65e5\u672c)" + "'", str1, "\u65e5\u6587\u65e5\u672c)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ja" + "'", str2, "ja");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Giappone" + "'", str5, "Giappone");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray7, (short) (byte) 10, 31);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0  ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  0-1.0100.0-1.010.01.0100.01.0  " + "'", str2, "  0-1.0100.0-1.010.01.0100.01.0  ");
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "         USA         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  en-US   ", "corean");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("  {false,false,false,false,true}   ");
        java.util.Locale locale6 = new java.util.Locale("0", "{false,false,false,false,tru", "truetruefalse");
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("china", locale6);
        java.lang.String str9 = locale1.getDisplayLanguage(locale6);
        java.util.Locale locale11 = java.util.Locale.US;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("", locale11);
        java.lang.String str14 = locale11.getCountry();
        java.lang.String str15 = locale6.getDisplayName(locale11);
        java.lang.String str16 = locale6.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "0_{FALSE,FALSE,FALSE,FALSE,TRU_truetruefalse");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CHINA" + "'", str8, "CHINA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "US" + "'", str14, "US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)" + "'", str15, "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0_{FALSE,FALSE,FALSE,FALSE,TRU_truetruefalse" + "'", str16, "0_{FALSE,FALSE,FALSE,FALSE,TRU_truetruefalse");
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("tedesco (Germania", 4, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tedesco (Germania" + "'", str3, "tedesco (Germania");
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        float[] floatArray6 = new float[] { 10, '#', 3, (byte) -1, 0, (byte) 0 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray6);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray6, (int) (short) 1, 10);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray6, (float) (short) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray12);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(floatArray12, (float) 'a');
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.remove(floatArray12, (int) (byte) 1);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.add(floatArray18, (float) 95);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0, 3.0, -1.0, 0.0, 0.0, 95.0]");
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=97.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        float[] floatArray3 = new float[] { 100, (byte) -1, (-1) };
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray6, (float) (byte) 0);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray10 = new float[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray9, floatArray10);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray9);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray16 = new float[] {};
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray16);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray15, floatArray16);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray15);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray9, floatArray15);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray15);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray6, floatArray15);
        float[] floatArray23 = new float[] {};
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray23);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray23);
        float[] floatArray26 = new float[] {};
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray26);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray26);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray28);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray28, (float) (short) 0, (int) (byte) 10);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray25, floatArray28);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.clone(floatArray33);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray6, floatArray33);
        java.lang.Float[] floatArray41 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray41, (float) (byte) 0);
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray43);
        java.lang.Float[] floatArray50 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray50, (float) (byte) 0);
        float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray52);
        float[] floatArray54 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray43, floatArray52);
        float[] floatArray55 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray54);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray35, floatArray54);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[0.0, 100.0, 0.0, 1.0, 1.0, 0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[0.0, 100.0, 0.0, 1.0, 1.0, 0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("eN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "eN" + "'", str1, "eN");
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Taiwan", "EN(US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("101035-135-1", 31, "97United States1United States10United States10United States35United States-1United States35United States-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "101035-135-197United States1Uni" + "'", str3, "101035-135-197United States1Uni");
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
        java.lang.Character[] charArray5 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray5, (java.lang.Object) builder9, 4);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, 'a');
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray13, '#', (int) 'x');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.add(charArray13, 'x');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray18);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[u,  , u, u, u]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "xuuu u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "xuuu u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[x, u, u, u,  , u]");
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("chinese (China)", "fr", (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\u65e5\u6587\u65e5\u672c)0", "UNITED ST");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
        java.lang.Object[] objArray0 = null;
        long[] longArray2 = new long[] { 'a' };
        long[] longArray9 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.addAll(longArray2, longArray9);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray10, (int) (short) 1, (long) (byte) 1);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.subarray(longArray13, (-1), (-1));
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(longArray13, (long) (byte) 0);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toObject(longArray13);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray13, (long) 23, (int) (byte) 1);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(objArray0, (java.lang.Object) 23);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[97]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(longArray12, (long) (byte) 0);
        java.lang.Long[] longArray18 = org.apache.commons.lang3.ArrayUtils.toObject(longArray12);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray19);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray19, (long) 3);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.subarray(longArray24, 3, (int) (short) 10);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.addAll(longArray12, longArray24);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray24, (long) 'u');
        org.apache.commons.lang3.ArrayUtils.reverse(longArray24);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, (int) (short) 100);
        int[] intArray16 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray16, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray16);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray16, (int) (short) 100);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray16);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray22);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray22);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray22);
        java.lang.Integer[] intArray26 = org.apache.commons.lang3.ArrayUtils.toObject(intArray22);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray26, 0);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray26, 213);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) intArray26);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 32, 10, 5, 1]");
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale2.getDisplayCountry(locale4);
        java.util.Locale locale6 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str7 = locale4.getDisplayCountry(locale6);
        java.util.Locale.setDefault(category1, locale6);
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.lang.String str12 = locale11.toLanguageTag();
        java.lang.String str13 = locale9.getDisplayScript(locale11);
        java.lang.String str14 = locale9.getDisplayLanguage();
        java.lang.String str15 = locale9.getDisplayVariant();
        java.lang.String str16 = locale9.getDisplayLanguage();
        java.lang.String str17 = locale6.getDisplayVariant(locale9);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.upperCase("JPN", locale9);
        java.util.Set<java.lang.Character> charSet19 = locale9.getExtensionKeys();
        boolean boolean20 = locale9.hasExtensions();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-US" + "'", str3, "en-US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u7f8e\u56fd" + "'", str5, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en-US" + "'", str12, "en-US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str14, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str16, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JPN" + "'", str18, "JPN");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("{0,-1}", "\u65e5\u6587", "china");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Canada", "44444444444444444444444444france                ", 756);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
        char[] charArray3 = new char[] { ' ', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray3, 'a');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'x');
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.toObject(charArray7);
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
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " aax");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " aax");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , a, a, x]");
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray13);
        char[] charArray23 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray23, 'a', (int) (short) 10);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray23, ' ');
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray23, ' ');
        char[] charArray37 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray37, 'a', (int) (short) 10);
        char[] charArray47 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray47, 'a', (int) (short) 10);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray47, ' ');
        char[] charArray54 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray47, ' ');
        char[] charArray55 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray54);
        char[] charArray56 = org.apache.commons.lang3.ArrayUtils.addAll(charArray37, charArray54);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray23, charArray37);
        boolean boolean58 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray37);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray13, charArray37);
        char[] charArray61 = org.apache.commons.lang3.ArrayUtils.add(charArray13, '#');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "4a 4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "4a 4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[4, a,  , 4,  , #]");
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Giappone", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Giappone               " + "'", str2, "Giappone               ");
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
        byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0]");
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("{fPfPfPfPNPJ", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{fPfPfPfPNPJ{fPfPfPfPNPJ{fPfPfPfPNPJ" + "'", str2, "{fPfPfPfPNPJ{fPfPfPfPNPJ{fPfPfPfPNPJ");
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
        java.lang.Character[] charArray5 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray5, (java.lang.Object) builder9, 4);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = org.apache.commons.lang3.ArrayUtils.remove(charArray12, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 98, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[u,  , u, u, u]");
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "se,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal" + "'", str2, "se,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal");
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray3);
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 0 };
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) 1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray9);
        java.lang.Short[] shortArray12 = new java.lang.Short[] { (short) 0 };
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray12, (short) (byte) 1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray14);
        java.lang.Short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray14);
        java.lang.Short[] shortArray18 = new java.lang.Short[] { (short) 0 };
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) (byte) 1);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray14, shortArray20);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray9, shortArray21);
        java.lang.Short[] shortArray24 = new java.lang.Short[] { (short) 0 };
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray24, (short) (byte) 1);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray26);
        java.lang.Short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray26);
        java.lang.Short[] shortArray30 = new java.lang.Short[] { (short) 0 };
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray30, (short) (byte) 1);
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray26, shortArray32);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.add(shortArray26, (short) (byte) -1);
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray35, (short) (byte) 100);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray37, (short) 10);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray9, shortArray37);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.remove(shortArray9, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 17, Length: 1");
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
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0]");
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[0, 0]");
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\u56fd\u7f8e", "tru#tru#fals                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u56fd\u7f8e" + "'", str2, "\u56fd\u7f8e");
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-.", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
        double[] doubleArray0 = null;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 23, 756, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("01530011aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "tru#tru#fals                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01530011aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "01530011aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("cor\351en", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cor\351en" + "'", str2, "cor\351en");
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}", "inglese");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray11 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray11, (double) (short) -1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray11);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, (double) 'u');
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray7, doubleArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray7, 0.0d, (double) (short) 100);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray7, (double) (-1), 0, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, 0.0, 117.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray12 = new boolean[] { false, false, false, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (byte) -1, (int) '#');
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray17, false);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.add(booleanArray17, false);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray17, (int) (byte) 0, 10);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, false, false, true, false, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, false, false, true, false, false, false, false, true]");
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray4, 213, (int) 'x');
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray14, (byte) 10, (int) '#');
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.add(byteArray20, (byte) -1);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray14, byteArray20);
        java.lang.Byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray20);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray24, (java.lang.Object) 4, 4);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray24, (byte) 0);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray36, (byte) 10, (int) '#');
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.add(byteArray42, (byte) -1);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray36, byteArray42);
        java.lang.Byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray42);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray46, (java.lang.Object) 4, 4);
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray46, (byte) -1);
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray46, (byte) 10);
        byte[] byteArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray46, (byte) 10);
        byte[] byteArray56 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray29, byteArray55);
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray55, (byte) -1, 213);
        byte[] byteArray60 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray55);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray63 = org.apache.commons.lang3.ArrayUtils.add(byteArray60, 21, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 21, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[1, 0, -1, 1, 0]");
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitaliana", 28, "0.1#0.001#0.1#0.01#0.1-#0.0010.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitaliana" + "'", str3, "aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitaliana");
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("01530011");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01530011" + "'", str1, "01530011");
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 10.0f };
        java.lang.Float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray1, (float) 2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.remove(floatArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...AaBB...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AaBB..." + "'", str1, "...AaBB...");
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\u82f1\u8a9e\u30a2en_US", "{fulse,fulse,fulse,fulse,true");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2en_US" + "'", str2, "\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toObject(longArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) longArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray7, ' ', (int) ' ', (int) (byte) 1);
        long[] longArray14 = new long[] { 'a' };
        long[] longArray21 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray21);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray21, (long) 5, (int) ' ');
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.add(longArray21, (long) (byte) -1);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) longArray7, (java.lang.Object) longArray21);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7, (long) 5);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray32);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray32, (long) 4);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray32);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11003510" + "'", str8, "11003510");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[10, 10, 35, -1, 35, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[10, 35, 100, 1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[10, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray8, (long) (byte) -1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray8);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) (-1), 7);
        long[] longArray25 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray25, 0L);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray27, (long) (byte) -1);
        long[] longArray34 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray34, 0L);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray36, (long) (byte) 0);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray36);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.addAll(longArray27, longArray36);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.clone(longArray36);
        java.lang.Long[] longArray42 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray43 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray42);
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray43);
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray44, (long) 13);
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.addAll(longArray36, longArray46);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray8, longArray46);
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray46, (long) 9);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray53 = org.apache.commons.lang3.ArrayUtils.add(longArray46, 43, (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 43, Length: 0");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[1, 100, 35, 10, 1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Deutsch (Deutschland)", "{fulse,fulse,fulse,fulse,tr", " FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Deutsch (Deutschland)" + "'", str3, "Deutsch (Deutschland)");
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category2, locale3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category2);
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setRegion("ja                                        ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ja                                         [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
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
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray43);
        java.lang.Character[] charArray50 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray50);
        java.util.Locale.Builder builder52 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder53 = builder52.clearExtensions();
        java.util.Locale.Builder builder54 = builder52.clearExtensions();
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray50, (java.lang.Object) builder54, 4);
        char[] charArray58 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray50, 'a');
        char[] charArray59 = org.apache.commons.lang3.ArrayUtils.addAll(charArray43, charArray58);
        int int62 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray59, 'a', 12);
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
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[u,  , u, u, u]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("{1.0,-1.0,0.0,0.0}", "English (United States)", "       ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setExtension('u', "German");
        java.util.Locale locale8 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setScript("\u30a2\u30e1##");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: (??## [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        char[] charArray17 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray17, 'a', (int) (short) 10);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray17, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray17, ' ');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray24);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.addAll(charArray7, charArray24);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray28);
        java.lang.Character[] charArray30 = org.apache.commons.lang3.ArrayUtils.toObject(charArray28);
        java.lang.Character[] charArray31 = org.apache.commons.lang3.ArrayUtils.toObject(charArray28);
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
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "  4 a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "  4 a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ ,  , 4,  , a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray31);
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("inglese", "1.010.0100.01.0100.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglese" + "'", str2, "inglese");
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toObject(longArray6);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) 100);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray6);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) 131);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray14 = org.apache.commons.lang3.ArrayUtils.remove(longArray12, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 21, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[1, 100, 35, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[1, 100, 35, 10, 131]");
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray3);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (short) 10, 2);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) (byte) 1, 35);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444{fPfPfPfPNPJ", "fran\347ais (France)", 39);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray13);
        char[] charArray22 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray22, 'a', (int) (short) 10);
        char[] charArray32 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray32, 'a', (int) (short) 10);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray32, ' ');
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray32, ' ');
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray39);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.addAll(charArray22, charArray39);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray13, (java.lang.Object) charArray41);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray41, 'a', (int) 'a');
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.contains(charArray41, ' ');
        char[] charArray55 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray55, 'a', (int) (short) 10);
        int int60 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray55, ' ');
        char[] charArray62 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray55, ' ');
        int int63 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aitalianaa", charArray55);
        char[] charArray66 = org.apache.commons.lang3.ArrayUtils.subarray(charArray55, 4, 0);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray41, charArray66);
        char[] charArray74 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int77 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray74, 'a', (int) (short) 10);
        int int79 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray74, ' ');
        char[] charArray81 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray74, ' ');
        char[] charArray82 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray81);
        boolean boolean83 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray81);
        boolean boolean84 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray81);
        java.lang.Character[] charArray85 = org.apache.commons.lang3.ArrayUtils.toObject(charArray81);
        char[] charArray87 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray85, 'u');
        char[] charArray89 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray87, '#');
        boolean boolean90 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray66, charArray89);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray92 = org.apache.commons.lang3.ArrayUtils.remove(charArray89, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4 + "'", int58 == 4);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 4 + "'", int77 == 4);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray89), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray89), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray89), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\u82f1\u8a9e\u30a2EN_US             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2en_us             " + "'", str1, "\u82f1\u8a9e\u30a2en_us             ");
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, (int) (short) 100);
        int[] intArray16 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray16, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray16);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray16, (int) (short) 100);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray16);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray22);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray22);
        int[] intArray30 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray30, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray30);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray30, (int) (short) 100);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray30);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.add(intArray30, 5);
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.clone(intArray38);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray39);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray5, 250);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[10, 32, 10, 5, 1]");
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2\u8a9e\u82f1 1", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale7);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = locale9.toLanguageTag();
        java.util.Locale locale11 = java.util.Locale.US;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale9.getDisplayCountry(locale12);
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Locale locale16 = java.util.Locale.US;
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale17.getLanguage();
        java.lang.String str19 = locale15.getDisplayScript(locale17);
        java.lang.String str20 = locale9.getDisplayName(locale15);
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str22 = locale15.getDisplayName(locale21);
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.util.Locale locale24 = java.util.Locale.US;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.lang.String str26 = locale25.toLanguageTag();
        java.lang.String str27 = locale23.getDisplayScript(locale25);
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        java.lang.String str30 = locale25.getDisplayCountry(locale29);
        java.lang.String str31 = locale15.getDisplayName(locale29);
        java.util.Locale.Builder builder32 = builder5.setLocale(locale15);
        java.util.Locale.Builder builder34 = builder32.setRegion("FR");
        java.util.Locale.Builder builder36 = builder34.setRegion("");
        java.util.Locale.Builder builder38 = builder34.setVariant("Giappone");
        java.util.Locale.Builder builder39 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder40 = builder39.clearExtensions();
        java.util.Locale.Builder builder41 = builder39.clearExtensions();
        java.util.Locale.Builder builder42 = builder39.clear();
        java.util.Locale.Builder builder43 = builder39.clear();
        java.util.Locale.Builder builder44 = builder39.clear();
        java.util.Locale locale45 = builder39.build();
        java.util.Locale.Builder builder46 = builder38.setLocale(locale45);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder48 = builder46.addUnicodeLocaleAttribute("en-CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-US" + "'", str10, "en-US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "United States" + "'", str14, "United States");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en" + "'", str18, "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "anglais (Etats-Unis)" + "'", str20, "anglais (Etats-Unis)");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str22, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en-US" + "'", str26, "en-US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "United States" + "'", str30, "United States");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "French (France)" + "'", str31, "French (France)");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[] shortArray1 = new java.lang.Short[] {};
        java.lang.Short[] shortArray2 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray3 = new java.lang.Short[][] { shortArray0, shortArray1, shortArray2 };
        java.lang.Short[][] shortArray4 = org.apache.commons.lang3.ArrayUtils.clone(shortArray3);
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) 0 };
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray6, (java.lang.Object) (byte) 10);
        java.lang.Short[][] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, shortArray6);
        java.lang.Short[][] shortArray12 = org.apache.commons.lang3.ArrayUtils.toArray(shortArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray12, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510", 250, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("coreano");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "coreano" + "'", str1, "coreano");
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)_COREANO", "COREANO");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)_" + "'", str2, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)_");
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("th Korea", 250, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        float[] floatArray0 = null;
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, (float) (byte) 0);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        float[] floatArray10 = new float[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray10);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray12);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray9, floatArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray12);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray12);
        float[] floatArray18 = null;
        java.lang.Float[] floatArray24 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray24, (float) (byte) 0);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray26);
        float[] floatArray28 = new float[] {};
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray28);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray28);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray30);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray27, floatArray30);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray30, (float) 1);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray30, (float) '4');
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray30, (float) 2);
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray18, floatArray30);
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray30);
        java.lang.Float[] floatArray46 = new java.lang.Float[] { 1.0f, 10.0f, 100.0f, 1.0f, 100.0f };
        float[] floatArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray46);
        float[] floatArray49 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray46, 0.0f);
        float[] floatArray51 = org.apache.commons.lang3.ArrayUtils.remove(floatArray49, (int) (byte) 1);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray40, floatArray51);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("TRUETRUEFALSE", "tru#tru#fal");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ed", 87, "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...ed" + "'", str3, "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...ed");
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setUnicodeLocaleKeyword("KOR", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)_");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: KOR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
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
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.util.Locale locale19 = locale18.stripExtensions();
        java.util.Locale locale21 = new java.util.Locale("Italian");
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str23 = locale21.getDisplayName(locale22);
        java.lang.String str24 = locale18.getDisplayLanguage(locale22);
        java.lang.String str25 = locale22.getDisplayVariant();
        java.lang.String str26 = locale15.getDisplayVariant(locale22);
        java.lang.Object obj27 = locale15.clone();
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
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale21.toString(), "italian");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "italian" + "'", str23, "italian");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u6587" + "'", str24, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "ko_KR");
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                ENG                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) (byte) 0);
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray8, (float) 42);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray8, (float) (byte) -1);
        java.lang.Float[] floatArray18 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray18, (float) (byte) 0);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray20);
        float[] floatArray22 = new float[] {};
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray22);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray22);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray24);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray21, floatArray24);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray24, (float) 1);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray24);
        java.lang.Float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray29);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray29, floatArray31);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray29, (float) 42, 100);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) 1);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray0, 'x');
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
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
        java.util.Locale locale37 = builder34.build();
        java.util.Locale.Builder builder38 = builder34.clearExtensions();
        java.util.Locale.Builder builder39 = builder38.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder42 = builder39.setExtension('x', "                                   English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value:                                    English [at index 0]");
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
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("10.0", "                                                                         {fulse,fulse,fulse,fulse,tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0" + "'", str2, "10.0");
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("444444444444444italie4444444444444444", 31, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44" + "'", str3, "44");
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0_{FALSE,FALSE,FALSE,FALSE,TRU_truetruefalse");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0_{false,false,false,false,tru_TRUETRUEFALSE" + "'", str1, "0_{false,false,false,false,tru_TRUETRUEFALSE");
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        int[] intArray0 = null;
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray2);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, 35, (int) (short) 10);
        int[] intArray10 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray10);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.subarray(intArray10, (int) (short) 0, (int) (byte) 0);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray10, (int) ' ');
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray10);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, (int) 'u', (int) 'u');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray0, intArray10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 35, 0, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category1, locale2);
        java.util.Locale locale4 = java.util.Locale.getDefault(category1);
        java.util.Locale locale5 = java.util.Locale.US;
        java.lang.String str6 = locale5.toLanguageTag();
        java.lang.String str7 = locale5.getScript();
        java.util.Locale.setDefault(category1, locale5);
        java.lang.String str9 = locale0.getDisplayLanguage(locale5);
        java.lang.Object obj10 = locale5.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-US" + "'", str6, "en-US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Korean" + "'", str9, "Korean");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "en_US");
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (byte) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, 2);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = org.apache.commons.lang3.ArrayUtils.remove(intArray10, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 98, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str1, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
        float[] floatArray3 = new float[] { 100, (byte) -1, (-1) };
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) (byte) 1, 100);
        java.lang.Float[] floatArray14 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray14, (float) (byte) 0);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray16);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (int) (short) 0, (float) 0);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray17, (float) (short) 100, (int) (byte) 0);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray3, floatArray17);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray17, (float) (short) -1);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray17, (float) 100L);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray28);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "   Etats-Unis    ", "9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("eTATS-uNIS", "aa_aa", 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{0}", "aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa", (int) (short) -1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("anglais (Etats-Unis)", "anglais (Etats-Unis)");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("Japanese (Japan)", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Japanese (Japan)" + "'", str12, "Japanese (Japan)");
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ko-KRko-KRko-KR");
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale2.getDisplayCountry(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("en-US", locale4);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder11 = builder7.clear();
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale12.getISO3Country();
        java.util.Locale.Builder builder14 = builder11.setLocale(locale12);
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = builder14.build();
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = locale4.getDisplayCountry(locale16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.upperCase("", locale16);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-US" + "'", str3, "en-US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u7f8e\u56fd" + "'", str5, "\u7f8e\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EN-US" + "'", str6, "EN-US");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "KOR" + "'", str13, "KOR");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\uc911\uad6d" + "'", str18, "\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0)32)10)5)1)5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0)32)10)5)1)5" + "'", str1, "0)32)10)5)1)5");
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        char[] charArray16 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray16, 'a', (int) (short) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray16, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray23);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.add(charArray23, 'a');
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray27);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray27, 'a');
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray30);
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
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4 a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4 a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4,  , a, 4, a]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " 4 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " 4 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , 4,  , 4, a]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray8, (int) (byte) 1, (-1));
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray8, 47);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 5, 10, 32, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 5, 10, 32, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("u...", "1}eurt,esl1}eurt,esl1}eurt,esl1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u65e5\u6587\u65e5\u5927\u5229\u6587", "10.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444FRANCE", "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2e_", 43);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        char[] charArray16 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray16, 'a', (int) (short) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray16, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray23);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.add(charArray23, 'a');
        java.lang.String[] strArray31 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxItalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "\u6cd5\u6587                                                 ", 221);
        java.lang.Class<?> wildcardClass32 = strArray31.getClass();
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray27, (java.lang.Object) wildcardClass32);
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3, true);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray3);
        java.lang.Boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray12, 213);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 213, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, false]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "truetruefalse" + "'", str9, "truetruefalse");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, false]");
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = locale9.toLanguageTag();
        java.util.Locale locale11 = java.util.Locale.US;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale9.getDisplayCountry(locale12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("\u4e2d\u56fd", locale9);
        java.util.Locale.Builder builder16 = builder0.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setLanguageTag("zh_TWzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNz");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: zh_TWzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNz [at index 0]");
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-US" + "'", str10, "en-US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "United States" + "'", str14, "United States");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd" + "'", str15, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("FR_FR", "  {FALSE,FALSE,FALSE,FALSE,TRUE}  ", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray6, (java.lang.Object) builder10, 4);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, 'a');
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("}eurt,esla", charArray14);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.subarray(charArray14, (int) '4', 48);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray18);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[u,  , u, u, u]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize(charSequence0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        float[] floatArray4 = new float[] {};
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        float[] floatArray8 = new float[] {};
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray8);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray8);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray4, floatArray8);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (byte) 100);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.clone(floatArray4);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray4, (float) 'u');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray3, floatArray18);
        float[] floatArray20 = new float[] {};
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray20);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray20);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray22);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray23);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.clone(floatArray23);
        float[] floatArray32 = new float[] { (byte) 10, 0, 100L, ' ', (byte) -1, (short) 0 };
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray32);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray23, floatArray32);
        java.lang.Float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray23);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) floatArray35);
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray35);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray3, floatArray37);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[100.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-UANGLAIS(ETATS-UNIS)                                                                                                  EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
        short[] shortArray1 = new short[] { (short) 10 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) 10, 35);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.add(shortArray1, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray1, (short) (byte) 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray1, (short) 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) -1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray1);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.add(shortArray1, 0, (short) 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) 10);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) 0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 10]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray2, (byte) 10, (int) (short) -1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, 16, (int) (byte) 100);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.add(byteArray10, (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray10, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    ", "UNITED ST");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ne", "aitalianaa");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("a", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("zh-cn", (int) 'u', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "German (Germany");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA", "Taiwan", "1United States0United States-1");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.subarray(longArray15, (int) (byte) 100, 0);
        long[] longArray20 = new long[] { 'a' };
        long[] longArray27 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.addAll(longArray20, longArray27);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray28, (long) '4');
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray15, longArray30);
        long[] longArray36 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray36, 0L);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray38, (long) (byte) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray38);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray38, (long) (short) 10, 100);
        long[] longArray45 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray38);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray38);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray38);
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray38);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.contains(longArray38, (long) 5);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
        java.util.Locale locale2 = java.util.Locale.JAPAN;
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = locale2.getLanguage();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale2.getDisplayCountry(locale5);
        boolean boolean8 = locale5.hasExtensions();
        java.lang.String str9 = locale1.getDisplayScript(locale5);
        java.lang.String str10 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Japanese (Japan)" + "'", str3, "Japanese (Japan)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ja" + "'", str4, "ja");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Giappone" + "'", str7, "Giappone");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "NG", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("italien (Italie)", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ital..." + "'", str2, "ital...");
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray4 = new float[] {};
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray0, floatArray4);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (int) (short) 0, (float) (byte) 100);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) 21);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) 6);
        float[] floatArray17 = new float[] {};
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray17);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, 1.0f);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.clone(floatArray17);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray0, floatArray22);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (int) (short) 0, (float) '4');
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[100.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[21.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[52.0]");
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        long[] longArray17 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray17, 0L);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray19, (long) 3, (int) '#');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray8, longArray19);
        java.lang.Long[] longArray24 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray8);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray8, 1L, 29);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray8, 98, (long) 743);
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
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) 0);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0, 0]");
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2\u8a9e\u82f1", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("cor\351en", "                                                eng                                                 ", "Italian (Italy)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cor\351en" + "'", str3, "cor\351en");
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
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
        boolean boolean76 = objMap15.isEmpty();
        java.util.Collection<java.lang.Object> objCollection77 = objMap15.values();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "en_US");
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(objCollection77);
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 48, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ital...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ital..." + "'", str2, "ital...");
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray4, 213, (int) 'x');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray4);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray4, (byte) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("{fulse,fulse,fulse,fulse,tr", "{FPFPFPFPNPJ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
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
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray26, (long) 'a');
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray26, (long) 21);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray30);
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
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        float[] floatArray4 = new float[] {};
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray4);
        float[] floatArray8 = new float[] {};
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray8);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray8);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray4, floatArray8);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (byte) 100);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.clone(floatArray4);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray4, (float) 'u');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray3, floatArray18);
        float[] floatArray20 = null;
        float[] floatArray21 = new float[] {};
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray21);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray24 = new float[] {};
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray24);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray24);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray26);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray26, (float) (short) 0, (int) (byte) 10);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray23, floatArray26);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.clone(floatArray31);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, (float) (-1));
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray31);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray18, floatArray31);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray18, (float) 48);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[100.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', '#', ' ', 'u', ' ' };
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) charArray7);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, 'a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " u #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " u #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , u,  , #, 4]");
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u4e2d\u4e2d\u4e2d\u4e2d\u4e2d", "{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" trutrufals  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " trutrufals  " + "'", str2, " trutrufals  ");
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\u30c9\u30a4\u30c4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, 1.0d, (double) 35);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) (byte) 100, (int) 'u', (double) 3);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) (short) 0, (double) 100);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray4);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray4, (int) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ANGLAIS(ETATS-UNIS)                                                                                                  ", (java.lang.CharSequence) "false");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 117 + "'", int2 == 117);
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
        short[] shortArray0 = null;
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) 0 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) (byte) 1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(shortArray4, (short) (byte) 100);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray4);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray4);
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
        java.lang.Short[] shortArray33 = new java.lang.Short[] { (short) 0 };
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray33, (short) (byte) 1);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.contains(shortArray35, (short) 0);
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray35, (short) -1);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray31, shortArray39);
        short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray31);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) shortArray31, (java.lang.Object) 12);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray0, shortArray31);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0]");
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
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 213);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("}eur", "1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-ecnarf", "italiano");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category3, locale4);
        java.lang.String str7 = locale4.getExtension('a');
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.lang.String str12 = locale10.getScript();
        java.util.Locale locale13 = java.util.Locale.US;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale14.toLanguageTag();
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale14.getDisplayName(locale16);
        java.lang.String str18 = locale10.getDisplayLanguage(locale14);
        java.util.Locale.setDefault(category0, locale14);
        java.util.Locale.Category[] categoryArray20 = new java.util.Locale.Category[] { category0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(categoryArray20);
        java.lang.Class<?> wildcardClass22 = categoryArray20.getClass();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en-US" + "'", str15, "en-US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str17, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chinese" + "'", str18, "Chinese");
        org.junit.Assert.assertNotNull(categoryArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "ja_J", 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Deutsch (Deutschland)", 28, 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Deutsch (Deutschland)" + "'", str3, "Deutsch (Deutschland)");
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        java.lang.Integer[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 48);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("{fPfPfPfPNPJ{fPfPfPfPNPJ{fPfPfPfPNPJ", "truetruefalsetruetruefalsetruetruefalsetruetruefalsetruetChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                               en_US", "ital...", "                                        aj");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale.Builder builder7 = builder4.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setScript("\u6cd510)32)10)5)1)5");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?10)32)10)5)1)5 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) (short) 10);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
        java.util.Locale locale3 = new java.util.Locale("44444444444444444444444444444444444444444444444444ITALIEN (ITALIE)444444444444444444444444444444444444444444444444444", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "French");
        org.junit.Assert.assertEquals(locale3.toString(), "44444444444444444444444444444444444444444444444444italien (italie)444444444444444444444444444444444444444444444444444_UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU_French");
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "chinois (Chine", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setRegion("{false,..");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: {false,.. [at index 0]");
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
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, true, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1, (long) 2);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray6 = org.apache.commons.lang3.ArrayUtils.remove(longArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList54, strMap73);
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
        org.junit.Assert.assertNotNull(languageRangeList74);
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("h", 250, 98);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = builder0.build();
        boolean boolean7 = locale6.hasExtensions();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\uc601\uc5b4\ubbf8\uad6d)", "{uuu", 98);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) (byte) 0);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray9 = new float[] {};
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray9);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray11);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray11, (float) 1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray11);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray11, (float) 48);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.add(floatArray18, (float) 9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[9.0]");
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
        float[] floatArray3 = new float[] { 100, (byte) -1, (-1) };
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) 35, 42);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (int) 'u', (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 117, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        java.lang.Short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray1);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) 0 };
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) 1);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray8);
        java.lang.Short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray8);
        java.lang.Short[] shortArray12 = new java.lang.Short[] { (short) 0 };
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray12, (short) (byte) 1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray8, shortArray14);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.add(shortArray8, (short) (byte) -1);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray17, (short) (byte) 100);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.clone(shortArray17);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray20);
        java.lang.Short[] shortArray23 = new java.lang.Short[] { (short) 0 };
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray23, (short) (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray25);
        java.lang.Short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray25);
        java.lang.Short[] shortArray29 = new java.lang.Short[] { (short) 0 };
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray29, (short) (byte) 1);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray25, shortArray31);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.add(shortArray25, (short) (byte) -1);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray34, (short) (byte) 100);
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.clone(shortArray34);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray34, (short) (byte) 0);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray34, (short) (byte) 10, 3);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray34);
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray20, shortArray34);
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray44);
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray3, (short) (byte) 10, 8);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0]");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[0, -1, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[0, -1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList19);
        java.lang.Iterable[] iterableArray23 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray24 = (java.lang.Iterable<java.lang.String>[]) iterableArray23;
        strIterableArray24[0] = strList8;
        strIterableArray24[1] = strList21;
        java.lang.Short[] shortArray30 = new java.lang.Short[] { (short) 0 };
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray30, (short) (byte) 1);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray30, (java.lang.Object) (byte) 10);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray30);
        java.lang.Iterable<java.lang.String>[] strIterableArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(strIterableArray24, (java.lang.Object) shortArray30);
        boolean[] booleanArray42 = new boolean[] { false, false, false, false, true };
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray42);
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray42, (int) (byte) -1, (int) '#');
        java.lang.String str47 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray42);
        boolean[] booleanArray53 = new boolean[] { false, false, false, false, true };
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray53);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray53, true);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.add(booleanArray53, (int) (short) 0, false);
        boolean[] booleanArray60 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray42, booleanArray53);
        int int62 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strIterableArray36, (java.lang.Object) booleanArray42, (int) (byte) 10);
        boolean[] booleanArray64 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray42, false);
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray64, false, 250);
        boolean[] booleanArray70 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray64, 87, 12);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(iterableArray23);
        org.junit.Assert.assertNotNull(strIterableArray24);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0]");
        org.junit.Assert.assertNotNull(strIterableArray36);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "{false,false,false,false,true}" + "'", str47, "{false,false,false,false,true}");
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray53), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray60), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(booleanArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray64), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(booleanArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray70), "[]");
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("italianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitaliano", "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitaliano" + "'", str2, "italianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitaliano");
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\u4e2d\u6587\u53f0\u7063)it_it", 0, 756);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587\u53f0\u7063)it_it" + "'", str3, "\u4e2d\u6587\u53f0\u7063)it_it");
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 10);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.remove(shortArray7, 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray9, (short) 10, 9);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[0]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray5, (int) '#');
        int[] intArray12 = new int[] {};
        int[] intArray16 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray16);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.add(intArray16, 0, 4);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.addAll(intArray12, intArray16);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.subarray(intArray12, 0, (int) '4');
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray12);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray12);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 10, 5, 1, 35]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 32, 10, 5, 1]");
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("th Korea");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "th Kore" + "'", str1, "th Kore");
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-UANGLAIS(ETATS-UNIS)                                                                                                  EN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-USEN-US");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) 7);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.remove(floatArray2, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 34, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Englisch", (java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuUED");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1" + "'", str1, "                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1");
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ANGLAIS (eTATS-uN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxitalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        java.lang.Character[] charArray5 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray5, (java.lang.Object) builder9, 4);
        java.util.Locale locale12 = builder9.build();
        java.util.Locale locale13 = builder9.build();
        java.util.Locale.Builder builder14 = builder9.clearExtensions();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.setExtension('a', "italianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitaliano");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: italianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitaliano [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "{FALSE,...##########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 0L);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray4, "USA", 9, 0);
        java.util.Locale locale11 = java.util.Locale.US;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale11.getDisplayCountry();
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleKeys();
        java.lang.String str16 = locale11.getDisplayScript(locale14);
        java.util.Locale locale17 = locale11.stripExtensions();
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray4, (java.lang.Object) locale17);
        java.lang.String str19 = locale17.toLanguageTag();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "United States" + "'", str13, "United States");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en-US" + "'", str19, "en-US");
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("{S}", 32, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              {S}               " + "'", str3, "              {S}               ");
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("[ , hi!, en-us,  ]   jpnpfpfpfpf{        []");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ , hi!, en-us,  ]   jpnpfpfpfpf{        []" + "'", str1, "[ , hi!, en-us,  ]   jpnpfpfpfpf{        []");
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
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
        float[] floatArray22 = new float[] { (byte) 10, 0, 100L, ' ', (byte) -1, (short) 0 };
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray22);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray22, (float) 10, (int) (short) 10);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.clone(floatArray22);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray22, 42, 0);
        boolean boolean31 = objMap15.equals((java.lang.Object) 0);
        objMap15.clear();
        java.util.Set<java.lang.Object> objSet33 = objMap15.keySet();
        java.lang.Short[] shortArray35 = new java.lang.Short[] { (short) 0 };
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray35, (short) (byte) 1);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray37);
        java.lang.Short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray37);
        java.lang.Short[] shortArray41 = new java.lang.Short[] { (short) 0 };
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray41, (short) (byte) 1);
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray37, shortArray43);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.add(shortArray37, (short) (byte) -1);
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray46, (short) (byte) 100);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.contains(shortArray48, (short) (byte) 10);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray48, (short) 0, 1);
        boolean boolean54 = objMap15.containsValue((java.lang.Object) (short) 0);
        java.util.Map<java.lang.Object, java.lang.Object> objMap55 = null;
        // The following exception was thrown during execution in test generation
        try {
            objMap15.putAll(objMap55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objSet33);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[0]");
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[0, -1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray8, (long) (byte) -1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray8);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.remove(longArray8, 3);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray20, (long) (byte) 100);
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
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[10, 10, 35, 35, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        java.lang.Short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray1);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) 0 };
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) 1);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray8);
        java.lang.Short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray8);
        java.lang.Short[] shortArray12 = new java.lang.Short[] { (short) 0 };
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray12, (short) (byte) 1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray8, shortArray14);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.add(shortArray8, (short) (byte) -1);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray17, (short) (byte) 100);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.clone(shortArray17);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray20);
        java.lang.Short[] shortArray23 = new java.lang.Short[] { (short) 0 };
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray23, (short) (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray25);
        java.lang.Short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray25);
        java.lang.Short[] shortArray29 = new java.lang.Short[] { (short) 0 };
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray29, (short) (byte) 1);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray25, shortArray31);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.add(shortArray25, (short) (byte) -1);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray34, (short) (byte) 100);
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.clone(shortArray34);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray34, (short) (byte) 0);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray34, (short) (byte) 10, 3);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray34);
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray20, shortArray34);
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray44);
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.remove(shortArray45, (int) (short) 0);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray45, 35, (int) '#');
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0]");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[0, -1, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[0, -1, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[-1, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[]");
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag(" trutrufals  ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("tRUETRUEFALSE", "SouthKorea", "}eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tRUETRUEFALSE" + "'", str3, "tRUETRUEFALSE");
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf", "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf" + "'", str2, "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf");
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
        short[] shortArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray0, (short) 1, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (byte) 10, 3);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 'x', (-1), (double) (byte) 10);
        double[] doubleArray17 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray17, (double) (short) -1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray19, (double) (short) 1, 100.0d);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) (-1L), 42);
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray19);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray26);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
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
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) byteArray16);
        java.lang.Byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray16);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray33, (byte) 10, (int) '#');
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.add(byteArray39, (byte) -1);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray33, byteArray39);
        java.lang.Byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray39);
        java.lang.Byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray39);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray51, (byte) 10, (int) '#');
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray59 = org.apache.commons.lang3.ArrayUtils.add(byteArray57, (byte) -1);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray51, byteArray57);
        java.lang.Byte[] byteArray61 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray57);
        java.lang.Byte[] byteArray62 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray57);
        byte[] byteArray63 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray39, byteArray57);
        byte[] byteArray65 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray39, (byte) 100);
        byte[] byteArray66 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray26, byteArray65);
        byte[] byteArray68 = org.apache.commons.lang3.ArrayUtils.add(byteArray26, (byte) -1);
        byte[] byteArray71 = org.apache.commons.lang3.ArrayUtils.add(byteArray68, 3, (byte) 0);
        int int74 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray68, (byte) 10, 7);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5 + "'", int54 == 5);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[1, 0, -1, 0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("DEU", "{false,false,false,false,tra", 95);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("ng", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{false,false,false,false,true}", '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray10);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0a-1", strArray10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, 'u');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("Jxpxn", strArray5, strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{false,false,false,false,true}" + "'", str11, "{false,false,false,false,true}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{false,false,false,false,true}" + "'", str15, "{false,false,false,false,true}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Jxpxn" + "'", str16, "Jxpxn");
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en..." + "'", str1, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en...");
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
        java.util.Locale locale1 = new java.util.Locale("tru4tru4fals");
        java.util.Locale locale4 = java.util.Locale.US;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("", locale4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("  {fPfPfPfPNPJ   ", locale4);
        java.util.Locale locale8 = java.util.Locale.JAPAN;
        java.lang.String str9 = locale8.getDisplayName();
        java.lang.String str10 = locale8.getISO3Language();
        java.lang.String str11 = locale4.getDisplayCountry(locale8);
        java.util.Locale locale12 = java.util.Locale.US;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.lang.String str14 = locale12.getDisplayCountry();
        java.util.Locale locale15 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        java.lang.String str17 = locale12.getDisplayScript(locale15);
        java.util.Locale locale18 = locale12.stripExtensions();
        java.lang.String str19 = locale18.getISO3Language();
        java.lang.String str20 = locale8.getDisplayScript(locale18);
        java.lang.String str21 = locale1.getDisplayLanguage(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = locale1.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "tru4tru4fals");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "  {FPFPFPFPNPJ   " + "'", str7, "  {FPFPFPFPNPJ   ");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Japanese (Japan)" + "'", str9, "Japanese (Japan)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "jpn" + "'", str10, "jpn");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd" + "'", str11, "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "United States" + "'", str14, "United States");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "eng" + "'", str19, "eng");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "tru4tru4fals" + "'", str21, "tru4tru4fals");
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, ' ');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("ja_", "  {FPFPFPFPNPJ   ", 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_" + "'", str3, "ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_");
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ANGLAIS (ETATS-UNIS)", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ANGLAIS (ETATS-UNIS)" + "'", str2, "ANGLAIS (ETATS-UNIS)");
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("{0}", "44444444444444444444444444France", 7);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("und", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = new float[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray5, (float) (short) 0, (int) (byte) 10);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray5);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.clone(floatArray10);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) (-1));
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray13);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.remove(floatArray13, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("{97,1,10,10,35,-1,35,-1}", "\u30a2\u30e1", "en_GB", 221);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{97,1,10,10,35,-1,35,-1}" + "'", str4, "{97,1,10,10,35,-1,35,-1}");
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
        long[] longArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\u30c9\u30a4\u30c4", "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\u52a0\u62ff\u5927", (java.lang.CharSequence) "CNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray0);
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray5);
        java.lang.Short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray5);
        java.lang.Short[] shortArray9 = new java.lang.Short[] { (short) 0 };
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray9, (short) (byte) 1);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray11);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.add(shortArray5, (short) (byte) -1);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray14, (short) (byte) 100);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray16, (short) 10);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(shortArray16, (short) 0);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(shortArray16, (short) (byte) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray0, (java.lang.Object) boolean22, 28);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) (byte) 0);
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray8, (float) 42);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray8, (float) (byte) -1);
        java.lang.Float[] floatArray18 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray18, (float) (byte) 0);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray20);
        float[] floatArray22 = new float[] {};
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray22);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray22);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray24);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray21, floatArray24);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray24, (float) 1);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray24);
        java.lang.Float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray30);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray30);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray32);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray32, (float) 7);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray29, floatArray32);
        java.lang.String str38 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) floatArray36, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXITALYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{0.0,100.0,0.0,1.0,1.0}" + "'", str38, "{0.0,100.0,0.0,1.0,1.0}");
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        java.lang.Boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, false);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) ' ', (java.lang.Object) booleanArray5);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, true);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray11, false);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("tRUETRUEFALSE", "0a-1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ngngngngngngngngngngngngngngn", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "en_GB", (java.lang.CharSequence) "444444444444444444444italien (Italie)44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) 0);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.clone(byteArray12);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray20, 8, (int) (short) 100);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray23, (byte) 0, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        java.util.Locale locale1 = new java.util.Locale("Italian");
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian" + "'", str3, "italian");
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, (int) (short) 100);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.add(intArray5, 5);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray13, 4, (int) (short) 1);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.remove(intArray13, 0);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(intArray18, 2);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray18, 0, 8);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray18);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 10, 5, 1, 5]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "koEN-US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        java.util.Locale locale2 = new java.util.Locale("[]", "France");
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList14);
        java.util.Locale.FilteringMode filteringMode17 = null;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList14, filteringMode17);
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.Locale locale22 = new java.util.Locale("Italian");
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.util.Locale locale25 = java.util.Locale.US;
        java.lang.String str26 = locale25.toLanguageTag();
        java.util.Locale locale27 = java.util.Locale.ITALY;
        java.util.Locale locale28 = java.util.Locale.US;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = locale29.toLanguageTag();
        java.lang.String str31 = locale27.getDisplayScript(locale29);
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Locale locale33 = java.util.Locale.ITALY;
        java.util.Locale locale34 = java.util.Locale.US;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale35.toLanguageTag();
        java.lang.String str37 = locale33.getDisplayScript(locale35);
        java.lang.String str38 = locale33.getDisplayLanguage();
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.util.Locale locale40 = java.util.Locale.US;
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale41.toLanguageTag();
        java.lang.String str43 = locale39.getDisplayScript(locale41);
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale19, locale22, locale23, locale24, locale25, locale27, locale32, locale33, locale41 };
        java.util.ArrayList<java.util.Locale> localeList45 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList45, localeArray44);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList45, filteringMode47);
        java.util.Locale locale49 = java.util.Locale.US;
        java.lang.String str50 = locale49.toLanguageTag();
        java.lang.String str51 = locale49.getScript();
        java.util.Locale[] localeArray52 = new java.util.Locale[] { locale49 };
        java.util.ArrayList<java.util.Locale> localeList53 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList53, localeArray52);
        java.util.Locale locale55 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList53);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap56 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList57 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap56);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList57, strMap58);
        boolean boolean60 = locale2.equals((java.lang.Object) languageRangeList57);
        org.junit.Assert.assertEquals(locale2.toString(), "[]_FRANCE");
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals(locale22.toString(), "italian");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en-US" + "'", str26, "en-US");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en-US" + "'", str30, "en-US");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "en-US" + "'", str36, "en-US");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Italian" + "'", str38, "Italian");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "en-US" + "'", str42, "en-US");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(localeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode47.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "en-US" + "'", str50, "en-US");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(localeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(locale55);
        org.junit.Assert.assertNotNull(languageRangeList57);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList19);
        java.lang.Iterable[] iterableArray23 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray24 = (java.lang.Iterable<java.lang.String>[]) iterableArray23;
        strIterableArray24[0] = strList8;
        strIterableArray24[1] = strList21;
        java.lang.Short[] shortArray30 = new java.lang.Short[] { (short) 0 };
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray30, (short) (byte) 1);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray30, (java.lang.Object) (byte) 10);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray30);
        java.lang.Iterable<java.lang.String>[] strIterableArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(strIterableArray24, (java.lang.Object) shortArray30);
        long[] longArray38 = new long[] { 'a' };
        long[] longArray45 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.addAll(longArray38, longArray45);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray45, (long) 5, (int) ' ');
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.add(longArray45, (long) (byte) -1);
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.clone(longArray45);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray45);
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.clone(longArray45);
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.clone(longArray45);
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.remove(longArray45, 3);
        int int60 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray57, 1L, (int) '4');
        int int62 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strIterableArray36, (java.lang.Object) 1L, 213);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(iterableArray23);
        org.junit.Assert.assertNotNull(strIterableArray24);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0]");
        org.junit.Assert.assertNotNull(strIterableArray36);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[10, 10, 35, -1, 35, -1, -1]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[10, 10, 35, 35, -1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("TR#TR#FALS                                    ", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         " + "'", str2, "         ");
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("   ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("  0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str1, "0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray6, true);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray8);
        boolean[] booleanArray15 = new boolean[] { false, false, false, false, true };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray15, true);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.add(booleanArray15, (int) (short) 0, false);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.add(booleanArray21, true);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray8, booleanArray23);
        java.lang.Boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray23);
        java.lang.Boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[true, false, false, false, false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray26);
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true" + "'", str1, "true");
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("{0.0,100.0,0.0,1.0,1.0}", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "SouthKorea");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("{false,false,false,false,true", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Canada", strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("10 32 10 5 1", "   JPNPfPfPfPf{        ", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "{FALSE,FALSE,FALSE,FALSE,TRU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) (short) 0);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray3, (java.lang.Object) doubleArray13, 4);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray13);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.add(doubleArray13, (double) (byte) 100);
        java.lang.Double[] doubleArray22 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray22, (double) (byte) -1);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray22);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray25, (int) (short) 1);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray19, doubleArray25);
        double[] doubleArray29 = new double[] {};
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray29, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray33 = null;
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray29, doubleArray33);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray29);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray29, (double) 10.0f, (double) (-1));
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray29);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray39, (double) (-1));
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray25, doubleArray39);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0, 100.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 1.0]");
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale0.getUnicodeLocaleType("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2e_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??(?e_US??(?e_US??(?e_US??(?e_US??(?e_US??(?e_US??(?e_US??(?e_US??(?e_US??(?e_");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" italien (Italie)hi!italien (Italie)en-USitalien (Italie) ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " italien (Italie)hi!italien (Italie)en-USitalien (Italie) " + "'", str1, " italien (Italie)hi!italien (Italie)en-USitalien (Italie) ");
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("jpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpn", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpn" + "'", str2, "jpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpnjpn");
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx" + "'", str1, "xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx");
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.removeUnicodeLocaleAttribute("italiano (Italia)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: italiano (Italia) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                hi!                                                 ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        float[] floatArray12 = new float[] { (byte) 10, 0, 100L, ' ', (byte) -1, (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray3, floatArray12);
        java.lang.Float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.remove(floatArray3, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 15, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatArray15);
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 6, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str2, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\u4e2d\u56fd", "italian");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 0L);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray6, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, 5, (float) 4);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, 743, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 743, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[1.0, -1.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[1.0, -1.0, 0.0, 0.0, 0.0, 4.0]");
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray7, (java.lang.Object) builder11, 4);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, 'a');
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "italie", charArray15);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.add(charArray15, 'x');
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hsilgnE                                   ", charArray18);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[u,  , u, u, u]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "u uuux");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "u uuux");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[u,  , u, u, u, x]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 10.0f };
        java.lang.Float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray2, (float) (byte) 10);
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray2);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray2, (float) 'x');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        boolean[] booleanArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray0, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Class<?>[] wildcardClassArray2 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray2);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) doubleArray1, (java.lang.Object) str3);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1, (double) 35);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        java.lang.Short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray3, (short) 10, 8);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\u65e5\u672c\u8a9e\u65e5\u672c)", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u672c\u8a9e\u65e5\u672c)" + "'", str2, "\u65e5\u672c\u8a9e\u65e5\u672c)");
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (byte) 0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) ' ');
        int[] intArray10 = null;
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray3, intArray10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 0, 32]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Giappone               ", "0.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.00.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.01.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.01.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
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
        java.util.Locale.Category category30 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale31 = java.util.Locale.getDefault(category30);
        java.util.Locale.Category category32 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category33 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category34 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale35 = java.util.Locale.getDefault(category34);
        java.util.Locale.Category category36 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale37 = java.util.Locale.getDefault(category36);
        java.util.Locale.Category category38 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale39 = java.util.Locale.getDefault(category38);
        java.util.Locale.Category[] categoryArray40 = new java.util.Locale.Category[] { category30, category32, category33, category34, category36, category38 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray41 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray40);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray44 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray41, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap45 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray44);
        java.util.Locale.Category category46 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale47 = java.util.Locale.getDefault(category46);
        java.util.Locale.Category category48 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category49 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category50 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale51 = java.util.Locale.getDefault(category50);
        java.util.Locale.Category category52 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale53 = java.util.Locale.getDefault(category52);
        java.util.Locale.Category category54 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale55 = java.util.Locale.getDefault(category54);
        java.util.Locale.Category[] categoryArray56 = new java.util.Locale.Category[] { category46, category48, category49, category50, category52, category54 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray57 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray56);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray58 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray56);
        boolean boolean59 = objMap45.containsKey((java.lang.Object) categoryEnumArray58);
        java.util.Locale locale60 = java.util.Locale.UK;
        java.lang.Long[] longArray62 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray63 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray62);
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray63);
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.clone(longArray64);
        boolean boolean66 = objMap45.replace((java.lang.Object) locale60, (java.lang.Object) "}eur", (java.lang.Object) longArray64);
        objMap15.putAll(objMap45);
        java.util.Collection<java.lang.Object> objCollection68 = objMap15.values();
        char[] charArray75 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int78 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray75, 'a', (int) (short) 10);
        int int80 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray75, 'u');
        java.lang.Character[] charArray81 = org.apache.commons.lang3.ArrayUtils.toObject(charArray75);
        char[] charArray82 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray81);
        char[] charArray84 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray81, ' ');
        char[] charArray85 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray81);
        char[] charArray87 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray81, 'x');
        java.lang.Object obj88 = null;
        java.lang.Character[] charArray92 = new java.lang.Character[] { ' ', ' ', 'a' };
        java.lang.Character[] charArray93 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray92);
        char[] charArray95 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray92, '4');
        boolean boolean96 = objMap15.replace((java.lang.Object) 'x', obj88, (java.lang.Object) charArray95);
        objMap15.clear();
        objMap15.clear();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category19.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category24.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(categoryArray26);
        org.junit.Assert.assertNotNull(categoryEnumArray27);
        org.junit.Assert.assertNotNull(categoryEnumArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category30.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category32 + "' != '" + java.util.Locale.Category.FORMAT + "'", category32.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category33.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category34 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category34.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category36.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category38 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category38.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(categoryArray40);
        org.junit.Assert.assertNotNull(categoryEnumArray41);
        org.junit.Assert.assertNotNull(categoryEnumArray44);
        org.junit.Assert.assertNotNull(objMap45);
        org.junit.Assert.assertTrue("'" + category46 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category46.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category48 + "' != '" + java.util.Locale.Category.FORMAT + "'", category48.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category49 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category49.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category50 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category50.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale51);
// flaky:         org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category52 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category52.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category54 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category54.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale55);
// flaky:         org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(categoryArray56);
        org.junit.Assert.assertNotNull(categoryEnumArray57);
        org.junit.Assert.assertNotNull(categoryEnumArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_GB");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objCollection68);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 4 + "'", int78 == 4);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray84), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray84), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray84), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray92);
        org.junit.Assert.assertNotNull(charArray93);
        org.junit.Assert.assertNotNull(charArray95);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray95), "  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray95), "  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray95), "[ ,  , a]");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
        java.lang.Float[] floatArray0 = null;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        org.junit.Assert.assertNull(floatArray1);
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "French (France)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2\u8a9e\u82f1 1", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2\u8a9e\u82f11" + "'", str2, "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2\u8a9e\u82f11");
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("FRA", "Chine");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(longArray4);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray4, (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray9 = org.apache.commons.lang3.ArrayUtils.remove(longArray4, 250);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 250, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[10]");
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("   JPNPfPfPfPf{        ", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   JPNPfPfPfPf{        " + "'", str2, "   JPNPfPfPfPf{        ");
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray5, 0.0f);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray7);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\u56fd\u7f8e", "aaaaaDEaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u56fd\u7f8e" + "'", str2, "\u56fd\u7f8e");
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA", 35, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray3);
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 0 };
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) 1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray9);
        java.lang.Short[] shortArray12 = new java.lang.Short[] { (short) 0 };
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray12, (short) (byte) 1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray14);
        java.lang.Short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray14);
        java.lang.Short[] shortArray18 = new java.lang.Short[] { (short) 0 };
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) (byte) 1);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray14, shortArray20);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray9, shortArray21);
        java.lang.Short[] shortArray24 = new java.lang.Short[] { (short) 0 };
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray24, (short) (byte) 1);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(shortArray26, (short) 0);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray26, (short) -1);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray22, shortArray30);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(shortArray30, (short) 1);
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
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (byte) -1);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 0);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 28);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d, (double) 100L);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("japonais (Japon)", "{false,...##########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "{fnlse,fnlse,fnlse,fnlse,trne", "100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                           CHINOIS");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                           CHINOIS" + "'", str1, "                           CHINOIS");
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "{false,false,false,false,tru");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "k");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("h{0,-1}{0,-1", "japonais (Japon)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Chinese");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0_{FALSE,FALSE,FALSE,FALSE,TRU_truetruefalse", "FRA", "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...ed");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0_{FALSE,FALSE,FALSE,FALSE,TRU_truetruefalse" + "'", str3, "0_{FALSE,FALSE,FALSE,FALSE,TRU_truetruefalse");
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("en", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u6cd510)32)10)5)1)5", "U UU", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse", strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "0");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\u65e5\u6587\u65e5\u672c)0", strArray4, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u65e5\u6587\u65e5\u672c)0" + "'", str11, "\u65e5\u6587\u65e5\u672c)0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("  {false,false,false,false,true}   ");
        java.util.Locale locale7 = new java.util.Locale("0", "{false,false,false,false,tru", "truetruefalse");
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("china", locale7);
        java.lang.String str10 = locale2.getDisplayLanguage(locale7);
        java.lang.String str11 = locale0.getDisplayLanguage(locale2);
        java.lang.String str12 = locale2.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale7.toString(), "0_{FALSE,FALSE,FALSE,FALSE,TRU_truetruefalse");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CHINA" + "'", str9, "CHINA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "German" + "'", str11, "German");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (byte) -1);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, 3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, 32);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (byte) 1, 21);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                hi!                                                 ", 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        boolean[] booleanArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("100.0#-1.0#10.0#1.0#100.0#1.0", 42, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str3, "             100.0#-1.0#10.0#1.0#100.0#1.0");
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      naliait", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("anglais(Etats-Unis)                                                                                                  ", "ARF");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 1.0f, 10.0f, 100.0f, 1.0f, 100.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray9);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray9);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (float) 10);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[1.0, 10.0, 100.0, 1.0, 100.0, 10.0]");
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0_{false,false,false,false,tru_TRUETRUEFALSE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        char[] charArray16 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray16, 'a', (int) (short) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray16, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray23);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.add(charArray23, 'a');
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray27);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray27, 'a');
        char[] charArray37 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray37, 'a', (int) (short) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray37);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray30, charArray37);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray44 = org.apache.commons.lang3.ArrayUtils.remove(charArray37, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4 a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4 a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4,  , a, 4, a]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " 4 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " 4 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , 4,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4a 4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4a 4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4, a,  , 4,  ,  ]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
        char[] charArray8 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a', (int) (short) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, ' ');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray15);
        char[] charArray23 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray23, 'a', (int) (short) 10);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray23, ' ');
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray15, charArray23);
        java.lang.Character[] charArray30 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray30);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray31);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "######{false,false,false,false,true", charArray31);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray31, 'x', 29);
        int int37 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "South Korea", charArray31);
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray8 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray11 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[][] shortArray12 = new java.lang.Short[][] { shortArray2, shortArray5, shortArray8, shortArray11 };
        java.lang.Short[][][] shortArray13 = new java.lang.Short[][][] { shortArray12 };
        int[] intArray14 = new int[] {};
        int[] intArray18 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray18);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.add(intArray18, 0, 4);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.addAll(intArray14, intArray18);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.add(intArray14, 0);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray14, intArray28);
        java.lang.Short[][][] shortArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray13, (java.lang.Object) intArray14);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray14);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shortArray30);
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("en-CA", "\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2en_US" + "'", str2, "\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (byte) -1);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) intArray3, 'x');
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray7, 3);
        java.lang.Integer[] intArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setLanguage("                                          ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                            [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\u6587\u5229\u5927\u610f");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.lang.String str3 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese" + "'", str3, "Chinese");
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
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
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene", "truetruef4lse", (int) '#');
        java.lang.Double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray24);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray26);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) doubleArray25, (java.lang.Object) str27);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray25, (double) 35);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray30, (double) 6, (int) '#');
        java.lang.Object obj34 = objMap15.putIfAbsent((java.lang.Object) strArray23, (java.lang.Object) 6);
        char[] charArray38 = new char[] { ' ', 'a' };
        boolean boolean39 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray38);
        java.lang.Character[] charArray40 = org.apache.commons.lang3.ArrayUtils.toObject(charArray38);
        java.lang.String[] strArray43 = org.apache.commons.lang3.StringUtils.split("en-US", "English");
        java.lang.String[] strArray44 = org.apache.commons.lang3.StringUtils.stripAll(strArray43);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray40, (java.lang.Object) strArray43, (int) 'a');
        java.lang.Character[] charArray47 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray40);
        java.util.Locale locale48 = java.util.Locale.US;
        java.lang.String str49 = locale48.toLanguageTag();
        java.lang.String str50 = locale48.getScript();
        java.lang.String str51 = locale48.getDisplayScript();
        boolean boolean52 = objMap15.remove((java.lang.Object) charArray40, (java.lang.Object) locale48);
        char[] charArray54 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray40, '4');
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "en-US" + "'", str49, "en-US");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[ , a]");
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", (int) 'a', 51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("France");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.util.Locale.Category category11 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = java.util.Locale.getDefault(category11);
        java.util.Locale.Category[] categoryArray13 = new java.util.Locale.Category[] { category3, category5, category6, category7, category9, category11 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray14 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray13);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray17 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray14, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap18 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray17);
        java.lang.Short[] shortArray20 = new java.lang.Short[] { (short) 0 };
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray20, (short) (byte) 1);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray20, (java.lang.Object) (byte) 10);
        java.lang.Short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray20);
        java.lang.Boolean[] booleanArray29 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray29);
        java.lang.Boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray30);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray25, (java.lang.Object) booleanArray30, (int) (byte) 1);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30);
        char[] charArray42 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray42, 'a', (int) (short) 10);
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray42, ' ');
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray42, ' ');
        char[] charArray50 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray49);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray49);
        boolean boolean52 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray49);
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray49, '#', (int) (short) -1);
        char[] charArray58 = org.apache.commons.lang3.ArrayUtils.add(charArray49, 2, 'u');
        java.lang.Object obj59 = objMap18.replace((java.lang.Object) booleanArray30, (java.lang.Object) charArray58);
        float[] floatArray60 = null;
        float[] floatArray61 = new float[] {};
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray61);
        float[] floatArray63 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray61);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray61);
        float[] floatArray65 = new float[] {};
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray65);
        float[] floatArray67 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray65);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray65);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray61, floatArray65);
        float[] floatArray70 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray60, floatArray61);
        java.lang.Float[] floatArray75 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray77 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray75, (float) 0L);
        float[] floatArray79 = org.apache.commons.lang3.ArrayUtils.add(floatArray77, (float) 0L);
        float[] floatArray81 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray77, (float) (short) 10);
        java.lang.Object obj82 = objMap18.replace((java.lang.Object) floatArray60, (java.lang.Object) floatArray77);
        objMap18.clear();
        java.lang.Integer[] intArray84 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray86 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray84, (int) (byte) -1);
        java.lang.Integer[] intArray87 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray84);
        java.lang.Integer[] intArray88 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray87);
        int[] intArray89 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray87);
        int[] intArray91 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray87, 3);
        boolean boolean92 = objMap18.containsKey((java.lang.Object) intArray91);
        boolean boolean93 = locale1.equals((java.lang.Object) boolean92);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category11.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(categoryArray13);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(categoryEnumArray17);
        org.junit.Assert.assertNotNull(objMap18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[true, true, false]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[4, a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "4au 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "4au 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[4, a, u,  , 4,  ]");
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray70), "[]");
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray77), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray79), "[1.0, -1.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray81), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("u uuu", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("true}", "Jxpxn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.add(charArray14, ' ');
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "English (United Kingdom)FALSE,FALSE,FALSE,TRU,truetruefalse)", charArray17);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4 a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4 a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4,  , a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, 1.0d, (double) 35);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 0);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) 100, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Deutsch (Deutschland)", 43, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444Deutsch (Deutschland)44444444444" + "'", str3, "44444444444Deutsch (Deutschland)44444444444");
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.lang.String str10 = locale9.getDisplayVariant();
        java.lang.String str11 = locale9.getDisplayVariant();
        java.lang.String str12 = locale9.getScript();
        java.util.Locale.Builder builder13 = builder8.setLocale(locale9);
        boolean boolean14 = locale9.hasExtensions();
        java.lang.String str15 = locale9.getScript();
        java.util.Locale locale16 = java.util.Locale.US;
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = java.util.Locale.US;
        java.util.Locale locale19 = locale18.stripExtensions();
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.lang.String str21 = locale16.getDisplayCountry(locale19);
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Locale locale23 = java.util.Locale.US;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.lang.String str25 = locale24.getLanguage();
        java.lang.String str26 = locale22.getDisplayScript(locale24);
        java.lang.String str27 = locale16.getDisplayName(locale22);
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str29 = locale22.getDisplayName(locale28);
        java.lang.String str30 = locale22.getVariant();
        java.util.Locale locale31 = locale22.stripExtensions();
        java.lang.String str32 = locale9.getDisplayLanguage(locale31);
        java.util.Locale.Category category33 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category33, locale34);
        java.util.Locale locale36 = java.util.Locale.getDefault(category33);
        java.lang.String str37 = locale9.getDisplayScript(locale36);
        java.util.Locale locale38 = java.util.Locale.JAPAN;
        java.lang.String str39 = locale9.getDisplayLanguage(locale38);
        java.util.Locale.Builder builder40 = builder4.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder42 = builder40.setLanguage("English (United Kingdom)FALSE,FALSE,FALSE,TRU,truetruefalse)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: English (United Kingdom)FALSE,FALSE,FALSE,TRU,truetruefalse) [at index 0]");
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
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-US" + "'", str17, "en-US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "United States" + "'", str21, "United States");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "anglais (Etats-Unis)" + "'", str27, "anglais (Etats-Unis)");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str29, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "chinois" + "'", str32, "chinois");
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.FORMAT + "'", category33.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str39, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510" + "'", str1, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510");
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 756, 221);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("DeutschDeutschDeutschDeutschDeutschDeutschDeutschDeutschDeutsch", "ANGLAIS (eTATS-uN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DeutschDeutschDeutschDeutschDeutschDeutschDeutschDeutschDeutsch" + "'", str2, "DeutschDeutschDeutschDeutschDeutschDeutschDeutschDeutschDeutsch");
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
        char[] charArray0 = null;
        char[] charArray8 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a', (int) (short) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, ' ');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray15);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray15);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray15, '#', (int) (short) -1);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray15, 2, 'u');
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.subarray(charArray15, (int) 'u', 0);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray15);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray15, 'x');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4au 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4au 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a, u,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.subarray(longArray15, (int) (byte) 100, 0);
        long[] longArray20 = new long[] { 'a' };
        long[] longArray27 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.addAll(longArray20, longArray27);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray28, (long) '4');
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray15, longArray30);
        long[] longArray36 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray36, 0L);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray38, (long) 3, (int) '#');
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray38, 0L);
        long[] longArray45 = new long[] { 'a' };
        long[] longArray52 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray45, longArray52);
        long[] longArray56 = org.apache.commons.lang3.ArrayUtils.add(longArray53, (int) (short) 1, (long) (byte) 1);
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.addAll(longArray38, longArray53);
        java.lang.Long[] longArray58 = org.apache.commons.lang3.ArrayUtils.toObject(longArray53);
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray58, (long) (short) 0);
        long[] longArray61 = org.apache.commons.lang3.ArrayUtils.addAll(longArray30, longArray60);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray30);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray64 = org.apache.commons.lang3.ArrayUtils.remove(longArray30, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 87, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[97]");
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[1, 100, 35, 10, 97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[97, 10, 10, 35, -1, 35, -1, 97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("         USA         ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Vereinigte Staaten von Amerika", "101035-135-197United States1Uni");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2", "RK_ok", "  {fPfPfPfPNPJ   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2" + "'", str3, "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2");
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
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
        java.lang.String[] strArray35 = new java.lang.String[] {};
        java.lang.String[] strArray36 = org.apache.commons.lang3.StringUtils.stripAll(strArray35);
        int int37 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray36);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.lang.String[] strArray39 = org.apache.commons.lang3.StringUtils.stripAll(strArray38);
        int int40 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray39);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("}", strArray36, strArray39);
        java.lang.String[] strArray42 = org.apache.commons.lang3.StringUtils.stripAll(strArray36);
        java.util.Locale locale43 = java.util.Locale.US;
        java.util.Locale locale44 = locale43.stripExtensions();
        java.lang.String str45 = locale44.getISO3Language();
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray36, (java.lang.Object) locale44, 0);
        java.lang.Object obj48 = objMap15.remove((java.lang.Object) locale44);
        char[] charArray52 = new char[] { ' ', 'a' };
        boolean boolean53 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray52);
        char[] charArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray52);
        char[] charArray56 = org.apache.commons.lang3.ArrayUtils.add(charArray52, 'a');
        char[] charArray59 = org.apache.commons.lang3.ArrayUtils.subarray(charArray52, 0, 98);
        double[] doubleArray60 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray61 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray60);
        double[] doubleArray62 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray61);
        double[] doubleArray64 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray61, (double) 1L);
        double[] doubleArray66 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray61, (double) 100);
        java.lang.Object obj67 = objMap15.putIfAbsent((java.lang.Object) charArray59, (java.lang.Object) doubleArray61);
        java.util.Collection<java.lang.Object> objCollection68 = objMap15.values();
        float[] floatArray72 = new float[] { 100, (byte) -1, (-1) };
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray72);
        float[] floatArray74 = org.apache.commons.lang3.ArrayUtils.clone(floatArray72);
        float[] floatArray75 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray74);
        java.lang.Float[] floatArray76 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray75);
        boolean boolean77 = objMap15.containsKey((java.lang.Object) floatArray76);
        java.lang.String str78 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray76);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "en_US");
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
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "}" + "'", str41, "}");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "eng" + "'", str45, "eng");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[ , a]");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), " aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), " aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[ , a, a]");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[ , a]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(objCollection68);
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray72), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray75), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "-1.0-1.0100.0" + "'", str78, "-1.0-1.0100.0");
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
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
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray12, (byte) 100);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray38, (byte) 1, (int) '4');
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.clone(byteArray38);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray49, (byte) 10, (int) '#');
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray57 = org.apache.commons.lang3.ArrayUtils.add(byteArray55, (byte) -1);
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray49, byteArray55);
        byte[] byteArray59 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray49);
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray64 = org.apache.commons.lang3.ArrayUtils.add(byteArray62, (byte) -1);
        int int67 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray64, (byte) 100, (-1));
        byte[] byteArray68 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray49, byteArray64);
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.contains(byteArray68, (byte) 0);
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        int int77 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray75, (byte) 10);
        java.lang.Byte[] byteArray78 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray75);
        byte[] byteArray81 = org.apache.commons.lang3.ArrayUtils.add(byteArray75, (int) (byte) 1, (byte) 0);
        byte[] byteArray82 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray68, byteArray81);
        boolean boolean83 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray42, byteArray81);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray86 = org.apache.commons.lang3.ArrayUtils.add(byteArray81, 32, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 5");
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
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[10, 1, 1, 0, 1, 10, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[1, 0, 1, 1, 1]");
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[10, 1, 1, 0, 1, 10, 1, 0, -1, 1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) (short) 0);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray3, (java.lang.Object) doubleArray13, 4);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        boolean[] booleanArray24 = new boolean[] { false, false, false, false, true };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray24);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray24, (int) (byte) -1, (int) '#');
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray24);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray24);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray24);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray31, (int) (short) 100, 2);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray34, true, (int) ' ');
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray18, booleanArray34);
        boolean[] booleanArray44 = new boolean[] { false, false, false, false, true };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray44);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray44, (int) (byte) -1, (int) '#');
        boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray48, true);
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray48, false);
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray48, false);
        boolean[] booleanArray55 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray34, booleanArray48);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray48);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[true, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[false, false, false, false]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray55), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, 1.0d);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray3);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 1.0f, 29, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("koEN-US", "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2EN_u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2EN_u" + "'", str1, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2EN_u");
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray3);
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 0 };
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) 1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray9);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (short) (byte) -1);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray12, (short) (byte) 100);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.clone(shortArray12);
        java.lang.Short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray12);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray16);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, 16, (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 16, Length: 2");
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
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, -1]");
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        long[] longArray17 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray17, 0L);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray19, (long) 3, (int) '#');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray8, longArray19);
        java.lang.Long[] longArray24 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray26 = org.apache.commons.lang3.ArrayUtils.remove(longArray8, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 95, Length: 6");
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
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(longArray24);
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "eNG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray3, (short) -1);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray3);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray3, (short) (byte) -1);
        java.lang.Short[] shortArray10 = new java.lang.Short[] {};
        java.lang.Short[] shortArray11 = new java.lang.Short[] {};
        java.lang.Short[] shortArray12 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray13 = new java.lang.Short[][] { shortArray10, shortArray11, shortArray12 };
        java.lang.Short[][] shortArray14 = org.apache.commons.lang3.ArrayUtils.clone(shortArray13);
        java.lang.Short[] shortArray16 = new java.lang.Short[] { (short) 0 };
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray16, (short) (byte) 1);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray16, (java.lang.Object) (byte) 10);
        java.lang.Short[][] shortArray21 = org.apache.commons.lang3.ArrayUtils.add(shortArray13, shortArray16);
        java.lang.Short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray16);
        java.lang.Short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray16);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray16);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.add(shortArray24, (short) -1);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray24);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.remove(shortArray3, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 120, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, -1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
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
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray3, (short) 100, (int) 'a');
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray28, 131, 42);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[0]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[]");
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##", 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##" + "'", str3, "##");
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\u82f1\u8a9e", "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf", 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e" + "'", str3, "\u82f1\u8a9e");
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
        float[] floatArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) 756);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "United   States", "0153001");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\u610f\u5927\u5229\u6587\u610f\u5927\u5229                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("uNITED sTATES");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uNITED sTATES" + "'", str1, "uNITED sTATES");
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("DE", "ja                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DE" + "'", str2, "DE");
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
        java.util.Locale locale2 = new java.util.Locale("anglais (Etats-Unis)");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444France", locale2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getDisplayLanguage(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "anglais (etats-unis)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444france" + "'", str3, "44444444444444444444444444france");
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("EN", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EN" + "'", str3, "EN");
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 131, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 131, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10]");
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
        java.lang.Object[] objArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) "KR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("USA", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA", "\u97d3\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "TR#TR#FALS                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, ' ');
        char[] charArray21 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray21, 'a', (int) (short) 10);
        char[] charArray31 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray31, 'a', (int) (short) 10);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray31, ' ');
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray31, ' ');
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray38);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.addAll(charArray21, charArray38);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray7, charArray21);
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.subarray(charArray7, 10, 100);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray7);
        int int47 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, '4');
        boolean boolean48 = org.apache.commons.lang3.StringUtils.containsAny("FR", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a 4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a 4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  , 4,  ,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
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
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(floatArray8, (float) 32);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u6cd5\u6587", 6, 743);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        java.lang.Double[] doubleArray8 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8, (double) (short) 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) (byte) 0, 7, (double) 4);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray10, 0, 10);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (short) 10, 42, (double) 42);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) 1.0f, 1);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray18, 48, (int) (short) 0);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray28, (double) ' ', (double) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        char[] charArray16 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray16, 'a', (int) (short) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray16, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray23);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.add(charArray23, 'a');
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray27);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray27, 'a');
        char[] charArray37 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray37, 'a', (int) (short) 10);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray37, ' ');
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray37, ' ');
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray44);
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.add(charArray44, ' ');
        char[] charArray48 = org.apache.commons.lang3.ArrayUtils.addAll(charArray27, charArray47);
        char[] charArray50 = org.apache.commons.lang3.ArrayUtils.remove(charArray27, 5);
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray27, 'a', 8);
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
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4 a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4 a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4,  , a, 4, a]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " 4 4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " 4 4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , 4,  , 4, a]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), " 4 a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), " 4 a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[ , 4,  , a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), " 4 a4a 4 a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), " 4 a4a 4 a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[ , 4,  , a, 4, a,  , 4,  , a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
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
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains(shortArray47, (short) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_u{97,1,10", "U UU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_u{97,1,10" + "'", str2, "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_u{97,1,10");
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{0}", "aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa", (int) (short) -1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray3);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[{0}]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[{0}]");
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.clone(longArray2);
        long[] longArray8 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray8, 0L);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray10, (long) 3, (int) '#');
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray10, 0L);
        long[] longArray20 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray20, 0L);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray22);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray10, longArray22);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray22, (long) 98);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.addAll(longArray2, longArray26);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray29 = org.apache.commons.lang3.ArrayUtils.remove(longArray2, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 98, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[1, 100, 35, 10]");
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("United   States", "0153001", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 'u', 10);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray4);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, 0.0d);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 35);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) 'a', (double) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "United   States");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United   States" + "'", str1, "United   States");
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "false");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("FRANCE", "und");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "Jxpxn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray4 = null;
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) (byte) 10);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray7, (double) 51);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[51.0]");
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray9);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.subarray(longArray9, 213, (int) (byte) 1);
        long[] longArray21 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray21, 0L);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray23, (long) 3, (int) '#');
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray23, 0L);
        long[] longArray33 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray33, 0L);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray23, longArray35);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.subarray(longArray35, 100, (-1));
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.add(longArray35, 10L);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray9, longArray35);
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.clone(longArray9);
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray9, (long) 10);
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
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[1, 100, 35, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("9)enihC( sionihc-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9)enihC( sionihc-" + "'", str1, "9)enihC( sionihc-");
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Japanese", 131, 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        char[] charArray17 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray17, 'a', (int) (short) 10);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray17, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray17, ' ');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray24);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.addAll(charArray7, charArray24);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.add(charArray24, 'a');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray28);
        boolean boolean30 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "-1.01.0", charArray29);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.clone(charArray29);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray33 = org.apache.commons.lang3.ArrayUtils.remove(charArray31, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 6");
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
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4 a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4 a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4,  , a, 4, a]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, 4, a]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " 4 a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " 4 a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , 4,  , a, 4, a]");
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale7 = builder4.build();
        java.util.Locale.Builder builder9 = builder4.setRegion("en");
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.Locale.Builder builder11 = builder4.setLocale(locale10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("   Etats-Unis    ", locale10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "   ETATS-UNIS    " + "'", str12, "   ETATS-UNIS    ");
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale0.getDisplayScript(locale2);
        java.lang.String str5 = locale0.getDisplayLanguage();
        java.lang.String str6 = locale0.getDisplayVariant();
        java.lang.String str7 = locale0.getDisplayLanguage();
        java.lang.String str8 = locale0.getDisplayName();
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = locale9.toLanguageTag();
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.lang.String str12 = locale9.getDisplayCountry(locale11);
        java.lang.String str13 = locale0.getDisplayName(locale11);
        java.lang.String str14 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-US" + "'", str3, "en-US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italian" + "'", str7, "Italian");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian (Italy)" + "'", str8, "Italian (Italy)");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-US" + "'", str10, "en-US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u7f8e\u56fd" + "'", str12, "\u7f8e\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str13, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italy" + "'", str14, "Italy");
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("it-IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it-it" + "'", str1, "it-it");
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  {false,false,false,false,true}  ", "{97,1,10,10,35,-1,35,-1}");
        java.lang.String[] strArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2eu_US", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENchinois (Chine)                                                                                     ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENEN", strArray6, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 7 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "falsefalsefalsefalsetrue" + "'", str7, "falsefalsefalsefalsetrue");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                       ", "-1.01.0-1.01.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("coreanocoreanocTaiwancoreanocoreanoco", "                                                                                           {-1,35,0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("       ...", "                                                                     100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray0, ' ');
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray3);
        char[] charArray11 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, 'a', (int) (short) 10);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray11, ' ');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray11, ' ');
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray18);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray18, ' ');
        char[] charArray28 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray28, 'a', (int) (short) 10);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray28, ' ');
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray28, ' ');
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray35);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray35);
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.addAll(charArray18, charArray35);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.addAll(charArray3, charArray35);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray40, '#');
        java.lang.Character[] charArray43 = org.apache.commons.lang3.ArrayUtils.toObject(charArray40);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray40);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, 4,  ]");
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
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), " 4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), " 4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[ , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                              Giappone                                              ", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                         {fulse,fulse,fulse,fulse,tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{fulse,fulse,fulse,fulse,tr" + "'", str1, "{fulse,fulse,fulse,fulse,tr");
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
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
        float[] floatArray57 = null;
        float[] floatArray58 = new float[] {};
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray58);
        float[] floatArray60 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray58);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray58);
        float[] floatArray62 = new float[] {};
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray62);
        float[] floatArray64 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray62);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray62);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray58, floatArray62);
        float[] floatArray67 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray57, floatArray58);
        java.lang.Float[] floatArray72 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray74 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray72, (float) 0L);
        float[] floatArray76 = org.apache.commons.lang3.ArrayUtils.add(floatArray74, (float) 0L);
        float[] floatArray78 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray74, (float) (short) 10);
        java.lang.Object obj79 = objMap15.replace((java.lang.Object) floatArray57, (java.lang.Object) floatArray74);
        objMap15.clear();
        java.lang.Integer[] intArray81 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray83 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray81, (int) (byte) -1);
        java.lang.Integer[] intArray84 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray81);
        java.lang.Integer[] intArray85 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray84);
        int[] intArray86 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray84);
        int[] intArray88 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray84, 3);
        boolean boolean89 = objMap15.containsKey((java.lang.Object) intArray88);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray92 = org.apache.commons.lang3.ArrayUtils.add(intArray88, 51, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 51, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "en_US");
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
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray60), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[]");
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray76), "[1.0, -1.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray78), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[]");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray4 = null;
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 0, (int) (short) 1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) 6, (double) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(longArray12, (long) (byte) 0);
        java.lang.Long[] longArray18 = org.apache.commons.lang3.ArrayUtils.toObject(longArray12);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray19);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray19, (long) 3);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.subarray(longArray24, 3, (int) (short) 10);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.addAll(longArray12, longArray24);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray28);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 1, 10, 10, 35, -1, 35, -1]");
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("ng", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     ng" + "'", str2, "                                                                                     ng");
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("######{false,false,false,false,true", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
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
            java.util.Locale.Builder builder31 = builder5.setExtension('u', "(Chine) chinois");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: (Chine) chinois [at index 0]");
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
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        short[] shortArray0 = null;
        short[] shortArray2 = new short[] { (short) 10 };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray2, (short) 10, 35);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.add(shortArray2, (short) 0);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray0, shortArray2);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.clone(shortArray2);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.removeUnicodeLocaleAttribute("[ , hi!, en-us,  ]   jpnpfpfpfpf{        [");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: [ , hi!, en-us,  ]   jpnpfpfpfpf{        [ [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray8, (long) (byte) -1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray8);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray8, (long) 48);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray8);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[-1, 35, -1, 35, 10, 10]");
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
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[10, 10, 35, -1, 35, -1]");
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (???????)?? (?????? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English (United Kingdom)", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("   {}   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   {}   " + "'", str1, "   {}   ");
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale6 = new java.util.Locale("RF_RF");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setLocale(locale6);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: rf_rf [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals(locale6.toString(), "rf_rf");
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Germany", 756, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGermany" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGermany");
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, (double) 'u');
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray8);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray9, (double) 43, 5, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0, 0.0, 117.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 100.0, 0.0, 117.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray4 = null;
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) 'u');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("German (GermanyEnglish (United Kingdom)FALSE,FALSE,FALSE,TRU,truetruefalse)", 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "German (GermanyEnglish (United Kingdom)FALSE,FALSE,FALSE,TRU,truetruefalse)" + "'", str3, "German (GermanyEnglish (United Kingdom)FALSE,FALSE,FALSE,TRU,truetruefalse)");
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
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
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray21, false);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray23);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.add(booleanArray25, 3, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray25, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[true, false, false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[true, false, false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, false, false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[true, false, false, false, false, true, true, false]");
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, 1.0d);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) 100, (double) (byte) 1);
        double[] doubleArray13 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray13, (double) (short) -1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray15);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 743, (double) 16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, (int) (short) 1);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, (-1), 0);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray7, (double) '#');
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.add(doubleArray12, (double) '4');
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray14);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray14, 0.0d, (double) 6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 35.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 35.0, 52.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[] shortArray1 = new java.lang.Short[] {};
        java.lang.Short[] shortArray2 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray3 = new java.lang.Short[][] { shortArray0, shortArray1, shortArray2 };
        java.lang.Short[][] shortArray4 = org.apache.commons.lang3.ArrayUtils.clone(shortArray3);
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) 0 };
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray6, (java.lang.Object) (byte) 10);
        java.lang.Short[][] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, shortArray6);
        java.lang.Short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray6);
        java.lang.Short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray6);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray13, (java.lang.Object) "{fPfPfPfPNPJ", 48);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray13, (short) 10);
        java.lang.Short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray13);
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
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0]");
        org.junit.Assert.assertNotNull(shortArray19);
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (short) 100, 2);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, false, 42);
        boolean[] booleanArray24 = new boolean[] { false, false, false, false, true };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray24);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray24, (int) (byte) -1, (int) '#');
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray28, true);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.add(booleanArray30, true);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray15, booleanArray32);
        java.lang.Boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray33);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray33);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, false, false, false, true]");
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale4.getScript();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale8 = java.util.Locale.US;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale9.toLanguageTag();
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = builder12.build();
        java.util.Locale.setDefault(category0, locale14);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        java.util.Locale locale19 = new java.util.Locale("Italian");
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str21 = locale19.getDisplayName(locale20);
        java.util.Locale locale22 = java.util.Locale.US;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.lang.String str24 = locale23.toLanguageTag();
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.lang.String str26 = locale23.getDisplayName(locale25);
        java.lang.String str27 = locale19.getDisplayVariant(locale23);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.upperCase("100.0#-1.0#10.0#1.0#100.0#1.0", locale19);
        java.util.Locale.setDefault(category0, locale19);
        java.lang.String str30 = locale19.getVariant();
        java.lang.Float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray31);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray31);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray31);
        boolean boolean35 = locale19.equals((java.lang.Object) floatArray34);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-US" + "'", str5, "en-US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en-US" + "'", str10, "en-US");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals(locale19.toString(), "italian");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "italian" + "'", str21, "italian");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en-US" + "'", str24, "en-US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str26, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str28, "100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 3, (int) '#');
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 0L);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) 3);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray18 = org.apache.commons.lang3.ArrayUtils.add(longArray15, 117, (long) 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 117, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[1, 100, 35, 10, 3]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[1, 100, 35]");
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("tedesco (Germania)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=tedesco(germania)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        char[] charArray16 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray16, 'a', (int) (short) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray16, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray23);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.add(charArray23, 'a');
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.clone(charArray23);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        java.lang.Character[] charArray30 = org.apache.commons.lang3.ArrayUtils.toObject(charArray23);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(charArray23, ' ');
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
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatruetruefalse", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx..." + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...");
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0}1.0{0}100.0{0}1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0}1.0{0}100.0{0}1.0" + "'", str1, "0}1.0{0}100.0{0}1.0");
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 0L);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray6);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category3, locale4);
        java.lang.String str7 = locale4.getExtension('a');
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.lang.String str12 = locale10.getScript();
        java.util.Locale locale13 = java.util.Locale.US;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale14.toLanguageTag();
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale14.getDisplayName(locale16);
        java.lang.String str18 = locale10.getDisplayLanguage(locale14);
        java.util.Locale.setDefault(category0, locale14);
        java.util.Locale locale20 = java.util.Locale.getDefault(category0);
        java.util.Locale locale23 = new java.util.Locale("100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "CN");
        java.util.Locale.setDefault(category0, locale23);
        java.util.Set<java.lang.String> strSet25 = locale23.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en-US" + "'", str15, "en-US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str17, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chinese" + "'", str18, "Chinese");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertEquals(locale23.toString(), "100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0_CN");
        org.junit.Assert.assertNotNull(strSet25);
    }
}
