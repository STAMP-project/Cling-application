import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray5, (int) '#');
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray11, 12);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = org.apache.commons.lang3.ArrayUtils.remove(intArray11, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 10, 5, 1, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 10, 5, 1, 35]");
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaanglais(Etats-Unis)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale0.getDisplayScript(locale3);
        java.lang.Short[] shortArray8 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray11 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray14 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray17 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[][] shortArray18 = new java.lang.Short[][] { shortArray8, shortArray11, shortArray14, shortArray17 };
        java.lang.Short[][][] shortArray19 = new java.lang.Short[][][] { shortArray18 };
        int[] intArray20 = new int[] {};
        int[] intArray24 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray24);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.add(intArray24, 0, 4);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.addAll(intArray20, intArray24);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.add(intArray20, 0);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray33);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray20, intArray34);
        java.lang.Short[][][] shortArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray19, (java.lang.Object) intArray20);
        java.util.Locale locale37 = java.util.Locale.US;
        java.lang.String str38 = locale37.toLanguageTag();
        java.util.Locale locale39 = java.util.Locale.US;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.lang.String str42 = locale37.getDisplayCountry(locale40);
        java.util.Locale locale43 = java.util.Locale.FRANCE;
        java.util.Locale locale44 = java.util.Locale.US;
        java.util.Locale locale45 = locale44.stripExtensions();
        java.lang.String str46 = locale45.getLanguage();
        java.lang.String str47 = locale43.getDisplayScript(locale45);
        java.lang.String str48 = locale37.getDisplayName(locale43);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) shortArray19, (java.lang.Object) locale43);
        java.util.Set<java.lang.Character> charSet50 = locale43.getExtensionKeys();
        java.lang.String str51 = locale43.getDisplayLanguage();
        java.lang.String str52 = locale0.getDisplayScript(locale43);
        java.lang.String str54 = locale43.getExtension('x');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United States" + "'", str2, "United States");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en-US" + "'", str38, "en-US");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "United States" + "'", str42, "United States");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en" + "'", str46, "en");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "anglais (Etats-Unis)" + "'", str48, "anglais (Etats-Unis)");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(charSet50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "French" + "'", str51, "French");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\u6cd5\u6587                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587" + "'", str1, "\u6cd5\u6587");
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("444444coreano");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444COREANO" + "'", str1, "444444COREANO");
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Deutsch (Deutschland)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Deutsch(Deutschland)" + "'", str1, "Deutsch(Deutschland)");
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)", "u uu ", "\u4e2d\u6587\u53f0\u7063)it_it", 69);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str4, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("United Statesslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurtu", 48, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "United Statesslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurtu" + "'", str3, "United Statesslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurtu");
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Englishtru#tru#fals                                    ", "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2", 48);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2                    " + "'", str3, "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2                    ");
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("KOR", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KOR       " + "'", str2, "KOR       ");
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        char[] charArray8 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a', (int) (short) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, ' ');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray15);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray15);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.add(charArray15, 'u');
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "USA", charArray20);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray20, ' ');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.add(charArray23, 'u');
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a4 u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a4 u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, 4,  , u]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4a4 uu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4a4 uu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, a, 4,  , u, u]");
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("     t      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "t" + "'", str1, "t");
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false, }eurt,eslaf,eslaf,eslaf,eslaf{", "  {FALSE,FALSE,FALSE,FALSE,TRUE}  xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        java.util.Locale.Category category1 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.util.Locale.Category category9 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale10 = java.util.Locale.getDefault(category9);
        java.util.Locale.Category[] categoryArray11 = new java.util.Locale.Category[] { category1, category3, category4, category5, category7, category9 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray12 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray11);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray15 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray12, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap16 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray15);
        java.lang.Short[] shortArray18 = new java.lang.Short[] { (short) 0 };
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) (byte) 1);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray18, (java.lang.Object) (byte) 10);
        java.lang.Short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray18);
        java.lang.Boolean[] booleanArray27 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray27);
        java.lang.Boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray28);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray23, (java.lang.Object) booleanArray28, (int) (byte) 1);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray28);
        char[] charArray40 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray40, 'a', (int) (short) 10);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray40, ' ');
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray40, ' ');
        char[] charArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray47);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray47);
        boolean boolean50 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray47);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray47, '#', (int) (short) -1);
        char[] charArray56 = org.apache.commons.lang3.ArrayUtils.add(charArray47, 2, 'u');
        java.lang.Object obj57 = objMap16.replace((java.lang.Object) booleanArray28, (java.lang.Object) charArray56);
        objMap16.clear();
        java.lang.Object obj59 = null;
        boolean boolean60 = objMap16.containsKey(obj59);
        int int61 = objMap16.size();
        int int62 = objMap16.size();
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet63 = objMap16.entrySet();
        char[] charArray70 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int73 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray70, 'a', (int) (short) 10);
        int int75 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray70, 'u');
        java.lang.Character[] charArray76 = org.apache.commons.lang3.ArrayUtils.toObject(charArray70);
        char[] charArray77 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray76);
        java.lang.Character[] charArray78 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray76);
        char[] charArray79 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray78);
        char[] charArray81 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray78, 'x');
        java.lang.Double[] doubleArray84 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray86 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray84, (double) (short) 100);
        double[] doubleArray87 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray84);
        java.lang.Double[] doubleArray88 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray84);
        java.lang.Object obj89 = objMap16.replace((java.lang.Object) charArray81, (java.lang.Object) doubleArray88);
        boolean boolean90 = org.apache.commons.lang3.StringUtils.containsAny("zh-CN", charArray81);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category1.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "en-us_  {FALSE,FALSE,FALSE,FALSE,TRUE}  _  {false,false,false,false,true}  ");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "en-us_  {FALSE,FALSE,FALSE,FALSE,TRUE}  _  {false,false,false,false,true}  ");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "en-us_  {FALSE,FALSE,FALSE,FALSE,TRUE}  _  {false,false,false,false,true}  ");
        org.junit.Assert.assertTrue("'" + category9 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category9.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "en-us_  {FALSE,FALSE,FALSE,FALSE,TRUE}  _  {false,false,false,false,true}  ");
        org.junit.Assert.assertNotNull(categoryArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray12);
        org.junit.Assert.assertNotNull(categoryEnumArray15);
        org.junit.Assert.assertNotNull(objMap16);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[true, true, false]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4, a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "4au 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "4au 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[4, a, u,  , 4,  ]");
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objEntrySet63);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 4 + "'", int73 == 4);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaah{0,-1}{0,German (Germany)h{0,-1}{0,-", "Chinese");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", "{false,false,false,false,tra", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str6, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("US", "Etts-Unis", 2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', (int) (short) 1, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_jja_j", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (byte) -1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray14);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray14, 'x');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                hi!                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                hi!                                                 " + "'", str1, "                                                hi!                                                 ");
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.remove(floatArray3, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
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
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        java.lang.String[] strArray6 = new java.lang.String[] { "{0}", "\u7f8e\u56fd", "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)", "  {false,false,false,false,true}  ", "\u7fa9\u5927\u5229\u6587", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen" };
        java.lang.String[][] strArray7 = new java.lang.String[][] { strArray6 };
        java.lang.String[] strArray14 = new java.lang.String[] { "{0}", "\u7f8e\u56fd", "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)", "  {false,false,false,false,true}  ", "\u7fa9\u5927\u5229\u6587", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen" };
        java.lang.String[][] strArray15 = new java.lang.String[][] { strArray14 };
        java.lang.String[] strArray22 = new java.lang.String[] { "{0}", "\u7f8e\u56fd", "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)", "  {false,false,false,false,true}  ", "\u7fa9\u5927\u5229\u6587", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen" };
        java.lang.String[][] strArray23 = new java.lang.String[][] { strArray22 };
        java.lang.String[][][] strArray24 = new java.lang.String[][][] { strArray7, strArray15, strArray23 };
        java.lang.String[] strArray31 = new java.lang.String[] { "{0}", "\u7f8e\u56fd", "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)", "  {false,false,false,false,true}  ", "\u7fa9\u5927\u5229\u6587", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen" };
        java.lang.String[][] strArray32 = new java.lang.String[][] { strArray31 };
        java.lang.String[] strArray39 = new java.lang.String[] { "{0}", "\u7f8e\u56fd", "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)", "  {false,false,false,false,true}  ", "\u7fa9\u5927\u5229\u6587", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen" };
        java.lang.String[][] strArray40 = new java.lang.String[][] { strArray39 };
        java.lang.String[] strArray47 = new java.lang.String[] { "{0}", "\u7f8e\u56fd", "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)", "  {false,false,false,false,true}  ", "\u7fa9\u5927\u5229\u6587", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen" };
        java.lang.String[][] strArray48 = new java.lang.String[][] { strArray47 };
        java.lang.String[][][] strArray49 = new java.lang.String[][][] { strArray32, strArray40, strArray48 };
        java.lang.String[][][][] strArray50 = new java.lang.String[][][][] { strArray24, strArray49 };
        java.util.Locale locale51 = java.util.Locale.US;
        java.util.Locale locale52 = locale51.stripExtensions();
        java.lang.String str53 = locale52.toLanguageTag();
        java.util.Locale locale54 = java.util.Locale.JAPANESE;
        java.lang.String str55 = locale52.getDisplayName(locale54);
        java.lang.String[][][][] strArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(strArray50, (java.lang.Object) locale54);
        java.lang.String[][][][] strArray57 = org.apache.commons.lang3.ArrayUtils.clone(strArray56);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "en-US" + "'", str53, "en-US");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str55, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "truetruefalse");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("truetruefalsetruetruefalsetruetruefalsetruetruefalsetruetChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr", 756, (int) 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...uefalsetruetruefalsetruetruefalsetruetruefalsetruetChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr" + "'", str3, "...uefalsetruetruefalsetruetruefalsetruetruefalsetruetChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr");
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("IT", "Taiwan");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("{0,-1}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{0,-1}" + "'", str1, "{0,-1}");
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("     zH_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zH_CN" + "'", str1, "zH_CN");
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        int[] intArray10 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray10);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray10, (int) '4');
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray20 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray20);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.add(intArray20, 0, 4);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = org.apache.commons.lang3.ArrayUtils.remove(intArray20, 756);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 756, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 35, 0, -1, 35, 0]");
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "1}eurt,esl1}eurt,esl1}eurt,esl1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) (byte) 0);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray9 = new float[] {};
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray9);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray11);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray11);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(floatArray11, (float) (-1));
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.clone(floatArray11);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray17, (float) 10L);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(floatArray19, (float) 13);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaafr_fraaaa (UNITED STATES)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaafr_fraaaa (UNITED STATES)" + "'", str1, "aaafr_fraaaa (UNITED STATES)");
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)", 87);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)" + "'", str2, "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\u30d5\u30e9\u30f3\u30b9\u8a9e", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str2, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(" italien (Italie)hi!italien (Italie)en-USitalien (Italie) ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien (Italie)hi!italien (Italie)en-USitalien (Italie)" + "'", str1, "italien (Italie)hi!italien (Italie)en-USitalien (Italie)");
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "ETRUEFALSE                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENchinois (Chine)                                                                                     ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENEN");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = org.apache.commons.lang3.ArrayUtils.add(longArray0, (int) '#', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        float[] floatArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) 379);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "ko_KR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("100.0United States-1.0United States10.0United States1.0United States100.0United States1.0", 116, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
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
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, false);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder8 = builder2.setExtension('a', "Etats-Unis");
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("eng", locale10);
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale15 = java.util.Locale.US;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = locale13.getDisplayCountry(locale16);
        java.lang.String str19 = locale10.getDisplayVariant(locale16);
        java.util.Locale.Builder builder20 = builder2.setLocale(locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder20.setVariant("Italian (Italy)aaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Italian (Italy)aaaaaaaaaaaaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ENG" + "'", str12, "ENG");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-US" + "'", str14, "en-US");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "United States" + "'", str18, "United States");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, 0.0d, (double) 'u');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u5229\u5927\u610f\u6587\u5229\u5927\u610f", "\u4e2d\u6587\u53f0\u7063)", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "     zH_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("{FALSE,...#########################################################################################", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{FALSE,...#########################################################################################" + "'", str2, "{FALSE,...#########################################################################################");
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.lang.String str5 = locale4.getDisplayScript();
        java.util.Locale locale8 = java.util.Locale.US;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("", locale8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", locale8);
        java.lang.String str12 = locale4.getDisplayLanguage(locale8);
        java.lang.String str13 = locale4.getDisplayCountry();
        java.util.Locale.Builder builder14 = builder3.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.removeUnicodeLocaleAttribute("Etts-Unis");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Etts-Unis [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510" + "'", str11, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "German" + "'", str12, "German");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, (int) (short) 100);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray11);
        java.lang.Integer[] intArray13 = org.apache.commons.lang3.ArrayUtils.toObject(intArray11);
        java.lang.Integer[] intArray14 = org.apache.commons.lang3.ArrayUtils.toObject(intArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) intArray14);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray14);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10321051" + "'", str15, "10321051");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 32, 10, 5, 1]");
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray6, (double) 'x', (double) (-1.0f));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("[ , hi!, en-us,  ]   jpnpfpfpfpf{        []");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (byte) 0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) ' ');
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray3, 221);
        java.lang.Integer[] intArray12 = org.apache.commons.lang3.ArrayUtils.toObject(intArray3);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(intArray3, (int) 'x');
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("US");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray16, "  {FPFPFPFPNPJ   ");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        int[] intArray23 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray23);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.add(intArray23, 0, 4);
        java.lang.Integer[] intArray28 = org.apache.commons.lang3.ArrayUtils.toObject(intArray23);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray19, (java.lang.Object) intArray28, (int) (byte) 1);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray28, (int) (short) 0);
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray32);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray32, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 0, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 35, 0, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 35, 0]");
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        int[] intArray10 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray10);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray10, (int) '4');
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray13);
        java.lang.Integer[] intArray15 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray15, (int) (byte) -1);
        java.lang.Integer[] intArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray15);
        java.lang.Integer[] intArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray18);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray19, (int) 'x');
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.addAll(intArray13, intArray21);
        int[] intArray28 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray28, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray28);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray28);
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.clone(intArray28);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray33, 42);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray13, intArray33);
        java.lang.Integer[] intArray37 = org.apache.commons.lang3.ArrayUtils.toObject(intArray33);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray37);
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("United St", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United St" + "'", str2, "United St");
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("{Italian}", "CHN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHN" + "'", str2, "CHN");
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.lang.String str3 = locale0.getScript();
        java.lang.String str4 = locale0.getISO3Language();
        java.lang.String str5 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("        ja_JP", "CHINA");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     t      ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        short[] shortArray1 = new short[] { (short) 10 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) 10, 35);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.add(shortArray1, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray1, (short) (byte) 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray1, (short) 1);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray1, (short) 1, (int) 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'u');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, 'u');
        char[] charArray20 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray20, 'a', (int) (short) 10);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray20, ' ');
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray20, ' ');
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray27);
        char[] charArray35 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray35, 'a', (int) (short) 10);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray35, ' ');
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray27, charArray35);
        java.lang.Character[] charArray42 = org.apache.commons.lang3.ArrayUtils.toObject(charArray27);
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray27, 'u');
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray13, charArray44);
        int int47 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray13, 'a');
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.add(charArray13, 'x');
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
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "  4 a4x");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "  4 a4x");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[ ,  , 4,  , a, 4, x]");
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "china    ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("{97,1,10", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510", 95);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("{false,false,false,false,true}", "italian");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "h", 97, 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 97, 3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray16, (java.lang.Object) 4, 4);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) -1, 34);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(byteArray21, (byte) -1);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) 100, 131);
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
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, (double) (short) 100);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray7, 1.0d, (double) 35);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray7, (double) 0);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray7, (double) 100, (double) (byte) 10);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, 6, (double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
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
        java.util.Locale.Builder builder20 = builder5.clearExtensions();
        java.util.Locale locale21 = java.util.Locale.US;
        java.lang.String str22 = locale21.toLanguageTag();
        java.util.Locale locale23 = java.util.Locale.US;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Set<java.lang.Character> charSet25 = locale24.getExtensionKeys();
        java.lang.String str26 = locale21.getDisplayCountry(locale24);
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.util.Locale locale28 = java.util.Locale.US;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = locale29.getLanguage();
        java.lang.String str31 = locale27.getDisplayScript(locale29);
        java.lang.String str32 = locale21.getDisplayName(locale27);
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale27.getDisplayName(locale33);
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.util.Locale locale36 = java.util.Locale.US;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.lang.String str38 = locale37.toLanguageTag();
        java.lang.String str39 = locale35.getDisplayScript(locale37);
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        java.lang.String str42 = locale37.getDisplayCountry(locale41);
        java.lang.String str43 = locale27.getDisplayName(locale41);
        java.util.Locale.Builder builder44 = builder20.setLocale(locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder46 = builder44.setScript("cor\351en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: core?en [at index 0]");
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
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en-US" + "'", str22, "en-US");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "United States" + "'", str26, "United States");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en" + "'", str30, "en");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "anglais (Etats-Unis)" + "'", str32, "anglais (Etats-Unis)");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str34, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en-US" + "'", str38, "en-US");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "United States" + "'", str42, "United States");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "French (France)" + "'", str43, "French (France)");
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (byte) 10, 3);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 'x', (-1), (double) (byte) 10);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray15, (double) 10L);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray15, 10.0d);
        java.lang.Long[] longArray20 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray20);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21, (long) 2);
        java.lang.Long[] longArray25 = org.apache.commons.lang3.ArrayUtils.toObject(longArray24);
        double[] doubleArray29 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray29, (double) (short) -1);
        java.lang.Double[] doubleArray34 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray34, (double) (short) 100);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray29, doubleArray36);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray25, (java.lang.Object) doubleArray36, 48);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray36, (double) 13, (double) 13);
        double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.add(doubleArray36, (double) 0L);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray36, (double) 10.0f);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray19, doubleArray36);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray5, doubleArray36);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray50 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray36, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 51, Length: 2");
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 10.0]");
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it_IT" + "'", str1, "it_IT");
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Deutsch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444Frnce", "italiano");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444Frnce" + "'", str2, "44444444444444444444444444Frnce");
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("English", "nglais (Etats-Unis)");
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("11003510", strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("China", strArray5, strArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal", strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concatWith("de_DE", (java.lang.Object[]) strArray12);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concatWith("44444444444444444444444444444444444444444444444444ITALIEN (ITALIE)444444444444444444444444444444444444444444444444444", (java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "China" + "'", str14, "China");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
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
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, (short) 0);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.add(shortArray38, (short) 10);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray38);
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
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\u82f1\u8a9e", 'a', 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e" + "'", str3, "\u82f1\u8a9e");
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("itali");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "itali" + "'", str1, "itali");
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("etruefals", "\u30a2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "etruefals" + "'", str2, "etruefals");
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ETRUEFALSE                                          ", 756, "rt,esluf,esluf,esluf,esluf{                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ETRUEFALSE                                          rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,e" + "'", str3, "ETRUEFALSE                                          rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,e");
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray16, (java.lang.Object) 4, 4);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 1);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 10);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray24);
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
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 221 + "'", int1 == 221);
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        long[] longArray0 = new long[] {};
        long[] longArray5 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray7, (long) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray0, longArray7);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) (short) 1);
        java.lang.Long[] longArray13 = org.apache.commons.lang3.ArrayUtils.toObject(longArray12);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13, (long) (byte) 1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("CNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCNJPNCN", 743, 743);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder7.setLanguage("German");
        java.util.Locale.Builder builder10 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuunited statesuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuunited statesuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
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
        java.util.Locale locale21 = locale3.stripExtensions();
        java.lang.String str22 = locale3.getCountry();
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CN" + "'", str22, "CN");
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("{false,fa  {false,false,false,false,true}  laf,eslaf", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e}  laf,eslafu{false,fa  {false,false,false,false,tr" + "'", str2, "e}  laf,eslafu{false,fa  {false,false,false,false,tr");
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
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
        java.lang.Byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray37);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray38);
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray38, (byte) -1);
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
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 0]");
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray2);
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Stati Uniti", strArray3, strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("anglais (Etats-Unis)", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 28, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Stati Uniti" + "'", str5, "Stati Uniti");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray14);
        char[] charArray23 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray23, 'a', (int) (short) 10);
        char[] charArray33 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray33, 'a', (int) (short) 10);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray33, ' ');
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray33, ' ');
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray40);
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.addAll(charArray23, charArray40);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray14, (java.lang.Object) charArray42);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray42, 'a', (int) 'a');
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.contains(charArray42, ' ');
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray42);
        char[] charArray52 = org.apache.commons.lang3.ArrayUtils.add(charArray42, (int) (byte) 0, '4');
        char[] charArray55 = org.apache.commons.lang3.ArrayUtils.subarray(charArray42, 29, 0);
        boolean boolean56 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444FRANCE                ", charArray42);
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
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "4  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "4  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[4,  ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        char[] charArray0 = null;
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'u');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, 'u');
        char[] charArray21 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray21, 'a', (int) (short) 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray21, ' ');
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray21, ' ');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray28);
        char[] charArray36 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray36, 'a', (int) (short) 10);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray36, ' ');
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray28, charArray36);
        java.lang.Character[] charArray43 = org.apache.commons.lang3.ArrayUtils.toObject(charArray28);
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray28, 'u');
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray14, charArray45);
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray45);
        char[] charArray51 = new char[] { ' ', 'a' };
        boolean boolean52 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray51);
        char[] charArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray51);
        char[] charArray54 = org.apache.commons.lang3.ArrayUtils.addAll(charArray47, charArray53);
        java.lang.Character[] charArray55 = org.apache.commons.lang3.ArrayUtils.toObject(charArray47);
        char[] charArray58 = org.apache.commons.lang3.ArrayUtils.subarray(charArray47, (int) (short) 100, (int) (byte) -1);
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray58, ' ', 320);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[ , a]");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), " 4 a4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), " 4 a4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[ , 4,  , a, 4,  , a]");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "china");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("100.0United States-1.0United States10.0United States1.0United States100.0United States1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0United States-1.0United States10.0United States1.0United States100.0United States1.0" + "'", str1, "100.0United States-1.0United States10.0United States1.0United States100.0United States1.0");
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 1.0f, 10.0f, 100.0f, 1.0f, 100.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, 0.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray10 = new float[] {};
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray9, floatArray10);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray9);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray9, (-1.0f));
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.clone(floatArray9);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray9, 16, (int) (byte) -1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray8, floatArray9);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\u610f\u5927\u5229\u6587\u610f\u5927\u5229");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0.1#0.001#0.1#0.01#0.1-#0.0010.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.001", "adaaeaafaagaaiaalaamaanaaoaaqaaraasaataauaawaaxaazabaabbabdabeabfabgabhabiabjablabmabnaboabqabrabsabtabvabwabyabzacaaccacdacfacgachaciackaclacmacnacoacracuacvacwacxacyaczadeadjadkadmadoadzaecaeeaegaehaeraesaetafiafjafkafmafoafragaagbagdageagfaggaghagiaglagmagnagpagqagragsagtaguagwagyahkahmahnahrahtahuaidaieailaimainaioaiqairaisaitajeajmajoajpakeakgakhakiakmaknakpakrakwakyakzalaalbalcalialkalralsaltalualvalyamaamcamdameamfamgamhamkamlammamnamoampamqamramsamtamuamvamwamxamyamzanaancaneanfanganianlanoanpanranuanzaomapaapeapfapgaphapkaplapmapnaprapsaptapwapyaqaarearoarsaruarwasaasbascasdaseasgashasiasjaskaslasmasnasoasrassastasvasxasyaszatcatdatfatgathatjatkatlatmatnatoatrattatvatwatzauaaugaumausauyauzavaavcaveavgaviavnavuawfawsayeaytazaazmazw");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.1#0.001#0.1#0.01#0.1-#0.0010.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.001" + "'", str2, "0.1#0.001#0.1#0.01#0.1-#0.0010.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.001");
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (coreano)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (coreano)" + "'", str1, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (coreano)");
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "nglais (Etats-Unis)", (java.lang.CharSequence) "\u4e2d\u4e2d\u4e2d\u4e2d\u4e2d");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "COREANO", (java.lang.CharSequence) "{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "USA" + "'", str2, "USA");
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
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
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray8);
        byte[] byteArray32 = null;
        byte[] byteArray34 = new byte[] { (byte) 100 };
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray34, byteArray35);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray32, byteArray34);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray8, byteArray34);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray2, byteArray34);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray34, (byte) -1, 15);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 1]");
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
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[100, 100]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 3, (int) '#');
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 0L);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray6, 320, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 320, Length: 4");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("italianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitaliano", " 4hi!4en-us4 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENchinois (Chine)                                                                                     ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENEN", "{false,false,false,false,true", "100.0United States-1.0United States10.0United States1.0United States100.0United States1.0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (long) 13);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.clone(longArray4);
        long[] longArray10 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray10, 0L);
        java.lang.Long[] longArray13 = org.apache.commons.lang3.ArrayUtils.toObject(longArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) longArray13);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray13, ' ', (int) ' ', (int) (byte) 1);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray19, (long) (short) -1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray5, longArray19);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray19);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "11003510" + "'", str14, "11003510");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[10, 35, 100, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[10, 35, 100, 1]");
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray0, "en-US");
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 100, (-1));
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 1);
        java.lang.Byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        java.lang.Byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray11);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray12, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1]");
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\uc77c\ubcf8\uc5b4", "S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale0.getUnicodeLocaleType("97UnitedaStates1UnitedaStates10UnitedaStates10UnitedaStates35UnitedaStates-1UnitedaStates35UnitedaStates-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 97UnitedaStates1UnitedaStates10UnitedaStates10UnitedaStates35UnitedaStates-1UnitedaStates35UnitedaStates-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        java.util.Locale locale1 = new java.util.Locale("101035-135-1");
        org.junit.Assert.assertEquals(locale1.toString(), "101035-135-1");
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale7 = new java.util.Locale("IT");
        java.lang.String str9 = locale7.getExtension('u');
        java.util.Locale.Builder builder10 = builder5.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setRegion("{97,1,10                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: {97,1,10                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        long[] longArray0 = new long[] {};
        long[] longArray1 = new long[] {};
        long[][] longArray2 = new long[][] { longArray0, longArray1 };
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        long[][] longArray5 = new long[][] { longArray3, longArray4 };
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        long[][] longArray8 = new long[][] { longArray6, longArray7 };
        long[][][] longArray9 = new long[][][] { longArray2, longArray5, longArray8 };
        long[] longArray15 = new long[] { 35, 0L, 1L, (byte) 1, 100L };
        long[] longArray21 = new long[] { 35, 0L, 1L, (byte) 1, 100L };
        long[][] longArray22 = new long[][] { longArray15, longArray21 };
        long[][] longArray25 = org.apache.commons.lang3.ArrayUtils.subarray(longArray22, (int) (byte) 0, (int) 'a');
        long[][][] longArray26 = org.apache.commons.lang3.ArrayUtils.add(longArray9, longArray22);
        java.lang.Short[] shortArray28 = new java.lang.Short[] { (short) 0 };
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray28, (short) (byte) 1);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray28, (java.lang.Object) (byte) 10);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray28);
        char[] charArray40 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray40, 'a', (int) (short) 10);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray40, ' ');
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray40, ' ');
        java.lang.Short[] shortArray49 = new java.lang.Short[] { (short) 0 };
        short[] shortArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray49, (short) (byte) 1);
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { shortArray28, charArray40, shortArray51 };
        java.lang.Short[] shortArray54 = new java.lang.Short[] { (short) 0 };
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray54, (short) (byte) 1);
        java.lang.Cloneable[] cloneableArray57 = org.apache.commons.lang3.ArrayUtils.add(cloneableArray52, (java.lang.Cloneable) shortArray54);
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray54);
        int int59 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray22, (java.lang.Object) shortArray58);
        short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray58, (short) 10);
        int int63 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray61, (short) (byte) 1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[35, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[35, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[0]");
        org.junit.Assert.assertNotNull(cloneableArray52);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[0]");
        org.junit.Assert.assertNotNull(cloneableArray57);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.add(byteArray19, (byte) -1);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) 100, (-1));
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray21);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.remove(byteArray21, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 3");
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
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1, 1, 0, 1, 10, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, -1]");
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
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
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(byteArray35, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.remove(byteArray35, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("France");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray10, (byte) 10, (int) '#');
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) -1);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray10, byteArray16);
        java.lang.Byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray16);
        java.lang.Byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray16);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.remove(byteArray23, (int) (short) 0);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray32, (byte) 10, (int) '#');
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.add(byteArray38, (byte) -1);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray32, byteArray38);
        java.lang.Byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray38);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray42, (java.lang.Object) 4, 4);
        byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray42);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray42, (byte) 1);
        java.lang.Byte[] byteArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray42);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) byteArray42);
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray42);
        byte[] byteArray52 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray23, byteArray51);
        java.lang.Byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray52);
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray52, (byte) 100, (-1));
        byte[] byteArray57 = org.apache.commons.lang3.ArrayUtils.clone(byteArray52);
        boolean boolean58 = languageRange1.equals((java.lang.Object) byteArray52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1, 0, 0, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[1, 0, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { true, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, false);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray4, true);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true]");
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Francia");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Francia" + "'", str1, "Francia");
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray1, 116, (long) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 116, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 1.0f, 10.0f, 100.0f, 1.0f, 100.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, 0.0f);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.remove(floatArray8, (int) (byte) 1);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray8, (float) 'a');
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray8);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 0, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        java.lang.Boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray13, 'a', 48, 12);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray13, true);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray13, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[true, false, false, false, false]");
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str1, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        java.lang.Boolean[][][][][] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean[][][][][] booleanArray2 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 320, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, 10.0d, (double) (-1.0f));
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) (short) 10, (double) (-1.0f));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) 0L);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray5, (int) (short) 1, (int) (byte) 0);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray16);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray16, 743);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 743, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\u82f1\u8a9e\u30a2en_US             aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        java.lang.Character[] charArray4 = new java.lang.Character[] { ' ', ' ', 'a' };
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray4);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4, '#');
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-", charArray9);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , a]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) (byte) 100);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (int) (short) 0, (short) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray3);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, 0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.remove(shortArray13, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 87, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[1, 0]");
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale0.getDisplayScript(locale3);
        java.util.Locale locale6 = locale0.stripExtensions();
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category7);
        java.lang.String str10 = locale0.getDisplayScript(locale9);
        java.lang.String str11 = locale9.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United States" + "'", str2, "United States");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("DEU", "IT", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("deuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "ital...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "deuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "deuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setRegion("en");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("\u97d3\u6587");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\u30a2");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a2(" + "'", str1, "\u30a2(");
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.String str4 = locale3.toLanguageTag();
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.lang.String str8 = locale3.getDisplayCountry(locale6);
        java.lang.String str9 = locale1.getDisplayScript(locale3);
        java.util.Locale locale10 = locale3.stripExtensions();
        java.lang.String str11 = locale3.getVariant();
        java.lang.String str12 = locale3.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-US" + "'", str4, "en-US");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "United States" + "'", str8, "United States");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 0, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        java.lang.Boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("97United States1United States10United States10United States35United States-1United States35United States-1", "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97United States1United States10United States10United States35United States-1United States35United States-1" + "'", str2, "97United States1United States10United States10United States35United States-1United States35United States-1");
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setRegion("en");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword(" 4hi!4en-US4 ", "RK_ok");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  4hi!4en-US4  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) (byte) 0);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) (short) 10, (int) 'u');
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, 32, 756);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray7);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[1.0, 1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[1.0, 1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("United States", "}eurt,esla");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444444444444444italie4444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaafr_fraaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaafr_fraaaa" + "'", str1, "aaafr_fraaaa");
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\u65e5\u5927\u5229\u6587\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u65e5\u5927\u5229\u6587\u65e5\u6587" + "'", str1, "\u65e5\u5927\u5229\u6587\u65e5\u6587");
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" italien (italie)hi!italien (italie)en-usitalien (italie) ", (int) 'x', 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "italien (Italie)hi!italien (Italie)en-USitalien (Italie)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italien (Italie)hi!italien (Italie)en-USitalien (Italie)" + "'", str1, "Italien (Italie)hi!italien (Italie)en-USitalien (Italie)");
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("fr", "t");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray12 = new boolean[] { false, false, false, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (byte) -1, (int) '#');
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, 0, (int) (short) 1);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray20);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray21, true);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.add(booleanArray21, true);
        boolean[] booleanArray31 = new boolean[] { false, false, false, false, true };
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray31);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray31, (int) (byte) -1, (int) '#');
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray31);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray31);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray31);
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray38, (int) (short) 100, 2);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray21, booleanArray41);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray42, false, 379);
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
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true]");
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[true, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[]");
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        char[] charArray17 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray17, 'a', (int) (short) 10);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray17, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray17, ' ');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray24);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.addAll(charArray7, charArray24);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.add(charArray24, 'a');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.clone(charArray24);
        boolean boolean30 = org.apache.commons.lang3.StringUtils.containsAny("EN-US", charArray29);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category1);
        java.lang.String str4 = locale3.getLanguage();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("ja_JP", locale3);
        java.lang.String str6 = locale3.getISO3Language();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ja_jp" + "'", str5, "ja_jp");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "eng" + "'", str6, "eng");
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Chinese (China)", "h{0,-1}{0,-1", 107);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) (byte) 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        java.lang.Short[] shortArray9 = new java.lang.Short[] { (short) 0 };
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray9, (short) (byte) 1);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray11);
        java.lang.Short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray11);
        java.lang.Short[] shortArray15 = new java.lang.Short[] { (short) 0 };
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray15, (short) (byte) 1);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray11, shortArray17);
        java.lang.Short[] shortArray20 = new java.lang.Short[] { (short) 0 };
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray20, (short) (byte) 1);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray22);
        java.lang.Short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray22);
        java.lang.Short[] shortArray26 = new java.lang.Short[] { (short) 0 };
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray26, (short) (byte) 1);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray22, shortArray28);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray17, shortArray29);
        java.lang.Short[] shortArray32 = new java.lang.Short[] { (short) 0 };
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray32, (short) (byte) 1);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.contains(shortArray34, (short) 0);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray34, (short) -1);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray30, shortArray38);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray30);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (short) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray3);
        java.lang.Short[] shortArray45 = new java.lang.Short[] { (short) 0 };
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray45, (short) (byte) 1);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray47);
        java.lang.Short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray47);
        java.lang.Short[] shortArray51 = new java.lang.Short[] { (short) 0 };
        short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray51, (short) (byte) 1);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray47, shortArray53);
        java.lang.Short[] shortArray56 = new java.lang.Short[] { (short) 0 };
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray56, (short) (byte) 1);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray58);
        java.lang.Short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray58);
        java.lang.Short[] shortArray62 = new java.lang.Short[] { (short) 0 };
        short[] shortArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray62, (short) (byte) 1);
        short[] shortArray65 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray58, shortArray64);
        short[] shortArray66 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray53, shortArray65);
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray53, (short) 0);
        java.lang.Short[] shortArray69 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray53);
        int int72 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray53, (short) 1, (int) (byte) 1);
        short[] shortArray73 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray53);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.contains(shortArray53, (short) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[0]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[0]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[0]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[0, 100]");
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
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[0]");
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray66), "[0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
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
        java.util.Locale.Builder builder21 = builder0.setLanguageTag("FRA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder21.setRegion("TEDESCO (GERMANIA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: TEDESCO (GERMANIA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
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
        java.lang.Short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray22);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray22);
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
        org.junit.Assert.assertNotNull(shortArray23);
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\u610f\u5927\u5229\u6587", "ANGLAIS (ETATS-UNIS)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str2, "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587                                                 -1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        byte[] byteArray0 = null;
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, 5, 39);
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a', (int) (short) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, ' ');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray15);
        java.lang.Character[] charArray19 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray19, 'u');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray21, '#');
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.clone(charArray23);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray25, ' ');
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ETRUEFALSE                                          rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,e", charArray25);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("fRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIA", "\u82f1\u8a9e\u30a2en_US             aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) (byte) 1);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray3 = new double[] { 4, 100L };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray3, (int) '4', 5);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 2, 0, (double) 100);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray0, (java.lang.Object) 100, (int) (short) 100);
        java.lang.Double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray13, (double) 42);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, 100.0d);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray17, (double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) 0);
        java.lang.Byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        java.lang.Byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray20);
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
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) 5, (-1.0d));
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 10.0]");
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3, true);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray8, false);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        boolean[] booleanArray17 = new boolean[] { false, false, false, false, true };
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray17, (int) (byte) -1, (int) '#');
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray21, true);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.add(booleanArray23, true);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray23, 2);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray27);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray27);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray27, true);
        java.lang.Boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray27);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray8, booleanArray27);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, true, true]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)", "uuuuuuuuuuuuuuuuuu     ", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
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
        float[] floatArray52 = new float[] { 100, (byte) -1, (-1) };
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray52);
        float[] floatArray54 = org.apache.commons.lang3.ArrayUtils.clone(floatArray52);
        float[] floatArray55 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray54);
        float[] floatArray57 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray55, (float) (byte) 0);
        float[] floatArray58 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray59 = new float[] {};
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray59);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray58, floatArray59);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray58);
        float[] floatArray63 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray58);
        float[] floatArray64 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        float[] floatArray65 = new float[] {};
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray65);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray64, floatArray65);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray64);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray58, floatArray64);
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray64);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray55, floatArray64);
        java.lang.Float[] floatArray77 = new java.lang.Float[] { 1.0f, 10.0f, 100.0f, 1.0f, 100.0f };
        float[] floatArray78 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray77);
        java.lang.Float[] floatArray79 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray77);
        float[] floatArray81 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray77, (float) '#');
        java.lang.Float[] floatArray82 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray77);
        java.lang.Float[] floatArray83 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray77);
        java.lang.Object obj84 = objMap15.replace((java.lang.Object) floatArray55, (java.lang.Object) floatArray83);
        java.lang.Boolean[] booleanArray89 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray90 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray89);
        boolean[] booleanArray92 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray89, true);
        boolean[] booleanArray93 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray89);
        boolean[] booleanArray94 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray89);
        java.lang.Object obj95 = objMap15.put((java.lang.Object) "French (France)", (java.lang.Object) booleanArray89);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet96 = objMap15.entrySet();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "english");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "english");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "english");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "english");
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
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[]");
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[]");
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[]");
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertNotNull(floatArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray78), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray79);
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray81), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray82);
        org.junit.Assert.assertNotNull(floatArray83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(booleanArray89);
        org.junit.Assert.assertNotNull(booleanArray90);
        org.junit.Assert.assertNotNull(booleanArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray92), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray93), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray94), "[true, true, false]");
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNotNull(objEntrySet96);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("CN", "fran\347ais (France)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        java.lang.String str10 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray5);
        boolean[] booleanArray16 = new boolean[] { false, false, false, false, true };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray16);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray16, true);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, (int) (short) 0, false);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray16);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray16);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, 69, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 69, Length: 5");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, false, false, true, false, false, false, false, true]");
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd", "kokokokokokokokokokokokokokoja_J", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("u uu ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        char[] charArray22 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray22, 'a', (int) (short) 10);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray22, ' ');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray14, charArray22);
        java.lang.Character[] charArray29 = org.apache.commons.lang3.ArrayUtils.toObject(charArray14);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray30);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "######{false,false,false,false,true", charArray30);
        char[] charArray39 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray39, 'a', (int) (short) 10);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray39, 'u');
        java.lang.Character[] charArray45 = org.apache.commons.lang3.ArrayUtils.toObject(charArray39);
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray45);
        java.lang.Character[] charArray47 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray45);
        java.lang.Character[] charArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray47);
        java.lang.Character[] charArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray47);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray30, (java.lang.Object) charArray49);
        java.lang.Character[] charArray51 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray49);
        char[] charArray53 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray51, ' ');
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[ ,  , 4,  , a, 4]");
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u82f1\u8a9e\u30a2EN_US", "Chinese");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str2, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ADaAEaAFaAGaAIaALa-1.0-1.0100.0WSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
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
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.subarray(longArray26, 10, (int) (byte) 100);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray26);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray30, (long) (short) 10, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, 'x');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.subarray(charArray12, 98, 213);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.subarray(charArray12, (int) 'x', (int) 'u');
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, 'a');
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "{0,-1}", charArray20);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[u,  , u, u, u]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("_ng_ng_ng_ng_", "\u65e5\u672c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444FRANCE                ", "{false,fa  {false,false,false,false,true}  laf,eslaf");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (byte) -1);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, 117);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray7, 98);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, 10.0d);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category7, locale8);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Locale.Category[] categoryArray12 = new java.util.Locale.Category[] { category7, category10 };
        java.util.Locale.Category[][] categoryArray13 = new java.util.Locale.Category[][] { categoryArray12 };
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category14, locale15);
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.util.Locale.Category[] categoryArray19 = new java.util.Locale.Category[] { category14, category17 };
        java.util.Locale.Category[][] categoryArray20 = new java.util.Locale.Category[][] { categoryArray19 };
        java.util.Locale.Category category21 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category21, locale22);
        java.util.Locale.Category category24 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale25 = java.util.Locale.getDefault(category24);
        java.util.Locale.Category[] categoryArray26 = new java.util.Locale.Category[] { category21, category24 };
        java.util.Locale.Category[][] categoryArray27 = new java.util.Locale.Category[][] { categoryArray26 };
        java.util.Locale.Category[][][] categoryArray28 = new java.util.Locale.Category[][][] { categoryArray13, categoryArray20, categoryArray27 };
        java.util.Locale.Category category30 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category31 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category32 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category33 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category34 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale35 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category34, locale35);
        java.util.Locale.Category category37 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale38 = java.util.Locale.getDefault(category37);
        java.util.Locale.Category[] categoryArray39 = new java.util.Locale.Category[] { category30, category31, category32, category33, category34, category37 };
        java.util.Locale.Category category40 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category41 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category42 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category43 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category44 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale45 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category44, locale45);
        java.util.Locale.Category category47 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale48 = java.util.Locale.getDefault(category47);
        java.util.Locale.Category[] categoryArray49 = new java.util.Locale.Category[] { category40, category41, category42, category43, category44, category47 };
        java.util.Locale.Category[][] categoryArray50 = new java.util.Locale.Category[][] { categoryArray39, categoryArray49 };
        java.util.Locale.Category[][] categoryArray53 = org.apache.commons.lang3.ArrayUtils.subarray(categoryArray50, (int) '#', 35);
        java.util.Locale.Category[][][] categoryArray54 = org.apache.commons.lang3.ArrayUtils.add(categoryArray28, 0, categoryArray53);
        java.lang.Cloneable[] cloneableArray55 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Cloneable[]) categoryArray28);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) doubleArray6, (java.lang.Object[]) categoryArray28);
        java.util.Locale.Category category57 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category58 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category59 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category60 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category61 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale62 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category61, locale62);
        java.util.Locale.Category category64 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale65 = java.util.Locale.getDefault(category64);
        java.util.Locale.Category[] categoryArray66 = new java.util.Locale.Category[] { category57, category58, category59, category60, category61, category64 };
        java.util.Locale.Category category67 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category68 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category69 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category70 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category71 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale72 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category71, locale72);
        java.util.Locale.Category category74 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale75 = java.util.Locale.getDefault(category74);
        java.util.Locale.Category[] categoryArray76 = new java.util.Locale.Category[] { category67, category68, category69, category70, category71, category74 };
        java.util.Locale.Category[][] categoryArray77 = new java.util.Locale.Category[][] { categoryArray66, categoryArray76 };
        java.util.Locale.Category[][] categoryArray80 = org.apache.commons.lang3.ArrayUtils.subarray(categoryArray77, (int) '#', 35);
        java.lang.Enum<java.util.Locale.Category>[][] categoryEnumArray83 = org.apache.commons.lang3.ArrayUtils.subarray((java.lang.Enum<java.util.Locale.Category>[][]) categoryArray80, 7, (int) 'a');
        java.lang.Enum<java.util.Locale.Category>[][][] categoryEnumArray84 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Enum<java.util.Locale.Category>[][][]) categoryArray28, (java.lang.Enum<java.util.Locale.Category>[][]) categoryArray80);
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.isNotEmpty((java.lang.Enum<java.util.Locale.Category>[][]) categoryArray80);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray12);
        org.junit.Assert.assertNotNull(categoryArray13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.FORMAT + "'", category17.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray19);
        org.junit.Assert.assertNotNull(categoryArray20);
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.FORMAT + "'", category21.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.FORMAT + "'", category24.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray26);
        org.junit.Assert.assertNotNull(categoryArray27);
        org.junit.Assert.assertNotNull(categoryArray28);
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category30.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category31 + "' != '" + java.util.Locale.Category.FORMAT + "'", category31.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category32 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category32.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.FORMAT + "'", category33.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category34 + "' != '" + java.util.Locale.Category.FORMAT + "'", category34.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category37 + "' != '" + java.util.Locale.Category.FORMAT + "'", category37.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray39);
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category40.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category41 + "' != '" + java.util.Locale.Category.FORMAT + "'", category41.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category42 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category42.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category43 + "' != '" + java.util.Locale.Category.FORMAT + "'", category43.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category44 + "' != '" + java.util.Locale.Category.FORMAT + "'", category44.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category47 + "' != '" + java.util.Locale.Category.FORMAT + "'", category47.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray49);
        org.junit.Assert.assertNotNull(categoryArray50);
        org.junit.Assert.assertNotNull(categoryArray53);
        org.junit.Assert.assertNotNull(categoryArray54);
        org.junit.Assert.assertNotNull(cloneableArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + category57 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category57.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category58 + "' != '" + java.util.Locale.Category.FORMAT + "'", category58.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category59 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category59.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category60 + "' != '" + java.util.Locale.Category.FORMAT + "'", category60.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category61 + "' != '" + java.util.Locale.Category.FORMAT + "'", category61.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category64 + "' != '" + java.util.Locale.Category.FORMAT + "'", category64.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray66);
        org.junit.Assert.assertTrue("'" + category67 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category67.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category68 + "' != '" + java.util.Locale.Category.FORMAT + "'", category68.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category69 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category69.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category70 + "' != '" + java.util.Locale.Category.FORMAT + "'", category70.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category71 + "' != '" + java.util.Locale.Category.FORMAT + "'", category71.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category74 + "' != '" + java.util.Locale.Category.FORMAT + "'", category74.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray76);
        org.junit.Assert.assertNotNull(categoryArray77);
        org.junit.Assert.assertNotNull(categoryArray80);
        org.junit.Assert.assertNotNull(categoryEnumArray83);
        org.junit.Assert.assertNotNull(categoryEnumArray84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("  {false,false,false,false,true}  ");
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category3, locale4);
        java.util.Locale locale6 = java.util.Locale.getDefault(category3);
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale7.toLanguageTag();
        java.lang.String str9 = locale7.getScript();
        java.util.Locale.setDefault(category3, locale7);
        java.util.Locale locale11 = java.util.Locale.US;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale12.toLanguageTag();
        java.util.Locale.setDefault(category3, locale12);
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clear();
        java.util.Locale locale17 = builder15.build();
        java.util.Locale.setDefault(category3, locale17);
        java.util.Locale locale19 = locale17.stripExtensions();
        java.lang.String str20 = locale17.getISO3Language();
        java.lang.String str21 = locale2.getDisplayName(locale17);
        java.lang.String str22 = locale17.getCountry();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587katlatmatnatoatrattatvatwatzauaaugaumausauyauzavaavcaveavgaviavnavuawfawsayeaytazaazmazw", locale17);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en-US" + "'", str8, "en-US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-US" + "'", str13, "en-US");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587katlatmatnatoatrattatvatwatzauaaugaumausauyauzavaavcaveavgaviavnavuawfawsayeaytazaazmazw" + "'", str23, "\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587katlatmatnatoatrattatvatwatzauaaugaumausauyauzavaavcaveavgaviavnavuawfawsayeaytazaazmazw");
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("{true,false,false,false,false,true,true,false}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{true,false,false,false,false,true,true,false}" + "'", str1, "{true,false,false,false,false,true,true,false}");
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\u30b9\u30ea\u30ae\u30a4\u8a9e\u82f1");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ANGLAIS(ETATS-UNIS)                                                                                                  ", "english");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale.Builder builder7 = builder4.setLocale(locale5);
        java.lang.String str8 = locale5.getISO3Country();
        java.lang.String str9 = locale5.getVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KOR" + "'", str6, "KOR");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KOR" + "'", str8, "KOR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("e}  laf,eslafu{false,fa  {false,false,false,false,tr", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, (int) (short) 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) 0L);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray7, (double) 1L);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, (-1.0d));
        java.lang.Boolean[] booleanArray17 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray17);
        java.lang.Double[] doubleArray25 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray25, (double) (short) 0);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray27);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray17, (java.lang.Object) doubleArray27, 4);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray27);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, (double) (byte) 100);
        java.lang.Double[] doubleArray36 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray36, (double) (byte) -1);
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray36);
        double[] doubleArray41 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray39, (int) (short) 1);
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray33, doubleArray39);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray42);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray13, doubleArray42);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray46 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray13, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 95, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, -1.0, 100.0, 1.0, 100.0, 1.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
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
        java.util.Set<java.lang.Object> objSet16 = objMap15.keySet();
        boolean boolean18 = objMap15.equals((java.lang.Object) "                       ");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "english");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "english");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "english");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "english");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertNotNull(objSet16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "1 100 35 10", (java.lang.CharSequence) "ja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_Jja_-1.0-1.0100.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("true true false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true true false" + "'", str1, "true true false");
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        boolean[] booleanArray17 = new boolean[] { false, false, false, false, true };
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray17, (int) (byte) -1, (int) '#');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray17);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray17);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray23, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray23, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 48, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, false, false]");
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray13);
        char[] charArray21 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray21, 'a', (int) (short) 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray21, ' ');
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray13, charArray21);
        java.lang.Character[] charArray28 = org.apache.commons.lang3.ArrayUtils.toObject(charArray13);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray28);
        java.lang.Character[] charArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray28);
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
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray30);
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("ja_JP", "eTATS-uNIS", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        java.lang.Short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2);
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 0 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) (byte) 1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray5);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) (byte) 10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray11, (short) (byte) 1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray11, (short) 100, 756);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(shortArray11, (short) -1);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray11);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "uNITED sTATES");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\u4e2d\u56fd                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u56fd" + "'", str1, "\u4e2d\u56fd");
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUNITED STATESUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUNITED STATESUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUNITED STATESUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray13);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.add(charArray13, ' ');
        char[] charArray23 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray23, 'a', (int) (short) 10);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray23, ' ');
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray23, ' ');
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray30);
        char[] charArray38 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray38, 'a', (int) (short) 10);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray38, ' ');
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray30, charArray38);
        java.lang.Character[] charArray45 = org.apache.commons.lang3.ArrayUtils.toObject(charArray30);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray16, charArray30);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray30);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray50 = org.apache.commons.lang3.ArrayUtils.add(charArray30, 12, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Length: 5");
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, 4,  ]");
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
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
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
        java.util.Locale locale10 = builder9.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.setExtension('#', "\u65e5\u6587\u65e5\u672c)0");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
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
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        long[] longArray17 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray17, 0L);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray19, (long) 3, (int) '#');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray8, longArray19);
        java.lang.Long[] longArray24 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 333);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "Italian (Italy)aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        java.lang.String[] strArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "0a-1");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u6cd5\u6587\u6cd5\u56fd)");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("truetruefalse", strArray5, strArray11);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "truetruefalse" + "'", str12, "truetruefalse");
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("French (France)", "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2\u8a9e\u82f11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse", "falsefalsefalsefalsetrue", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuunited statesuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("0153001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=0153001");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "k");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "0");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("{false,false,false,false,true", strArray3);
        java.util.Map<java.lang.Object, java.lang.Object> objMap6 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Chinese", "{fnlse,fnlse,fnlse,fnlse,trne");
        boolean boolean10 = objMap6.containsKey((java.lang.Object) "Chinese");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("}eurt,esla", " ");
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("etruefalse", strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = objMap6.put((java.lang.Object) str17, obj18);
        objMap6.clear();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objMap6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}eurt,esla" + "'", str17, "}eurt,esla");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                   UNITED STATES");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                   UNITED STATES" + "'", str1, "                   UNITED STATES");
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 10);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray7, (byte) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 10, 95);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale0.getDisplayScript(locale3);
        java.util.Locale locale6 = locale0.stripExtensions();
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category7);
        java.lang.String str10 = locale0.getDisplayScript(locale9);
        java.util.Locale locale13 = new java.util.Locale("it", "ANGLAIS (eTATS-uNIS)");
        java.lang.String str14 = locale9.getDisplayScript(locale13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u7f8e\u570b" + "'", str2, "\u7f8e\u570b");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale13.toString(), "it_ANGLAIS (ETATS-UNIS)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aitalianaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aitalianaa" + "'", str1, "aitalianaa");
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxChine", "Japanisch (Japan)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "  {false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (", (java.lang.CharSequence) "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
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
            java.util.Locale.Builder builder43 = builder40.setUnicodeLocaleKeyword("\u65e5\u6587\u65e5\u672c)0", "fr-FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 1?? (??)0 [at index 0]");
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
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                           CHINOIS", "  falsefalsefalsefalsetrue  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray3);
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 0 };
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) 1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray9);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (short) (byte) -1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray12);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray12);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray15);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, -1]");
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (byte) 0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) ' ');
        int[] intArray13 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray13);
        int[] intArray15 = new int[] {};
        int[] intArray19 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray19);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.add(intArray19, 0, 4);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.addAll(intArray15, intArray19);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray13, intArray15);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.addAll(intArray9, intArray13);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray26);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(intArray26, (int) (short) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray26);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 0, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 35, -1, 32, 0, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 3, (int) '#');
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 0L);
        long[] longArray13 = new long[] { 'a' };
        long[] longArray20 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.addAll(longArray13, longArray20);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.add(longArray21, (int) (short) 1, (long) (byte) 1);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray21);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.subarray(longArray21, 0, 95);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.add(longArray28, (long) 23);
        java.lang.Long[] longArray31 = org.apache.commons.lang3.ArrayUtils.toObject(longArray28);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray28, (long) 42);
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
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 10, 10, 35, -1, 35, -1, 23]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        char[] charArray3 = new char[] { ' ', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray3);
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("en-US", "English");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray5, (java.lang.Object) strArray8, (int) 'a');
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, 'u');
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray15);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , a]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh-CN");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str7 = locale5.getUnicodeLocaleType("TW");
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("zh_CN", locale9);
        java.util.Set<java.lang.Character> charSet12 = locale9.getExtensionKeys();
        java.util.Set<java.lang.String> strSet13 = locale9.getUnicodeLocaleKeys();
        java.lang.String str14 = locale5.getDisplayCountry(locale9);
        boolean boolean15 = languageRange1.equals((java.lang.Object) str14);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-cn" + "'", str3, "zh-cn");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ZH_CN" + "'", str11, "ZH_CN");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str14, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "97United States1United States10United States10United States35United States-1United States35United States-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
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
        java.lang.String str14 = locale6.getVariant();
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale6.getDisplayLanguage(locale15);
        java.lang.String str18 = locale6.getDisplayCountry();
        java.lang.String str19 = locale6.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u6cd5\u6587" + "'", str17, "\u6cd5\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u6cd5\u570b" + "'", str18, "\u6cd5\u570b");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u6cd5\u6587\u6cd5\u570b)" + "'", str19, "\u6cd5\u6587\u6cd5\u570b)");
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AUTOSELEC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("COREANO", "it-IT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap3 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, 'COREANO', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("ZH-CN", "it_IT", 95, 333);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ZH-CNit_IT" + "'", str4, "ZH-CNit_IT");
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("tru#tru#fals                                    ", "anglais(Etats-Unis)                                                                                                  ", "fr-FR");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "T", "01530011");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  {false,false,false,false,true}   ", 6, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  {false,false,false,false,true}   " + "'", str3, "  {false,false,false,false,true}   ");
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaSoath Korea");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAsOATH kOREA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAsOATH kOREA");
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("{false,fal", "aaaaaaaaaaah{0,-1}{0,German (Germany)h{0,-1}{0,-");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
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
        int[] intArray44 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray44);
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray44, (int) '4');
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.add(intArray47, 5);
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.addAll(intArray40, intArray49);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray40, 6);
        int[] intArray54 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray40, 7);
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
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 35, 0, 5]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1, 5, -1, 35, 0, 5]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1, 5]");
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("xxxxxxxxxx", "fr_FR", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("zh_CN", "\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229) ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_CN" + "'", str2, "zh_CN");
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) 'a');
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, 7, (int) (byte) 100);
        java.lang.Short[] shortArray14 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray17 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray20 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray23 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[][] shortArray24 = new java.lang.Short[][] { shortArray14, shortArray17, shortArray20, shortArray23 };
        java.lang.Short[][][] shortArray25 = new java.lang.Short[][][] { shortArray24 };
        int[] intArray26 = new int[] {};
        int[] intArray30 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray30);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.add(intArray30, 0, 4);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.addAll(intArray26, intArray30);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.add(intArray26, 0);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray39);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray26, intArray40);
        java.lang.Short[][][] shortArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray25, (java.lang.Object) intArray26);
        int[] intArray43 = org.apache.commons.lang3.ArrayUtils.addAll(intArray11, intArray26);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray11, (-1), 39);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 35, 0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[10]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "fRENCH (fRANCE)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\u110b\u1175\u11af\u1107\u1169\u11ab\u110b\u1165", (int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u110b\u1175\u11af\u1107\u1169\u11ab\u110b\u1165                                             " + "'", str2, "\u110b\u1175\u11af\u1107\u1169\u11ab\u110b\u1165                                             ");
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (int) (short) 100, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 0]");
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EN_gb" + "'", str1, "EN_gb");
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("ITALIAN", "{false,..", 48);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN" + "'", str3, "ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN{false,..ITALIAN");
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444FRANCE                ", "aaeaafaa", 21);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  {false,false,false,false,true}  ", "\u52a0\u62ff\u5927", 100);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("Chinese (China)", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        java.lang.String str10 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray5);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray5);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.add(booleanArray11, 17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 17, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{false,false,false,false,true}" + "'", str10, "{false,false,false,false,true}");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        java.lang.Character[] charArray3 = new java.lang.Character[] { ' ', ' ', 'a' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, '4');
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, 'a', 743);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , a]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444france                ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, (int) (short) 1);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, (-1), 0);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray7, (double) '#');
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) '4', (double) ' ');
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) 10L, (double) 1.0f);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("RK_ok{fnlse,fnlse,fnlse,fnlse,trne", "tru#tru#fal");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                          cor\351en (Cor\351e du Sud)", (int) (short) 100, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                          cor\351en (Cor\351e du Sud)                                     " + "'", str3, "                                          cor\351en (Cor\351e du Sud)                                     ");
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "}eurt,esl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("UED", "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", "                                           etruefalse                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UED" + "'", str3, "UED");
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Locale locale9 = java.util.Locale.US;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.lang.String str13 = locale8.getDisplayLanguage();
        java.lang.String str14 = locale8.getDisplayVariant();
        java.lang.String str15 = locale8.getDisplayLanguage();
        java.lang.String str16 = locale8.getDisplayName();
        java.lang.String str17 = locale7.getDisplayVariant(locale8);
        java.util.Locale locale19 = java.util.Locale.TAIWAN;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.upperCase("eng", locale19);
        java.lang.String str22 = locale7.getDisplayName(locale19);
        java.lang.String str23 = locale7.getDisplayScript();
        java.util.Locale.Builder builder24 = builder6.setLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder24.setExtension('u', "{97,1,10,10,35,-1,35,-1}lse,false,false,false,true");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: {97,1,10,10,35, [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en-US" + "'", str11, "en-US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str13, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str15, "\u7fa9\u5927\u5229\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229)" + "'", str16, "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ENG" + "'", str21, "ENG");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u6cd5\u6587" + "'", str22, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" trutrufals  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " trutrufals " + "'", str1, " trutrufals ");
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "deuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (java.lang.CharSequence) "jpn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("444444444444444444444ITALIEN (iTALIE)44444444444444444444444444444444444444444444444444", "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444ITALIEN (iTALIE)44444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444ITALIEN (iTALIE)44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh-CN");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        int[] intArray9 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray9);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray9, (int) (short) 0, (int) (byte) 0);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.add(intArray9, (int) ' ');
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray9, 221);
        java.lang.Integer[] intArray18 = org.apache.commons.lang3.ArrayUtils.toObject(intArray9);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(intArray9, (int) 'x');
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("US");
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray22, "  {FPFPFPFPNPJ   ");
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray22);
        int[] intArray29 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray29);
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.add(intArray29, 0, 4);
        java.lang.Integer[] intArray34 = org.apache.commons.lang3.ArrayUtils.toObject(intArray29);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray25, (java.lang.Object) intArray34, (int) (byte) 1);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray34, (int) (short) 0);
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.addAll(intArray9, intArray38);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray9, 10);
        boolean boolean42 = languageRange1.equals((java.lang.Object) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-cn" + "'", str2, "zh-cn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-cn" + "'", str3, "zh-cn");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-cn" + "'", str5, "zh-cn");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 35, 0, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, 35, 0, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444itali", (-1), "anglais(Etats-Unis)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444itali" + "'", str3, "44444itali");
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray0 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray1 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray2 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray3 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][][] arrayUtilsArray4 = new org.apache.commons.lang3.ArrayUtils[][][] { arrayUtilsArray0, arrayUtilsArray1, arrayUtilsArray2, arrayUtilsArray3 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray5 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray6 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray7 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray8 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][][] arrayUtilsArray9 = new org.apache.commons.lang3.ArrayUtils[][][] { arrayUtilsArray5, arrayUtilsArray6, arrayUtilsArray7, arrayUtilsArray8 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray10 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray11 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray12 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray13 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][][] arrayUtilsArray14 = new org.apache.commons.lang3.ArrayUtils[][][] { arrayUtilsArray10, arrayUtilsArray11, arrayUtilsArray12, arrayUtilsArray13 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray15 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray16 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray17 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray18 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][][] arrayUtilsArray19 = new org.apache.commons.lang3.ArrayUtils[][][] { arrayUtilsArray15, arrayUtilsArray16, arrayUtilsArray17, arrayUtilsArray18 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray20 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray21 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray22 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray23 = new org.apache.commons.lang3.ArrayUtils[][] {};
        org.apache.commons.lang3.ArrayUtils[][][] arrayUtilsArray24 = new org.apache.commons.lang3.ArrayUtils[][][] { arrayUtilsArray20, arrayUtilsArray21, arrayUtilsArray22, arrayUtilsArray23 };
        org.apache.commons.lang3.ArrayUtils[][][][] arrayUtilsArray25 = new org.apache.commons.lang3.ArrayUtils[][][][] { arrayUtilsArray4, arrayUtilsArray9, arrayUtilsArray14, arrayUtilsArray19, arrayUtilsArray24 };
        org.apache.commons.lang3.ArrayUtils[][][][] arrayUtilsArray27 = org.apache.commons.lang3.ArrayUtils.remove(arrayUtilsArray25, 0);
        char[] charArray34 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray34, 'a', (int) (short) 10);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray34, 'u');
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray34, 'u');
        java.lang.Character[] charArray42 = org.apache.commons.lang3.ArrayUtils.toObject(charArray41);
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) arrayUtilsArray27, (java.lang.Object) charArray41);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) arrayUtilsArray27);
        org.junit.Assert.assertNotNull(arrayUtilsArray0);
        org.junit.Assert.assertNotNull(arrayUtilsArray1);
        org.junit.Assert.assertNotNull(arrayUtilsArray2);
        org.junit.Assert.assertNotNull(arrayUtilsArray3);
        org.junit.Assert.assertNotNull(arrayUtilsArray4);
        org.junit.Assert.assertNotNull(arrayUtilsArray5);
        org.junit.Assert.assertNotNull(arrayUtilsArray6);
        org.junit.Assert.assertNotNull(arrayUtilsArray7);
        org.junit.Assert.assertNotNull(arrayUtilsArray8);
        org.junit.Assert.assertNotNull(arrayUtilsArray9);
        org.junit.Assert.assertNotNull(arrayUtilsArray10);
        org.junit.Assert.assertNotNull(arrayUtilsArray11);
        org.junit.Assert.assertNotNull(arrayUtilsArray12);
        org.junit.Assert.assertNotNull(arrayUtilsArray13);
        org.junit.Assert.assertNotNull(arrayUtilsArray14);
        org.junit.Assert.assertNotNull(arrayUtilsArray15);
        org.junit.Assert.assertNotNull(arrayUtilsArray16);
        org.junit.Assert.assertNotNull(arrayUtilsArray17);
        org.junit.Assert.assertNotNull(arrayUtilsArray18);
        org.junit.Assert.assertNotNull(arrayUtilsArray19);
        org.junit.Assert.assertNotNull(arrayUtilsArray20);
        org.junit.Assert.assertNotNull(arrayUtilsArray21);
        org.junit.Assert.assertNotNull(arrayUtilsArray22);
        org.junit.Assert.assertNotNull(arrayUtilsArray23);
        org.junit.Assert.assertNotNull(arrayUtilsArray24);
        org.junit.Assert.assertNotNull(arrayUtilsArray25);
        org.junit.Assert.assertNotNull(arrayUtilsArray27);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaah{0,-1}{0,German (Germany)h{0,-1}{0,-", (java.lang.CharSequence) "-101");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("\uc911\uad6d", "44444444444444444444444444Frnce", 9);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d" + "'", str3, "\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d");
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("}eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
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
        int int81 = objMap15.size();
        double[] doubleArray84 = new double[] { 4, 100L };
        double[] doubleArray87 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray84, (int) '4', 5);
        double[] doubleArray89 = org.apache.commons.lang3.ArrayUtils.add(doubleArray87, (double) (-1.0f));
        int int92 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray89, (double) 10.0f, (double) 21);
        boolean boolean95 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray89, (-1.0d), (double) 10);
        double[] doubleArray97 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray89, 100.0d);
        java.lang.Double[] doubleArray98 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray97);
        boolean boolean99 = objMap15.containsKey((java.lang.Object) doubleArray97);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
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
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(doubleArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray97), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                ENG                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENG" + "'", str1, "ENG");
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  {false,false,false,false,true}  ", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.lang.String str5 = locale4.getDisplayScript();
        java.util.Locale locale8 = java.util.Locale.US;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("", locale8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", locale8);
        java.lang.String str12 = locale4.getDisplayLanguage(locale8);
        java.lang.String str13 = locale4.getDisplayCountry();
        java.util.Locale.Builder builder14 = builder3.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder3.setUnicodeLocaleKeyword("                                                                               cor\351en (Cor\351e du Sud)", "        ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:                                                                                core?en (Core?e du Sud) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510" + "'", str11, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "German" + "'", str12, "German");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("0.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.00.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.01.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.01.0", "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 0.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.00.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.01.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.01.0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale2 = java.util.Locale.US;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.String str5 = locale3.getScript();
        java.lang.String str6 = locale0.getDisplayName(locale3);
        java.lang.String str7 = locale3.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese (China)" + "'", str6, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u7f8e\u56fd" + "'", str7, "\u7f8e\u56fd");
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                        aj", "{false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (", "US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        aj" + "'", str3, "                                        aj");
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...lse,f", (int) (short) 1, "\u610f\u5927\u5229aaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...lse,f" + "'", str3, "...lse,f");
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("\u4e2d\u56fd\u8a9e", "\u6cd5\u6587xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ??? [at index 0]");
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
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)", "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        java.lang.Character[] charArray5 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray5, (java.lang.Object) builder9, 4);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, 'a');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray14, 'u');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray14, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray14);
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
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "uuu u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "uuu u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[u, u, u,  , u]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , u, u, u]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[u,  , u, u, u]");
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-9)enihC( sionihc-", "                                                hi!                                                 ", "ZH_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-" + "'", str3, "9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-");
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.addUnicodeLocaleAttribute("it_it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: it_it [at index 0]");
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
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("97United States1United States10United States10United States35United States-1United States35United States-1", "u uuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97United States1United States10United States10United States35United States-1United States35United States-1" + "'", str2, "97United States1United States10United States10United States35United States-1United States35United States-1");
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray5);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray7);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 100.0, 0.0]");
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, 'x');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.subarray(charArray12, 98, 213);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray12, ' ');
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "[ , hi!, en-us,  ]   jpnpfpfpfpf{        [", charArray12);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) (short) 0);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray3, (java.lang.Object) doubleArray13, 4);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3, true);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray18, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray18, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
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
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...lse,f", "\u7f8e\u56fd", "zH_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...lse,f" + "'", str3, "...lse,f");
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) (byte) 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (short) -1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray9);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(shortArray9, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, 743, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 743, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[0]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0, -1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\u7fa9\u5927\u5229", "tru#tru#fal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\u5229\u5927\u610f\u6587\u5229\u5927\u610f", "a");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("chinois", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("\u610f\u5927\u5229\u6587", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class[] classArray3 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray4 = (java.lang.Class<?>[]) classArray3;
        wildcardClassArray4[0] = wildcardClass1;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass8;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass15;
        java.lang.Class[][] classArray22 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray23 = (java.lang.Class<?>[][]) classArray22;
        wildcardClassArray23[0] = wildcardClassArray4;
        wildcardClassArray23[1] = wildcardClassArray11;
        wildcardClassArray23[2] = wildcardClassArray18;
        java.lang.Class<?>[][] wildcardClassArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(wildcardClassArray23, (java.lang.Object) 'u');
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.Class[] classArray42 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass40;
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        java.lang.Class[] classArray49 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        wildcardClassArray50[0] = wildcardClass47;
        java.lang.Class[][] classArray54 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray55 = (java.lang.Class<?>[][]) classArray54;
        wildcardClassArray55[0] = wildcardClassArray36;
        wildcardClassArray55[1] = wildcardClassArray43;
        wildcardClassArray55[2] = wildcardClassArray50;
        java.lang.Class<?>[][] wildcardClassArray63 = org.apache.commons.lang3.ArrayUtils.removeElement(wildcardClassArray55, (java.lang.Object) 'u');
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray64 = org.apache.commons.lang3.ArrayUtils.addAll((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray23, (java.lang.reflect.GenericDeclaration[][]) wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(genericDeclarationArray64);
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 10);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray8, (byte) 10);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.add(byteArray10, (byte) 10);
        byte[] byteArray13 = null;
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray10, byteArray13);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 1, 1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, 1, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 1, 1]");
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("{false,fa  {false,false,false,false,true}  laf,eslaf");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse", "\u610f\u5927\u5229\u6587\u610f\u5927\u5229");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse" + "'", str2, "True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("10321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051" + "'", str1, "10321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051");
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList54, strMap60);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList54, strMap62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList54, strMap64);
        java.util.Locale locale66 = java.util.Locale.ITALY;
        java.util.Locale locale67 = java.util.Locale.US;
        java.util.Locale locale68 = locale67.stripExtensions();
        java.lang.String str69 = locale68.toLanguageTag();
        java.lang.String str70 = locale66.getDisplayScript(locale68);
        java.lang.String str71 = locale68.getISO3Language();
        java.lang.String str72 = locale68.getLanguage();
        java.util.Set<java.lang.String> strSet73 = locale68.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags(languageRangeList54, (java.util.Collection<java.lang.String>) strSet73);
        java.lang.String str76 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet73, "\u4e2d\u56fd");
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str35, "\u610f\u5927\u5229\u6587");
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
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "en-US" + "'", str69, "en-US");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "eng" + "'", str71, "eng");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "en" + "'", str72, "en");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) (byte) 1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) 0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[]");
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2                    ");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd  slaf#urt#urthsilgnE" + "'", str1, "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd  slaf#urt#urthsilgnE");
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("NPJ", "", "\u82f1\u8a9e\u30a2EN_US             ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u7f8e\u56fd", "truetruefalse", (int) (short) 1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", 213);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE", strArray5, strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(objArray0, (java.lang.Object[]) strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE" + "'", str10, "TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0{0}10.0{0}1.0{0}100.0{0}1.0" + "'", str13, "-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("fr_FR", "United States", "CN");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ne");
        java.lang.String[] strArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("en-us", "Italian");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("anglais(Etats-Unis)                                                                                                  ", "e");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u82f1\u6587{FPFPFPFPNPJ{FPFPFPFP", "\u5fb7\u6587\u5fb7\u56fd)", (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("zh_cn", "etruefalse                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_cn" + "'", str2, "zh_cn");
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toObject(longArray6);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, 0L);
        java.lang.Long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toObject(longArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray6);
        java.lang.Long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toObject(longArray6);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[10, 35, 100, 1]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[1, 100, 35, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(longArray14);
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("e}  laf,eslafu{false,fa  {false,false,false,false,tr", "0 ({FALSE,FALSE,FAJPN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e}  laf,eslafu{false,fa  {false,false,false,false,tr" + "'", str2, "e}  laf,eslafu{false,fa  {false,false,false,false,tr");
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray3);
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 0 };
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) 1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray9);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (short) (byte) -1);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray12, (short) (byte) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray14, (short) (byte) -1, 0);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\u610f\u5927\u5229aaaa", "\u7f8e\u56fd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale7.getVariant();
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.lang.String str12 = locale7.getDisplayVariant(locale11);
        java.lang.String str13 = locale6.getDisplayCountry(locale11);
        java.lang.String str14 = locale0.getDisplayName(locale6);
        java.lang.String str15 = locale0.getISO3Language();
        java.lang.String str16 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u65e5\u6587\u65e5\u672c)" + "'", str1, "\u65e5\u6587\u65e5\u672c)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Japanese (Japan)" + "'", str14, "Japanese (Japan)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "jpn" + "'", str15, "jpn");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ja_JP" + "'", str16, "ja_JP");
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("{false,false,false,false,true", strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray2);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray2, "");
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (-1));
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray2, "italien (Italie)hi!italien (Italie)en-USitalien (Italie)", 15, 15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.01.0" + "'", str6, "-1.01.0");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("{false,false,false,false,tru");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.US;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.lang.String str7 = locale1.getDisplayLanguage(locale4);
        java.lang.String str8 = locale4.getISO3Language();
        java.util.Locale.setDefault(locale4);
        java.lang.String str10 = locale4.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eng" + "'", str8, "eng");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en_US" + "'", str10, "en_US");
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("EN-US");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "TI_ti");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "rt,esluf,esluf,esluf,esluf{                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.add(byteArray3, (byte) -1);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE", (java.lang.Object[]) byteArray7);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, -1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE0{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE-1" + "'", str9, "1{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE0{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE-1");
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\u4e2d", 16, 333);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d" + "'", str3, "\u4e2d");
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " 4hi!4en-us4 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\u6cd5\u570b");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en..." + "'", str1, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en...");
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) 'a');
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, 7, (int) (byte) 100);
        int[] intArray17 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray17, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray17);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray17, (int) (short) 100);
        int[] intArray28 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray28, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray28);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray28, (int) (short) 100);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray28);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray34);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.addAll(intArray17, intArray34);
        int[] intArray42 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray42, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray42);
        int int47 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray42, (int) (short) 100);
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray42);
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.add(intArray42, 5);
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.clone(intArray50);
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.addAll(intArray17, intArray51);
        int[] intArray56 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray56);
        int[] intArray59 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray56, (int) '4');
        int[] intArray61 = org.apache.commons.lang3.ArrayUtils.add(intArray59, 5);
        int[] intArray62 = org.apache.commons.lang3.ArrayUtils.addAll(intArray52, intArray61);
        int[] intArray63 = org.apache.commons.lang3.ArrayUtils.clone(intArray52);
        int[] intArray67 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray67);
        int[] intArray71 = org.apache.commons.lang3.ArrayUtils.add(intArray67, 0, 4);
        int[] intArray75 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean76 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray75);
        int int78 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray75, (int) (byte) 0);
        int[] intArray80 = org.apache.commons.lang3.ArrayUtils.add(intArray75, (int) 'a');
        int[] intArray83 = org.apache.commons.lang3.ArrayUtils.subarray(intArray75, 7, (int) (byte) 100);
        int int86 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray83, 0, 0);
        boolean boolean87 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray71, intArray83);
        boolean boolean88 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray71);
        int[] intArray89 = org.apache.commons.lang3.ArrayUtils.addAll(intArray63, intArray71);
        boolean boolean90 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray3, intArray63);
        boolean boolean91 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray63);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 35, 0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 35, 0, 5]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1, 5, -1, 35, 0, 5]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 35, 0, 97]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1, 5, 4, -1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("it_IT", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it_IT" + "'", str2, "it_IT");
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                eng                                                 ", "ANGLAIS (eTATS-uNIS)", 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                eng                                                 " + "'", str3, "                                                eng                                                 ");
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    " + "'", str1, "                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ");
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("{false,false,false,false,true", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("}eurt,eslaf,eslaf,eslaf,eslaf{", "11003510");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("{false,false,false,false,true}", strArray4, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.Short[] shortArray12 = new java.lang.Short[] { (short) 0 };
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray12, (short) (byte) 1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(shortArray14, (short) (byte) 100);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray14);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray14);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.add(shortArray14, (short) -1);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray20);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) shortArray20, 42);
        int int24 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("######################################################################################################################################################################################################################################                    ", strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{false,false,false,false,true}" + "'", str9, "{false,false,false,false,true}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("united states");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=unitedstates");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en_GB", "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaafr_fraaaa", "\u4e2d\u6587", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("jpn", "United Statesslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurturtslafurtu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
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
        long[] longArray69 = new long[] { 'a' };
        long[] longArray76 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray77 = org.apache.commons.lang3.ArrayUtils.addAll(longArray69, longArray76);
        long[] longArray80 = org.apache.commons.lang3.ArrayUtils.add(longArray77, (int) (short) 1, (long) (byte) 1);
        boolean boolean81 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray77);
        long[] longArray84 = org.apache.commons.lang3.ArrayUtils.subarray(longArray77, 213, (int) (byte) 1);
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray77);
        java.lang.String[] strArray89 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE", "German", 221);
        java.lang.Object obj90 = objMap15.putIfAbsent((java.lang.Object) longArray77, (java.lang.Object) 221);
        java.util.Set<java.lang.Object> objSet91 = objMap15.keySet();
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
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[97]");
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray84), "[]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(objSet91);
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal", "eTATS-uNIS");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        char[] charArray22 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray22, 'a', (int) (short) 10);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray22, ' ');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray14, charArray22);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U", charArray14);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, 'a', 5);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray35 = org.apache.commons.lang3.ArrayUtils.add(charArray14, (-1), 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        char[] charArray4 = new char[] { ' ', 'a' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray4);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray4);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray4, 'a');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray4);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.clone(charArray4);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "FALSEtru#tru#fals                                    ", charArray10);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , a, a]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ZH-CNit_IT", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        java.lang.Integer[] intArray0 = null;
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("china");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale.Category category10 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Locale.Category category12 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale13 = java.util.Locale.getDefault(category12);
        java.util.Locale.Category[] categoryArray14 = new java.util.Locale.Category[] { category4, category6, category7, category8, category10, category12 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray15 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray14);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray18 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray15, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap19 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray18);
        int int20 = objMap19.size();
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet22, ' ');
        java.lang.Object obj25 = objMap19.get((java.lang.Object) strSet22);
        long[] longArray30 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray30, 0L);
        java.lang.Long[] longArray33 = org.apache.commons.lang3.ArrayUtils.toObject(longArray32);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) longArray33);
        int[] intArray38 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray38);
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray38, (int) '4');
        int[] intArray43 = org.apache.commons.lang3.ArrayUtils.add(intArray41, 5);
        int[] intArray49 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray49, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray49);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray49);
        int[] intArray54 = org.apache.commons.lang3.ArrayUtils.clone(intArray49);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.addAll(intArray41, intArray54);
        java.lang.Object obj56 = objMap19.replace((java.lang.Object) str34, (java.lang.Object) intArray54);
        java.util.Collection<java.lang.Object> objCollection57 = objMap19.values();
        int[] intArray58 = new int[] {};
        int[] intArray62 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray62);
        int[] intArray66 = org.apache.commons.lang3.ArrayUtils.add(intArray62, 0, 4);
        int[] intArray67 = org.apache.commons.lang3.ArrayUtils.addAll(intArray58, intArray62);
        int[] intArray69 = org.apache.commons.lang3.ArrayUtils.add(intArray58, 0);
        int int72 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray69, (int) (byte) 1, 13);
        int[] intArray75 = org.apache.commons.lang3.ArrayUtils.subarray(intArray69, 7, 0);
        java.lang.Object obj76 = objMap19.remove((java.lang.Object) 7);
        boolean boolean77 = languageRange1.equals((java.lang.Object) 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category10.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category12.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNotNull(categoryArray14);
        org.junit.Assert.assertNotNull(categoryEnumArray15);
        org.junit.Assert.assertNotNull(categoryEnumArray18);
        org.junit.Assert.assertNotNull(objMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "11003510" + "'", str34, "11003510");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 35, 0, 5]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, 35, 0, 10, 32, 10, 5, 1]");
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(objCollection57);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[0]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[]");
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.TAIWAN;
        java.lang.String str5 = locale4.getDisplayVariant();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str7 = locale4.getScript();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("444444444444444444444ITALIEN (iTALIE)44444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 444444444444444444444ITALIEN (iTALIE)44444444444444444444444444444444444444444444444444 [at index 0]");
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
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("en(us");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EN(US" + "'", str1, "EN(US");
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ", (java.lang.CharSequence) " FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3, true);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray8, false);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        java.lang.Boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray8, true);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray8, true);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        boolean[] booleanArray1 = new boolean[] { false };
        java.lang.Boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray1);
        java.lang.Boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.removeUnicodeLocaleAttribute("{fnlse,fnlse,fnlse,fnlse,trne");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: {fnlse,fnlse,fnlse,fnlse,trne [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u30a2\u30e1#", "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, (float) 39);
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 10.0f };
        java.lang.Float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, (float) (byte) 10);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        float[] floatArray11 = new float[] {};
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray11);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray11);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (float) 213);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray11);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray3, floatArray10);
        float[] floatArray19 = null;
        float[] floatArray20 = new float[] {};
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray20);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray20);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray20);
        float[] floatArray24 = new float[] {};
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray24);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray24);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray24);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray24);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray19, floatArray20);
        float[] floatArray30 = new float[] {};
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray30);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray30, (int) (short) 10, (int) (short) 1);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray20, floatArray30);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray20, (float) 87, (int) (short) -1);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray10, floatArray20);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[213.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        long[] longArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) 37, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("IT_IT", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("truetruefalse", "en-US", (int) '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray4);
        java.lang.CharSequence[] charSequenceArray6 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{false,false,false,false,true}", '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray10);
        boolean[] booleanArray18 = new boolean[] { false, false, false, false, true };
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray18);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray18, (int) (byte) -1, (int) '#');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray18);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray18);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray18);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray10, (java.lang.Object) booleanArray25, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("y", strArray5, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{false,false,false,false,true}" + "'", str11, "{false,false,false,false,true}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("          ENG", "united states");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        long[] longArray0 = null;
        long[] longArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray0, longArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("etruefalse                                                                                          ", "         ", (int) (short) 10);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        java.util.Locale.FilteringMode[][] filteringModeArray0 = new java.util.Locale.FilteringMode[][] {};
        java.util.Locale.FilteringMode filteringMode2 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.Locale.FilteringMode filteringMode3 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.Locale.FilteringMode filteringMode4 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.Locale.FilteringMode filteringMode5 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.Locale.FilteringMode[] filteringModeArray6 = new java.util.Locale.FilteringMode[] { filteringMode2, filteringMode3, filteringMode4, filteringMode5 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(filteringModeArray6);
        java.util.Locale.FilteringMode[] filteringModeArray10 = org.apache.commons.lang3.ArrayUtils.subarray(filteringModeArray6, 213, (int) (short) 100);
        java.lang.Boolean[] booleanArray14 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray14);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray14, true);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray14);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray14);
        java.util.Locale.FilteringMode[] filteringModeArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(filteringModeArray6, (java.lang.Object) booleanArray19);
        char[] charArray28 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray28, 'a', (int) (short) 10);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray28, ' ');
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray28, ' ');
        char[] charArray42 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray42, 'a', (int) (short) 10);
        char[] charArray52 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray52, 'a', (int) (short) 10);
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray52, ' ');
        char[] charArray59 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray52, ' ');
        char[] charArray60 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray59);
        char[] charArray61 = org.apache.commons.lang3.ArrayUtils.addAll(charArray42, charArray59);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray28, charArray42);
        char[] charArray65 = org.apache.commons.lang3.ArrayUtils.subarray(charArray28, 10, 100);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray28);
        int int67 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "{FALSE,...", charArray28);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) filteringModeArray6, (java.lang.Object) int67);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.FilteringMode[][] filteringModeArray69 = org.apache.commons.lang3.ArrayUtils.add(filteringModeArray0, 5, filteringModeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(filteringModeArray0);
        org.junit.Assert.assertTrue("'" + filteringMode2 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode2.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertTrue("'" + filteringMode3 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode3.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertTrue("'" + filteringMode4 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode4.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertTrue("'" + filteringMode5 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode5.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(filteringModeArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(filteringModeArray10);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, true, false]");
        org.junit.Assert.assertNotNull(filteringModeArray20);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4a 4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4a 4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4, a,  , 4,  ,  ]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\u65e5\u6587", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u6587" + "'", str2, "\u65e5\u6587");
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        java.lang.Double[] doubleArray0 = null;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 8);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        boolean[] booleanArray1 = new boolean[] { false };
        java.lang.Boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray1);
        java.lang.Boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true, 95);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false]");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getScript();
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("fra", 32, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaafraaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaafraaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'u');
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) charArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, ' ', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , 4,  , a, 4]");
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444italien (Italie...aaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaa", "fRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIAfRANCIA", "Chine");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444italien (talie...aaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaa" + "'", str3, "444444444444444444444italien (talie...aaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaa");
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray8, (long) (byte) -1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray8);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray8, (long) (short) 1, 39);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 12);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaafr_FRaaaa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, 1.0d);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 10.0d);
        double[] doubleArray9 = new double[] {};
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray13 = null;
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray9, doubleArray13);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray9, (double) 4, (double) (byte) 10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray9);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 0L);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray6, (float) 0L);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray8, (float) 250, (int) (byte) -1);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 100, 97);
        float[] floatArray21 = new float[] { 10, '#', 3, (byte) -1, 0, (byte) 0 };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray21);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, (int) (short) 1, 10);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray21, (float) (short) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray27);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray27, (float) (byte) 0, 98);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray27);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.clone(floatArray27);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray27);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray27);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[1.0, -1.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, 0.0, -1.0, 3.0, 35.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[0.0, 0.0, -1.0, 3.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 0.0, -1.0, 3.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[0.0, 0.0, -1.0, 3.0, 35.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Collection<java.util.Locale> localeCollection4 = null;
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList16);
        java.util.Locale.FilteringMode filteringMode19 = null;
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList16, filteringMode19);
        java.util.Locale locale21 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleAttributes();
        java.util.Locale locale24 = new java.util.Locale("Italian");
        java.util.Locale locale25 = java.util.Locale.ITALY;
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.util.Locale locale27 = java.util.Locale.US;
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Locale locale29 = java.util.Locale.ITALY;
        java.util.Locale locale30 = java.util.Locale.US;
        java.util.Locale locale31 = locale30.stripExtensions();
        java.lang.String str32 = locale31.toLanguageTag();
        java.lang.String str33 = locale29.getDisplayScript(locale31);
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.util.Locale locale35 = java.util.Locale.ITALY;
        java.util.Locale locale36 = java.util.Locale.US;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.lang.String str38 = locale37.toLanguageTag();
        java.lang.String str39 = locale35.getDisplayScript(locale37);
        java.lang.String str40 = locale35.getDisplayLanguage();
        java.util.Locale locale41 = java.util.Locale.ITALY;
        java.util.Locale locale42 = java.util.Locale.US;
        java.util.Locale locale43 = locale42.stripExtensions();
        java.lang.String str44 = locale43.toLanguageTag();
        java.lang.String str45 = locale41.getDisplayScript(locale43);
        java.util.Locale[] localeArray46 = new java.util.Locale[] { locale21, locale24, locale25, locale26, locale27, locale29, locale34, locale35, locale43 };
        java.util.ArrayList<java.util.Locale> localeList47 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList47, localeArray46);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList47, filteringMode49);
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, localeCollection4, filteringMode49);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.lang.String[] strArray62 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strList63);
        java.util.Locale.FilteringMode filteringMode66 = null;
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.lang.String>) strList63, filteringMode66);
        java.util.Locale locale68 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleAttributes();
        java.util.Locale locale71 = new java.util.Locale("Italian");
        java.util.Locale locale72 = java.util.Locale.ITALY;
        java.util.Locale locale73 = java.util.Locale.FRANCE;
        java.util.Locale locale74 = java.util.Locale.US;
        java.lang.String str75 = locale74.toLanguageTag();
        java.util.Locale locale76 = java.util.Locale.ITALY;
        java.util.Locale locale77 = java.util.Locale.US;
        java.util.Locale locale78 = locale77.stripExtensions();
        java.lang.String str79 = locale78.toLanguageTag();
        java.lang.String str80 = locale76.getDisplayScript(locale78);
        java.util.Locale locale81 = java.util.Locale.KOREA;
        java.util.Locale locale82 = java.util.Locale.ITALY;
        java.util.Locale locale83 = java.util.Locale.US;
        java.util.Locale locale84 = locale83.stripExtensions();
        java.lang.String str85 = locale84.toLanguageTag();
        java.lang.String str86 = locale82.getDisplayScript(locale84);
        java.lang.String str87 = locale82.getDisplayLanguage();
        java.util.Locale locale88 = java.util.Locale.ITALY;
        java.util.Locale locale89 = java.util.Locale.US;
        java.util.Locale locale90 = locale89.stripExtensions();
        java.lang.String str91 = locale90.toLanguageTag();
        java.lang.String str92 = locale88.getDisplayScript(locale90);
        java.util.Locale[] localeArray93 = new java.util.Locale[] { locale68, locale71, locale72, locale73, locale74, locale76, locale81, locale82, locale90 };
        java.util.ArrayList<java.util.Locale> localeList94 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList94, localeArray93);
        java.util.Locale.FilteringMode filteringMode96 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList97 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.util.Locale>) localeList94, filteringMode96);
        java.util.List<java.util.Locale> localeList98 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList94);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList99 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals(locale24.toString(), "italian");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en-US" + "'", str28, "en-US");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "en-US" + "'", str32, "en-US");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en-US" + "'", str38, "en-US");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "italiano" + "'", str40, "italiano");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "en-US" + "'", str44, "en-US");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(localeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList50);
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertEquals(locale71.toString(), "italian");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "en-US" + "'", str75, "en-US");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "en-US" + "'", str79, "en-US");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "en-US" + "'", str85, "en-US");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "italiano" + "'", str87, "italiano");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "en-US" + "'", str91, "en-US");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNotNull(localeArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + filteringMode96 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode96.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList97);
        org.junit.Assert.assertNotNull(localeList98);
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        java.lang.Float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray12 = new boolean[] { false, false, false, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (byte) -1, (int) '#');
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, 0, (int) (short) 1);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.add(booleanArray20, true);
        boolean[] booleanArray28 = new boolean[] { false, false, false, false, true };
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray28);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray28, (int) (byte) -1, (int) '#');
        java.lang.String str33 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray28);
        boolean[] booleanArray39 = new boolean[] { false, false, false, false, true };
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray39);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray39, true);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.add(booleanArray39, (int) (short) 0, false);
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray28, booleanArray39);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray28, true);
        boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray28);
        boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray28);
        boolean[] booleanArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray28, false);
        boolean[] booleanArray53 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray20, booleanArray52);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true]");
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{false,false,false,false,true}" + "'", str33, "{false,false,false,false,true}");
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray53), "[false, false, false, false, true]");
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray8, (long) (byte) -1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(longArray8, (long) 28);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[10, 10, 35, -1, 35, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.removeUnicodeLocaleAttribute("en-");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en- [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("true                                                                                                    true                                                                                                    false", "-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ" + "'", str2, "{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ");
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENchinois (Chine)                                                                                     ENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENEN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2EN_US" + "'", str1, "\u82f1\u8a9e\u30a2EN_US");
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("fRANCIA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fRANCIA" + "'", str1, "fRANCIA");
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("1United States0United States-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1-setatS detinU0setatS detinU1" + "'", str1, "1-setatS detinU0setatS detinU1");
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray3, 0, 4);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray8);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.clone(intArray8);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.add(intArray10, 0, (int) (byte) 10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray10, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 35, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 35, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 0, 35, -1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaJapanese", "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2eu_US", "\u110b\u1175\u11af\u1107\u1169\u11ab\u110b\u1165");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("}", strArray2, strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.util.Locale locale9 = java.util.Locale.US;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = locale10.getISO3Language();
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray2, (java.lang.Object) locale10, 0);
        java.util.Set<java.lang.Character> charSet14 = locale10.getExtensionKeys();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}" + "'", str7, "}");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "eng" + "'", str11, "eng");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charSet14);
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Locale locale9 = java.util.Locale.US;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.lang.String str13 = locale8.getDisplayLanguage();
        java.lang.String str14 = locale8.getDisplayVariant();
        java.lang.String str15 = locale8.getDisplayLanguage();
        java.lang.String str16 = locale8.getDisplayName();
        java.lang.String str17 = locale7.getDisplayVariant(locale8);
        java.util.Locale locale19 = java.util.Locale.TAIWAN;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.upperCase("eng", locale19);
        java.lang.String str22 = locale7.getDisplayName(locale19);
        java.lang.String str23 = locale7.getDisplayScript();
        java.util.Locale.Builder builder24 = builder6.setLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder24.removeUnicodeLocaleAttribute("{nglais (Etats-Unis)}");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: {nglais (Etats-Unis)} [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en-US" + "'", str11, "en-US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "italiano" + "'", str13, "italiano");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italiano" + "'", str15, "italiano");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "italiano (Italia)" + "'", str16, "italiano (Italia)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ENG" + "'", str21, "ENG");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u6cd5\u6587" + "'", str22, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray16, (java.lang.Object) 4, 4);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 0);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray21);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) -1);
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
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("01530011aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray4);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0, 4);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray4);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 0);
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 10 };
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray0, intArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray14);
        java.lang.Integer[] intArray17 = org.apache.commons.lang3.ArrayUtils.toObject(intArray14);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray17, 48);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray17);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10]");
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 100.0f);
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray5);
        boolean[] booleanArray17 = new boolean[] { false, false, false, false, true };
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray17, (int) (byte) -1, (int) '#');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray17);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        long[] longArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("############################0A-1", "{S}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("100.0#-1.0#10.0#1.0#100.0#1.0", 31, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
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
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray18);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, (short) (byte) -1);
        java.lang.Short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray18);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray39);
        short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray40);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0]");
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[0]");
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
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
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.util.Locale locale23 = new java.util.Locale("\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
        java.lang.Short[] shortArray26 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray29 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray32 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray35 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[][] shortArray36 = new java.lang.Short[][] { shortArray26, shortArray29, shortArray32, shortArray35 };
        java.lang.Short[][][] shortArray37 = new java.lang.Short[][][] { shortArray36 };
        int[] intArray38 = new int[] {};
        int[] intArray42 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray42);
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.add(intArray42, 0, 4);
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.addAll(intArray38, intArray42);
        int[] intArray49 = org.apache.commons.lang3.ArrayUtils.add(intArray38, 0);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 10 };
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray51);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray38, intArray52);
        java.lang.Short[][][] shortArray54 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray37, (java.lang.Object) intArray38);
        java.util.Locale locale55 = java.util.Locale.US;
        java.lang.String str56 = locale55.toLanguageTag();
        java.util.Locale locale57 = java.util.Locale.US;
        java.util.Locale locale58 = locale57.stripExtensions();
        java.util.Set<java.lang.Character> charSet59 = locale58.getExtensionKeys();
        java.lang.String str60 = locale55.getDisplayCountry(locale58);
        java.util.Locale locale61 = java.util.Locale.FRANCE;
        java.util.Locale locale62 = java.util.Locale.US;
        java.util.Locale locale63 = locale62.stripExtensions();
        java.lang.String str64 = locale63.getLanguage();
        java.lang.String str65 = locale61.getDisplayScript(locale63);
        java.lang.String str66 = locale55.getDisplayName(locale61);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) shortArray37, (java.lang.Object) locale61);
        java.lang.String str69 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) locale61, "ko_KR");
        java.lang.String str70 = locale23.getDisplayCountry(locale61);
        java.util.Locale locale71 = java.util.Locale.TAIWAN;
        java.util.Locale locale72 = locale71.stripExtensions();
        java.util.Locale locale74 = new java.util.Locale("Italian");
        java.util.Locale locale75 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str76 = locale74.getDisplayName(locale75);
        java.lang.String str77 = locale71.getDisplayLanguage(locale75);
        java.util.Locale locale78 = java.util.Locale.PRC;
        java.lang.String str79 = locale75.getDisplayLanguage(locale78);
        java.lang.String str80 = locale23.getDisplayName(locale75);
        java.util.Locale.setDefault(category0, locale75);
        java.util.Locale locale82 = java.util.Locale.getDefault(category0);
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
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertEquals(locale23.toString(), "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[10]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "en-US" + "'", str56, "en-US");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "United States" + "'", str60, "United States");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "en" + "'", str64, "en");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "anglais (Etats-Unis)" + "'", str66, "anglais (Etats-Unis)");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "fr_FR" + "'", str69, "fr_FR");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale74.toString(), "italian");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "italian" + "'", str76, "italian");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\u4e2d\u6587" + "'", str77, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\u4e2d\u6587" + "'", str79, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd" + "'", str80, "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "zh_CN");
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        short[] shortArray0 = null;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, 2, 100);
        org.junit.Assert.assertNull(shortArray3);
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
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
        java.lang.Byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray37);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.contains(byteArray37, (byte) 1);
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
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\uc601\uc5b4\ubbf8\uad6d)", "JPNPfPfPfPf{");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        char[] charArray2 = new char[] { '4' };
        char[] charArray4 = new char[] { '4' };
        char[] charArray6 = new char[] { '4' };
        char[] charArray8 = new char[] { '4' };
        char[] charArray10 = new char[] { '4' };
        char[] charArray12 = new char[] { '4' };
        char[][] charArray13 = new char[][] { charArray2, charArray4, charArray6, charArray8, charArray10, charArray12 };
        char[] charArray21 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray21, 'a', (int) (short) 10);
        char[] charArray31 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray31, 'a', (int) (short) 10);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray31, ' ');
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray31, ' ');
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray38);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.addAll(charArray21, charArray38);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.contains(charArray21, '4');
        boolean boolean43 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aitalianaa", charArray21);
        char[] charArray50 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray50, 'a', (int) (short) 10);
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray50, ' ');
        char[] charArray57 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray50, ' ');
        char[] charArray64 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray64, 'a', (int) (short) 10);
        char[] charArray74 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int77 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray74, 'a', (int) (short) 10);
        int int79 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray74, ' ');
        char[] charArray81 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray74, ' ');
        char[] charArray82 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray81);
        char[] charArray83 = org.apache.commons.lang3.ArrayUtils.addAll(charArray64, charArray81);
        boolean boolean84 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray50, charArray64);
        char[] charArray87 = org.apache.commons.lang3.ArrayUtils.subarray(charArray50, 10, 100);
        char[] charArray88 = org.apache.commons.lang3.ArrayUtils.addAll(charArray21, charArray87);
        char[][] charArray89 = org.apache.commons.lang3.ArrayUtils.add(charArray13, charArray21);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray90 = org.apache.commons.lang3.ArrayUtils.removeElement((java.lang.reflect.GenericDeclaration[]) wildcardClassArray0, (java.lang.Object) charArray89);
        boolean boolean91 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray89);
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4]");
        org.junit.Assert.assertNotNull(charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 4 + "'", int67 == 4);
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
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray83), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray83), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray83), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[]");
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray88), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray88), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray88), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertNotNull(genericDeclarationArray90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, (int) '4', (int) ' ');
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 7, 4);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 23, 98);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, 39, (float) 333);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 39, Length: 0");
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
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        java.util.Locale locale1 = new java.util.Locale("Italian");
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.lang.String str4 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) locale1);
        java.util.Set<java.lang.Character> charSet5 = locale1.getExtensionKeys();
        int[] intArray11 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray11, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray11);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray11, (int) (short) 100);
        int[] intArray22 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray22, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray22);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray22, (int) (short) 100);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray22);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray28);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.addAll(intArray11, intArray28);
        int[] intArray36 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray36, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray36);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray36, (int) (short) 100);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray36);
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.add(intArray36, 5);
        int[] intArray45 = org.apache.commons.lang3.ArrayUtils.clone(intArray44);
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.addAll(intArray11, intArray45);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) locale1, (java.lang.Object) intArray46);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 10 };
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray49);
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray49, 100);
        int[] intArray53 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray49);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray49, 100);
        int[] intArray56 = org.apache.commons.lang3.ArrayUtils.addAll(intArray46, intArray55);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 10 };
        int[] intArray59 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray58);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray59);
        int int63 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray59, 7, 48);
        int[] intArray65 = org.apache.commons.lang3.ArrayUtils.add(intArray59, 100);
        int[] intArray66 = org.apache.commons.lang3.ArrayUtils.clone(intArray65);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray46, intArray66);
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian" + "'", str3, "italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italian" + "'", str4, "italian");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[10]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[10]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[10]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[10]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1, 5, 10]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[10]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) 'a');
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) (byte) -1);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(intArray3, 10);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(intArray3, 51);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 35, 0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 35, 0, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ko-KRko-KRko-KR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Japan", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
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
        java.util.Collection<java.lang.Object> objCollection34 = objMap15.values();
        char[] charArray38 = new char[] { ' ', 'a' };
        boolean boolean39 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray38);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray38);
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.add(charArray38, 'a');
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray38);
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.clone(charArray38);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray38);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) objMap15, (java.lang.Object) charArray38);
        java.util.Locale.Category category47 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale48 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category47, locale48);
        java.util.Locale.Category category50 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale51 = java.util.Locale.getDefault(category50);
        java.util.Locale.Category[] categoryArray52 = new java.util.Locale.Category[] { category47, category50 };
        java.util.Locale.Category[][] categoryArray53 = new java.util.Locale.Category[][] { categoryArray52 };
        java.util.Locale.Category category54 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale55 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category54, locale55);
        java.util.Locale.Category category57 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale58 = java.util.Locale.getDefault(category57);
        java.util.Locale.Category[] categoryArray59 = new java.util.Locale.Category[] { category54, category57 };
        java.util.Locale.Category[][] categoryArray60 = new java.util.Locale.Category[][] { categoryArray59 };
        java.util.Locale.Category category61 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale62 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category61, locale62);
        java.util.Locale.Category category64 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale65 = java.util.Locale.getDefault(category64);
        java.util.Locale.Category[] categoryArray66 = new java.util.Locale.Category[] { category61, category64 };
        java.util.Locale.Category[][] categoryArray67 = new java.util.Locale.Category[][] { categoryArray66 };
        java.util.Locale.Category[][][] categoryArray68 = new java.util.Locale.Category[][][] { categoryArray53, categoryArray60, categoryArray67 };
        java.util.Locale.Category category70 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category71 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category72 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category73 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category74 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale75 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category74, locale75);
        java.util.Locale.Category category77 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale78 = java.util.Locale.getDefault(category77);
        java.util.Locale.Category[] categoryArray79 = new java.util.Locale.Category[] { category70, category71, category72, category73, category74, category77 };
        java.util.Locale.Category category80 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category81 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category82 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category83 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category84 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale85 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category84, locale85);
        java.util.Locale.Category category87 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale88 = java.util.Locale.getDefault(category87);
        java.util.Locale.Category[] categoryArray89 = new java.util.Locale.Category[] { category80, category81, category82, category83, category84, category87 };
        java.util.Locale.Category[][] categoryArray90 = new java.util.Locale.Category[][] { categoryArray79, categoryArray89 };
        java.util.Locale.Category[][] categoryArray93 = org.apache.commons.lang3.ArrayUtils.subarray(categoryArray90, (int) '#', 35);
        java.util.Locale.Category[][][] categoryArray94 = org.apache.commons.lang3.ArrayUtils.add(categoryArray68, 0, categoryArray93);
        java.lang.String str95 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) categoryArray93);
        java.lang.Object obj96 = objMap15.get((java.lang.Object) str95);
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
        org.junit.Assert.assertNotNull(objCollection34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , a]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), " aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), " aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ , a, a]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + category47 + "' != '" + java.util.Locale.Category.FORMAT + "'", category47.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category50 + "' != '" + java.util.Locale.Category.FORMAT + "'", category50.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray52);
        org.junit.Assert.assertNotNull(categoryArray53);
        org.junit.Assert.assertTrue("'" + category54 + "' != '" + java.util.Locale.Category.FORMAT + "'", category54.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category57 + "' != '" + java.util.Locale.Category.FORMAT + "'", category57.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray59);
        org.junit.Assert.assertNotNull(categoryArray60);
        org.junit.Assert.assertTrue("'" + category61 + "' != '" + java.util.Locale.Category.FORMAT + "'", category61.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category64 + "' != '" + java.util.Locale.Category.FORMAT + "'", category64.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray66);
        org.junit.Assert.assertNotNull(categoryArray67);
        org.junit.Assert.assertNotNull(categoryArray68);
        org.junit.Assert.assertTrue("'" + category70 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category70.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category71 + "' != '" + java.util.Locale.Category.FORMAT + "'", category71.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category72 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category72.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category73 + "' != '" + java.util.Locale.Category.FORMAT + "'", category73.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category74 + "' != '" + java.util.Locale.Category.FORMAT + "'", category74.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category77 + "' != '" + java.util.Locale.Category.FORMAT + "'", category77.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray79);
        org.junit.Assert.assertTrue("'" + category80 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category80.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category81 + "' != '" + java.util.Locale.Category.FORMAT + "'", category81.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category82 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category82.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category83 + "' != '" + java.util.Locale.Category.FORMAT + "'", category83.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category84 + "' != '" + java.util.Locale.Category.FORMAT + "'", category84.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category87 + "' != '" + java.util.Locale.Category.FORMAT + "'", category87.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray89);
        org.junit.Assert.assertNotNull(categoryArray90);
        org.junit.Assert.assertNotNull(categoryArray93);
        org.junit.Assert.assertNotNull(categoryArray94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("DeutschDeutschDeutschDeutschDeutschDeutschDeutschDeutschDeutsch", "\u4e2d\u6587", "\u6cd5\u6587                                                 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DeutschDeutschDeutschDeutschDeutschDeutschDeutschDeutschDeutsch" + "'", str3, "DeutschDeutschDeutschDeutschDeutschDeutschDeutschDeutschDeutsch");
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("_", "DEUuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
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
            java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
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
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        java.lang.Double[] doubleArray8 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8, (double) (short) 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) (byte) 0, 7, (double) 4);
        java.lang.Double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray10);
        java.lang.Double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("zh-CN", 107, "GIAPPONESE (GIAPPONE)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GIAPPONESE (GIAPPONE)GIAPPONESE (GIAPPONE)GIAPPONESE (GIAPPONE)GIAPPONESE (GIAPPONE)GIAPPONESE (GIAPPOzh-CN" + "'", str3, "GIAPPONESE (GIAPPONE)GIAPPONESE (GIAPPONE)GIAPPONESE (GIAPPONE)GIAPPONESE (GIAPPONE)GIAPPONESE (GIAPPOzh-CN");
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setRegion("{uuu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: {uuu [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder3.setVariant("");
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category11 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category12 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale13 = java.util.Locale.getDefault(category12);
        java.util.Locale.Category category14 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale15 = java.util.Locale.getDefault(category14);
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale.Category[] categoryArray18 = new java.util.Locale.Category[] { category8, category10, category11, category12, category14, category16 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray19 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray18);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray22 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray19, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap23 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray22);
        int int24 = objMap23.size();
        java.lang.Short[] shortArray25 = new java.lang.Short[] {};
        java.lang.Short[] shortArray26 = new java.lang.Short[] {};
        java.lang.Short[] shortArray27 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray28 = new java.lang.Short[][] { shortArray25, shortArray26, shortArray27 };
        java.lang.Short[][] shortArray29 = org.apache.commons.lang3.ArrayUtils.clone(shortArray28);
        boolean[] booleanArray35 = new boolean[] { false, false, false, false, true };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray35);
        boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray35, (int) (byte) -1, (int) '#');
        java.lang.String str40 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray35);
        java.lang.Object obj41 = objMap23.replace((java.lang.Object) shortArray28, (java.lang.Object) booleanArray35);
        java.lang.String[] strArray43 = new java.lang.String[] {};
        java.lang.String[] strArray44 = org.apache.commons.lang3.StringUtils.stripAll(strArray43);
        int int45 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray44);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        java.lang.String[] strArray47 = org.apache.commons.lang3.StringUtils.stripAll(strArray46);
        int int48 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray47);
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("}", strArray44, strArray47);
        java.lang.String[] strArray50 = org.apache.commons.lang3.StringUtils.stripAll(strArray44);
        java.util.Locale locale51 = java.util.Locale.US;
        java.util.Locale locale52 = locale51.stripExtensions();
        java.lang.String str53 = locale52.getISO3Language();
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray44, (java.lang.Object) locale52, 0);
        java.lang.Object obj56 = objMap23.remove((java.lang.Object) locale52);
        java.util.Locale locale57 = locale52.stripExtensions();
        java.util.Locale.Builder builder58 = builder3.setLocale(locale57);
        java.util.Locale locale59 = builder3.build();
        java.util.Locale.Builder builder61 = builder3.removeUnicodeLocaleAttribute("hinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder63 = builder3.setScript("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: {false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category11.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category12.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category14.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNotNull(categoryArray18);
        org.junit.Assert.assertNotNull(categoryEnumArray19);
        org.junit.Assert.assertNotNull(categoryEnumArray22);
        org.junit.Assert.assertNotNull(objMap23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{false,false,false,false,true}" + "'", str40, "{false,false,false,false,true}");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "}" + "'", str49, "}");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "eng" + "'", str53, "eng");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        double[][] doubleArray0 = new double[][] {};
        double[][] doubleArray1 = new double[][] {};
        double[][] doubleArray2 = new double[][] {};
        double[][] doubleArray3 = new double[][] {};
        double[][] doubleArray4 = new double[][] {};
        double[][] doubleArray5 = new double[][] {};
        double[][][] doubleArray6 = new double[][][] { doubleArray0, doubleArray1, doubleArray2, doubleArray3, doubleArray4, doubleArray5 };
        double[] doubleArray9 = new double[] { 'x', 0.0f };
        double[] doubleArray12 = new double[] { 'x', 0.0f };
        double[][] doubleArray13 = new double[][] { doubleArray9, doubleArray12 };
        boolean[] booleanArray19 = new boolean[] { false, false, false, false, true };
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray19);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray19, (int) (byte) -1, (int) '#');
        java.lang.String str24 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray19);
        boolean[] booleanArray30 = new boolean[] { false, false, false, false, true };
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray30);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray30, true);
        boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.add(booleanArray30, (int) (short) 0, false);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray19, booleanArray30);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray19, true);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray19);
        java.lang.Boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray19);
        double[][] doubleArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray13, (java.lang.Object) booleanArray41);
        double[][][] doubleArray43 = org.apache.commons.lang3.ArrayUtils.add(doubleArray6, doubleArray42);
        double[][] doubleArray44 = new double[][] {};
        double[][] doubleArray45 = new double[][] {};
        double[][] doubleArray46 = new double[][] {};
        double[][] doubleArray47 = new double[][] {};
        double[][] doubleArray48 = new double[][] {};
        double[][] doubleArray49 = new double[][] {};
        double[][][] doubleArray50 = new double[][][] { doubleArray44, doubleArray45, doubleArray46, doubleArray47, doubleArray48, doubleArray49 };
        double[] doubleArray53 = new double[] { 'x', 0.0f };
        double[] doubleArray56 = new double[] { 'x', 0.0f };
        double[][] doubleArray57 = new double[][] { doubleArray53, doubleArray56 };
        boolean[] booleanArray63 = new boolean[] { false, false, false, false, true };
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray63);
        boolean[] booleanArray67 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray63, (int) (byte) -1, (int) '#');
        java.lang.String str68 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray63);
        boolean[] booleanArray74 = new boolean[] { false, false, false, false, true };
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray74);
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray74, true);
        boolean[] booleanArray80 = org.apache.commons.lang3.ArrayUtils.add(booleanArray74, (int) (short) 0, false);
        boolean[] booleanArray81 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray63, booleanArray74);
        int int83 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray63, true);
        boolean[] booleanArray84 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray63);
        java.lang.Boolean[] booleanArray85 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray63);
        double[][] doubleArray86 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray57, (java.lang.Object) booleanArray85);
        double[][][] doubleArray87 = org.apache.commons.lang3.ArrayUtils.add(doubleArray50, doubleArray86);
        double[][][] doubleArray88 = org.apache.commons.lang3.ArrayUtils.toArray(doubleArray50);
        double[][][] doubleArray89 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray6, doubleArray88);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[120.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[120.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{false,false,false,false,true}" + "'", str24, "{false,false,false,false,true}");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[120.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[120.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray63), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(booleanArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray67), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "{false,false,false,false,true}" + "'", str68, "{false,false,false,false,true}");
        org.junit.Assert.assertNotNull(booleanArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray74), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(booleanArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray80), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray81), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 4 + "'", int83 == 4);
        org.junit.Assert.assertNotNull(booleanArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray84), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray85);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertNotNull(doubleArray89);
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
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
            java.util.Locale.Builder builder38 = builder34.setLanguage("{false,false,false,false,true}");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: {false,false,false,false,true} [at index 0]");
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
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray1, (java.lang.Object) (byte) 10);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(shortArray6, (short) (byte) 10);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        float[] floatArray6 = new float[] { 10, '#', 3, (byte) -1, 0, (byte) 0 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray6);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray6, (int) (short) 1, 10);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.clone(floatArray6);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray11, (float) 23);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray11, (float) (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0, 35.0, 3.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("tru#tru#fals");
        java.lang.String str3 = locale1.getUnicodeLocaleType("fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("France", "\u30a2");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (byte) 0);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray8);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(intArray9, 16);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
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
        java.util.Locale locale38 = java.util.Locale.forLanguageTag("French (France)");
        java.util.Locale.Builder builder39 = builder36.setLocale(locale38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder41 = builder36.setLanguage("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U{97,1,10");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? (?en_US?? (?en_US?? (?en_U{97,1,10 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927\u52a0\u62ff\u5927", "\u30a2\u30e1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 100);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 10);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 10);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray22, (byte) -1);
        java.lang.Byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray22);
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Italian (Italy)aaaaaaaaaaaaaa", "(Chine) chinois", "ko");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u5927");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        boolean[] booleanArray3 = new boolean[] { false, true, true };
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.add(booleanArray3, true);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray3, false);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, true, true, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu10.0uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu10.0uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) (byte) 1);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, 0, (short) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0]");
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("10 32 10 5 1", 379);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10 32 10 5 1                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "10 32 10 5 1                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        java.lang.String[] strArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray1);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("{false,false,false,false,true", strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("}eurt,eslaf,eslaf,eslaf,eslaf{", "11003510");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("{false,false,false,false,true}", strArray6, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("10.0100.01.0100.00.0", strArray2, strArray10);
        java.lang.Double[] doubleArray15 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray15, (double) (byte) -1);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray15);
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray18, (int) (short) 1);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) 0L);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray20, (double) 1L);
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray20, (-1.0d));
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray30);
        java.lang.Double[] doubleArray38 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray38, (double) (short) 0);
        double[] doubleArray41 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray40);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray30, (java.lang.Object) doubleArray40, 4);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray40);
        double[] doubleArray46 = org.apache.commons.lang3.ArrayUtils.add(doubleArray40, (double) (byte) 100);
        java.lang.Double[] doubleArray49 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray49, (double) (byte) -1);
        double[] doubleArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray49);
        double[] doubleArray54 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray52, (int) (short) 1);
        double[] doubleArray55 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray46, doubleArray52);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray55);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray26, doubleArray55);
        int int60 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray55, (double) (-1), 35);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray2, (java.lang.Object) doubleArray55);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{false,false,false,false,true}" + "'", str11, "{false,false,false,false,true}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.0100.01.0100.00.0" + "'", str12, "10.0100.01.0100.00.0");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, -1.0, 100.0, 1.0, 100.0, 1.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 7 + "'", int60 == 7);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
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
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray8);
        byte[] byteArray32 = null;
        byte[] byteArray34 = new byte[] { (byte) 100 };
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray34, byteArray35);
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray32, byteArray34);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray8, byteArray34);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray2, byteArray34);
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray39);
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.clone(byteArray39);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.add(byteArray39, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 1]");
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
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[100, 100]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[100, 100]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100, 100]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 100, 100]");
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale7 = new java.util.Locale("IT");
        java.lang.String str9 = locale7.getExtension('u');
        java.util.Locale.Builder builder10 = builder5.setLocale(locale7);
        java.lang.Object obj11 = null;
        boolean boolean12 = locale7.equals(obj11);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("GIAPPONESE (GIAPPONE)", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "K");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2                    ", 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2                    " + "'", str3, "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2                    ");
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str4 = locale1.getExtension('a');
        java.util.Set<java.lang.Character> charSet5 = locale1.getExtensionKeys();
        java.lang.Object obj6 = locale1.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "de_DE");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "de_DE");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "de_DE");
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'u');
        java.lang.Character[] charArray13 = org.apache.commons.lang3.ArrayUtils.toObject(charArray7);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13, ' ');
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "se,false,false,tru{false,false,false,false", charArray16);
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) (byte) 10, 35);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 0.0f, (int) ' ');
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, 10.0d, 17, (double) 39);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2th Koreth Koreth Koreth Koreth Kore", "Francia", 107);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2th Koreth Koreth Koreth Koreth Kore" + "'", str3, "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2th Koreth Koreth Koreth Koreth Kore");
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
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
        java.util.Locale.FilteringMode filteringMode34 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.lang.Object obj35 = objMap15.get((java.lang.Object) filteringMode34);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 10 };
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray37);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray38, 35, (int) (short) 10);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.clone(intArray38);
        java.util.Locale.Category category43 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale44 = java.util.Locale.getDefault(category43);
        java.util.Locale.Category category45 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category46 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category47 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale48 = java.util.Locale.getDefault(category47);
        java.util.Locale.Category category49 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale50 = java.util.Locale.getDefault(category49);
        java.util.Locale.Category category51 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale52 = java.util.Locale.getDefault(category51);
        java.util.Locale.Category[] categoryArray53 = new java.util.Locale.Category[] { category43, category45, category46, category47, category49, category51 };
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray54 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Enum<java.util.Locale.Category>[]) categoryArray53);
        java.lang.Enum<java.util.Locale.Category>[] categoryEnumArray57 = org.apache.commons.lang3.ArrayUtils.subarray(categoryEnumArray54, (int) 'x', 23);
        java.util.Map<java.lang.Object, java.lang.Object> objMap58 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryEnumArray57);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray63 = org.apache.commons.lang3.ArrayUtils.add(byteArray61, (byte) -1);
        int int66 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray63, (byte) 100, (-1));
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray63, (byte) 10);
        byte[] byteArray69 = org.apache.commons.lang3.ArrayUtils.clone(byteArray63);
        byte[] byteArray72 = org.apache.commons.lang3.ArrayUtils.add(byteArray63, (int) (short) 1, (byte) 100);
        java.lang.Object obj73 = objMap58.remove((java.lang.Object) (short) 1);
        java.lang.Object obj74 = objMap15.replace((java.lang.Object) intArray38, obj73);
        int int77 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray38, 221, 39);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray38);
        int int81 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray38, 16, 69);
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
        org.junit.Assert.assertTrue("'" + filteringMode34 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode34.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[10]");
        org.junit.Assert.assertTrue("'" + category43 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category43.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "it");
        org.junit.Assert.assertTrue("'" + category45 + "' != '" + java.util.Locale.Category.FORMAT + "'", category45.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category46 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category46.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category47 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category47.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale48);
// flaky:         org.junit.Assert.assertEquals(locale48.toString(), "it");
        org.junit.Assert.assertTrue("'" + category49 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category49.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "it");
        org.junit.Assert.assertTrue("'" + category51 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category51.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "it");
        org.junit.Assert.assertNotNull(categoryArray53);
        org.junit.Assert.assertNotNull(categoryEnumArray54);
        org.junit.Assert.assertNotNull(categoryEnumArray57);
        org.junit.Assert.assertNotNull(objMap58);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[1, 100, 0, -1]");
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
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
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Locale locale49 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet50 = locale49.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strSet50);
        java.lang.String str52 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet50);
        java.util.Locale.LanguageRange languageRange54 = new java.util.Locale.LanguageRange("France");
        java.util.Locale.LanguageRange languageRange56 = new java.util.Locale.LanguageRange("France");
        java.lang.String str57 = languageRange56.getRange();
        java.lang.String str58 = languageRange56.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] { languageRange54, languageRange56 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.util.Locale.LanguageRange[] languageRangeArray62 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList63 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList63, languageRangeArray62);
        java.util.Locale locale65 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, (java.util.Collection<java.lang.String>) strSet66);
        java.lang.String str69 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet66, "hi!");
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet66, 'x');
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strSet66);
        java.util.ArrayList[] arrayListArray74 = new java.util.ArrayList[2];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.util.Locale.LanguageRange>[] languageRangeListArray75 = (java.util.ArrayList<java.util.Locale.LanguageRange>[]) arrayListArray74;
        languageRangeListArray75[0] = languageRangeList1;
        languageRangeListArray75[1] = languageRangeList60;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.util.Locale.LanguageRange>[] languageRangeListArray81 = org.apache.commons.lang3.ArrayUtils.remove(languageRangeListArray75, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "italiano" + "'", str35, "italiano");
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
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "france" + "'", str57, "france");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "france" + "'", str58, "france");
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(languageRangeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(arrayListArray74);
        org.junit.Assert.assertNotNull(languageRangeListArray75);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray18 = org.apache.commons.lang3.ArrayUtils.remove(charArray14, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 5");
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, a,  , 4,  ]");
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray9, (long) '4');
        long[] longArray13 = new long[] { 'a' };
        long[] longArray20 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.addAll(longArray13, longArray20);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.add(longArray21, (int) (short) 1, (long) (byte) 1);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.subarray(longArray24, (-1), (-1));
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray11, longArray24);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.remove(longArray24, 4);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray30, (long) 379);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 1, 10, 10, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray12 = new boolean[] { false, false, false, false, true };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray12);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) (byte) -1, (int) '#');
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, 0, (int) (short) 1);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray20, false);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.add(booleanArray22, true);
        float[] floatArray25 = new float[] {};
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray25);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray25);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, 1.0f);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(floatArray25, (float) 100);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) booleanArray24, (java.lang.Object) boolean31);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray24);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray24);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray34, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
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
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[true]");
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        long[] longArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        char[] charArray17 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray17, 'a', (int) (short) 10);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray17, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray17, ' ');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray24);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.addAll(charArray7, charArray24);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.clone(charArray26);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.subarray(charArray27, 10, (int) (short) 100);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.clone(charArray30);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray30);
        char[] charArray33 = null;
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray30, charArray33);
        int int35 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "97UnitedaStates1UnitedaStates10UnitedaStates10UnitedaStates35UnitedaStates-1UnitedaStates35UnitedaStates-1", charArray33);
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
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[4]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("class [Z");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap46);
        java.util.Locale.Builder builder48 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder49 = builder48.clear();
        java.util.Locale.Builder builder50 = builder48.clear();
        java.util.Locale.Builder builder51 = builder48.clear();
        java.util.Locale.Category category53 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale54 = java.util.Locale.US;
        java.lang.String str55 = locale54.toLanguageTag();
        java.util.Locale locale56 = java.util.Locale.CHINA;
        java.lang.String str57 = locale54.getDisplayCountry(locale56);
        java.util.Locale locale58 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str59 = locale56.getDisplayCountry(locale58);
        java.util.Locale.setDefault(category53, locale58);
        java.util.Locale locale61 = java.util.Locale.ITALY;
        java.util.Locale locale62 = java.util.Locale.US;
        java.util.Locale locale63 = locale62.stripExtensions();
        java.lang.String str64 = locale63.toLanguageTag();
        java.lang.String str65 = locale61.getDisplayScript(locale63);
        java.lang.String str66 = locale61.getDisplayLanguage();
        java.lang.String str67 = locale61.getDisplayVariant();
        java.lang.String str68 = locale61.getDisplayLanguage();
        java.lang.String str69 = locale58.getDisplayVariant(locale61);
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.upperCase("JPN", locale61);
        java.lang.String str71 = locale61.getVariant();
        java.util.Locale.Builder builder72 = builder48.setLocale(locale61);
        java.util.Set<java.lang.String> strSet73 = locale61.getUnicodeLocaleKeys();
        java.lang.String str74 = java.util.Locale.lookupTag(languageRangeList47, (java.util.Collection<java.lang.String>) strSet73);
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
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "italiano" + "'", str35, "italiano");
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
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + category53 + "' != '" + java.util.Locale.Category.FORMAT + "'", category53.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "en-US" + "'", str55, "en-US");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\u7f8e\u56fd" + "'", str57, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\u4e2d\u56fd" + "'", str59, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "en-US" + "'", str64, "en-US");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "italiano" + "'", str66, "italiano");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "italiano" + "'", str68, "italiano");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "JPN" + "'", str70, "JPN");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("de_DE");
        boolean[] booleanArray8 = new boolean[] { false, false, false, false, true };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray8, (int) (byte) -1, (int) '#');
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray8);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray8, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray8, false, (-1));
        boolean[] booleanArray25 = new boolean[] { false, false, false, false, true };
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray25);
        boolean[] booleanArray32 = new boolean[] { false, false, false, false, true };
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray32);
        boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray32, (int) (byte) -1, (int) '#');
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray25, booleanArray32);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray25, 0, (int) (short) 1);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray40, false);
        boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.add(booleanArray42, true);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray8, booleanArray42);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) locale2, (java.lang.Object) booleanArray42);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.upperCase("{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ", locale2);
        java.lang.String str48 = locale2.getLanguage();
        java.lang.String str49 = locale2.getDisplayName();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[false]");
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[]");
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[true]");
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ" + "'", str47, "{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray4 = null;
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) 'u');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu10.0uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "{false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (", "fr");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("E");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale6.toLanguageTag();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale6.getDisplayCountry(locale8);
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str11 = locale8.getDisplayCountry(locale10);
        java.util.Locale.setDefault(category5, locale10);
        java.util.Locale locale13 = java.util.Locale.ITALY;
        java.util.Locale locale14 = java.util.Locale.US;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.toLanguageTag();
        java.lang.String str17 = locale13.getDisplayScript(locale15);
        java.lang.String str18 = locale13.getDisplayLanguage();
        java.lang.String str19 = locale13.getDisplayVariant();
        java.lang.String str20 = locale13.getDisplayLanguage();
        java.lang.String str21 = locale10.getDisplayVariant(locale13);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.upperCase("JPN", locale13);
        java.lang.String str23 = locale13.getVariant();
        java.util.Locale.Builder builder24 = builder0.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder0.addUnicodeLocaleAttribute("-1.01.0");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: -1.01.0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en-US" + "'", str16, "en-US");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "italiano" + "'", str18, "italiano");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "italiano" + "'", str20, "italiano");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "JPN" + "'", str22, "JPN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray8, (long) (byte) -1);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (-1), (int) (byte) 1);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray17, (long) (short) 1, 1);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray17, (long) (byte) 10, 23);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray17, (long) 42);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray17);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray17);
        java.lang.Long[] longArray28 = org.apache.commons.lang3.ArrayUtils.toObject(longArray17);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[10, 10, 35, -1, 35, -1, -1]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(longArray28);
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("e}  laf,eslafu{false,fa  {false,false,false,false,tr", "japonais");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{false,false,false,false,true", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("}eurt,eslaf,eslaf,eslaf,eslaf{", '#');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray6);
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = builder9.clear();
        java.util.Locale.Builder builder13 = builder9.clear();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale14.getISO3Country();
        java.util.Locale.Builder builder16 = builder13.setLocale(locale14);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) locale14, (int) (byte) 10);
        java.lang.String[] strArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "KOR" + "'", str15, "KOR");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)", "RK_ok", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) "RK_ok");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 'u', 10);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray4);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, 0.0d);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 35);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 100.0f, (int) (short) 100, (double) 95);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) 3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("-1.0{0}10.0{0}1.0{0}100.0{0}1.0", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1..." + "'", str2, "-1...");
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setExtension('u', "German");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguage("tRUETRUEFALSE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: tRUETRUEFALSE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        long[] longArray2 = new long[] { 'a' };
        long[] longArray9 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.addAll(longArray2, longArray9);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray10, (int) (short) 1, (long) (byte) 1);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.subarray(longArray13, (-1), (-1));
        java.lang.Long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toObject(longArray13);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray17, "United States");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.concatWith("\u6cd5\u6587                                                 ", (java.lang.Object[]) longArray17);
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray17);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray17, (long) 379);
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
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97United States1United States10United States10United States35United States-1United States35United States-1" + "'", str19, "97United States1United States10United States10United States35United States-1United States35United States-1");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587                                                 -1" + "'", str20, "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587                                                 -1");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 1, 10, 10, 35, -1, 35, -1]");
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("france", "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE", "0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE" + "'", str2, "{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE");
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray12, (byte) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray12);
        java.lang.Byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray20, (byte) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray22, (byte) 1);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.add(byteArray22, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 1, 0]");
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen", 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("{nglais (Etats-Unis)}", "0}1.0{0}100.0{0}1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nglais (Etats-Unis)}" + "'", str2, "nglais (Etats-Unis)}");
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        char[] charArray0 = null;
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'u');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, 'u');
        char[] charArray21 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray21, 'a', (int) (short) 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray21, ' ');
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray21, ' ');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray28);
        char[] charArray36 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray36, 'a', (int) (short) 10);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray36, ' ');
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray28, charArray36);
        java.lang.Character[] charArray43 = org.apache.commons.lang3.ArrayUtils.toObject(charArray28);
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray28, 'u');
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray14, charArray45);
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray45);
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.add(charArray45, 'a');
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray45, '#', 13);
        char[] charArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray45);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), " 4 a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), " 4 a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[ , 4,  , a, 4, a]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[ , 4,  , a, 4]");
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u30a2", (int) (short) 100, 'x');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u30a2xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "\u30a2xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("        {fP{-1,35,0}        {fPf", "         USA         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        {fP{-1,35,0}        {fPf" + "'", str2, "        {fP{-1,35,0}        {fPf");
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu10.0uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu..." + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("        {fpfpfpfpnpj   ", "italien (Italie)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("JPN", "\u5fb7\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JPN" + "'", str2, "JPN");
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "  0-1   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        java.lang.Iterable<java.lang.String> strIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(strIterable0, '4');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
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
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray21);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.remove(byteArray27, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 2");
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
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0]");
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)", "FRA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray0);
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                          ja_JP", "{tru,tru,fals}", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale locale3 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("\u6cd5true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxItalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "0a-1", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR" + "'", str1, " FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR");
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("_ng_ng_ng_ng_");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_ng_ng_ng_ng" + "'", str1, "_ng_ng_ng_ng");
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
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
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, (float) 'u');
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray14, (float) 107);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(" 4hi!4en-US4 ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("        {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ   " + "'", str1, "        {{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ   ");
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Chinese (China)", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxItalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese (China)" + "'", str3, "Chinese (China)");
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, 1.0d, (double) 35);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 0);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        java.lang.Double[] doubleArray17 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray17, (double) (short) 0);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray17, (double) '#');
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray21);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 0, (double) 10L);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 10.0, 100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("tru#tru#fals                                    ", 7, 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#fals                               " + "'", str3, "#fals                               ");
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\u610f\u5927\u5229aaaa", 10);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229aaaa" + "'", str2, "\u610f\u5927\u5229aaaa");
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, true, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category3, locale4);
        java.lang.String str7 = locale4.getExtension('a');
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.util.Locale locale13 = java.util.Locale.US;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.lang.String str15 = locale14.toLanguageTag();
        java.lang.String str16 = locale12.getDisplayScript(locale14);
        java.lang.String str17 = locale12.getDisplayLanguage();
        java.lang.String str18 = locale12.getDisplayVariant();
        java.util.Set<java.lang.String> strSet19 = locale12.getUnicodeLocaleKeys();
        java.lang.String str20 = locale11.getDisplayCountry(locale12);
        java.lang.String str21 = locale12.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en-US" + "'", str15, "en-US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "italiano" + "'", str17, "italiano");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Taiwan" + "'", str20, "Taiwan");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "falsefalsefalsefalsefalsefaaaaaDEaaaaaa", (java.lang.CharSequence) "23");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("##", "", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##" + "'", str3, "##");
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) 'a');
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        long[] longArray0 = null;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, 69, 0);
        org.junit.Assert.assertNull(longArray3);
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("china");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setVariant("{10}");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: {10} [at index 0]");
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
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "tru#tru#fal", "ngngngngngngngngngngngngngngn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        java.lang.Boolean[] booleanArray0 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, false);
        org.junit.Assert.assertNull(booleanArray2);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        boolean[] booleanArray4 = new boolean[] { false, true, true, true };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray6, 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 69, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, true, true, true]");
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.clear();
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder1.clear();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Locale.Builder builder9 = builder6.setLocale(locale8);
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale12 = java.util.Locale.US;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.lang.String str15 = locale10.getDisplayCountry(locale13);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.US;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.lang.String str19 = locale18.getLanguage();
        java.lang.String str20 = locale16.getDisplayScript(locale18);
        java.lang.String str21 = locale10.getDisplayName(locale16);
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str23 = locale16.getDisplayName(locale22);
        java.util.Locale locale24 = java.util.Locale.ITALY;
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale26.toLanguageTag();
        java.lang.String str28 = locale24.getDisplayScript(locale26);
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        java.lang.String str31 = locale26.getDisplayCountry(locale30);
        java.lang.String str32 = locale16.getDisplayName(locale30);
        java.util.Locale.Builder builder33 = builder6.setLocale(locale16);
        java.util.Locale.Builder builder35 = builder33.setRegion("FR");
        java.util.Locale locale36 = builder35.build();
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.lowerCase("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", locale36);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en-US" + "'", str11, "en-US");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "United States" + "'", str15, "United States");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "anglais (Etats-Unis)" + "'", str21, "anglais (Etats-Unis)");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str23, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en-US" + "'", str27, "en-US");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "United States" + "'", str31, "United States");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "French (France)" + "'", str32, "French (France)");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us" + "'", str37, "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_us");
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        byte[] byteArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (byte) 0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) ' ');
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray3, 221);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 35, 0, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 35, 0]");
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\u82f1\u6587\u7f8e\u570b)", " u u4u uau4", "th Korea");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str3, "\u82f1\u6587\u7f8e\u570b)");
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray1, (java.lang.Object) (byte) 10);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray1);
        java.lang.Short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[0]");
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("EN_gb", "ital...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
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
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7, (long) 35);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray32 = org.apache.commons.lang3.ArrayUtils.remove(longArray30, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[1, 100, 35, 10]");
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatruetruefalse", "{false,...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatruetruefalse" + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatruetruefalse");
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
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
        java.lang.Boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        float[] floatArray49 = new float[] {};
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray49);
        float[] floatArray51 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray49);
        float[] floatArray52 = new float[] {};
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray52);
        float[] floatArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray52);
        float[] floatArray55 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray54);
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray54, (float) (short) 0, (int) (byte) 10);
        float[] floatArray59 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray51, floatArray54);
        float[] floatArray60 = org.apache.commons.lang3.ArrayUtils.clone(floatArray59);
        java.lang.Object obj61 = objMap15.getOrDefault((java.lang.Object) booleanArray48, (java.lang.Object) floatArray60);
        boolean[] booleanArray67 = new boolean[] { false, false, false, false, true };
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray67);
        boolean[] booleanArray71 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray67, (int) (byte) -1, (int) '#');
        int int74 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray67, false, (int) (short) 0);
        boolean[] booleanArray75 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray67);
        boolean boolean76 = objMap15.containsValue((java.lang.Object) booleanArray75);
        java.util.Collection<java.lang.Object> objCollection77 = objMap15.values();
        java.lang.Object obj78 = null;
        java.lang.Object obj79 = objMap15.get(obj78);
        objMap15.clear();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
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
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[]");
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray60), "[]");
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(booleanArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray67), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(booleanArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray71), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(booleanArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray75), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objCollection77);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, (double) 'u');
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) (-1), (double) (byte) 10);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, 100.0d, 6, (double) 39);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 'a', 51);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("JPN", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("{fPfPfPfPNPJ", "\u65e5\u65870}1.0{0}100.0{0}1.0", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
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
        char[] charArray76 = null;
        char[] charArray77 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray84 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int87 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray84, 'a', (int) (short) 10);
        int int89 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray84, ' ');
        char[] charArray91 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray84, ' ');
        boolean boolean92 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray77, charArray91);
        boolean boolean94 = org.apache.commons.lang3.ArrayUtils.contains(charArray91, '#');
        char[] charArray95 = org.apache.commons.lang3.ArrayUtils.addAll(charArray76, charArray91);
        char[] charArray96 = org.apache.commons.lang3.ArrayUtils.addAll(charArray75, charArray95);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray99 = org.apache.commons.lang3.ArrayUtils.add(charArray95, 95, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 95, Length: 5");
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
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[]");
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray84), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray84), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray84), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 4 + "'", int87 == 4);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray91), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray91), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray91), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(charArray95);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray95), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray95), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray95), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray96);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray96), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray96), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray96), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
    }
}
