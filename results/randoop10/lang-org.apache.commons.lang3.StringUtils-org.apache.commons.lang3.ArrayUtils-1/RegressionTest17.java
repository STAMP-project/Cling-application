import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
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
        float[] floatArray86 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray83, (float) 97);
        float[] floatArray88 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray83, (float) 213);
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
        org.junit.Assert.assertNotNull(floatArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray86), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray88), "[1.0, 10.0, 100.0, 1.0, 100.0]");
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setScript("{true,false,false,false,false,true,true,false}");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: {true,false,false,false,false,true,true,false} [at index 0]");
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
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("etruefalse                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "etruefalse                                          " + "'", str1, "etruefalse                                          ");
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("JPN", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        float[] floatArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
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
        java.lang.String str10 = locale0.getCountry();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("italie");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italie" + "'", str1, "italie");
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "EN_gb", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        java.lang.Long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toObject(longArray12);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray12, (long) (short) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray12, (long) 8, 12);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, 95, (int) 'x');
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
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setRegion("aitalianaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: aitalianaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)", 116, "44444444444444444444444444france                ");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)44444444444444444444444444france                44444444444444444444444444france                44444444" + "'", str3, "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)44444444444444444444444444france                44444444444444444444444444france                44444444");
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        float[] floatArray6 = new float[] { (byte) 10, 0, 100L, ' ', (byte) -1, (short) 0 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray6, (float) 10, (int) (short) 10);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.clone(floatArray6);
        float[] floatArray12 = new float[] {};
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray12);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (short) 10, (int) (short) 1);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray11, floatArray12);
        float[] floatArray18 = new float[] {};
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray18);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray18);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray18);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.add(floatArray18, (float) 213);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray23, 0.0f);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray25);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray11, floatArray25);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.clone(floatArray27);
        java.lang.Float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray28);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[213.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[213.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0, 213.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0, 213.0]");
        org.junit.Assert.assertNotNull(floatArray29);
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuunited statesuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "italianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitalianoitaliano");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 21, 333);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
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
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray43, 'a');
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.clone(charArray43);
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.subarray(charArray43, (int) (byte) 100, (int) ' ');
        java.lang.Character[] charArray50 = org.apache.commons.lang3.ArrayUtils.toObject(charArray49);
        char[] charArray52 = org.apache.commons.lang3.ArrayUtils.add(charArray49, ' ');
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[ ]");
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Etats-Unis", 47, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Etats-Unisuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "Etats-Unisuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)", 250);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)" + "'", str2, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)");
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "korn-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, false, true, false, false };
        java.lang.Boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray6, "");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, true, false, false]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "truefalsetruefalsefalse" + "'", str9, "truefalsetruefalsefalse");
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) (byte) 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (short) -1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray9);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.clone(shortArray10);
        short[] shortArray12 = null;
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray11, shortArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray12, (short) (byte) 1);
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
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Englisch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray16, (java.lang.Object) 4, 4);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 0);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray22);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (int) (byte) 1, (byte) 0);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray26, (byte) 10, 4);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray26);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray37, (byte) 10, (int) '#');
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.add(byteArray43, (byte) -1);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray37, byteArray43);
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray43);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray47);
        byte[] byteArray49 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray26, byteArray48);
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 0, 0, 1, 0]");
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("       ", "44444444444444444444444444France");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'u');
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        java.lang.Character[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13, ' ');
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray16);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        char[] charArray4 = new char[] { ' ', 'a' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray4);
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray4, 'a', 9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray4, '4');
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, 'a');
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("{true,true,false}", charArray11);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , a, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("NG", "FR_FR", "nglais (Etats-Unis)}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NG" + "'", str3, "NG");
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
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
        float[] floatArray31 = new float[] {};
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray31);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray31);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray33);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray34);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.clone(floatArray34);
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray34, (int) '4', (int) ' ');
        float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray39, 7, 4);
        float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray39, 23, 98);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray45, (float) 48, (int) (short) 10);
        java.lang.Short[][][] shortArray49 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray13, (java.lang.Object) (short) 10);
        java.lang.Long[] longArray50 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray51 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray50);
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray50);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray50);
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray50, (long) 3);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray55);
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray55, (long) 0);
        java.lang.Short[][][] shortArray59 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray49, (java.lang.Object) int58);
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
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(shortArray59);
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, 1.0d);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 10.0d);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, 10.0d, (double) 0.0f);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) -1);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray7, (short) -1);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray7, (int) (short) 1, 213);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray7);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray7, (short) 0);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.clone(shortArray7);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, 15, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 15, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[0]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0]");
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("RF_RF", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("}eurt,esl", "e");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) -1);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 10);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 100);
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
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("nglais (Etats-Unis)}", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\u610f\u5927\u5229\u6587\u610f\u5927\u5229");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229" + "'", str1, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229");
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ETRUEFALSE                                          ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
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
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray12);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
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
        boolean boolean30 = objMap15.isEmpty();
        boolean boolean31 = objMap15.isEmpty();
        java.lang.Object obj33 = objMap15.get((java.lang.Object) "#tts-Unis");
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = objMap15.remove(obj34);
        objMap15.clear();
        java.lang.Short[] shortArray38 = new java.lang.Short[] { (short) 0 };
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray38, (short) (byte) 1);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray40);
        java.lang.Short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray40);
        java.lang.Short[] shortArray44 = new java.lang.Short[] { (short) 0 };
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray44, (short) (byte) 1);
        short[] shortArray47 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray40, shortArray46);
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.add(shortArray40, (short) (byte) -1);
        boolean[] booleanArray55 = new boolean[] { false, false, false, false, true };
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray55);
        boolean[] booleanArray62 = new boolean[] { false, false, false, false, true };
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray62);
        boolean[] booleanArray66 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray62, (int) (byte) -1, (int) '#');
        boolean[] booleanArray67 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray55, booleanArray62);
        int int69 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray67, false);
        boolean[] booleanArray71 = org.apache.commons.lang3.ArrayUtils.add(booleanArray67, false);
        int int73 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray67, false);
        java.lang.Object obj74 = objMap15.replace((java.lang.Object) shortArray40, (java.lang.Object) booleanArray67);
        long[] longArray75 = new long[] {};
        long[] longArray80 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray82 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray80, 0L);
        int int84 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray82, (long) (byte) -1);
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray75, longArray82);
        long[] longArray86 = org.apache.commons.lang3.ArrayUtils.clone(longArray75);
        java.lang.Long[] longArray87 = org.apache.commons.lang3.ArrayUtils.toObject(longArray75);
        java.lang.Long[] longArray88 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray87);
        java.lang.Object obj89 = null;
        int int91 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray88, obj89, 8);
        boolean boolean92 = objMap15.containsValue((java.lang.Object) int91);
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet93 = objMap15.entrySet();
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
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category19.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category24.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(categoryArray26);
        org.junit.Assert.assertNotNull(categoryEnumArray27);
        org.junit.Assert.assertNotNull(categoryEnumArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0]");
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray47), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[0, -1]");
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray55), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(booleanArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray62), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(booleanArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray66), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray67), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(booleanArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray71), "[false, false, false, false, true, false, false, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray75), "[]");
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray80), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(objEntrySet93);
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("FALSE", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FALSE" + "'", str2, "FALSE");
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "{false,false,false}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{false,false,false}" + "'", str1, "{false,false,false}");
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        int[] intArray0 = new int[] {};
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) 'u');
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 21, 12);
        int[] intArray9 = new int[] { (short) 10 };
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray9, (int) 'a');
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray0, intArray9);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray9, 213);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(intArray14, 743);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) 0);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.remove(byteArray19, (int) (short) 0);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray28, (byte) 10, (int) '#');
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.add(byteArray34, (byte) -1);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray28, byteArray34);
        java.lang.Byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray34);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray38, (java.lang.Object) 4, 4);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray38);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray38, (byte) 1);
        java.lang.Byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray38);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) byteArray38);
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray38);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray19, byteArray47);
        java.lang.Byte[] byteArray49 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray48);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray48, (byte) 100, (-1));
        java.lang.Byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray48);
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray48, (byte) 100, 8);
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
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 0, 0, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 2, 0, (double) 100);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (-1.0d), 42, 1.0d);
        java.lang.Double[] doubleArray20 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray20, (double) (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray20, (java.lang.Object) "TRUETRUEFALSE");
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray20);
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray5, doubleArray25);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray26, (double) 'u');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
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
        java.lang.Boolean[] booleanArray56 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray57 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray56);
        java.lang.Double[] doubleArray64 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray66 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray64, (double) (short) 0);
        double[] doubleArray67 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray66);
        int int69 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray56, (java.lang.Object) doubleArray66, 4);
        boolean[] booleanArray70 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray56);
        boolean[] booleanArray72 = org.apache.commons.lang3.ArrayUtils.add(booleanArray70, false);
        double[] doubleArray75 = new double[] { 4, 100L };
        double[] doubleArray78 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray75, (int) '4', 5);
        int int81 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray78, 10.0d, (double) (-1.0f));
        double[] doubleArray83 = org.apache.commons.lang3.ArrayUtils.add(doubleArray78, (double) 23);
        double[] doubleArray85 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray78, 100.0d);
        boolean boolean86 = objMap15.remove((java.lang.Object) booleanArray72, (java.lang.Object) doubleArray78);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray89 = org.apache.commons.lang3.ArrayUtils.add(booleanArray72, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertNotNull(booleanArray57);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(booleanArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray70), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray72), "[true, true, false, false]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[23.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
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
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray21);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray21, 2, 10);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray26, 48, (int) (byte) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray29);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(shortArray29, (short) (byte) 10);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("h", "...lse,tru", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("true", 16, "{1,100,35,10}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{1,100true{1,100" + "'", str3, "{1,100true{1,100");
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "444444COREANO");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("             100.0#-1.0#10.0#1.0#100.0#1.0", "", "_ng_ng_ng_ng");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setRegion("en");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setRegion("ja_J");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ja_J [at index 0]");
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
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("[ , hi!, en-us,  ]   jpnpfpfpfpf{        [", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [" + "'", str2, "[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [");
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
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
        char[] charArray52 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray52, 'a', (int) (short) 10);
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray52, ' ');
        char[] charArray59 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray52, ' ');
        char[] charArray60 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray59);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray59);
        boolean boolean62 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray59);
        int int65 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray59, '#', (int) (short) -1);
        char[] charArray68 = org.apache.commons.lang3.ArrayUtils.add(charArray59, 2, 'u');
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray44, charArray59);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray72 = org.apache.commons.lang3.ArrayUtils.add(charArray59, 107, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 107, Length: 5");
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
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[4, a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "4au 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "4au 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[4, a, u,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        float[] floatArray12 = new float[] { (byte) 10, 0, 100L, ' ', (byte) -1, (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray3, floatArray12);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\u65e5\u672c\u8a9e\u65e5\u672c)", "444444444444444444444444444444444444{fPfPfPfPNPJ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
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
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray35);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray35);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray35);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("[ , hi!, en-us,  ]   jpnpfpfpfpf{        []", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...", 743);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
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
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.remove(floatArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("{Italian}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{Italian}" + "'", str1, "{Italian}");
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1, (long) 2);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1, (long) (short) 0);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.clone(longArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray7);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        char[] charArray16 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray16, 'a', (int) (short) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray16, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray23);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(charArray6, '4');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        java.lang.Character[] charArray34 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray34);
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray35);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray36, 'x');
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray36);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray36, ' ', 10);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a 4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a 4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , 4,  ,  ]");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[u,  , u, u, u]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "4a 4  u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "4a 4  u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[4, a,  , 4,  ,  , u,  , u, u, u]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
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
        float[] floatArray31 = new float[] {};
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray31);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray31);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray33);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray34);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.clone(floatArray34);
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray34, (int) '4', (int) ' ');
        float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray39, 7, 4);
        float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray39, 23, 98);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray45, (float) 48, (int) (short) 10);
        java.lang.Short[][][] shortArray49 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray13, (java.lang.Object) (short) 10);
        java.lang.String[] strArray54 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("}eurt,esla", " ");
        int int55 = org.apache.commons.lang3.StringUtils.indexOfAny("etruefalse", strArray54);
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray54, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        java.lang.String[] strArray59 = new java.lang.String[] {};
        int int60 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ", strArray59);
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.replaceEach("nglais (Etats-Unis)", strArray54, strArray59);
        java.lang.Short[][][] shortArray62 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray13, (java.lang.Object) str61);
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
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "}eurt,esla" + "'", str57, "}eurt,esla");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "nglais (Etats-Unis)" + "'", str61, "nglais (Etats-Unis)");
        org.junit.Assert.assertNotNull(shortArray62);
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("NG", "...lse,tru");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("{fPfPfPfPNPJ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{fPfPfPfPNPJ" + "'", str2, "{fPfPfPfPNPJ");
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setRegion("en");
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.Locale.Builder builder10 = builder3.setLocale(locale9);
        java.util.Locale.Builder builder11 = builder3.clearExtensions();
        java.util.Locale.Builder builder13 = builder3.setLanguageTag("hinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder3.removeUnicodeLocaleAttribute("\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ??????? [at index 0]");
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
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray6);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) (byte) -1);
        long[] longArray14 = new long[] { 'a' };
        long[] longArray21 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray21);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.add(longArray22, (int) (short) 1, (long) (byte) 1);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.subarray(longArray25, (-1), (-1));
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.subarray(longArray28, (int) (byte) 100, 0);
        long[] longArray33 = new long[] { 'a' };
        long[] longArray40 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray40);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray41, (long) '4');
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray28, longArray43);
        long[] longArray49 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray49, 0L);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray51, (long) (byte) 0);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray51);
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray51);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray28, longArray51);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray51);
        long[] longArray59 = new long[] { (byte) 0 };
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.addAll(longArray51, longArray59);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray12, longArray51);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray63 = org.apache.commons.lang3.ArrayUtils.remove(longArray51, 379);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 379, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[1, 100, 35, 10, -1]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[0]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[1, 100, 35, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray2);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (byte) 1, (int) (short) -1);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(longArray3, (long) (byte) 100);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        char[] charArray1 = null;
        char[] charArray8 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a', (int) (short) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'u');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, 'u');
        char[] charArray22 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray22, 'a', (int) (short) 10);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray22, ' ');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray22, ' ');
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray29);
        char[] charArray37 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray37, 'a', (int) (short) 10);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray37, ' ');
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray29, charArray37);
        java.lang.Character[] charArray44 = org.apache.commons.lang3.ArrayUtils.toObject(charArray29);
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray29, 'u');
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray15, charArray46);
        char[] charArray48 = org.apache.commons.lang3.ArrayUtils.addAll(charArray1, charArray46);
        int int49 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...e)4444444444444444444444444444444444...", charArray46);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray51 = org.apache.commons.lang3.ArrayUtils.remove(charArray46, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 95, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  {false,false,false,false,true}  ", (int) 'x', 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0", 0, "NPJ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str3, "0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        boolean[] booleanArray0 = null;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        boolean[] booleanArray8 = new boolean[] { false, false, false, false, true };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray8, (int) (byte) -1, (int) '#');
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray8);
        boolean[] booleanArray20 = new boolean[] { false, false, false, false, true };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray20);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray20, (int) (byte) -1, (int) '#');
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray8, booleanArray20);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray20);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray1, (java.lang.Object) booleanArray20);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray20);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray20);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray20, true);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray20, 131, 0);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray0, booleanArray34);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray0, true);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(booleanArray37);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(longArray12, (long) (byte) 0);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray12, (long) 131, 3);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray12);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) "{0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("y", 320);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y" + "'", str2, "y");
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063)it_it4", '4');
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063)it_it" + "'", str4, "\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063)it_it");
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.US;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.lang.String str7 = locale2.getDisplayCountry(locale5);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.US;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.lang.String str13 = locale2.getDisplayName(locale8);
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str15 = locale8.getDisplayName(locale14);
        java.lang.String str16 = locale8.getVariant();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.upperCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxItalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", locale8);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("zH_CN", locale8);
        boolean boolean19 = locale8.hasExtensions();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-US" + "'", str3, "en-US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "United States" + "'", str7, "United States");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "anglais (Etats-Unis)" + "'", str13, "anglais (Etats-Unis)");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXITALYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + "'", str17, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXITALYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh_cn" + "'", str18, "zh_cn");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...e)4444444444444444444444444444444444...", "hsilgnE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...e)4444444444444444444444444444444444..." + "'", str2, "...e)4444444444444444444444444444444444...");
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Locale.setDefault(locale0);
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Canada" + "'", str1, "Canada");
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'a', 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "zh_tw", (java.lang.CharSequence) "KR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ne", (java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (COREANO)");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("_ng_ng_ng_ng_", "\u30a4\u30bf\u30ea\u30a2\u8a9e\u30a4\u30bf\u30ea\u30a2)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("AAAAADEAAAAAA", "nglais (etats-unis)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nglais (etats-unis)" + "'", str2, "nglais (etats-unis)");
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\u6cd5\u6587                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
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
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray35);
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.add(byteArray35, (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[100]");
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Unitedetruefalse etruefalseStates", 'a', 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Unitedetruefxlse etruefxlseStxtes" + "'", str3, "Unitedetruefxlse etruefxlseStxtes");
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("{false,...", "{false,...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
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
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.clone(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = org.apache.commons.lang3.ArrayUtils.add(intArray9, 333, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 333, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 35, 0, 32, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 35, 0, 32]");
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("ENG", "{FPFPFPFPNPJ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("Italian (Italy)", "n-US   ", "aaafr_fraaaa (UNITED STATES)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("{FALSE,FALSE,FALSE,FALSE,TRUE", "1}eurt,esl1}eurt,esl1}eurt,esl1", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("1.0-1.00.00.0", "inglese (Stati Uniti)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("{fulse,fulse,fulse,fulse,tr", 29, "inglese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i{fulse,fulse,fulse,fulse,tri" + "'", str3, "i{fulse,fulse,fulse,fulse,tri");
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        char[] charArray8 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a', (int) (short) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'u');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, 'u');
        char[] charArray22 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray22, 'a', (int) (short) 10);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray22, ' ');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray22, ' ');
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray29);
        char[] charArray37 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray37, 'a', (int) (short) 10);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray37, ' ');
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray29, charArray37);
        java.lang.Character[] charArray44 = org.apache.commons.lang3.ArrayUtils.toObject(charArray29);
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray29, 'u');
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray15, charArray46);
        boolean boolean48 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u30a2\u30e1##", charArray15);
        char[] charArray50 = org.apache.commons.lang3.ArrayUtils.add(charArray15, 'x');
        int int51 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "nnnnnnnnnnnnnnnnnnnnnnnnnnnnn", charArray15);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "  4 a4x");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "  4 a4x");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[ ,  , 4,  , a, 4, x]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category2, locale3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category2);
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder1.addUnicodeLocaleAttribute("\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatruetruefalse");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: xxxxxxxxxxxxxxxxx????? (????)xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatruetruefalse [at index 0]");
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
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
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
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.clone(byteArray23);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray44);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.remove(byteArray44, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 6");
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
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray3, 0, 4);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray8);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.clone(intArray8);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, 213);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 35, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 35, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 35, -1]");
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("TW", "0a-1", "\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063)it_it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TW" + "'", str3, "TW");
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063\u4e2d\u6587\u53f0\u7063)it_it", "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("{tru,tru,fals}", "zh-TWUnited   States");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\u30a2\u30e1");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30e1\u30a2(" + "'", str1, "\u30e1\u30a2(");
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "na    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    china    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
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
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.addAll(intArray24, intArray39);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray40, 21);
        int int43 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) intArray42);
        java.lang.Integer[] intArray44 = org.apache.commons.lang3.ArrayUtils.toObject(intArray42);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray42, 2);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1, 10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1, 10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 16 + "'", int43 == 16);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        java.lang.String str3 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray1, "0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray1, true);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{}" + "'", str3, "{}");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[]");
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3, true);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray8, false);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray8);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray8);
        boolean[] booleanArray19 = new boolean[] { false, false, false, false, true };
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray19);
        boolean[] booleanArray26 = new boolean[] { false, false, false, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray26);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray26, (int) (byte) -1, (int) '#');
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray19, booleanArray26);
        boolean[] booleanArray37 = new boolean[] { false, false, false, false, true };
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray37);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.add(booleanArray37, false);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray26, booleanArray40);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray8, booleanArray26);
        java.lang.Boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray8);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray43, false);
        java.lang.Boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray43);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[false, false, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[true, true, false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray46);
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
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
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray12, (byte) 10, (int) 'u');
        int[] intArray47 = new int[] {};
        int[] intArray51 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray51);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.add(intArray51, 0, 4);
        int[] intArray56 = org.apache.commons.lang3.ArrayUtils.addAll(intArray47, intArray51);
        int[] intArray58 = org.apache.commons.lang3.ArrayUtils.add(intArray47, 0);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        int[] intArray61 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray60);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray47, intArray61);
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray61);
        java.lang.Integer[] intArray64 = org.apache.commons.lang3.ArrayUtils.toObject(intArray61);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) byteArray12, (java.lang.Object) intArray64);
        int[] intArray66 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray64);
        java.lang.Integer[] intArray67 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray64);
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[10]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[10]");
        org.junit.Assert.assertNotNull(intArray67);
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
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
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) 13, 15);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
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
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray48, '4');
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray48, 'a');
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray48, 'x', 42);
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.add(longArray0, (long) ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(longArray0);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[32]");
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                          ", "97United States1United States10United States10United States35United States-1United States35United States-", 131);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale3 = new java.util.Locale("Italian");
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.lang.String str6 = locale0.getDisplayLanguage(locale4);
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.lang.String str8 = locale4.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getDisplayName();
        java.util.Set<java.lang.String> strSet10 = locale7.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale3.toString(), "italian");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italian" + "'", str5, "italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese (China)" + "'", str9, "Chinese (China)");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "UNITED ST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("      []", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("eNG", 28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray13);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.add(charArray14, 'u');
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 a4u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 a4u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, 4, u]");
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hsilgnE                                   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toObject(longArray6);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, (int) ' ', 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 743, 0);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toObject(longArray0);
        java.lang.Long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toObject(longArray0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray2, '#');
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaafr_fraaaa (UNITED STATES)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("1                                   English0", 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "23", (java.lang.CharSequence) "fra");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        java.util.Locale locale3 = new java.util.Locale("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAsOATH kOREA", "97101035-135-1", "ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_");
        org.junit.Assert.assertEquals(locale3.toString(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasoath korea_97101035-135-1_ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_  {FPFPFPFPNPJ   ja_");
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale5.getDisplayLanguage();
        java.lang.Object obj8 = locale5.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
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
        java.lang.String str19 = locale9.getVariant();
        java.lang.String str21 = locale9.getExtension('u');
        java.lang.String str22 = locale9.toString();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italian" + "'", str14, "Italian");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JPN" + "'", str18, "JPN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "it_IT" + "'", str22, "it_IT");
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("etruefalse");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ");
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray1, (java.lang.Object) "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hinese", "italie ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hinese" + "'", str2, "hinese");
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "nglais (etats-unis)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaafr_fraaaa", "true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "-101");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
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
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, (float) 39);
        float[] floatArray41 = new float[] { (byte) 10, 0, 100L, ' ', (byte) -1, (short) 0 };
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray41);
        float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray41, (int) (short) 0, (int) (byte) -1);
        float[] floatArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray45, (float) 1);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains(floatArray45, (float) (byte) -1);
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray31, floatArray45);
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray45, (float) (short) 100);
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
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[39.0]");
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                     ng");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = java.util.Locale.US;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.lang.String str6 = locale1.getDisplayCountry(locale4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("\u4e2d\u56fd", locale1);
        java.util.Set<java.lang.String> strSet8 = locale1.getUnicodeLocaleKeys();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet8, 'x');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-US" + "'", str2, "en-US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "United States" + "'", str6, "United States");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AAAAADEAAAAAA", "                                                        {97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE                                                         ", "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2\u8a9e\u82f1");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 'u', 10);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray4);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray4);
        double[] doubleArray13 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray13, (double) (short) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray15, (double) (short) 1, 100.0d);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray15);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray15);
        java.lang.Double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray15);
        java.lang.Double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray21);
        int[] intArray28 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray28, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray28);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray28, (int) (short) 100);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray28);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.add(intArray28, 5);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.clone(intArray36);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) doubleArray21, (java.lang.Object) intArray37);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = org.apache.commons.lang3.ArrayUtils.remove(intArray37, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 23, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) (byte) 0);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray9 = new float[] {};
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray9);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray11);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray11);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray11);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray11, (float) 98, 0);
        float[] floatArray21 = new float[] { 1.0f, (-1L), 13 };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray11, floatArray21);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray11);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[1.0, -1.0, 13.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        java.lang.String str10 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray5);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray5);
        boolean[] booleanArray17 = new boolean[] { false, false, false, false, true };
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray17, (int) (byte) -1, (int) '#');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray17);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray17, false);
        java.lang.Boolean[] booleanArray29 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray29);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray29, true);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray17, booleanArray32);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray33, false);
        boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray35);
        java.lang.Boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray35);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray37);
        boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray38);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray38, true);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{false,false,false,false,true}" + "'", str10, "{false,false,false,false,true}");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, false, false, false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[true, false, false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[true, false, false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[true, false, false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[false, false, false, false, true, true, false, false, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.US;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale7.getDisplayVariant();
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
        java.lang.String str34 = locale30.getExtension('x');
        java.lang.String str35 = locale7.getDisplayScript(locale30);
        java.lang.String str36 = locale1.getDisplayName(locale30);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.upperCase("English (United States)", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
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
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "French (France)" + "'", str36, "French (France)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ENGLISH (UNITED STATES)" + "'", str37, "ENGLISH (UNITED STATES)");
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
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
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray12, (byte) 10, (int) 'u');
        byte[] byteArray49 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, 6, (int) '4');
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray49, (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ja_JP", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ja_JP" + "'", str2, "ja_JP");
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("         ", (int) (short) 100, 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         " + "'", str3, "         ");
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray10 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList11);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList22);
        java.lang.Iterable[] iterableArray26 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray27 = (java.lang.Iterable<java.lang.String>[]) iterableArray26;
        strIterableArray27[0] = strList11;
        strIterableArray27[1] = strList24;
        java.lang.Short[] shortArray33 = new java.lang.Short[] { (short) 0 };
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray33, (short) (byte) 1);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray33, (java.lang.Object) (byte) 10);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray33);
        java.lang.Iterable<java.lang.String>[] strIterableArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(strIterableArray27, (java.lang.Object) shortArray33);
        boolean[] booleanArray45 = new boolean[] { false, false, false, false, true };
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray45);
        boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray45, (int) (byte) -1, (int) '#');
        java.lang.String str50 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray45);
        boolean[] booleanArray56 = new boolean[] { false, false, false, false, true };
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray56);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray56, true);
        boolean[] booleanArray62 = org.apache.commons.lang3.ArrayUtils.add(booleanArray56, (int) (short) 0, false);
        boolean[] booleanArray63 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray45, booleanArray56);
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strIterableArray39, (java.lang.Object) booleanArray45, (int) (byte) 10);
        java.lang.Class<?>[][][] wildcardClassArray66 = org.apache.commons.lang3.ArrayUtils.removeElement(wildcardClassArray2, (java.lang.Object) (byte) 10);
        java.lang.Class<?>[][][] wildcardClassArray67 = org.apache.commons.lang3.ArrayUtils.toArray(wildcardClassArray2);
        java.lang.String str68 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray2);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.isNotEmpty((java.lang.reflect.GenericDeclaration[][][]) wildcardClassArray2);
        java.util.Locale locale71 = new java.util.Locale("Italian");
        java.util.Locale locale72 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str73 = locale71.getDisplayName(locale72);
        java.util.Locale locale74 = java.util.Locale.US;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.lang.String str76 = locale75.toLanguageTag();
        java.util.Locale locale77 = java.util.Locale.JAPANESE;
        java.lang.String str78 = locale75.getDisplayName(locale77);
        java.lang.String str79 = locale71.getDisplayVariant(locale75);
        java.util.Locale locale81 = new java.util.Locale("");
        java.lang.String str82 = locale71.getDisplayName(locale81);
        int int84 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) wildcardClassArray2, (java.lang.Object) locale71, (int) (short) 1);
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(iterableArray26);
        org.junit.Assert.assertNotNull(strIterableArray27);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[0]");
        org.junit.Assert.assertNotNull(strIterableArray39);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "{false,false,false,false,true}" + "'", str50, "{false,false,false,false,true}");
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(booleanArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray62), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray63), "[false, false, false, false, true, false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals(locale71.toString(), "italian");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "italian" + "'", str73, "italian");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "en-US" + "'", str76, "en-US");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str78, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals(locale81.toString(), "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "italian" + "'", str82, "italian");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("e", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        char[] charArray8 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a', (int) (short) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, ' ');
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aitalianaa", charArray8);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0}1.0{0}100.0{0}1.0", charArray8);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a');
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[ ,  , 4,  , a, 4]");
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) (byte) 0);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (int) (short) 0, (float) 0);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, (float) (short) 100, (int) (byte) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray8);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[1.0, 1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[1.0, 1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\u30a4\u30bf\u30ea\u30a2", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u30a4\u30bf\u30ea\u30a2" + "'", charSequence2, "\u30a4\u30bf\u30ea\u30a2");
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444italie4444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444italie4444444444444444" + "'", str1, "444444444444444italie4444444444444444");
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaah{0,-1}{0,German (Germany)h{0,-1}{0,-", (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "se,false,false,tru{false,false,false,false", "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale6.toLanguageTag();
        java.lang.String str8 = locale6.toLanguageTag();
        java.util.Locale locale9 = java.util.Locale.US;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = locale6.getDisplayLanguage(locale10);
        java.lang.String str12 = locale5.getDisplayCountry(locale6);
        java.util.Locale.Builder builder13 = builder4.setLocale(locale6);
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder16 = builder14.clearExtensions();
        java.util.Locale.Builder builder17 = builder14.clear();
        java.util.Locale locale18 = builder14.build();
        java.util.Locale locale19 = java.util.Locale.TAIWAN;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Locale.Builder builder21 = builder14.setLocale(locale19);
        java.util.Locale locale22 = java.util.Locale.US;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.US;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.lang.String str27 = locale22.getDisplayCountry(locale25);
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.util.Locale locale29 = java.util.Locale.US;
        java.util.Locale locale30 = locale29.stripExtensions();
        java.lang.String str31 = locale30.getLanguage();
        java.lang.String str32 = locale28.getDisplayScript(locale30);
        java.lang.String str33 = locale22.getDisplayName(locale28);
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str35 = locale28.getDisplayName(locale34);
        java.lang.String str36 = locale28.getVariant();
        java.lang.String str37 = locale28.getDisplayVariant();
        java.lang.String str38 = locale28.getISO3Language();
        java.util.Locale.Builder builder39 = builder21.setLocale(locale28);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) builder4, (java.lang.Object) builder21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder43 = builder4.setExtension('a', "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaSoath Korea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaSoath Korea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-US" + "'", str7, "en-US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en-US" + "'", str8, "en-US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English" + "'", str11, "English");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en-US" + "'", str23, "en-US");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "United States" + "'", str27, "United States");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en" + "'", str31, "en");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "anglais (Etats-Unis)" + "'", str33, "anglais (Etats-Unis)");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str35, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fra" + "'", str38, "fra");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 3, (int) '#');
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 0L);
        long[] longArray16 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray16, 0L);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray18);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray6, longArray18);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray18, (long) 98);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray22);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("it", "\u6587\u5229\u5927\u610f");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
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
            java.util.Locale.Builder builder82 = builder79.setRegion("frChinatruetruefalsetruetruefalsetrChinatruetruefalsetruetruefal   JPNPfPfPfPf{        etruefalsetruetruefalsetruetrFR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: frChinatruetruefalsetruetruefalsetrChinatruetruefalsetruetruefal   JPNPfPfPfPf{        etruefalsetruetruefalsetruetrFR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(categoryEnumArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category19.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category24.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_CA");
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
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("SE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE", "Unitedetruefalse etruefalseStates");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                       aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ", 16, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                       aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    " + "'", str3, "                                                                       aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ");
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList5 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray16 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList17);
        java.util.Locale.FilteringMode filteringMode20 = null;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList17, filteringMode20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.String[] strArray34 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList35);
        java.util.Locale.FilteringMode filteringMode38 = null;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList35, filteringMode38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, strMap40);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.lang.String[] strArray52 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList53);
        java.util.Locale.FilteringMode filteringMode56 = null;
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.lang.String>) strList53, filteringMode56);
        java.util.Locale locale58 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet59 = locale58.getUnicodeLocaleAttributes();
        java.util.Locale locale61 = new java.util.Locale("Italian");
        java.util.Locale locale62 = java.util.Locale.ITALY;
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        java.util.Locale locale64 = java.util.Locale.US;
        java.lang.String str65 = locale64.toLanguageTag();
        java.util.Locale locale66 = java.util.Locale.ITALY;
        java.util.Locale locale67 = java.util.Locale.US;
        java.util.Locale locale68 = locale67.stripExtensions();
        java.lang.String str69 = locale68.toLanguageTag();
        java.lang.String str70 = locale66.getDisplayScript(locale68);
        java.util.Locale locale71 = java.util.Locale.KOREA;
        java.util.Locale locale72 = java.util.Locale.ITALY;
        java.util.Locale locale73 = java.util.Locale.US;
        java.util.Locale locale74 = locale73.stripExtensions();
        java.lang.String str75 = locale74.toLanguageTag();
        java.lang.String str76 = locale72.getDisplayScript(locale74);
        java.lang.String str77 = locale72.getDisplayLanguage();
        java.util.Locale locale78 = java.util.Locale.ITALY;
        java.util.Locale locale79 = java.util.Locale.US;
        java.util.Locale locale80 = locale79.stripExtensions();
        java.lang.String str81 = locale80.toLanguageTag();
        java.lang.String str82 = locale78.getDisplayScript(locale80);
        java.util.Locale[] localeArray83 = new java.util.Locale[] { locale58, locale61, locale62, locale63, locale64, locale66, locale71, locale72, locale80 };
        java.util.ArrayList<java.util.Locale> localeList84 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList84, localeArray83);
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.util.Locale>) localeList84, filteringMode86);
        java.util.Locale locale88 = java.util.Locale.US;
        java.lang.String str89 = locale88.toLanguageTag();
        java.lang.String str90 = locale88.getScript();
        java.util.Locale[] localeArray91 = new java.util.Locale[] { locale88 };
        java.util.ArrayList<java.util.Locale> localeList92 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList92, localeArray91);
        java.util.Locale locale94 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter(languageRangeList23, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.Locale.FilteringMode filteringMode97 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList98 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList92, filteringMode97);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertEquals(locale61.toString(), "italian");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "en-US" + "'", str65, "en-US");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "en-US" + "'", str69, "en-US");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "en-US" + "'", str75, "en-US");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Italian" + "'", str77, "Italian");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "en-US" + "'", str81, "en-US");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(localeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode86.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "en-US" + "'", str89, "en-US");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(localeArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNull(locale94);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertTrue("'" + filteringMode97 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode97.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList98);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("FR_fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FR_fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("10 32 10 5 1", "TR#TR#FALS                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10 32 10 5 1" + "'", str2, "10 32 10 5 1");
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
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
        java.lang.Boolean[] booleanArray56 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray57 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray56);
        java.lang.Double[] doubleArray64 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray66 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray64, (double) (short) 0);
        double[] doubleArray67 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray66);
        int int69 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray56, (java.lang.Object) doubleArray66, 4);
        boolean[] booleanArray70 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray56);
        boolean[] booleanArray72 = org.apache.commons.lang3.ArrayUtils.add(booleanArray70, false);
        double[] doubleArray75 = new double[] { 4, 100L };
        double[] doubleArray78 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray75, (int) '4', 5);
        int int81 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray78, 10.0d, (double) (-1.0f));
        double[] doubleArray83 = org.apache.commons.lang3.ArrayUtils.add(doubleArray78, (double) 23);
        double[] doubleArray85 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray78, 100.0d);
        boolean boolean86 = objMap15.remove((java.lang.Object) booleanArray72, (java.lang.Object) doubleArray78);
        java.lang.Object obj88 = objMap15.get((java.lang.Object) "\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
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
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertNotNull(booleanArray57);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(booleanArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray70), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray72), "[true, true, false, false]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[23.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("1-setatS detinU0setatS detinU1", "\u82f1\u8a9e\u30a2EN_US", 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray2, "");
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.add(doubleArray7, 320, (double) 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 320, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.01.0" + "'", str6, "-1.01.0");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 1.0]");
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("   {}   ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                {}                 " + "'", str2, "                {}                 ");
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Italiano");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiano" + "'", str1, "italiano");
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3, false);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray3, '#', (int) '4', (int) '#');
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, false]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "truetruefalse" + "'", str9, "truetruefalse");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("truetruefalse", "en-US", (int) '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("DE", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAsOATH kOREA", strArray6, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{false,false,false,false,true}", '4');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                              Giappone                                              ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray0);
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.remove(shortArray0, 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 69, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2e_US", "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
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
        char[] charArray19 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray19, 'a', (int) (short) 10);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray19, ' ');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray19, ' ');
        char[] charArray33 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray33, 'a', (int) (short) 10);
        char[] charArray43 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray43, 'a', (int) (short) 10);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray43, ' ');
        char[] charArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray43, ' ');
        char[] charArray51 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray50);
        char[] charArray52 = org.apache.commons.lang3.ArrayUtils.addAll(charArray33, charArray50);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray19, charArray33);
        char[] charArray56 = org.apache.commons.lang3.ArrayUtils.subarray(charArray19, 10, 100);
        char[] charArray57 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray56);
        char[] charArray65 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray65, 'a', (int) (short) 10);
        int int70 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray65, ' ');
        char[] charArray72 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray65, ' ');
        char[] charArray73 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray72);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray72);
        boolean boolean75 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray72);
        int int78 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray72, '#', (int) (short) -1);
        char[] charArray81 = org.apache.commons.lang3.ArrayUtils.add(charArray72, 2, 'u');
        boolean boolean82 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray57, charArray72);
        char[] charArray85 = org.apache.commons.lang3.ArrayUtils.subarray(charArray72, (int) (byte) -1, 0);
        char[] charArray86 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray72);
        char[] charArray88 = org.apache.commons.lang3.ArrayUtils.add(charArray72, '4');
        boolean boolean89 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                     100.0#-1.0#10.0#1.0#100.0#1.0", charArray88);
        boolean boolean90 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray88);
        java.util.Locale.Category[] categoryArray91 = org.apache.commons.lang3.ArrayUtils.removeElement(categoryArray10, (java.lang.Object) boolean90);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertNotNull(categoryArray10);
        org.junit.Assert.assertNotNull(categoryEnumArray11);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[]");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[]");
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 4 + "'", int68 == 4);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[4, a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), "4au 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), "4au 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[4, a, u,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[]");
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray88), "4a 4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray88), "4a 4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray88), "[4, a,  , 4,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(categoryArray91);
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 10);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("{false,fa  {false,false,false,false,true}  laf,eslaf");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range={false,fa  {false,false,false,false,true}  laf,eslaf");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("United Kingdom", "44444444444444444444444444FRANCE");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toObject(longArray6);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray6, (int) ' ', 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, (long) '#', 0);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) (short) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray6, '#');
        java.lang.Double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray6);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) (byte) 100);
        long[] longArray18 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray18, 0L);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray20, (long) 3, (int) '#');
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray20, 0L);
        long[] longArray30 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray30, 0L);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray32);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray20, longArray32);
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.subarray(longArray32, 98, 95);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray11, (java.lang.Object) longArray37);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str10, "100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("eng");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("u uuu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: u uuu [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Japan");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\u97d3\u56fd\u8a9e", "100.010.0", 333);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444italien (Italie)44444444444444444444444444444444444444444444444444", 756, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ", "-1.01.0", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja_JP" + "'", str1, "ja_JP");
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        char[] charArray3 = new char[] { ' ', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray3);
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray3, 'a', 9);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray3, '4');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray3, 'u');
        java.lang.String str14 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) charArray3, "\u4e2d\u4e2d\u4e2d\u4e2d\u4e2d");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , a, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{ ,a}" + "'", str14, "{ ,a}");
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str1, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("  en-US   ", "deuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("-1.0zh_TW1.0", "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", 221);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\u30a2(");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) (byte) 10);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) 131);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray9, (long) '4');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray11, (int) (short) 1, (-1L));
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.remove(longArray11, 0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[97]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, -1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[10, 10, 35, -1, 35, -1]");
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) (short) 0);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray3, (java.lang.Object) doubleArray13, 4);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray13, (double) 34, (int) (byte) 1);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        java.lang.Character[] charArray5 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'x');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[u,  , u, u, u]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 3, (int) '#');
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 0L);
        long[] longArray16 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray16, 0L);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray18);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray6, longArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, (long) 221);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray6);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, ' ');
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, 'u', (int) '4');
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.subarray(charArray14, 23, (int) (byte) 1);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(charArray14, '4');
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u4e2d\u56fd", charArray14);
        java.lang.Character[] charArray30 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray30);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray31);
        int int33 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) charArray32);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray14, charArray32);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray36 = org.apache.commons.lang3.ArrayUtils.remove(charArray14, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 320, Length: 5");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[u,  , u, u, u]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("zh-TW  ", "xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        java.lang.Character[] charArray5 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clearExtensions();
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray5, (java.lang.Object) builder9, 4);
        java.util.Locale locale12 = builder9.build();
        java.util.Locale locale13 = builder9.build();
        java.util.Locale.Builder builder14 = builder9.clearExtensions();
        java.util.Locale.Builder builder15 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder9.setVariant("US                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: US                                                                                                   [at index 0]");
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
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        java.util.Locale locale1 = new java.util.Locale("truetruetruefalsetruetruetruefalsefalse");
        boolean boolean2 = locale1.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "truetruetruefalsetruetruetruefalsefalse");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "444444444444444444444italien (talie...aaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("rt,esluf,esluf,esluf,esluf{                                                                         ", "United St", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray14);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.add(charArray14, 'u');
        java.lang.CharSequence charSequence20 = null;
        char[] charArray22 = null;
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray30 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray30, 'a', (int) (short) 10);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray30, ' ');
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray30, ' ');
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray23, charArray37);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray22, charArray23);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray47 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray47, 'a', (int) (short) 10);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray47, ' ');
        char[] charArray54 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray47, ' ');
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray40, charArray54);
        char[] charArray56 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray40);
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.contains(charArray56, 'a');
        int int60 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray56, '4');
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray23, charArray56);
        boolean boolean62 = org.apache.commons.lang3.StringUtils.containsAny("en-CA", charArray56);
        boolean boolean63 = org.apache.commons.lang3.StringUtils.containsNone(charSequence20, charArray56);
        char[] charArray64 = org.apache.commons.lang3.ArrayUtils.addAll(charArray19, charArray56);
        int int66 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray56, 'a');
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
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4a 4 u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4a 4 u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, a,  , 4,  , u]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[]");
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "4a 4 u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "4a 4 u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[4, a,  , 4,  , u]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("francese (Francia)", "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "francese (Francia)" + "'", str2, "francese (Francia)");
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, 1.0d);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray7, (double) (-1L), (double) 98);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) 'a');
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, 7, (int) (byte) 100);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray11);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.subarray(intArray11, 17, 22);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.subarray(intArray11, (int) (short) 0, 95);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 35, 0, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) booleanArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(objArray6, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (coreano)");
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[true, true, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[true, true, false]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (coreano)false" + "'", str8, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (coreano)false");
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
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
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray45);
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("n", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale6 = java.util.Locale.US;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale7.toLanguageTag();
        java.lang.String str9 = locale5.getDisplayScript(locale7);
        java.lang.String str10 = locale7.getISO3Language();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags(languageRangeList4, (java.util.Collection<java.lang.String>) strSet11, filteringMode12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList27);
        java.util.Locale.FilteringMode filteringMode30 = null;
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList27, filteringMode30);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.lang.String[] strArray42 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList43);
        java.util.Locale.FilteringMode filteringMode46 = null;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList43, filteringMode46);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList43);
        java.lang.String str49 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strList48);
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList48, "{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...{FALSE,...");
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList48, ' ');
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en-US" + "'", str8, "en-US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "eng" + "'", str10, "eng");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode12.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\u6cd5", "truefalsefalsefalsefalsetruetruefalse");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.add(byteArray3, (byte) -1);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray5, (byte) 100, (-1));
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 10);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.clone(byteArray5);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (int) (short) 1, (byte) 100);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray21, (byte) 10, (int) '#');
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.add(byteArray27, (byte) -1);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray21, byteArray27);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray21);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(byteArray31, (byte) 1);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray31, (int) (short) 100, (int) '#');
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray36);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray14, byteArray36);
        java.lang.Byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray36);
        byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.add(byteArray36, (byte) 1);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray41);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray42, (byte) -1);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.contains(byteArray42, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 100, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 100, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
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
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray21, (float) 69);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("US");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "  {FPFPFPFPNPJ   ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int[] intArray8 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray8);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.add(intArray8, 0, 4);
        java.lang.Integer[] intArray13 = org.apache.commons.lang3.ArrayUtils.toObject(intArray8);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) intArray13, (int) (byte) 1);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray13, (int) (short) 0);
        java.lang.Integer[] intArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray13);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\uc774\ud0c8\ub9ac\uc544\uc5b4", (java.lang.CharSequence) "italien");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", charSequence2, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("...lse,tru", "9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-FALSE,FALSE,FALSE,TRU,truetruefalse)9)enihC( sionihc-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 8, (double) 1L);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 756, 97, (double) 333);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("UNITED STATES");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UNITED STATES" + "'", str1, "UNITED STATES");
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("CHINA", "{false,fa  {false,false,false,false,true}  laf,eslaf");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINA" + "'", str2, "CHINA");
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("  {false,false,false,false,true}   ");
        java.util.Locale locale6 = new java.util.Locale("0", "{false,false,false,false,tru", "truetruefalse");
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("china", locale6);
        java.lang.String str9 = locale1.getDisplayLanguage(locale6);
        java.lang.String str10 = locale1.getScript();
        java.lang.Object obj11 = null;
        boolean boolean12 = locale1.equals(obj11);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "0_{FALSE,FALSE,FALSE,FALSE,TRU_truetruefalse");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CHINA" + "'", str8, "CHINA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.Class<?>[] wildcardClassArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        char[] charArray3 = new char[] { '4' };
        char[] charArray5 = new char[] { '4' };
        char[] charArray7 = new char[] { '4' };
        char[] charArray9 = new char[] { '4' };
        char[] charArray11 = new char[] { '4' };
        char[] charArray13 = new char[] { '4' };
        char[][] charArray14 = new char[][] { charArray3, charArray5, charArray7, charArray9, charArray11, charArray13 };
        char[] charArray22 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray22, 'a', (int) (short) 10);
        char[] charArray32 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray32, 'a', (int) (short) 10);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray32, ' ');
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray32, ' ');
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray39);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.addAll(charArray22, charArray39);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.contains(charArray22, '4');
        boolean boolean44 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aitalianaa", charArray22);
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
        char[] charArray89 = org.apache.commons.lang3.ArrayUtils.addAll(charArray22, charArray88);
        char[][] charArray90 = org.apache.commons.lang3.ArrayUtils.add(charArray14, charArray22);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray91 = org.apache.commons.lang3.ArrayUtils.removeElement((java.lang.reflect.GenericDeclaration[]) wildcardClassArray1, (java.lang.Object) charArray90);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray92 = org.apache.commons.lang3.ArrayUtils.clone(genericDeclarationArray91);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray93 = org.apache.commons.lang3.ArrayUtils.addAll((java.lang.reflect.AnnotatedElement[]) wildcardClassArray0, (java.lang.reflect.AnnotatedElement[]) genericDeclarationArray91);
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertNotNull(wildcardClassArray1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4]");
        org.junit.Assert.assertNotNull(charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
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
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray89), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray89), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray89), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertNotNull(genericDeclarationArray91);
        org.junit.Assert.assertNotNull(genericDeclarationArray92);
        org.junit.Assert.assertNotNull(annotatedElementArray93);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        java.lang.Character[] charArray5 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) charArray5);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(objArray7);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[u,  , u, u, u]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[u,  , u, u, u]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[u,  , u, u, u]");
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
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
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray21);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray24, false);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[true, false, false, false, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("adaaeaafaagaaiaalaamaanaaoaaqaaraasaataauaawaaxaazabaabbabdabeabfabgabhabiabjablabmabnaboabqabrabsabtabvabwabyabzacaaccacdacfacgachaciackaclacmacnacoacracuacvacwacxacyaczadeadjadkadmadoadzaecaeeaegaehaeraesaetafiafjafkafmafoafragaagbagdageagfaggaghagiaglagmagnagpagqagragsagtaguagwagyahkahmahnahrahtahuaidaieailaimainaioaiqairaisaitajeajmajoajpakeakgakhakiakmaknakpakrakwakyakzalaalbalcalialkalralsaltalualvalyamaamcamdameamfamgamhamkamlammamnamoampamqamramsamtamuamvamwamxamyamzanaancaneanfanganianlanoanpanranuanzaomapaapeapfapgaphapkaplapmapnaprapsaptapwapyaqaarearoarsaruarwasaasbascasdaseasgashasiasjaskaslasmasnasoasrassastasvasxasyaszatcatdatfatgathatjatkatlatmatnatoatrattatvatwatzauaaugaumausauyauzavaavcaveavgaviavnavuawfawsayeaytazaazmazw", "KOR", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adaaeaafaagaaiaalaamaanaaoaaqaaraasaataauaawaaxaazabaabbabdabeabfabgabhabiabjablabmabnaboabqabrabsabtabvabwabyabzacaaccacdacfacgachaciackaclacmacnacoacracuacvacwacxacyaczadeadjadkadmadoadzaecaeeaegaehaeraesaetafiafjafkafmafoafragaagbagdageagfaggaghagiaglagmagnagpagqagragsagtaguagwagyahkahmahnahrahtahuaidaieailaimainaioaiqairaisaitajeajmajoajpakeakgakhakiakmaknakpakrakwakyakzalaalbalcalialkalralsaltalualvalyamaamcamdameamfamgamhamkamlammamnamoampamqamramsamtamuamvamwamxamyamzanaancaneanfanganianlanoanpanranuanzaomapaapeapfapgaphapkaplapmapnaprapsaptapwapyaqaarearoarsaruarwasaasbascasdaseasgashasiasjaskaslasmasnasoasrassastasvasxasyaszatcatdatfatgathatjatkatlatmatnatoatrattatvatwatzauaaugaumausauyauzavaavcaveavgaviavnavuawfawsayeaytazaazmazw" + "'", str3, "adaaeaafaagaaiaalaamaanaaoaaqaaraasaataauaawaaxaazabaabbabdabeabfabgabhabiabjablabmabnaboabqabrabsabtabvabwabyabzacaaccacdacfacgachaciackaclacmacnacoacracuacvacwacxacyaczadeadjadkadmadoadzaecaeeaegaehaeraesaetafiafjafkafmafoafragaagbagdageagfaggaghagiaglagmagnagpagqagragsagtaguagwagyahkahmahnahrahtahuaidaieailaimainaioaiqairaisaitajeajmajoajpakeakgakhakiakmaknakpakrakwakyakzalaalbalcalialkalralsaltalualvalyamaamcamdameamfamgamhamkamlammamnamoampamqamramsamtamuamvamwamxamyamzanaancaneanfanganianlanoanpanranuanzaomapaapeapfapgaphapkaplapmapnaprapsaptapwapyaqaarearoarsaruarwasaasbascasdaseasgashasiasjaskaslasmasnasoasrassastasvasxasyaszatcatdatfatgathatjatkatlatmatnatoatrattatvatwatzauaaugaumausauyauzavaavcaveavgaviavnavuawfawsayeaytazaazmazw");
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-9)enC(Zsonc-", "chinois (Chine)                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("ja_jp", "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2\u8a9e\u82f1 1");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 'u', 10);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray4);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray4);
        double[] doubleArray13 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray13, (double) (short) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray15, (double) (short) 1, 100.0d);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray15);
        java.lang.Double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray4);
        java.lang.Double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray21);
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "{false,...##########################################################################################", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "{false,...##########################################################################################" + "'", charSequence2, "{false,...##########################################################################################");
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        boolean[] booleanArray1 = new boolean[] { false };
        java.lang.Boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray1);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray1, (int) '#', 34);
        boolean[] booleanArray11 = new boolean[] { false, false, false, false, true };
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray11);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray11, (int) (byte) -1, (int) '#');
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray11);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray11);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray18, (int) (short) 100, 2);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray21, false, 42);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray21);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray21);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.add(booleanArray21, true);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray28);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[true]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        char[] charArray16 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray16, 'a', (int) (short) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray16, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray23);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(charArray6, '4');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.remove(charArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray31 = org.apache.commons.lang3.ArrayUtils.remove(charArray29, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 23, Length: 5");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, 4]");
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
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
        java.lang.String str33 = locale15.getDisplayScript();
        java.util.Set<java.lang.String> strSet34 = locale15.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\u610f\u5927\u5229\u6587\u30bf\u610f\u5927\u5229)", "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587\u30bf\u610f\u5927\u5229)" + "'", str2, "\u610f\u5927\u5229\u6587\u30bf\u610f\u5927\u5229)");
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        java.util.Locale[][] localeArray0 = new java.util.Locale[][] {};
        java.util.Locale[][] localeArray1 = new java.util.Locale[][] {};
        java.util.Locale[][][] localeArray2 = new java.util.Locale[][][] { localeArray0, localeArray1 };
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(localeArray2);
        org.junit.Assert.assertNotNull(localeArray0);
        org.junit.Assert.assertNotNull(localeArray1);
        org.junit.Assert.assertNotNull(localeArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("EN", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EN" + "'", str2, "EN");
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
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
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.contains(byteArray71, (byte) -1);
        int int75 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray71, (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("truetruefalse", "en-US", (int) '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("anglais (Etats-Unis)", "anglais (Etats-Unis)");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("97101035-135-1", strArray5, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97101035-135-1" + "'", str10, "97101035-135-1");
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587\u4e2d\u6587katlatmatnatoatrattatvatwatzauaaugaumausauyauzavaavcaveavgaviavnavuawfawsayeaytazaazmazw");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 766 + "'", int1 == 766);
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        java.util.Locale locale2 = new java.util.Locale("FR", "                                              Giappone                                              ");
        org.junit.Assert.assertEquals(locale2.toString(), "fr_                                              GIAPPONE                                              ");
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "French");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale.Category[] categoryArray5 = new java.util.Locale.Category[] { category0, category3 };
        java.util.Locale.Category[][] categoryArray6 = new java.util.Locale.Category[][] { categoryArray5 };
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
        java.util.Locale.Category[][][] categoryArray21 = new java.util.Locale.Category[][][] { categoryArray6, categoryArray13, categoryArray20 };
        java.util.Locale.Category category23 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category24 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category25 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category27, locale28);
        java.util.Locale.Category category30 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale31 = java.util.Locale.getDefault(category30);
        java.util.Locale.Category[] categoryArray32 = new java.util.Locale.Category[] { category23, category24, category25, category26, category27, category30 };
        java.util.Locale.Category category33 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category34 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category35 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category36 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category37 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category37, locale38);
        java.util.Locale.Category category40 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale41 = java.util.Locale.getDefault(category40);
        java.util.Locale.Category[] categoryArray42 = new java.util.Locale.Category[] { category33, category34, category35, category36, category37, category40 };
        java.util.Locale.Category[][] categoryArray43 = new java.util.Locale.Category[][] { categoryArray32, categoryArray42 };
        java.util.Locale.Category[][] categoryArray46 = org.apache.commons.lang3.ArrayUtils.subarray(categoryArray43, (int) '#', 35);
        java.util.Locale.Category[][][] categoryArray47 = org.apache.commons.lang3.ArrayUtils.add(categoryArray21, 0, categoryArray46);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) categoryArray21);
        java.lang.Boolean[] booleanArray52 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray52);
        java.lang.Boolean[] booleanArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray53);
        boolean[] booleanArray56 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray53, false);
        boolean[] booleanArray58 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray53, true);
        int int59 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) categoryArray21, (java.lang.Object) true);
        java.util.Locale.Category[][][] categoryArray60 = org.apache.commons.lang3.ArrayUtils.toArray(categoryArray21);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray5);
        org.junit.Assert.assertNotNull(categoryArray6);
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
        org.junit.Assert.assertNotNull(categoryArray21);
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category23.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.FORMAT + "'", category24.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category25 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category25.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.FORMAT + "'", category26.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category27 + "' != '" + java.util.Locale.Category.FORMAT + "'", category27.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.FORMAT + "'", category30.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray32);
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category33.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category34 + "' != '" + java.util.Locale.Category.FORMAT + "'", category34.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category35 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category35.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.FORMAT + "'", category36.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category37 + "' != '" + java.util.Locale.Category.FORMAT + "'", category37.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.FORMAT + "'", category40.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray42);
        org.junit.Assert.assertNotNull(categoryArray43);
        org.junit.Assert.assertNotNull(categoryArray46);
        org.junit.Assert.assertNotNull(categoryArray47);
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(categoryArray60);
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 42, 98, 48, 6, 48, 29 };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = org.apache.commons.lang3.ArrayUtils.remove(intArray8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[42, 98, 48, 6, 48, 29]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[42, 98, 48, 6, 48, 29]");
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("allemand (Allemagne)", "true true false");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand (Allemagne)" + "'", str2, "allemand (Allemagne)");
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        int[] intArray0 = new int[] {};
        int[] intArray4 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray4);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0, 4);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray4);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 0);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = org.apache.commons.lang3.ArrayUtils.remove(intArray0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ne");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("US");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "  {FPFPFPFPNPJ   ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("n", strArray2, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "  {false,false,false,false,true}   nglais (Etats-Unis)nglais (Etats-Unis)nglais (Etats-Unis)nglais (");
        java.util.Locale.Category category11 = java.util.Locale.Category.DISPLAY;
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray10, (java.lang.Object) category11);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("[]");
        java.util.Locale.setDefault(category11, locale14);
        java.lang.String str16 = locale14.getVariant();
        java.lang.String str17 = locale14.getScript();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "n" + "'", str8, "n");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category11.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("coreanocoreanocTaiwancoreanocoreanoco", "aaaaaDEaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "coreanocoreanocTaiwancoreanocoreanoco" + "'", str2, "coreanocoreanocTaiwancoreanocoreanoco");
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\uc911\uad6d", "hi!", 17);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("######{false,false,false,false,true", "0-1");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229)", strArray5, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("TEDESCO (GERMANIA", strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str9, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("100.0#-1.0#10.0#1.0#100.0#1.0", 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Giappone", 'u');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("etruefalse                                                                                          ", strArray3, strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "etruefalse                                                                                          " + "'", str7, "etruefalse                                                                                          ");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "\u5229\u5927\u610f\u6587\u5229\u5927\u610f\u5229\u5927\u610f\u6587\u5229\u5927\u610f\u5229\u5927\u610f\u6587\u5229\u5927\u610f");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ZH_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZH_CN" + "'", str1, "ZH_CN");
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        float[] floatArray6 = new float[] { (byte) 10, 0, 100L, ' ', (byte) -1, (short) 0 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray6);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray6, (int) (short) 0, (int) (byte) -1);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray10, (float) 1);
        java.lang.Float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray12);
        java.lang.Float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray13);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray14);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray14, (float) 8);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray17, (float) 48, 25);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, 0.0, 100.0, 32.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\u65e5\u672c", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u672c" + "'", str3, "\u65e5\u672c");
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u97e9\u56fd", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)_CORE                             slafurturt", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 0L);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray6, (float) 0L);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray6, (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, 117, (float) 107);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 117, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[1.0, -1.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[1.0, -1.0, 0.0, 0.0]");
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U", "corean44444444444444444444444444fRANCE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Italiano", "Giappone", 39);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("italie ", "it_it", 69);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italie " + "'", str3, "italie ");
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, 320, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 320, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 100, 10, 100]");
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray0, "Etats-Unis");
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 42);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) 'a', 0.0d);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        java.lang.Character[] charArray3 = new java.lang.Character[] { ' ', ' ', 'a' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4, '4');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, 'u', 42);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  , a]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , a]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , a]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "{false,fal", (java.lang.CharSequence) "97United States1United States10United States10United States35United States-1United States35United States");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\u30a2\u30e1#", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30a2\u30e1#" + "'", str2, "\u30a2\u30e1#");
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) (short) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) '#', 10);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray8, 2);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) 87, 221, (double) 221);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setRegion("en");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clear();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.setExtension('#', "      []");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) '4');
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) (byte) 1);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) 250);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.subarray(longArray9, 2, 87);
        java.lang.Long[] longArray13 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray13);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray13, (long) 3);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.add(longArray18, (long) 0);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.clone(longArray20);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray12, longArray20);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray12);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[0]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\u5fb7\u56fd", "....0#1.0#100...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) (-1));
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, (float) 10L);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Ko-KR", "51103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ko-KR" + "'", str2, "Ko-KR");
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("97United States1United States10United States10United States35United States-1United States35United States-1", "10 32 10 5 1                                                                                                                                                                                                                                                                                                                                                                               ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                true{false,f");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("{true,false,false,false,false,true,true,false}", 116);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{true,false,false,false,false,true,true,false}" + "'", str2, "{true,false,false,false,false,true,true,false}");
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("{0,35,-1}", "DEUuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Italy", "COREANO", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, (long) (byte) -1);
        long[] longArray13 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray13, 0L);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray15, (long) (byte) 0);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray15);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray15);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.clone(longArray15);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray20);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray20, (long) 51);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)_CORE                             slafurturt", "\u7f8e\u570b");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "7");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7" + "'", str1, "7");
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        java.lang.Integer[] intArray9 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        java.lang.Integer[] intArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray9);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9, 87);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9, 0);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray14, (int) 'a', 15);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        int[] intArray0 = null;
        int[] intArray6 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, (int) (short) 100);
        int[] intArray17 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray17, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray17);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray17, (int) (short) 100);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray17);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray23);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.addAll(intArray6, intArray23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray23);
        java.lang.Integer[] intArray27 = org.apache.commons.lang3.ArrayUtils.toObject(intArray23);
        int[] intArray31 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray31);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.add(intArray31, 0, 4);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray31);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray36);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.addAll(intArray23, intArray36);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray0, intArray23);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.clone(intArray23);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.add(intArray23, 250);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray44 = org.apache.commons.lang3.ArrayUtils.remove(intArray42, 107);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 107, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 32, 10, 5, 1, 10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[0, 35, -1]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10, 32, 10, 5, 1, 0, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[10, 32, 10, 5, 1, 250]");
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("USA", (int) (byte) 100, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)", 250);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (e" + "'", str2, "anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (etats-unis)anglais (e");
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        boolean[] booleanArray4 = new boolean[] { false, true, true, true };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray4);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray4, true);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, false, (int) (byte) 100);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, true, true]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)italiano (Italia)", "true{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,f");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray1);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        java.lang.Double[] doubleArray14 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray14, (double) (short) 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray14, (java.lang.Object) "TRUETRUEFALSE");
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) shortArray6, (java.lang.Object[]) doubleArray14);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray2);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        java.lang.Long[] longArray5 = org.apache.commons.lang3.ArrayUtils.toObject(longArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray4);
        long[] longArray8 = new long[] { 'a' };
        long[] longArray15 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.addAll(longArray8, longArray15);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.add(longArray16, (int) (short) 1, (long) (byte) 1);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.subarray(longArray19, (-1), (-1));
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.subarray(longArray22, (int) (byte) 100, 0);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.addAll(longArray4, longArray22);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[97]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, 2, 43);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray9);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        java.lang.String str10 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray5);
        java.lang.Boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{false,false,false,false,true}" + "'", str10, "{false,false,false,false,true}");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true}" + "'", str1, "true}");
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#fals                               ", "zh_TWzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNz");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("korn-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   ", 320);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "korn-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   " + "'", str2, "korn-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   n-US   ");
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        java.lang.Integer[] intArray0 = null;
        java.lang.Integer[] intArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 37);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNull(intArray3);
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("   ETATS-UNIS    ", 42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        java.lang.Character[] charArray1 = new java.lang.Character[] { 'a' };
        java.lang.Character[] charArray3 = new java.lang.Character[] { 'a' };
        java.lang.Character[][] charArray4 = new java.lang.Character[][] { charArray1, charArray3 };
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a' };
        java.lang.Character[] charArray8 = new java.lang.Character[] { 'a' };
        java.lang.Character[][] charArray9 = new java.lang.Character[][] { charArray6, charArray8 };
        java.lang.Character[][][] charArray10 = new java.lang.Character[][][] { charArray4, charArray9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character[][][] charArray12 = org.apache.commons.lang3.ArrayUtils.remove(charArray10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray0, 117);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 117, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "[ , hi!, en-US,  ]   JPNPfPfPfPf{        []");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 2, 0, (double) 100);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray5, (double) (byte) 1);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray5, 0, 221);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        org.apache.commons.lang3.StringUtils[][] stringUtilsArray0 = new org.apache.commons.lang3.StringUtils[][] {};
        org.apache.commons.lang3.StringUtils[][] stringUtilsArray1 = new org.apache.commons.lang3.StringUtils[][] {};
        org.apache.commons.lang3.StringUtils[][] stringUtilsArray2 = new org.apache.commons.lang3.StringUtils[][] {};
        org.apache.commons.lang3.StringUtils[][] stringUtilsArray3 = new org.apache.commons.lang3.StringUtils[][] {};
        org.apache.commons.lang3.StringUtils[][][] stringUtilsArray4 = new org.apache.commons.lang3.StringUtils[][][] { stringUtilsArray0, stringUtilsArray1, stringUtilsArray2, stringUtilsArray3 };
        org.apache.commons.lang3.StringUtils[][][][] stringUtilsArray5 = new org.apache.commons.lang3.StringUtils[][][][] { stringUtilsArray4 };
        org.apache.commons.lang3.StringUtils[][][][] stringUtilsArray6 = org.apache.commons.lang3.ArrayUtils.clone(stringUtilsArray5);
        org.apache.commons.lang3.StringUtils[][][][] stringUtilsArray7 = org.apache.commons.lang3.ArrayUtils.clone(stringUtilsArray5);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray8, (int) (byte) -1);
        java.lang.Integer[] intArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray8);
        java.lang.Integer[] intArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray11);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray11);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray11, 3);
        java.lang.Integer[] intArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray11);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) stringUtilsArray5, (java.lang.Object) intArray11);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) intArray11);
        org.junit.Assert.assertNotNull(stringUtilsArray0);
        org.junit.Assert.assertNotNull(stringUtilsArray1);
        org.junit.Assert.assertNotNull(stringUtilsArray2);
        org.junit.Assert.assertNotNull(stringUtilsArray3);
        org.junit.Assert.assertNotNull(stringUtilsArray4);
        org.junit.Assert.assertNotNull(stringUtilsArray5);
        org.junit.Assert.assertNotNull(stringUtilsArray6);
        org.junit.Assert.assertNotNull(stringUtilsArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", "Japanese");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("44444444444444444444444444FRANCE                ", "                                                                                     TW                                                                                     TW                                                                                     TW                                                                                     TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444FRANCE                " + "'", str2, "44444444444444444444444444FRANCE                ");
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "france-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "France-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1" + "'", str1, "France-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1");
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
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
        int[] intArray76 = new int[] { (short) 10 };
        int[] intArray78 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray76, (int) 'a');
        int[] intArray80 = org.apache.commons.lang3.ArrayUtils.add(intArray78, 13);
        boolean boolean81 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray38, intArray78);
        int[] intArray82 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray38);
        int int84 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray82, (int) ' ');
        java.lang.Class<?> wildcardClass85 = intArray82.getClass();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
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
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category45 + "' != '" + java.util.Locale.Category.FORMAT + "'", category45.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category46 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category46.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category47 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category47.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale48);
// flaky:         org.junit.Assert.assertEquals(locale48.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category49 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category49.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category51 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category51.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "de_DE");
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
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[10]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[10]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[10, 13]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[10]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\u82f1\u8a9e\u30a2EN_US             ", "truefalsetruefalsefalse");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (byte) -1);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, 3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, 32);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray8);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray11, 28);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        java.util.Locale locale3 = new java.util.Locale("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", "coreano", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for ?? (???????)");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)_COREANO");
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                  ", "u uu", "\u610f\u5927\u5229aaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0" + "'", str2, "100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Giappone               ", "ngla");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Giappone               " + "'", str2, "Giappone               ");
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.lang.String str3 = locale0.getScript();
        java.lang.String str4 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        char[] charArray0 = null;
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        char[] charArray2 = null;
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray2);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444444444444444444444444fRANCE", "tRUETRUEFALSE", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 3, (int) '#');
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 0L);
        long[] longArray16 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray16, 0L);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray18);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray6, longArray18);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.subarray(longArray18, 100, (-1));
        long[] longArray25 = new long[] { 'a' };
        long[] longArray32 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray32);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray18, longArray33);
        java.lang.Long[] longArray35 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray35);
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray36);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray36, (long) 2);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.add(longArray39, 0L);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.add(longArray39, (long) (-1));
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray18, longArray43);
        long[] longArray46 = new long[] { 'a' };
        long[] longArray53 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray54 = org.apache.commons.lang3.ArrayUtils.addAll(longArray46, longArray53);
        int int57 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray53, (long) 5, (int) ' ');
        long[] longArray62 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray62, 0L);
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray64, (long) 3, (int) '#');
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray53, longArray64);
        long[] longArray70 = org.apache.commons.lang3.ArrayUtils.add(longArray53, (long) (byte) 10);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray43, longArray53);
        boolean boolean72 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray43);
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
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[0]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray70), "[10, 10, 35, -1, 35, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("falsefalsefalsefalsefalsefaaaaaDEaaaaaa", "444444444444444444444444444444444444{fPfPfPfPNPJ", "\u4e2d\u6587\u53f0\u7063)it_it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "falsefalsefalsefalsefalsefaaaaaDEaaaaaa" + "'", str3, "falsefalsefalsefalsefalsefaaaaaDEaaaaaa");
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        java.util.Locale locale1 = new java.util.Locale("\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[] shortArray13 = new java.lang.Short[] { (short) 1, (short) 1 };
        java.lang.Short[][] shortArray14 = new java.lang.Short[][] { shortArray4, shortArray7, shortArray10, shortArray13 };
        java.lang.Short[][][] shortArray15 = new java.lang.Short[][][] { shortArray14 };
        int[] intArray16 = new int[] {};
        int[] intArray20 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray20);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.add(intArray20, 0, 4);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.addAll(intArray16, intArray20);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.add(intArray16, 0);
        java.lang.Integer[] intArray29 = new java.lang.Integer[] { 10 };
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray16, intArray30);
        java.lang.Short[][][] shortArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray15, (java.lang.Object) intArray16);
        java.util.Locale locale33 = java.util.Locale.US;
        java.lang.String str34 = locale33.toLanguageTag();
        java.util.Locale locale35 = java.util.Locale.US;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        java.lang.String str38 = locale33.getDisplayCountry(locale36);
        java.util.Locale locale39 = java.util.Locale.FRANCE;
        java.util.Locale locale40 = java.util.Locale.US;
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale41.getLanguage();
        java.lang.String str43 = locale39.getDisplayScript(locale41);
        java.lang.String str44 = locale33.getDisplayName(locale39);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) shortArray15, (java.lang.Object) locale39);
        java.lang.String str47 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) locale39, "ko_KR");
        java.lang.String str48 = locale1.getDisplayCountry(locale39);
        java.util.Locale locale49 = java.util.Locale.TAIWAN;
        java.util.Locale locale50 = locale49.stripExtensions();
        java.util.Locale locale52 = new java.util.Locale("Italian");
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str54 = locale52.getDisplayName(locale53);
        java.lang.String str55 = locale49.getDisplayLanguage(locale53);
        java.util.Locale locale56 = java.util.Locale.PRC;
        java.lang.String str57 = locale53.getDisplayLanguage(locale56);
        java.lang.String str58 = locale1.getDisplayName(locale53);
        java.lang.String str60 = locale53.getExtension('a');
        org.junit.Assert.assertEquals(locale1.toString(), "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en-US" + "'", str34, "en-US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "United States" + "'", str38, "United States");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "en" + "'", str42, "en");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "anglais (Etats-Unis)" + "'", str44, "anglais (Etats-Unis)");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "fr_FR" + "'", str47, "fr_FR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale52.toString(), "italian");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "italian" + "'", str54, "italian");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\u4e2d\u6587" + "'", str55, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\u4e2d\u6587" + "'", str57, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd" + "'", str58, "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(strArray0);
        java.util.Map<java.lang.Object, java.lang.Object> objMap2 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "0");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("{false,false,false,false,true", strArray7);
        java.util.Map<java.lang.Object, java.lang.Object> objMap10 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray7);
        int[] intArray11 = new int[] {};
        int[] intArray15 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray15);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.add(intArray15, 0, 4);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.addAll(intArray11, intArray15);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.clone(intArray15);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.add(intArray21, 48);
        java.util.Locale locale24 = java.util.Locale.US;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.util.Locale locale27 = java.util.Locale.US;
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Locale locale29 = java.util.Locale.US;
        java.util.Locale locale30 = locale29.stripExtensions();
        java.util.Set<java.lang.Character> charSet31 = locale30.getExtensionKeys();
        java.lang.String str32 = locale27.getDisplayCountry(locale30);
        java.lang.String str33 = locale25.getDisplayScript(locale27);
        java.util.Locale locale34 = java.util.Locale.US;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.util.Set<java.lang.Character> charSet36 = locale35.getExtensionKeys();
        java.util.Locale locale37 = java.util.Locale.US;
        java.lang.String str38 = locale37.toLanguageTag();
        java.util.Locale locale39 = java.util.Locale.US;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.lang.String str42 = locale37.getDisplayCountry(locale40);
        java.lang.String str43 = locale35.getDisplayScript(locale37);
        java.util.Locale locale44 = locale37.stripExtensions();
        java.lang.String str45 = locale37.getScript();
        java.lang.String str46 = locale25.getDisplayName(locale37);
        java.lang.Object obj47 = objMap10.getOrDefault((java.lang.Object) intArray21, (java.lang.Object) locale37);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.upperCase("\u7f8e\u56fd", locale37);
        java.lang.String[] strArray52 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "0");
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray52);
        boolean boolean54 = org.apache.commons.lang3.StringUtils.endsWithAny("{false,false,false,false,true", strArray52);
        java.util.Map<java.lang.Object, java.lang.Object> objMap55 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray52);
        int[] intArray56 = new int[] {};
        int[] intArray60 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray60);
        int[] intArray64 = org.apache.commons.lang3.ArrayUtils.add(intArray60, 0, 4);
        int[] intArray65 = org.apache.commons.lang3.ArrayUtils.addAll(intArray56, intArray60);
        int[] intArray66 = org.apache.commons.lang3.ArrayUtils.clone(intArray60);
        int[] intArray68 = org.apache.commons.lang3.ArrayUtils.add(intArray66, 48);
        java.util.Locale locale69 = java.util.Locale.US;
        java.util.Locale locale70 = locale69.stripExtensions();
        java.util.Set<java.lang.Character> charSet71 = locale70.getExtensionKeys();
        java.util.Locale locale72 = java.util.Locale.US;
        java.lang.String str73 = locale72.toLanguageTag();
        java.util.Locale locale74 = java.util.Locale.US;
        java.util.Locale locale75 = locale74.stripExtensions();
        java.util.Set<java.lang.Character> charSet76 = locale75.getExtensionKeys();
        java.lang.String str77 = locale72.getDisplayCountry(locale75);
        java.lang.String str78 = locale70.getDisplayScript(locale72);
        java.util.Locale locale79 = java.util.Locale.US;
        java.util.Locale locale80 = locale79.stripExtensions();
        java.util.Set<java.lang.Character> charSet81 = locale80.getExtensionKeys();
        java.util.Locale locale82 = java.util.Locale.US;
        java.lang.String str83 = locale82.toLanguageTag();
        java.util.Locale locale84 = java.util.Locale.US;
        java.util.Locale locale85 = locale84.stripExtensions();
        java.util.Set<java.lang.Character> charSet86 = locale85.getExtensionKeys();
        java.lang.String str87 = locale82.getDisplayCountry(locale85);
        java.lang.String str88 = locale80.getDisplayScript(locale82);
        java.util.Locale locale89 = locale82.stripExtensions();
        java.lang.String str90 = locale82.getScript();
        java.lang.String str91 = locale70.getDisplayName(locale82);
        java.lang.Object obj92 = objMap55.getOrDefault((java.lang.Object) intArray66, (java.lang.Object) locale82);
        java.util.Locale locale93 = java.util.Locale.US;
        java.lang.String str94 = locale93.toLanguageTag();
        java.util.Locale locale95 = java.util.Locale.CHINA;
        java.lang.String str96 = locale93.getDisplayCountry(locale95);
        java.lang.String str97 = locale82.getDisplayVariant(locale93);
        java.lang.Object obj98 = objMap2.putIfAbsent((java.lang.Object) "\u7f8e\u56fd", (java.lang.Object) str97);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objMap2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objMap10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 35, 0, 48]");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en-US" + "'", str28, "en-US");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "United States" + "'", str32, "United States");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en-US" + "'", str38, "en-US");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "United States" + "'", str42, "United States");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "English (United States)" + "'", str46, "English (United States)");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "en_US");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\u7f8e\u56fd" + "'", str48, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objMap55);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 35, 0, 48]");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "en-US" + "'", str73, "en-US");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "United States" + "'", str77, "United States");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "en-US" + "'", str83, "en-US");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "United States" + "'", str87, "United States");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "English (United States)" + "'", str91, "English (United States)");
        org.junit.Assert.assertNotNull(obj92);
        org.junit.Assert.assertEquals(obj92.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj92), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj92), "en_US");
        org.junit.Assert.assertNotNull(locale93);
        org.junit.Assert.assertEquals(locale93.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "en-US" + "'", str94, "en-US");
        org.junit.Assert.assertNotNull(locale95);
        org.junit.Assert.assertEquals(locale95.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "\u7f8e\u56fd" + "'", str96, "\u7f8e\u56fd");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertNull(obj98);
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "{nglais (Etats-Unis)}{nglais (Etats-Unis)}{zh_CN", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'u');
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12);
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray12);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12, '#');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, '4');
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray18, 'a', 756);
        java.lang.String str23 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) 756, "english");
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "   a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "   a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ ,  ,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "756" + "'", str23, "756");
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("COREANO", "de_D");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: COREANO [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u4e2d\u56fd\u8a9e", 766, ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd\u8a9e                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str3, "\u4e2d\u56fd\u8a9e                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u82f1\u6587\u7f8e\u570b)", (int) (byte) 100, "\u30a2");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u30a2\u82f1\u6587\u7f8e\u570b\u30a2German (Germa" + "'", str3, "\u30a2\u82f1\u6587\u7f8e\u570b\u30a2German (Germa");
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray2);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 0, 37);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("eng");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale8 = new java.util.Locale("{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}");
        java.lang.String str9 = locale8.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: {97,1,10,10,35,-1,35,-1}lse,false,false,false,true} [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale8.toString(), "{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{false,false,false,false,true}", '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en-US", "{false,false,false,false,true}", 100);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("Italian (Italy)", strArray4, strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("{false,false,false,false,true}", "italian");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("\u82f1\u6587{FPFPFPFPNPJ{FPFPFPFP", strArray4, strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{false,false,false,false,true}" + "'", str5, "{false,false,false,false,true}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italian (Italy)" + "'", str11, "Italian (Italy)");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u82f1\u6587{FPFPFPFPNPJ{FPFPFPFP" + "'", str15, "\u82f1\u6587{FPFPFPFPNPJ{FPFPFPFP");
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
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
        java.lang.String str19 = locale9.toLanguageTag();
        java.lang.Short[] shortArray21 = new java.lang.Short[] { (short) 0 };
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray21, (short) (byte) 1);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(shortArray23, (short) (byte) 100);
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.add(shortArray23, (int) (short) 0, (short) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray23);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray23);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray23);
        boolean boolean32 = locale9.equals((java.lang.Object) shortArray23);
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
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italienisch" + "'", str14, "Italienisch");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italienisch" + "'", str16, "Italienisch");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JPN" + "'", str18, "JPN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "it-IT" + "'", str19, "it-IT");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("         USA         ", "\u56fd\u8846\u5408\u30ab\u30ea\u30e1\u30a2\u8a9e\u82f1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
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
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet49 = objMap15.entrySet();
        int int50 = objMap15.size();
        java.util.Collection<java.lang.Object> objCollection51 = objMap15.values();
        java.lang.Object obj52 = null;
        boolean boolean53 = objMap15.equals(obj52);
        int int54 = objMap15.size();
        objMap15.clear();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
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
        org.junit.Assert.assertNotNull(objEntrySet49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objCollection51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray0, "\u65e5\u65870}1.0{0}100.0{0}1.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.reflect.AnnotatedElement[]) wildcardClassArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("zh-TW  ", (int) (byte) -1, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
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
        char[] charArray75 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray74);
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
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("j", "                                                hi!                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        java.lang.Character[] charArray3 = new java.lang.Character[] { ' ', ' ', 'a' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, '#');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray6, (int) (short) 1, 'u');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray9, 'u');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , a]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " u a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " u a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , u,  , a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , a]");
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "-1.01.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        java.lang.Double[] doubleArray8 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray8, (double) (short) 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) 37, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, 31, (double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 31, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        java.lang.Long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toObject(longArray12);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray16);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray16);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.remove(longArray18, 4);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray23 = org.apache.commons.lang3.ArrayUtils.add(longArray20, 37, (long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 37, Length: 7");
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
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 1, 10, 10, -1, 35, -1]");
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "Deutsch (Deutschland)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Germany", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germany                  " + "'", str2, "Germany                  ");
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("France-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "France-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1" + "'", str1, "France-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1");
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray16, (java.lang.Object) 4, 4);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 0);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray22);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (int) (byte) 1, (byte) 0);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray26, (byte) 0);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray26);
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("}eurt,eslaf,eslaf,eslaf,eslaf{", "US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}eurt,eslaf,eslaf,eslaf,eslaf{" + "'", str2, "}eurt,eslaf,eslaf,eslaf,eslaf{");
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("rt,esluf,esluf,esluf,esluf{                                                                         ", "         {FALSE,...         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray7);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray7, false);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray7, true, (int) (byte) 1);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [[ , hi!, en-us,  ]   jpnpfpfpfpf{        [");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [" + "'", str1, "[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [[ , HI!, EN-US,  ]   JPNPFPFPFPF{        [");
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, 10.0d);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 98, (double) 221);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        char[] charArray22 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray22, 'a', (int) (short) 10);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray22, ' ');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray14, charArray22);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...e)4444444444444444444444444444444444...", charArray22);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.add(charArray22, (int) (short) 0, 'x');
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "x  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "x  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[x,  ,  , 4,  , a, 4]");
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
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
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray28);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray29, (double) 107, (double) 'x');
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
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("RF_RF", "\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RF_RF" + "'", str2, "RF_RF");
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (byte) 10);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        char[] charArray16 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray16, 'a', (int) (short) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray16, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray23);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(charArray6, '4');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        char[] charArray35 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray35, 'a', (int) (short) 10);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray35, ' ');
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray35, ' ');
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray42);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray42);
        char[] charArray51 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int54 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray51, 'a', (int) (short) 10);
        char[] charArray61 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int64 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray61, 'a', (int) (short) 10);
        int int66 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray61, ' ');
        char[] charArray68 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray61, ' ');
        char[] charArray69 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray68);
        char[] charArray70 = org.apache.commons.lang3.ArrayUtils.addAll(charArray51, charArray68);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray42, (java.lang.Object) charArray70);
        int int74 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray70, 'a', (int) 'a');
        boolean boolean76 = org.apache.commons.lang3.ArrayUtils.contains(charArray70, ' ');
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray70);
        char[] charArray80 = org.apache.commons.lang3.ArrayUtils.subarray(charArray70, (int) '#', (int) 'a');
        int int83 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray70, 'a', 21);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a 4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a 4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , 4,  ,  ]");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 4 + "'", int64 == 4);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 9 + "'", int74 == 9);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray80), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray80), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray80), "[]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1-setatS detinU0setatS detinU1", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Ko-KR", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ko-KR" + "'", str2, "Ko-KR");
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
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
        java.util.Locale.Category category33 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category33, locale34);
        java.util.Locale locale36 = java.util.Locale.getDefault(category33);
        java.util.Locale locale37 = java.util.Locale.US;
        java.lang.String str38 = locale37.toLanguageTag();
        java.lang.String str39 = locale37.getScript();
        java.util.Locale.setDefault(category33, locale37);
        java.lang.String str41 = locale37.getCountry();
        java.lang.String str42 = locale37.getDisplayName();
        java.util.Set<java.lang.String> strSet43 = locale37.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder44 = builder5.setLocale(locale37);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder47 = builder5.setExtension('x', "tRUETRUEFALSE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: tRUETRUEFALSE [at index 0]");
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
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.FORMAT + "'", category33.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en-US" + "'", str38, "en-US");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "US" + "'", str41, "US");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str42, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale1.getDisplayCountry(locale3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("en-US", locale3);
        java.lang.String str6 = locale3.getDisplayCountry();
        java.lang.String str7 = locale3.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-US" + "'", str2, "en-US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u7f8e\u56fd" + "'", str4, "\u7f8e\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EN-US" + "'", str5, "EN-US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("TR#TR#FALS                                    ", "SE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uc911\uad6d" + "'", str1, "\uc911\uad6d");
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 31, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("tedesco (Germania", "444444444444444444444italien (talie...aaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tedesco (Germania" + "'", str2, "tedesco (Germania");
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 0, false);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.add(booleanArray11, true);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray11);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, false, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "{FALSE,FALSE,FALSE,FALSE,TRU", (java.lang.CharSequence) "united# #states                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ",false,false,tru{fal" + "'", str2, ",false,false,tru{fal");
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene", "chinois", 69);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{97,1,10,10,35,-1,35,-1}nenenenchinoisenenenenenenenenenenenenenenene" + "'", str3, "{97,1,10,10,35,-1,35,-1}nenenenchinoisenenenenenenenenenenenenenenene");
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, ' ');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(charArray16, 'a');
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.subarray(charArray16, 100, 7);
        char[] charArray28 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray28, 'a', (int) (short) 10);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray28, ' ');
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray28, ' ');
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray35);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray35);
        char[] charArray45 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray45, 'a', (int) (short) 10);
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray45, ' ');
        char[] charArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray45, ' ');
        char[] charArray59 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int62 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray59, 'a', (int) (short) 10);
        char[] charArray69 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int72 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray69, 'a', (int) (short) 10);
        int int74 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray69, ' ');
        char[] charArray76 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray69, ' ');
        char[] charArray77 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray76);
        char[] charArray78 = org.apache.commons.lang3.ArrayUtils.addAll(charArray59, charArray76);
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray45, charArray59);
        boolean boolean80 = org.apache.commons.lang3.StringUtils.containsAny("{false,false,false,false,true", charArray59);
        boolean boolean81 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray35, charArray59);
        char[] charArray82 = org.apache.commons.lang3.ArrayUtils.addAll(charArray16, charArray35);
        char[] charArray83 = org.apache.commons.lang3.ArrayUtils.clone(charArray35);
        char[] charArray86 = org.apache.commons.lang3.ArrayUtils.subarray(charArray35, (int) '4', 87);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4 + "'", int62 == 4);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 4 + "'", int72 == 4);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray76), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray76), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray76), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray83), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray83), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray83), "[4, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[]");
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("de_D", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de_D" + "'", str2, "de_D");
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
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
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList27);
        java.util.Locale.FilteringMode filteringMode30 = null;
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList27, filteringMode30);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList27);
        java.util.Locale locale33 = java.util.Locale.ITALY;
        java.util.Locale locale34 = java.util.Locale.US;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale35.toLanguageTag();
        java.lang.String str37 = locale33.getDisplayScript(locale35);
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        java.lang.String str40 = locale35.getDisplayCountry(locale39);
        java.util.Locale.setDefault(locale35);
        java.util.Set<java.lang.String> strSet42 = locale35.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet42);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet42, '#');
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "en-US" + "'", str36, "en-US");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "United States" + "'", str40, "United States");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("it_it", "                {}                 ", 250);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("zh-cn", 19, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-cnaaaaaaaaaaaaaa" + "'", str3, "zh-cnaaaaaaaaaaaaaa");
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                     ng", "aaaaaaEDaaaaa", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "ANGLAIS (eTATS-uN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 1.0f, 10.0f, 100.0f, 1.0f, 100.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray5, (float) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray9, (float) 34);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray9, (float) 213, (int) '4');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, (int) '#');
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray9, true);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.add(booleanArray11, true);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray11, 2);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray15);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray16, (int) 'u', (int) (short) 10);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray16, true, 131);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
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
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray15, (short) (byte) 0);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.add(shortArray15, (int) (byte) 0, (short) 100);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.clone(shortArray20);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray21, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.add(shortArray21, 16, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 16, Length: 3");
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
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[100, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[100, 0, -1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2e_", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("de-DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ED-ed" + "'", str1, "ED-ed");
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true, false };
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        java.lang.Double[] doubleArray11 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray11, (double) (short) 0);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray3, (java.lang.Object) doubleArray13, 4);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray3, false);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray18, true, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray4 = null;
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray4);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) 4, (double) (byte) 10);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray0);
        double[] doubleArray13 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray13, (double) (short) -1);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, (double) 5);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray17, 0.0d, (int) (byte) 100);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray17, 1.0d);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray22);
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.add(doubleArray22, 0, (double) (short) -1);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray22, (-1.0d), 743, (double) 19);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, 0.0, 5.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 0.0, 5.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 0.0, 5.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaEDaaaaa", "true{false,f");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                   UNITED STATES", "{nglais (Etats-Unis)}{nglais (Etats-Unis)}{zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   UNITED STATES" + "'", str2, "                   UNITED STATES");
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("1.0-1.00.00.0", 333);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0-1.00.00.0                                                                                                                                                                                                                                                                                                                                " + "'", str2, "1.0-1.00.00.0                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("English (United Kingdom)", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (Unit..." + "'", str2, "English (Unit...");
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
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
        java.lang.String str27 = locale22.getDisplayCountry();
        java.lang.Short[] shortArray28 = new java.lang.Short[] {};
        java.lang.Short[] shortArray29 = new java.lang.Short[] {};
        java.lang.Short[] shortArray30 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray31 = new java.lang.Short[][] { shortArray28, shortArray29, shortArray30 };
        java.lang.Short[][] shortArray32 = org.apache.commons.lang3.ArrayUtils.clone(shortArray31);
        java.lang.Short[] shortArray34 = new java.lang.Short[] { (short) 0 };
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray34, (short) (byte) 1);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray34, (java.lang.Object) (byte) 10);
        java.lang.Short[][] shortArray39 = org.apache.commons.lang3.ArrayUtils.add(shortArray31, shortArray34);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray34);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray34, (short) 1);
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray42, (short) 10);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray44);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray44);
        boolean boolean47 = locale22.equals((java.lang.Object) shortArray44);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "China" + "'", str27, "China");
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[0]");
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "############################0A-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
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
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet56, "0-1");
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
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("English", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("zh-TW  ", "se,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal", "true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-TW  " + "'", str3, "zh-TW  ");
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d\uc911\uad6d", "                                                                               cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("coreano", "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2EU_us");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "coreano" + "'", str2, "coreano");
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("h", "NG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-" + "'", str1, "-");
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\u82f1\u8a9e\u30a2EN_US             ", "          ENG", "100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a2EN_US             " + "'", str3, "\u82f1\u8a9e\u30a2EN_US             ");
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA", (java.lang.CharSequence) "Giappone");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
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
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray30, (long) 98);
        java.lang.Long[] longArray34 = org.apache.commons.lang3.ArrayUtils.toObject(longArray33);
        java.lang.Long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toObject(longArray33);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray33, (long) 9, 16);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray33, (long) 743);
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
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        char[] charArray8 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray8, 'a', (int) (short) 10);
        char[] charArray18 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray18, 'a', (int) (short) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, ' ');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray18, ' ');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray25);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.addAll(charArray8, charArray25);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(charArray8, '4');
        boolean boolean30 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "{false,..", charArray8);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "{fulse,fulse,fulse,fulse,tru", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
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
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
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
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.add(byteArray21, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.remove(byteArray21, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42, Length: 3");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, -1, 100]");
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, 2, 43);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = org.apache.commons.lang3.ArrayUtils.add(intArray9, 19, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 19, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "     zH_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("CHINA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHINA" + "'", str1, "CHINA");
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setScript("10 32 10 5 1");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 10 32 10 5 1 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray3);
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) 0 };
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) (byte) 1);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray9);
        java.lang.Short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray10);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray10, (short) (byte) 0);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.add(shortArray10, (short) 10);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray10, (short) (byte) 100);
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
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, 0, 100]");
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
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
        java.lang.Short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray34);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray38, (short) -1);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.contains(shortArray40, (short) (byte) 0);
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray40, 12, 47);
        boolean boolean46 = objMap15.containsKey((java.lang.Object) shortArray40);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray40);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
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
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[0, -1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     " + "'", str1, "     ");
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder39 = builder34.removeUnicodeLocaleAttribute("######{false,false,false,false,true");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ######{false,false,false,false,true [at index 0]");
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
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ED", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ED" + "'", str2, "ED");
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) (byte) 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray3);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray7, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, 250, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 250, Length: 1");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "                                                eng                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("        {fP{-1,35,0}        {fPf", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        {fP{-1,35,0}        {fPf" + "'", str2, "        {fP{-1,35,0}        {fPf");
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category2, locale3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category2);
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale locale9 = builder1.build();
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Locale locale13 = new java.util.Locale("Italian");
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.lang.String str16 = locale10.getDisplayLanguage(locale14);
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.lang.String str18 = locale14.getDisplayLanguage(locale17);
        java.lang.String str19 = locale9.getDisplayVariant(locale14);
        java.util.Set<java.lang.String> strSet20 = locale14.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale13.toString(), "italian");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italian" + "'", str15, "italian");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
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
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (short) (byte) 1);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray24, (short) (byte) 10);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray26);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 1]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, 1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 1]");
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("{1,0,-1}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}1-,0,1{" + "'", str1, "}1-,0,1{");
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setLanguage("falsefalsefalsefalsefalsefaaaaaDEaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: falsefalsefalsefalsefalsefaaaaaDEaaaaaa [at index 0]");
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
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", "444444444444444444444italien (Italie...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str2, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        java.lang.Long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toObject(longArray12);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray16, (long) 213);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray18, (long) (byte) -1);
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
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder11.clearExtensions();
        java.util.Locale.Builder builder14 = builder11.clear();
        java.util.Locale.Builder builder15 = builder11.clear();
        java.util.Locale.Builder builder16 = builder11.clear();
        java.util.Locale locale17 = builder11.build();
        java.lang.String str18 = locale17.getDisplayName();
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category19, locale20);
        java.util.Locale locale22 = java.util.Locale.getDefault(category19);
        java.util.Locale locale23 = java.util.Locale.US;
        java.lang.String str24 = locale23.toLanguageTag();
        java.lang.String str25 = locale23.getScript();
        java.util.Locale.setDefault(category19, locale23);
        java.util.Locale locale27 = java.util.Locale.US;
        java.util.Locale locale28 = locale27.stripExtensions();
        java.lang.String str29 = locale28.toLanguageTag();
        java.util.Locale.setDefault(category19, locale28);
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder32 = builder31.clear();
        java.util.Locale locale33 = builder31.build();
        java.util.Locale.setDefault(category19, locale33);
        java.util.Locale locale35 = locale33.stripExtensions();
        java.lang.String str36 = locale17.getDisplayName(locale33);
        java.lang.String str37 = locale10.getDisplayName(locale17);
        java.lang.String str38 = locale5.getDisplayVariant(locale17);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en-US" + "'", str24, "en-US");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en-US" + "'", str29, "en-US");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray16, (java.lang.Object) 4, 4);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 0);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray22, (int) (byte) -1, 2);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(byteArray25, (byte) 100);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.add(byteArray25, (byte) 1);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray25, (byte) 10);
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 0, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "{97,1,10,10,35,-1,35,-1}", "xzh-TW  xx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        java.util.Locale locale1 = new java.util.Locale("Italian");
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.US;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.toLanguageTag();
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale5.getDisplayName(locale7);
        java.lang.String str9 = locale1.getDisplayVariant(locale5);
        boolean boolean10 = locale5.hasExtensions();
        java.lang.String str11 = locale5.getDisplayVariant();
        java.lang.Object obj12 = null;
        boolean boolean13 = locale5.equals(obj12);
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian" + "'", str3, "italian");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-US" + "'", str6, "en-US");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str8, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) 1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.remove(floatArray2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
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
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        char[] charArray16 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray16, 'a', (int) (short) 10);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray16, ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray16, ' ');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray23);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a 4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a 4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , 4,  ,  ]");
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
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4a 4  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4a 4  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4, a,  , 4,  ,  , a]");
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "fran\347ais");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("{97,1,10,10,35,-1,35,-1}nenenene", "0 ({false,false,false,false,tru,truetruefalse)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
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
            java.util.Locale.Builder builder42 = builder4.addUnicodeLocaleAttribute(" FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR [at index 0]");
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
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229\u610f\u5927\u5229\u6587\u610f\u5927\u5229) ", "cor\351en (Cor\351e du Sud)", "true{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,fchinois (Chinetrue{false,f");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510", "                                                hi!                                                 ", (int) (byte) -1, 250);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                hi!                                                 " + "'", str4, "                                                hi!                                                 ");
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ne");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("US");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "  {FPFPFPFPNPJ   ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("n", strArray3, strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "-1.0");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("  {false,false,false,false,true}  ", "{97,1,10,10,35,-1,35,-1}");
        java.lang.String[] strArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray15);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray16, "anglais(Etats-Unis)");
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", strArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\u56fd\u5fb7\u6587\u5fb7", strArray3, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "n" + "'", str9, "n");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "coreano", "false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE", "Italy");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE" + "'", str2, "{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE");
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\u7f8e\u56fd", "ETRUEFALSE                                          rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,esluf,esluf,esluf,esluf{                                                                         rt,e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u7f8e\u56fd" + "'", str2, "\u7f8e\u56fd");
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("uNITED sTATES", 6, (int) 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " sTATES" + "'", str3, " sTATES");
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        char[] charArray9 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, 'a', (int) (short) 10);
        char[] charArray19 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray19, 'a', (int) (short) 10);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray19, ' ');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray19, ' ');
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray26);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.addAll(charArray9, charArray26);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.subarray(charArray29, 10, (int) (short) 100);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "US", charArray32);
        boolean boolean34 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "{false,false,false,false,true", charArray32);
        int int35 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u4e2d\u6587\u53f0\u7063)it_it", charArray32);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray32);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray32);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray39 = org.apache.commons.lang3.ArrayUtils.remove(charArray32, 756);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 756, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Englisch");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "englisch");
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510", "France-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1", "{fulse,fulse,fulse,fulse,true");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510" + "'", str3, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510");
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
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
        boolean[] booleanArray56 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray55);
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray56, false);
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
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, 1.0d);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 10.0d);
        double[] doubleArray12 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray12, (double) (short) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray12);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray12, (double) 0);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray12);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray12);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) 22, (int) ' ', 0.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        java.util.Locale locale2 = new java.util.Locale("true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse", "Englisch");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("n-US   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: n-US   ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "true{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse_ENGLISCH");
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("gn", "\u65e5\u6587\u65e5\u5927\u5229\u6587", "France-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1.0-1.0{0}10.0{0}1.0{0}100.0{0}1", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gn" + "'", str4, "gn");
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" 4hi!4en-us4 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4hi!4en-us4" + "'", str1, "4hi!4en-us4");
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        java.util.Locale locale2 = java.util.Locale.US;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("", locale2);
        java.lang.String str5 = locale2.getCountry();
        java.lang.String str6 = locale2.getDisplayScript();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("United St", locale2);
        java.lang.String str8 = locale2.getCountry();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "US" + "'", str5, "US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UNITED ST" + "'", str7, "UNITED ST");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "US" + "'", str8, "US");
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("deu", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u" + "'", str2, "u");
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, (int) (short) 1);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, (-1), 0);
        double[] doubleArray14 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray14, (double) (short) -1);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray14);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray17, (double) (byte) 100, (double) (-1.0f));
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray10, doubleArray17);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray10);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) 5, (double) 1L);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, 0.0d, (int) '4');
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray10, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 31, Length: 0");
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
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("     t      ", "        ja_jp");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.add(byteArray3, (byte) -1);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray5, (byte) 100, (-1));
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray5, (byte) 1);
        java.lang.Byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concatWith("United States", (java.lang.Object[]) byteArray12);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray12, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray15, (int) (short) -1, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, -1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1United States0United States-1" + "'", str13, "1United States0United States-1");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 0, -1]");
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
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
        objMap15.clear();
        java.lang.Object obj50 = null;
        java.lang.Character[] charArray56 = new java.lang.Character[] { 'u', ' ', 'u', 'u', 'u' };
        char[] charArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray56);
        char[] charArray58 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray56);
        char[] charArray60 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray58, 'a');
        java.lang.Object obj61 = objMap15.replace(obj50, (java.lang.Object) 'a');
        java.util.Locale.LanguageRange[] languageRangeArray62 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList63 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList63, languageRangeArray62);
        java.util.Locale locale65 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList63, (java.util.Collection<java.lang.String>) strSet66);
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int77 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray74, (byte) 10, (int) '#');
        byte[] byteArray80 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray82 = org.apache.commons.lang3.ArrayUtils.add(byteArray80, (byte) -1);
        boolean boolean83 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray74, byteArray80);
        int int85 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray80, (byte) 0);
        java.lang.Byte[] byteArray86 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray80);
        byte[] byteArray88 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray86, (byte) 0);
        byte[] byteArray89 = org.apache.commons.lang3.ArrayUtils.clone(byteArray88);
        java.lang.Object obj90 = objMap15.put((java.lang.Object) strList67, (java.lang.Object) byteArray88);
        java.lang.String str92 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList67, '4');
        java.lang.String str94 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList67, "se,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
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
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[u,  , u, u, u]");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "u uuu");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "u uuu");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[u,  , u, u, u]");
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(languageRangeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 5 + "'", int77 == 5);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[1, 0]");
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Class[] classArray4 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        wildcardClassArray5[0] = wildcardClass2;
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass9;
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass16;
        java.lang.Class[][] classArray23 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray24 = (java.lang.Class<?>[][]) classArray23;
        wildcardClassArray24[0] = wildcardClassArray5;
        wildcardClassArray24[1] = wildcardClassArray12;
        wildcardClassArray24[2] = wildcardClassArray19;
        java.lang.Class<?>[][] wildcardClassArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(wildcardClassArray24, (java.lang.Object) 'u');
        java.lang.Class<?>[][] wildcardClassArray33 = org.apache.commons.lang3.ArrayUtils.clone(wildcardClassArray32);
        char[] charArray40 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray40, 'a', (int) (short) 10);
        char[] charArray50 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray50, 'a', (int) (short) 10);
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray50, ' ');
        char[] charArray57 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray50, ' ');
        char[] charArray58 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray57);
        char[] charArray59 = org.apache.commons.lang3.ArrayUtils.addAll(charArray40, charArray57);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.contains(charArray40, '4');
        int int62 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) wildcardClassArray33, (java.lang.Object) charArray40);
        java.lang.Character[] charArray63 = org.apache.commons.lang3.ArrayUtils.toObject(charArray40);
        int int64 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ", charArray40);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
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
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 101 + "'", int64 == 101);
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str2, "100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0#10.0#1.0#100.0#1.0100.0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("giapponese (Giappone)", "chinois");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "giapponese (Giappone)" + "'", str2, "giapponese (Giappone)");
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("01530011", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("u", "fRANCIA", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("TR#TR#FALS                                    ", 12, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("{{FALSE,FALSE,FALSE,FALSE,TRUE}PFPFPFPNPJ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray4 = null;
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray4);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) 4, (double) (byte) 10);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 100, 13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray9, (double) 95, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '#');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                     100.0#-1.0#10.0#1.0#100.0#", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Germany                  ", "{fulse,fulse,fulse,fulse,true");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
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
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        java.lang.Long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toObject(longArray29);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray29, (long) 743, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, 1.0d);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 10.0d);
        double[] doubleArray9 = new double[] {};
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray13 = null;
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray9, doubleArray13);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray9, (double) 4, (double) (byte) 10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray9);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray9, 97, (int) '#');
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray21, (double) 37, (double) (short) 10);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray21, (double) 2, (double) (short) 0);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXITALYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "zh_tw");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("      naliait", "T", (int) 'x');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ko-KR", "                                                                                         ...lse,f");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("English (United Kingdom)", 35, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1English (United Kingdom)" + "'", str3, "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1English (United Kingdom)");
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\u5927\u5229\u6587", "e", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("{false,false,false,false,tru");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.US;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.lang.String str7 = locale1.getDisplayLanguage(locale4);
        java.lang.String str8 = locale4.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale4.getUnicodeLocaleType("\u4e2d\u4e2d\u4e2d\u4e2d\u4e2d");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        java.lang.Integer[] intArray9 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        java.lang.Object[] objArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) intArray9);
        java.lang.Integer[] intArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray9);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray11, (int) 'u');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 10, 5, 1]");
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("{false,fa  {false,false,false,false,true}  laf,eslaf", "united# #states");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF " + "'", str1, "RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF RF ");
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        java.lang.String[] strArray3 = new java.lang.String[] { "\u7f8e\u570b", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", "{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}" };
        java.lang.String[] strArray7 = new java.lang.String[] { "\u7f8e\u570b", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", "{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}" };
        java.lang.String[] strArray11 = new java.lang.String[] { "\u7f8e\u570b", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", "{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}" };
        java.lang.String[] strArray15 = new java.lang.String[] { "\u7f8e\u570b", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", "{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}" };
        java.lang.String[][] strArray16 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15 };
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!");
        java.lang.String[][] strArray20 = org.apache.commons.lang3.ArrayUtils.add(strArray16, strArray19);
        java.lang.CharSequence[][] charSequenceArray21 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.CharSequence[][]) strArray16);
        java.lang.String[][] strArray22 = org.apache.commons.lang3.ArrayUtils.clone(strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[][] strComparableArray24 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.Comparable<java.lang.String>[][]) strArray22, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 19, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
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
            java.util.Locale.Builder builder64 = builder61.setExtension('a', "nglais (Etats-Unis)}");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: nglais (Etats [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category11.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category12.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category14.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
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
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, (int) (short) 1);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, (-1), 0);
        double[] doubleArray14 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray14, (double) (short) -1);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray14);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray17, (double) (byte) 100, (double) (-1.0f));
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray10, doubleArray17);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray10);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray10, (double) 756);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                hi!                                                 ", "rt,esluf,esluf,esluf,esluf{                                                                         ", 34);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        java.lang.Long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toObject(longArray12);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray16);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray16);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray16);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray16);
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
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 1, 10, 10, 35, -1, 35, -1]");
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.lang.String str4 = locale0.getExtension('x');
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japanese" + "'", str2, "Japanese");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        short[] shortArray1 = new short[] { (short) 10 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) 10, 35);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.add(shortArray1, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray1, (short) (byte) 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray1, (short) 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) -1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray1);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.add(shortArray1, 0, (short) 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.remove(shortArray1, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 98, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        boolean[] booleanArray1 = new boolean[] { false };
        java.lang.Boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray1);
        java.lang.Boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray2);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray4);
        java.lang.Boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false]");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false]");
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "NPJ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 333);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
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
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(intArray43, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray3, (java.lang.Object) (byte) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray3);
        char[] charArray15 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray15, 'a', (int) (short) 10);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray15, ' ');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray15, ' ');
        java.lang.Short[] shortArray24 = new java.lang.Short[] { (short) 0 };
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray24, (short) (byte) 1);
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { shortArray3, charArray15, shortArray26 };
        java.lang.Short[] shortArray29 = new java.lang.Short[] { (short) 0 };
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray29, (short) (byte) 1);
        java.lang.Cloneable[] cloneableArray32 = org.apache.commons.lang3.ArrayUtils.add(cloneableArray27, (java.lang.Cloneable) shortArray29);
        java.lang.String[] strArray33 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        int int34 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray33);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) cloneableArray27, (java.lang.Object[]) strArray33);
        java.lang.String[] strArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray33);
        int int37 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray33);
        java.lang.String[] strArray38 = null;
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.replaceEach("\u7f8e\u570b", strArray33, strArray38);
        java.lang.String[] strArray40 = org.apache.commons.lang3.StringUtils.stripAll(strArray38);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0]");
        org.junit.Assert.assertNotNull(cloneableArray27);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0]");
        org.junit.Assert.assertNotNull(cloneableArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u7f8e\u570b" + "'", str39, "\u7f8e\u570b");
        org.junit.Assert.assertNull(strArray40);
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str2, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder0.build();
        java.lang.String str4 = locale3.getDisplayScript();
        java.lang.String str5 = locale3.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "aaafr_FRaaaa", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale locale2 = java.util.Locale.US;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale3.getISO3Language();
        java.lang.String str5 = locale3.getDisplayScript();
        java.lang.String str6 = locale1.getDisplayCountry(locale3);
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale3.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eng" + "'", str4, "eng");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en_US" + "'", str9, "en_US");
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("      []", 23, (int) 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0.1#0.001#0.1#0.01#0.1-#0.0010.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.001", "\u56fd\u7f8e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.1#0.001#0.1#0.01#0.1-#0.0010.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.001" + "'", str2, "0.1#0.001#0.1#0.01#0.1-#0.0010.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.0010.1#0.001#0.1#0.01#0.1-#0.001");
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\u97e9");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale.Category[] categoryArray5 = new java.util.Locale.Category[] { category0, category3 };
        java.util.Locale.Category[][] categoryArray6 = new java.util.Locale.Category[][] { categoryArray5 };
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
        java.util.Locale.Category[][][] categoryArray21 = new java.util.Locale.Category[][][] { categoryArray6, categoryArray13, categoryArray20 };
        java.util.Locale.Category category23 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category24 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category25 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category27, locale28);
        java.util.Locale.Category category30 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale31 = java.util.Locale.getDefault(category30);
        java.util.Locale.Category[] categoryArray32 = new java.util.Locale.Category[] { category23, category24, category25, category26, category27, category30 };
        java.util.Locale.Category category33 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category34 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category35 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Category category36 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Category category37 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale38 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category37, locale38);
        java.util.Locale.Category category40 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale41 = java.util.Locale.getDefault(category40);
        java.util.Locale.Category[] categoryArray42 = new java.util.Locale.Category[] { category33, category34, category35, category36, category37, category40 };
        java.util.Locale.Category[][] categoryArray43 = new java.util.Locale.Category[][] { categoryArray32, categoryArray42 };
        java.util.Locale.Category[][] categoryArray46 = org.apache.commons.lang3.ArrayUtils.subarray(categoryArray43, (int) '#', 35);
        java.util.Locale.Category[][][] categoryArray47 = org.apache.commons.lang3.ArrayUtils.add(categoryArray21, 0, categoryArray46);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) categoryArray21);
        java.util.Locale.Category[][][] categoryArray49 = org.apache.commons.lang3.ArrayUtils.clone(categoryArray21);
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) categoryArray49, '4', 35, (int) (byte) -1);
        java.lang.String[] strArray57 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("}eurt,esla", " ");
        int int58 = org.apache.commons.lang3.StringUtils.indexOfAny("etruefalse", strArray57);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) categoryArray49, (java.lang.Object[]) strArray57);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isNotEmpty((java.lang.Enum<java.util.Locale.Category>[][][]) categoryArray49);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray5);
        org.junit.Assert.assertNotNull(categoryArray6);
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
        org.junit.Assert.assertNotNull(categoryArray21);
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category23.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.FORMAT + "'", category24.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category25 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category25.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.FORMAT + "'", category26.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category27 + "' != '" + java.util.Locale.Category.FORMAT + "'", category27.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.FORMAT + "'", category30.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray32);
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category33.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category34 + "' != '" + java.util.Locale.Category.FORMAT + "'", category34.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category35 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category35.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.FORMAT + "'", category36.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + category37 + "' != '" + java.util.Locale.Category.FORMAT + "'", category37.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.FORMAT + "'", category40.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de_DE");
        org.junit.Assert.assertNotNull(categoryArray42);
        org.junit.Assert.assertNotNull(categoryArray43);
        org.junit.Assert.assertNotNull(categoryArray46);
        org.junit.Assert.assertNotNull(categoryArray47);
        org.junit.Assert.assertNotNull(categoryArray49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                         {fulse,fulse,fulse,fulse,tr", "TWN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         {fulse,fulse,fulse,fulse,tr" + "'", str2, "                                                                         {fulse,fulse,fulse,fulse,tr");
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("{false,false,false,false,tru");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.US;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.lang.String str7 = locale1.getDisplayLanguage(locale4);
        java.lang.String str8 = locale4.getISO3Language();
        java.lang.String str9 = locale4.toString();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en_US" + "'", str9, "en_US");
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
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
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.subarray(intArray26, (int) (short) -1, 7);
        java.lang.Float[] floatArray35 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray35, (float) (byte) 0);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray37);
        java.lang.Float[] floatArray44 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray44, (float) (byte) 0);
        float[] floatArray47 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray46);
        float[] floatArray48 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray37, floatArray46);
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray37, (float) (-1L));
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray50, (float) 213, 17);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) 7, (java.lang.Object) floatArray50);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, 35, 0, 32, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 35, 0, 32, -1, 35, 0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[0.0, 100.0, 0.0, 1.0, 1.0, 0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Class[] classArray4 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        wildcardClassArray5[0] = wildcardClass2;
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class[] classArray11 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        wildcardClassArray12[0] = wildcardClass9;
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass16;
        java.lang.Class[][] classArray23 = new java.lang.Class[3][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray24 = (java.lang.Class<?>[][]) classArray23;
        wildcardClassArray24[0] = wildcardClassArray5;
        wildcardClassArray24[1] = wildcardClassArray12;
        wildcardClassArray24[2] = wildcardClassArray19;
        java.lang.Class<?>[][] wildcardClassArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(wildcardClassArray24, (java.lang.Object) 'u');
        java.lang.Class<?>[][] wildcardClassArray33 = org.apache.commons.lang3.ArrayUtils.clone(wildcardClassArray32);
        char[] charArray40 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray40, 'a', (int) (short) 10);
        char[] charArray50 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray50, 'a', (int) (short) 10);
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray50, ' ');
        char[] charArray57 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray50, ' ');
        char[] charArray58 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray57);
        char[] charArray59 = org.apache.commons.lang3.ArrayUtils.addAll(charArray40, charArray57);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.contains(charArray40, '4');
        int int62 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) wildcardClassArray33, (java.lang.Object) charArray40);
        java.lang.Character[] charArray63 = org.apache.commons.lang3.ArrayUtils.toObject(charArray40);
        int int64 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "slafurturt", charArray40);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
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
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), " 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), " 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[ , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "  4 a4 4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[ ,  , 4,  , a, 4,  , 4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                       aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ", "{0,35,-1}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("CHN44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHN44444444444444444444444444444444" + "'", str1, "CHN44444444444444444444444444444444");
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
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
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        java.lang.Long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toObject(longArray29);
        java.lang.Long[] longArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray30);
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
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertNotNull(longArray31);
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)_CORE                             slafurturt");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("{fulse,fulse,fulse,fulse,tr", 320, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{fulse,fulse,fulse,fulse,tr" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa{fulse,fulse,fulse,fulse,tr");
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
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
        java.lang.String str21 = locale20.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u82f1\u8a9e" + "'", str21, "\u82f1\u8a9e");
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("United St", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("Giappone");
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
        java.util.Locale.Builder builder38 = builder4.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder40 = builder38.addUnicodeLocaleAttribute("                                          ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                            [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
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
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "10.0100.01.0100.00.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10.0100.01.0100.00.0" + "'", str1, "10.0100.01.0100.00.0");
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aitalianaa", "", (-1));
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) builder4, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder4.addUnicodeLocaleAttribute("{false,false,false,false,tra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: {false,false,false,false,tra [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "####################{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 10.0f };
        java.lang.Float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray1, (float) 22);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444italien (talie...aaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaaaaDEaaaaaaaaa", "truefalsefalsefalsefalsetruetruefalse");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "French (France)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "-101");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-101" + "'", str1, "-101");
    }
}
