import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
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
        java.lang.String str14 = locale6.getScript();
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
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("German", " ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("true                                                                                                    true                                                                                                    false", "aaaaaDEaaaaaa", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("n", (int) (short) 100, 221);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "{fnlse,fnlse,fnlse,fnlse,trne", "en_GB");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("{false,...", "Giappone", "\u5229\u5927\u610f\u6587\u5229\u5927\u610f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{false,..." + "'", str3, "{false,...");
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("}eurt,esla", "                                                                     100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}eurt,esla" + "'", str2, "}eurt,esla");
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.add(booleanArray33, 2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 1");
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
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("anglais(Etats-Unis)", "e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais(Etats-Unis)" + "'", str2, "anglais(Etats-Unis)");
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ", "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      " + "'", str2, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ");
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                     100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                     100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str1, "                                                                     100.0#-1.0#10.0#1.0#100.0#1.0");
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 0L);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray4, "USA", 9, 0);
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray4);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 'x');
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.remove(floatArray13, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[1.0, -1.0, 0.0, 0.0]");
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja_J" + "'", str1, "ja_J");
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("France");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray10, (byte) 10, (int) '#');
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) -1);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray10, byteArray16);
        java.lang.Byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray16);
        java.lang.Byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray16);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.clone(byteArray16);
        boolean boolean25 = languageRange1.equals((java.lang.Object) byteArray24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "france" + "'", str2, "france");
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
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("{FALSE,...", (int) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{FALSE,...##########################################################################################" + "'", str3, "{FALSE,...##########################################################################################");
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "CN", (java.lang.CharSequence) " italien (Italie)hi!italien (Italie)en-USitalien (Italie) ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("TI_TI", "etruefalse                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "zho", (java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Japanese (Japan)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Japanese (Japan)" + "'", str1, "Japanese (Japan)");
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("France");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                   English", 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "{1,0}");
        double[] doubleArray10 = new double[] { 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray10, (double) 35, (double) (byte) 10);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray10, (double) 1, (double) (short) 100);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray10);
        double[] doubleArray21 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray21, (double) (byte) 10, 1.0d);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray21, 10.0d);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray21, 10.0d, (double) 0.0f);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray21);
        double[] doubleArray32 = new double[] { 0 };
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray32, (double) 35, (double) (byte) 10);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray32, (int) (byte) 100, 213);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray21, doubleArray38);
        double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray10, doubleArray21);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray6, (java.lang.Object) doubleArray10, 2);
        boolean boolean43 = languageRange1.equals((java.lang.Object) 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "france" + "'", str2, "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "france" + "'", str3, "france");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                   English" + "'", str8, "                                   English");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen}1-,53,1-,53,01,01,1,79{", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("}eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE", "                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ", 13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "}eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt" + "'", str4, "}eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt");
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("france", "slafurturt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "france" + "'", str2, "france");
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("th Korea", "        {{false,false,false,false,true}PfPfPfPNPJ   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "th Korea" + "'", str2, "th Korea");
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
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
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray25, (double) (byte) -1);
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray25);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray25, 0.0d, (double) 'x');
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray4 = null;
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray4);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) 4, (double) (byte) 10);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 100, 13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) (byte) 100, (int) 'u', (double) 21);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("kor", 1, 95);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\u5927\u5229\u6587", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("-1.0{0}10.0{0}1.0{0}100.0{0}1.0", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0{0}10.0{0}1.0{0}100.0{0}1.0" + "'", str2, "-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("   }eurt,eslaf,eslaf,eslaf,eslaf{  ", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("{10,32,10,5,1,5}", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{10,32,10,5,1,5}" + "'", str2, "{10,32,10,5,1,5}");
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\u82f1\u8a9e\u30a2en_US", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a2en_US" + "'", str3, "\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        short[] shortArray1 = new short[] { (short) 10 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) 10, 35);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.add(shortArray1, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray1, (short) (byte) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(shortArray8, (short) 10);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("DE", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DE" + "'", str2, "DE");
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\u30a2\u30e1#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a2\u30e1#" + "'", str1, "\u30a2\u30e1#");
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', '#', ' ', 'u', ' ' };
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) charArray6);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, (int) (short) 100);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.add(intArray5, 5);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, 0);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(intArray5, 6);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 10, 5, 1, 5]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("CN", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CN" + "'", str2, "CN");
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap48 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) categoryArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '[[Ljava.util.Locale$Category;@4f01d53c', has a length less than 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("100.0#-1.0#10.0#1.0#100.0#1.0", " italien (Italie)hi!italien (Italie)en-USitalien (Italie) ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...", "ja");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,..." + "'", str2, "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...");
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("it_IT", "JPN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it_IT" + "'", str2, "it_IT");
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\u4e2d\u6587", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\u6cd5\u6587                                                 ", "US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587                                                 " + "'", str2, "\u6cd5\u6587                                                 ");
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("TI_TI");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ti_ti");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        float[] floatArray0 = null;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        org.junit.Assert.assertNull(floatArray1);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("France");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.Byte[] byteArray4 = null;
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        boolean boolean6 = languageRange1.equals((java.lang.Object) byteArray5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "france" + "'", str2, "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "france" + "'", str3, "france");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ja", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("n", "United States", "German (Germany)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "n" + "'", str3, "n");
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\u82f1\u6587\u7f8e\u570b)");
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("etruefalse                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: etruefalse                                                                                          [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{" + "'", str1, "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{");
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        char[][] charArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("china", "xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "china" + "'", str2, "china");
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ja_JP", "1.0-1.00.00.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("S");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: S [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, (int) (byte) 100, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("10321051", "T");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray1, 6);
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
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
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
        java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> objEntrySet80 = objMap15.entrySet();
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
        org.junit.Assert.assertNotNull(objEntrySet80);
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("coreano", 98, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "coreanoaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "coreanoaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "truetruetruefalsetruetruetruefalsefalse", (java.lang.CharSequence) "etruefalse                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray4 = null;
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.add(doubleArray7, (double) (short) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray9, (double) (short) 1, 213);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444France                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444france                " + "'", str1, "44444444444444444444444444france                ");
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "france");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 100, 0L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) -1);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, 42, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 100.0, 0.0]");
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder35 = builder5.setExtension('4', "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf");
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
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "italien (Italie)", (java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("44444444444444444444444444france                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444france" + "'", str1, "44444444444444444444444444france");
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd", "{uuu", "ZH_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd" + "'", str3, "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("South Korea", "{false,...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "South Korea" + "'", str2, "South Korea");
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zho", "\u82f1\u8a9e\u30a2en_US             ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("        {fPfPfPfPNPJ   ", (double) 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=29.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
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
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setLanguageTag("tRUETRUEFALSE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: tRUETRUEFALSE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("100.0#-1.0#10.0#1.0#100.0#1.0", "aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setRegion("        {fPfPfPfPNPJ   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:         {fPfPfPfPNPJ    [at index 0]");
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
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\u65e5\u6587\u65e5\u672c)");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray7 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, 'a', (int) (short) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, ' ');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, ' ');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray0, charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray16, '#', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray22 = org.apache.commons.lang3.ArrayUtils.add(charArray16, (int) ' ', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd", "tru4tru4fals");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd" + "'", str2, "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        boolean[] booleanArray5 = new boolean[] { false, false, false, false, true };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, true);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 0, false);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.add(booleanArray11, true);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray13, false);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 0, (int) '#');
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, 5);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) -1);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 100, 10);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ED", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Japanese (Japan)", "frChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr_ChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetrFR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        java.lang.Double[] doubleArray6 = new java.lang.Double[] { 100.0d, (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d };
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) (short) 0);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) 100, 6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, -1.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category2, locale3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category2);
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguage("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: {false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal [at index 0]");
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
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("{FALSE,...##########################################################################################", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{FALSE,...##########################################################################################" + "'", str2, "{FALSE,...##########################################################################################");
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("10 32 10 5 1", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    10 32 10 5 1" + "'", str2, "                    10 32 10 5 1");
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("ko_KR", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\u82f1\u8a9e\u30a2EN_US             ", "\u65e5\u6587", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
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
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.add(intArray13, 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = org.apache.commons.lang3.ArrayUtils.add(intArray13, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 3");
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
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 35, 0, 10]");
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
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
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray54);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.add(shortArray54, 5, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("{false,false,false,false,true", strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("}eurt,eslaf,eslaf,eslaf,eslaf{", "11003510");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("{false,false,false,false,true}", strArray6, strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("etruefalse", strArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("{", strArray10);
        java.lang.Double[] doubleArray16 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray16, (double) (byte) -1);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray16);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray19, (int) (short) 1);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray10, (java.lang.Object) (short) 1);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{false,false,false,false,true", 'a');
        java.lang.String[] strArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray25);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.split("}eurt,eslaf,eslaf,eslaf,eslaf{", '#');
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray25, (java.lang.Object[]) strArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\uc911\uad6d", strArray10, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{false,false,false,false,true}" + "'", str11, "{false,false,false,false,true}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
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
        java.lang.String str10 = locale5.getCountry();
        java.lang.Object obj11 = locale5.clone();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "US" + "'", str10, "US");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "en_US");
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ")enihC( sionihc" + "'", str1, ")enihC( sionihc");
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("tru#tru#fals", 0, "1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-ecnarf");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tru#tru#fals" + "'", str3, "tru#tru#fals");
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("}", (int) 'u');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
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
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.remove(shortArray21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 2");
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
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[]");
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}" + "'", str1, "}");
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("T", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "T" + "'", str2, "T");
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? (???????)?? (?????? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_US?? (?en_U [at index 0]");
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
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ja", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ja                                        " + "'", str2, "ja                                        ");
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        java.lang.Float[] floatArray4 = new java.lang.Float[] { 1.0f, (-1.0f), 0.0f, 0.0f };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 0L);
        java.lang.Float[] floatArray12 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray12, (float) (byte) 0);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray14);
        java.lang.Float[] floatArray21 = new java.lang.Float[] { 0.0f, 100.0f, 0.0f, 1.0f, 1.0f };
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray21, (float) (byte) 0);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray23);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray23);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray6, floatArray14);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray6);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 0.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[0.0, 100.0, 0.0, 1.0, 1.0, 0.0, 100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[1.0, -1.0, 0.0, 0.0, 0.0, 100.0, 0.0, 1.0, 1.0]");
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
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
        java.util.Locale locale53 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet54 = locale53.getUnicodeLocaleKeys();
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet54, ' ');
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet54);
        java.lang.String str59 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList57, ' ');
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
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("zh_TW", strArray2, strArray4);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("{fPfPfPfPNPJ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh_TW" + "'", str8, "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen", "0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444france                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444france" + "'", str1, "44444444444444444444444444france");
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("en_US", 12, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (byte) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, 2);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = org.apache.commons.lang3.ArrayUtils.remove(intArray10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
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
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray3, 0, 4);
        int[] intArray13 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray13, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray13);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray13, (int) (short) 100);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray3, intArray13);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, 42);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = org.apache.commons.lang3.ArrayUtils.remove(intArray3, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[4, -1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 32, 10, 5, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\u7fa9\u5927\u5229\u6587", "10321051");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\u4e2d\u6587\u53f0\u7063)it_it", "True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("United States", "a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United St" + "'", str2, "United St");
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", "n-US   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str2, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                 {false,..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444", "\u6cd5\u6587                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("-1.0", "Chinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u52a0\u62ff\u5927", "##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "USA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setScript("                                                                                                                                                                                                                                                 {false,..");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                                                                                                                                                                                                                                  {false,.. [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setLanguage("{FPFPFPFPNPJ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: {FPFPFPFPNPJ [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444france");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444FRANCE" + "'", str1, "44444444444444444444444444FRANCE");
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setExtension('a', "coreanoaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: coreanoaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("10321051", "{uuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10321051" + "'", str2, "10321051");
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "japonais (Japon)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("h", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen", "DE");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "France");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        boolean[] booleanArray0 = new boolean[] {};
        boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("{false,fal", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{false,fal" + "'", str2, "{false,fal");
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Chinese", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray0);
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) (byte) 1);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.remove(shortArray5, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[]");
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "truetruefalse", (java.lang.CharSequence) "1 100 35 10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)", "\u5229\u5927\u610f\u6587\u5229\u5927\u610f");
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        int[] intArray5 = new int[] { (byte) 1, 5, (byte) 10, ' ', (byte) 10 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (-1));
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, (int) '#', 12);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 5, 10, 32, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("{0}", "44444444444444444444444444France", 7);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "truetruef4lse");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                   English", 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "{1,0}");
        java.lang.String[] strArray11 = org.apache.commons.lang3.ArrayUtils.addAll(strArray3, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap12 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '                                   English', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                   English" + "'", str10, "                                   English");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
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
        // The following exception was thrown during execution in test generation
        try {
            long[][][] longArray28 = org.apache.commons.lang3.ArrayUtils.remove(longArray26, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 48, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444444444444444FRANCE", "trutrufals");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("eng");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("{0}");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: {0} [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("}eurt,esla", (int) (byte) 0, (int) 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}eurt,esla" + "'", str3, "}eurt,esla");
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("true{false,f");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true{false,f" + "'", str1, "true{false,f");
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("{false,false,false,false,true}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{false,false,false,false,true}" + "'", str1, "{false,false,false,false,true}");
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Italian", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE", "de_DE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444italien (Italie)44444444444444444444444444444444444444444444444444", 35, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444italien (Italie)44444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444italien (Italie)44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)11003510", " trutrufals  ", 42);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510" + "'", str3, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510");
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE", 0, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{97,1,10" + "'", str3, "{97,1,10");
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 3, (int) '#');
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray6, 0L);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray11, 0, (long) 13);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray11, (long) (short) 0, (int) 'u');
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray11, (long) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[13, 1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.subarray(longArray15, (int) (byte) 100, 0);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray15, (long) 13);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray22 = org.apache.commons.lang3.ArrayUtils.remove(longArray15, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("en-CA", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA" + "'", str2, "en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA");
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "{10,32,10,5,1,5}", "{97,1,10,10,35,-1,35,-1}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aitalianaa", 21, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        char[] charArray6 = new char[] { ' ', ' ', '4', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a', (int) (short) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'u');
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12);
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray12);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12, '#');
        java.lang.Character[] charArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray12);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17, ' ');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray21 = org.apache.commons.lang3.ArrayUtils.remove(charArray19, 221);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 221, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , 4,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "  4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "  4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ ,  , 4,  , a, 4]");
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray3);
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray3, (float) (short) 1, (-1));
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray7);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7, (long) 3);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, 3, (int) (short) 10);
        boolean boolean16 = locale5.equals((java.lang.Object) longArray15);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ja_J", "eng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ja_J" + "'", str2, "ja_J");
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_US", "United States", (int) (byte) -1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\u82f1\u6587\u7f8e\u570b)", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[, , _, , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[, , _, , ]");
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
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
        java.lang.Object obj15 = null;
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) categoryEnumArray11, obj15, 1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(categoryEnumArray11);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (byte) 0);
        int[] intArray10 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray10);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray10, (int) '4');
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.addAll(intArray3, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = org.apache.commons.lang3.ArrayUtils.add(intArray3, (int) (short) -1, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
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
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        java.lang.Character[] charArray3 = new java.lang.Character[] { ' ', ' ', 'a' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, '4');
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        java.lang.Integer[] intArray10 = org.apache.commons.lang3.ArrayUtils.toObject(intArray9);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) charArray3, (java.lang.Object[]) intArray10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  , a]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("CHINA", "false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINA" + "'", str2, "CHINA");
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Japan");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Japan" + "'", str1, "Japan");
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)_COREANO", "     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("German (Germany)", 250);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("444444444444444444444italien (Italie)44444444444444444444444444444444444444444444444444", 35, 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...e)4444444444444444444444444444444444..." + "'", str3, "...e)4444444444444444444444444444444444...");
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                    10 32 10 5 1", "italianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalian", (int) 'x');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguage("True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList20);
        java.lang.Iterable[] iterableArray24 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray25 = (java.lang.Iterable<java.lang.String>[]) iterableArray24;
        strIterableArray25[0] = strList9;
        strIterableArray25[1] = strList22;
        java.lang.Short[] shortArray31 = new java.lang.Short[] { (short) 0 };
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray31, (short) (byte) 1);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray31, (java.lang.Object) (byte) 10);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray31);
        java.lang.Iterable<java.lang.String>[] strIterableArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(strIterableArray25, (java.lang.Object) shortArray31);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strIterableArray37);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.concatWith("   JPNPfPfPfPf{        ", (java.lang.Object[]) strIterableArray37);
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(iterableArray24);
        org.junit.Assert.assertNotNull(strIterableArray25);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0]");
        org.junit.Assert.assertNotNull(strIterableArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[ , hi!, en-US,  ]   JPNPfPfPfPf{        []" + "'", str39, "[ , hi!, en-US,  ]   JPNPfPfPfPf{        []");
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("Chinese");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        float[] floatArray0 = null;
        float[] floatArray1 = new float[] {};
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        float[] floatArray5 = new float[] {};
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray5);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray5);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray1, floatArray5);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray1);
        float[] floatArray11 = new float[] {};
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray11);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray11, (int) (short) 10, (int) (short) 1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray1, floatArray11);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray11);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (byte) 0);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = org.apache.commons.lang3.ArrayUtils.remove(intArray8, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 98, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setLanguageTag("{false,false,false,false,true}");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: {false,false,false,false,true} [at index 0]");
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
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("CHINA", "\u97e9\u56fd", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        char[] charArray3 = new char[] { ' ', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray3);
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("en-US", "English");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray5, (java.lang.Object) strArray8, (int) 'a');
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray13, '4');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray17 = org.apache.commons.lang3.ArrayUtils.remove(charArray13, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 117, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u97e9\u56fd", "se,false,false,tru{false,false,false,false", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("etruefalse");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("zh_TW", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "etruefalse" + "'", str4, "etruefalse");
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ja_J", "97United States1United States10United States10United States35United States-1United States35United States-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  en-US   ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  en-US   " + "'", str3, "  en-US   ");
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (int) (short) 1, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray12, (-1), (-1));
        java.lang.Long[] longArray16 = org.apache.commons.lang3.ArrayUtils.toObject(longArray12);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray16, (java.lang.Object) floatArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray17);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray17, 0, (int) '4');
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
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.remove(shortArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("nglais (Etats-Unis)", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nglais (Etats-Unis)" + "'", str2, "nglais (Etats-Unis)");
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray0, '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                     100.0#-1.0#10.0#1.0#100.0#1.0", "Italian (Italy)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "frChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr_ChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetrFR", "\u65e5\u6587");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[] typeArray92 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.reflect.Type[]) wildcardClassArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "  en-US   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Etats-Unis");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("{uuu", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "zho");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        java.util.Locale locale1 = new java.util.Locale("ja_J");
        org.junit.Assert.assertEquals(locale1.toString(), "ja_j");
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getVariant();
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale0.getDisplayVariant(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale4.getUnicodeLocaleType("\u4e2d\u6587\u53f0\u7063)it_it");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?? (??)it_it");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                    10 32 10 5 1", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1" + "'", str2, "                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1");
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("{fulse,fulse,fulse,fulse,tr", "KOR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7, (double) 4);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray9, 213, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 213, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 1.0]");
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale4 = java.util.Locale.US;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.lang.String str7 = locale2.getDisplayCountry(locale5);
        java.lang.String str8 = locale2.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-US" + "'", str1, "en-US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u7f8e\u56fd" + "'", str3, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("th Korea", "Japanese (Japan)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        java.util.AbstractCollection[] abstractCollectionArray1 = new java.util.AbstractCollection[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<java.util.Locale.LanguageRange>[] languageRangeCollectionArray2 = (java.util.AbstractCollection<java.util.Locale.LanguageRange>[]) abstractCollectionArray1;
        java.util.AbstractCollection<java.util.Locale.LanguageRange>[] languageRangeCollectionArray3 = org.apache.commons.lang3.ArrayUtils.toArray((java.util.AbstractCollection<java.util.Locale.LanguageRange>[]) abstractCollectionArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractCollection<java.util.Locale.LanguageRange>[] languageRangeCollectionArray5 = org.apache.commons.lang3.ArrayUtils.remove(languageRangeCollectionArray3, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 98, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(abstractCollectionArray1);
        org.junit.Assert.assertNotNull(languageRangeCollectionArray2);
        org.junit.Assert.assertNotNull(languageRangeCollectionArray3);
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 10.0f };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, 1.0d);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 10.0d);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 10);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0, 10.0]");
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        java.lang.Short[] shortArray0 = null;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNull(shortArray2);
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("tru#tru#fals");
        java.lang.String str2 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) "tru#tru#fals");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tru#tru#fals" + "'", str2, "tru#tru#fals");
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA", "\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e\u30a2en_US" + "'", str2, "\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("}eurt,esla", "France");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  {false,false,false,false,true}   ", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  {false,false,false,false,true}   " + "'", str2, "  {false,false,false,false,true}   ");
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 100.0d, 10.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, 1.0d, (double) 35);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 0);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) 100, 4);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) 7, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str1, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
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
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray16);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray49 = org.apache.commons.lang3.ArrayUtils.remove(charArray16, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 29, Length: 6");
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
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), " 4 a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), " 4 a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[ , 4,  , a, 4,  ]");
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str1, "0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) 'a');
        int[] intArray4 = null;
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.addAll(intArray1, intArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray4);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10]");
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("truetruef4lse", 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("n", (int) (short) 10, "FAL a{FAL a{FALSEu0 a{FAL a{FAL a{FAL a{FA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FAL nFAL a" + "'", str3, "FAL nFAL a");
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "n", (java.lang.CharSequence) "US");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "{}", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "{1.0,-1.0,0.0,0.0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("ja_JP", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        ja_JP" + "'", str2, "        ja_JP");
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        float[] floatArray6 = new float[] { (byte) -1, (byte) 1, '#', (short) 10, 35, 'u' };
        float[] floatArray13 = new float[] { (byte) -1, (byte) 1, '#', (short) 10, 35, 'u' };
        float[][] floatArray14 = new float[][] { floatArray6, floatArray13 };
        java.lang.Object obj15 = null;
        float[][] floatArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray14, obj15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray16);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, 1.0, 35.0, 10.0, 35.0, 117.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0, 1.0, 35.0, 10.0, 35.0, 117.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray16);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("CN", "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     " + "'", str1, "     ");
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 29, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "{97,1,10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 1.0f, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
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
            java.util.Locale.Builder builder38 = builder34.setVariant(")enihC( sionihc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: )enihC( sionihc [at index 0]");
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
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("truetruefalse", "en-US", (int) '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" ", "etruefalse");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("CHINA", strArray7, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("zh-CN", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa" + "'", str1, "aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa");
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("en-US", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-US" + "'", str3, "en-US");
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale locale6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setVariant("True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse [at index 0]");
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
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en_GB" + "'", str1, "en_GB");
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        boolean[] booleanArray7 = new boolean[] { false, false, false, false, true };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray7);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray7, (int) (byte) -1, (int) '#');
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray7);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray7);
        boolean[] booleanArray19 = new boolean[] { false, false, false, false, true };
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray19);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray19, (int) (byte) -1, (int) '#');
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray7, booleanArray19);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray19);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray0, (java.lang.Object) booleanArray19);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray19, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("{false,fal", "\u82f1\u8a9e\u30a2en_US             ", " ", 213);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{false,fal" + "'", str4, "{false,fal");
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("English");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("10321051", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051" + "'", str2, "10321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051");
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray8, (long) (byte) -1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray8);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray19 = org.apache.commons.lang3.ArrayUtils.remove(longArray17, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Length: 6");
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
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("{97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE", 213, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                        {97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE                                                         " + "'", str3, "                                                        {97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE                                                         ");
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u7fa9\u5927\u5229\u6587", "44444444444444444444444444france                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("{false,false,false,false,true}", "aitalianaa", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\u7f8e\u56fd", "truetruefalse", (int) (short) 1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", 213);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE", strArray5, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{  ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE" + "'", str10, "TRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALTRUE{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FAL{FALSE,FALSE,FALSE,FALSE,TRU{FALSE,FALSE,FALSE,FALSE,TRU{FALFALSE");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
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
            double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, 39, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 39, Length: 0");
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
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
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
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray28, 23, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 23, Length: 8");
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
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u52a0\u62ff\u5927", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5927" + "'", str2, "\u5927");
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
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
            java.util.Locale.Builder builder11 = builder7.setScript("fran\347ais (France)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: franc?ais (France) [at index 0]");
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
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ", strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        long[] longArray8 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray8, 0L);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray10, (long) (byte) -1);
        long[] longArray17 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray17, 0L);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray19, (long) (byte) 0);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray10, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.clone(longArray19);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray1, (java.lang.Object) longArray24, (-1));
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[1, 100, 35, 10, 1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Set[] setArray7 = new java.util.Set[2];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.Character>[] charSetArray8 = (java.util.Set<java.lang.Character>[]) setArray7;
        charSetArray8[0] = charSet2;
        charSetArray8[1] = charSet5;
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale13.getScript();
        java.util.Set<java.lang.Character> charSet16 = locale13.getExtensionKeys();
        java.util.Locale locale17 = java.util.Locale.US;
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Locale locale19 = java.util.Locale.US;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.String str22 = locale17.getDisplayCountry(locale20);
        java.util.Set<java.lang.Character> charSet23 = locale17.getExtensionKeys();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.util.Set<java.lang.Character> charSet25 = locale24.getExtensionKeys();
        java.util.Set[] setArray27 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.Character>[] charSetArray28 = (java.util.Set<java.lang.Character>[]) setArray27;
        charSetArray28[0] = charSet16;
        charSetArray28[1] = charSet23;
        charSetArray28[2] = charSet25;
        java.util.Set<java.lang.Character>[] charSetArray35 = org.apache.commons.lang3.ArrayUtils.addAll(charSetArray8, charSetArray28);
        java.lang.String[] strArray38 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("United States", "}eurt,esla");
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charSetArray8, (java.lang.Object) "}eurt,esla", 39);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(setArray7);
        org.junit.Assert.assertNotNull(charSetArray8);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-US" + "'", str14, "en-US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en-US" + "'", str18, "en-US");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "United States" + "'", str22, "United States");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertNotNull(setArray27);
        org.junit.Assert.assertNotNull(charSetArray28);
        org.junit.Assert.assertNotNull(charSetArray35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("United States", "ja_JP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United States" + "'", str2, "United States");
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        char[] charArray3 = new char[] { ' ', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray3);
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray3, 'a', 9);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray3, '4');
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray10, 'x', (-1));
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("JPN", 21, "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 ({FALSE,FALSE,FAJPN" + "'", str3, "0 ({FALSE,FALSE,FAJPN");
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray6);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray6, 1, (long) 100);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[1, 100, 100, 35, 10]");
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("{false,fal", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{false,fal" + "'", str2, "{false,fal");
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "ja_JP");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category3, locale4);
        java.lang.String str7 = locale4.getExtension('a');
        java.util.Locale.setDefault(category0, locale4);
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
        java.lang.String str23 = locale15.getVariant();
        java.util.Locale.setDefault(category0, locale15);
        java.lang.String str25 = locale15.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNull(str7);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "France" + "'", str25, "France");
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[] shortArray1 = new java.lang.Short[] {};
        java.lang.Short[] shortArray2 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray3 = new java.lang.Short[][] { shortArray0, shortArray1, shortArray2 };
        java.lang.Short[][] shortArray4 = org.apache.commons.lang3.ArrayUtils.clone(shortArray3);
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) shortArray4, (java.lang.Object) builder5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.removeUnicodeLocaleAttribute("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ??zh_CN(???????)zh_CN(COREANO) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        long[] longArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("kor", "th Korea", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("     ", locale2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("}eurt,esl", locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-CA" + "'", str3, "en-CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "     " + "'", str4, "     ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "}EURT,ESL" + "'", str5, "}EURT,ESL");
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toObject(longArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) longArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray7);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11003510" + "'", str8, "11003510");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11003510" + "'", str9, "11003510");
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-ecnarf", "Taiwan");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-ecnarf" + "'", str2, "1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-0.1}0{0.001}0{0.1}0{0.01}0{0.1-ecnarf");
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("{false,false,false,false,true}", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true}" + "'", str2, "true}");
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("FR_fr", 2, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\u5927\u5229\u6587", "en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510", 221, "nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen}1-,53,1-,53,01,01,1,79{");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510" + "'", str3, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ea\u30ab\u5408\u8846\u56fd)11003510");
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("France");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category4, locale5);
        java.util.Locale locale7 = java.util.Locale.getDefault(category4);
        java.util.Locale locale8 = java.util.Locale.US;
        java.lang.String str9 = locale8.toLanguageTag();
        java.lang.String str10 = locale8.getScript();
        java.util.Locale.setDefault(category4, locale8);
        java.util.Locale locale12 = java.util.Locale.US;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale.setDefault(category4, locale13);
        java.util.Locale locale16 = locale13.stripExtensions();
        boolean boolean17 = languageRange1.equals((java.lang.Object) locale16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "france" + "'", str2, "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "france" + "'", str3, "france");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-US" + "'", str9, "en-US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-US" + "'", str14, "en-US");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        java.lang.Object[][] objArray0 = null;
        java.lang.Object[][] objArray1 = org.apache.commons.lang3.ArrayUtils.clone(objArray0);
        org.junit.Assert.assertNull(objArray1);
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("}eurt,esl", "Italy");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}eurt,esl" + "'", str2, "}eurt,esl");
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                ENG                                                 ", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                ENG                                                 " + "'", str2, "                                                ENG                                                 ");
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setExtension(' ', "1 100 35 10");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
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
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("e");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.Short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray4);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray6);
        boolean boolean8 = languageRange1.equals((java.lang.Object) shortArray7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Italian (Italy)", "44444444444444444444444444france");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("France");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("JPN");
        boolean boolean6 = languageRange1.equals((java.lang.Object) "JPN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("nglais (Etats-Unis)", "", "\u65e5\u6587\u65e5\u672c)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("1 100 35 10", (int) ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 100 35 10aaaaaaaaaaaaaaaaaaaaa" + "'", str3, "1 100 35 10aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\u7f8e\u570b");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u7f8e\u570b" + "'", str1, "\u7f8e\u570b");
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "th Korea", "0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        char[] charArray0 = null;
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.subarray(charArray0, (int) (byte) 100, 23);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "{FALSE,...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0 ({FALSE,FALSE,FAJPN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 ({FALSE,FALSE,FAJPN" + "'", str1, "0 ({FALSE,FALSE,FAJPN");
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("{10,32,10,5,1,5}", "{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{  ", "\u6cd5\u6587\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd510)32)10)5)1)5" + "'", str3, "\u6cd510)32)10)5)1)5");
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
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
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.util.Locale locale12 = java.util.Locale.US;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale11.getDisplayScript(locale13);
        java.lang.String str16 = locale11.getDisplayLanguage();
        java.lang.String str17 = locale11.getDisplayVariant();
        java.lang.String str18 = locale7.getDisplayScript(locale11);
        java.lang.String str19 = locale7.toString();
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-US" + "'", str14, "en-US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en_US" + "'", str19, "en_US");
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "eng", "true}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("CHINA", "}eurt,esla");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("97United States1United States10United States10United States35United States-1United States35United States-1", "[ , hi!, en-US,  ]   JPNPfPfPfPf{        []");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray16, (byte) 10, (int) '#');
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.add(byteArray22, (byte) -1);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray16, byteArray22);
        java.lang.Byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray22);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray26, (byte) -1);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray26, (byte) 10);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray26);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, 7, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 1, 1, 0, 1, 10, 1, 0]");
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("italianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalianGermanitalian", "\u4e2d\u56fd\u8a9e", "KOR");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u7fa9\u5927\u5229\u6587", 213, 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "\u7fa9\u5927\u5229\u6587aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenene", 221);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,..." + "'", str1, "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...");
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("italien", "fr_FR", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1" + "'", str1, "-1");
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("-1.0{0}10.0{0}1.0{0}100.0{0}1.0", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0{0}10.0{0}1.0{0}100.0{0}1.0" + "'", str2, "-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1.0", 'x');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("{}", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("slafurturt", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("ja", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, 10.0d, (double) (-1.0f));
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) 23);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) 8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[4.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[23.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray3, (int) '4');
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray6, 5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray6, (int) (byte) 10, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 35, 0, 5]");
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "  {FALSE,FALSE,FALSE,FALSE,TRUE}  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder19.setExtension('a', "\u6cd5\u6587                                                 ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value:                                                  ??                                                  [at index 0]");
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
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("e", "chinois (Chine)                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("NG", "", "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        float[] floatArray2 = new float[] { (short) 100, 6 };
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, 9, (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 6.0]");
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Italian (Italy)", "{97,1,10,10,35,-1,35,-1}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) (byte) 10, (double) 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray2);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, 7, 48);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 100);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("ja", "n-US   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen}1-,53,1-,53,01,01,1,79{");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\u5229\u5927\u610f\u6587\u5229\u5927\u610f", "en_US", 5, (int) (short) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6587\u5229\u5927\u610f" + "'", str4, "\u6587\u5229\u5927\u610f");
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.US;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("\u82f1\u8a9e\u30a2en_US             ", locale2);
        java.lang.String str8 = locale0.getDisplayName(locale2);
        java.lang.String str9 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u8a9e\u30a2EN_US             " + "'", str7, "\u82f1\u8a9e\u30a2EN_US             ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "anglais (Etats-Unis)" + "'", str8, "anglais (Etats-Unis)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en_US" + "'", str9, "en_US");
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.lang.Object obj3 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "de");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "de");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "de");
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        java.lang.Short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        java.lang.Class<?> wildcardClass2 = shortArray0.getClass();
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) 1, (short) -1 };
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5);
        java.lang.Class<?> wildcardClass7 = shortArray6.getClass();
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) 1, (short) -1 };
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10);
        java.lang.Class<?> wildcardClass12 = shortArray11.getClass();
        java.lang.Short[] shortArray15 = new java.lang.Short[] { (short) 1, (short) -1 };
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray15);
        java.lang.Class<?> wildcardClass17 = shortArray16.getClass();
        long[] longArray19 = new long[] { 'a' };
        long[] longArray26 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.addAll(longArray19, longArray26);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.add(longArray27, (int) (short) 1, (long) (byte) 1);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray27);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.subarray(longArray27, 213, (int) (byte) 1);
        long[] longArray39 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray39, 0L);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray41, (long) 3, (int) '#');
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray41, 0L);
        long[] longArray51 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray51, 0L);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray53);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray41, longArray53);
        long[] longArray58 = org.apache.commons.lang3.ArrayUtils.subarray(longArray53, 100, (-1));
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.add(longArray53, 10L);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray27, longArray53);
        java.lang.Class<?> wildcardClass62 = longArray27.getClass();
        java.lang.Short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        java.lang.Short[] shortArray64 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray63);
        java.lang.Class<?> wildcardClass65 = shortArray63.getClass();
        java.lang.reflect.Type[] typeArray66 = new java.lang.reflect.Type[] { wildcardClass2, wildcardClass7, wildcardClass12, wildcardClass17, wildcardClass62, wildcardClass65 };
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[] typeArray70 = org.apache.commons.lang3.ArrayUtils.add(typeArray66, 39, (java.lang.reflect.Type) wildcardClass69);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 39, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[97]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[97, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 1, 10, 10, 35, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[1, 100, 35, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("100.0United States-1.0United States10.0United States1.0United States100.0United States1.0", "\u4e2d\u6587\u53f0\u7063)it_it");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguage("\u5fb7\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                 {false,..", (int) 'u', "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                 {false,.." + "'", str3, "                                                                                                                                                                                                                                                 {false,..");
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("etruefalse                                          ", "EN-US");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Japanese (Japan)", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japanese (Japan)" + "'", str2, "Japanese (Japan)");
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
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
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("France");
        java.util.Locale.LanguageRange languageRange14 = new java.util.Locale.LanguageRange("France");
        java.lang.String str15 = languageRange14.getRange();
        java.lang.String str16 = languageRange14.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] { languageRange12, languageRange14 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strSet24);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet24, "hi!");
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet24, 'x');
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strSet24);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray41 = new java.lang.String[] { " ", "hi!", "en-US", " " };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList42);
        java.util.Locale.FilteringMode filteringMode45 = null;
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList42, filteringMode45);
        java.util.Locale locale47 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet48 = locale47.getUnicodeLocaleAttributes();
        java.util.Locale locale50 = new java.util.Locale("Italian");
        java.util.Locale locale51 = java.util.Locale.ITALY;
        java.util.Locale locale52 = java.util.Locale.FRANCE;
        java.util.Locale locale53 = java.util.Locale.US;
        java.lang.String str54 = locale53.toLanguageTag();
        java.util.Locale locale55 = java.util.Locale.ITALY;
        java.util.Locale locale56 = java.util.Locale.US;
        java.util.Locale locale57 = locale56.stripExtensions();
        java.lang.String str58 = locale57.toLanguageTag();
        java.lang.String str59 = locale55.getDisplayScript(locale57);
        java.util.Locale locale60 = java.util.Locale.KOREA;
        java.util.Locale locale61 = java.util.Locale.ITALY;
        java.util.Locale locale62 = java.util.Locale.US;
        java.util.Locale locale63 = locale62.stripExtensions();
        java.lang.String str64 = locale63.toLanguageTag();
        java.lang.String str65 = locale61.getDisplayScript(locale63);
        java.lang.String str66 = locale61.getDisplayLanguage();
        java.util.Locale locale67 = java.util.Locale.ITALY;
        java.util.Locale locale68 = java.util.Locale.US;
        java.util.Locale locale69 = locale68.stripExtensions();
        java.lang.String str70 = locale69.toLanguageTag();
        java.lang.String str71 = locale67.getDisplayScript(locale69);
        java.util.Locale[] localeArray72 = new java.util.Locale[] { locale47, locale50, locale51, locale52, locale53, locale55, locale60, locale61, locale69 };
        java.util.ArrayList<java.util.Locale> localeList73 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList73, localeArray72);
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList73, filteringMode75);
        java.util.List<java.util.Locale> localeList77 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Locale locale78 = java.util.Locale.lookup(languageRangeList10, (java.util.Collection<java.util.Locale>) localeList76);
        java.util.Collection<java.lang.String> strCollection79 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags(languageRangeList10, strCollection79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + filteringMode7 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode7.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "france" + "'", str15, "france");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "france" + "'", str16, "france");
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertEquals(locale50.toString(), "italian");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "en-US" + "'", str54, "en-US");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "en-US" + "'", str58, "en-US");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "en-US" + "'", str64, "en-US");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Italian" + "'", str66, "Italian");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "en-US" + "'", str70, "en-US");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(localeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode75.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(localeList77);
        org.junit.Assert.assertNull(locale78);
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 100);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.remove(byteArray20, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42, Length: 2");
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
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder34 = builder32.setLanguage("{FALSE,...##########################################################################################");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: {FALSE,...########################################################################################## [at index 0]");
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
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("de_D", "        {fPfPfPfPNPJ   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 0.0f, (double) (byte) 10);
        double[] doubleArray4 = null;
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 10.0f, (double) (-1));
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1.0f), 9);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("italien");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italie" + "'", str1, "italie");
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\u6cd5\u6587                                                 ", "\u5fb7\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "en-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CAen-CA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("naliait", 21, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "en-US");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray16, (java.lang.Object) 4, 4);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 0);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) byteArray16);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) -1);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray24, (byte) 100);
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
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.add(booleanArray15, 221, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 221, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("{-1,35,0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{-1,35,0}" + "'", str1, "{-1,35,0}");
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (long) 13);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.clone(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray5, 6, (long) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        long[] longArray1 = new long[] { 'a' };
        long[] longArray8 = new long[] { (short) 10, (byte) 10, 35, (-1L), '#', (-1) };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray8, (long) 5, (int) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.add(longArray8, (long) (byte) -1);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (-1), (int) (byte) 1);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray17, (long) (short) 1, 1);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray17, (long) (byte) 10, 23);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray25 = org.apache.commons.lang3.ArrayUtils.remove(longArray17, 213);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 213, Length: 1");
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
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        double[] doubleArray2 = new double[] { 4, 100L };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, (int) '4', 5);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (byte) 10, 3);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 'x', (-1), (double) (byte) 10);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, 250, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 250, Length: 0");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("true                                                                                                    true                                                                                                    false", "true                                                                                                    true                                                                                                    false", (int) (byte) 0);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_US", "United States", (int) (byte) -1);
        java.lang.String[] strArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\u82f1\u6587\u7f8e\u570b)", strArray10);
        java.lang.String[] strArray13 = null;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("}eurt,esla", strArray10, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAADEAAAAAA", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "}eurt,esla" + "'", str14, "}eurt,esla");
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("{fulse,fulse,fulse,fulse,true", "{false,...", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("tru4tru4fals", "\u5927");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tru4tru4fals" + "'", str2, "tru4tru4fals");
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("frChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr_ChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetrFR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "frChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr_ChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetrFR" + "'", str1, "frChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr_ChinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetrFR");
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setScript("zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zh_CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "eng", (java.lang.CharSequence) "01530011");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE", "tru4tru4fals");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale52 = java.util.Locale.lookup(languageRangeList0, localeCollection4);
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Italian" + "'", str40, "Italian");
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
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale6 = builder3.build();
        java.util.Locale.Builder builder8 = builder3.setRegion("en");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("japonais (Japon)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: japonais (Japon) [at index 0]");
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
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ne", 100, (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u4e2d\u6587\u53f0\u7063)it_it", "aitalianaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        long[] longArray0 = new long[] {};
        long[] longArray5 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray7, (long) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray0, longArray7);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray11);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "TW", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("{-1,35,0}", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                           {-1,35,0}" + "'", str2, "                                                                                           {-1,35,0}");
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("united states");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "united states" + "'", str1, "united states");
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Chine", "true}", "it_it", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chine" + "'", str4, "Chine");
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("}eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=}eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      " + "'", str2, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)      ");
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) (short) -1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, 0L);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray6);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray10, 12, (long) 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 12, Length: 4");
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
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        short[] shortArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray0, (short) (byte) 10, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("}eurt,esl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "}EURT,ESL" + "'", str1, "}EURT,ESL");
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("{false,..", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("slafurturt");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "slafurturt" + "'", str1, "slafurturt");
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("en-CA", "10 32 10 5 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("etruefalse                                                                                         ", "xxxxxxxxxxxxxxDEUxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "etruefalse                                                                                         " + "'", str2, "etruefalse                                                                                         ");
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u7f8e\u56fd", "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "{FALSE,...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
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
        java.lang.Short[] shortArray44 = new java.lang.Short[] {};
        java.lang.Short[] shortArray45 = new java.lang.Short[] {};
        java.lang.Short[] shortArray46 = new java.lang.Short[] {};
        java.lang.Short[] shortArray47 = new java.lang.Short[] {};
        java.lang.Short[] shortArray48 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray49 = new java.lang.Short[][] { shortArray44, shortArray45, shortArray46, shortArray47, shortArray48 };
        java.lang.Short[] shortArray50 = new java.lang.Short[] {};
        java.lang.Short[] shortArray51 = new java.lang.Short[] {};
        java.lang.Short[] shortArray52 = new java.lang.Short[] {};
        java.lang.Short[] shortArray53 = new java.lang.Short[] {};
        java.lang.Short[] shortArray54 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray55 = new java.lang.Short[][] { shortArray50, shortArray51, shortArray52, shortArray53, shortArray54 };
        java.lang.Short[][][] shortArray56 = new java.lang.Short[][][] { shortArray49, shortArray55 };
        java.lang.Short[] shortArray57 = new java.lang.Short[] {};
        java.lang.Short[] shortArray58 = new java.lang.Short[] {};
        java.lang.Short[] shortArray59 = new java.lang.Short[] {};
        java.lang.Short[] shortArray60 = new java.lang.Short[] {};
        java.lang.Short[] shortArray61 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray62 = new java.lang.Short[][] { shortArray57, shortArray58, shortArray59, shortArray60, shortArray61 };
        java.lang.Short[] shortArray63 = new java.lang.Short[] {};
        java.lang.Short[] shortArray64 = new java.lang.Short[] {};
        java.lang.Short[] shortArray65 = new java.lang.Short[] {};
        java.lang.Short[] shortArray66 = new java.lang.Short[] {};
        java.lang.Short[] shortArray67 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray68 = new java.lang.Short[][] { shortArray63, shortArray64, shortArray65, shortArray66, shortArray67 };
        java.lang.Short[][][] shortArray69 = new java.lang.Short[][][] { shortArray62, shortArray68 };
        java.lang.Short[] shortArray70 = new java.lang.Short[] {};
        java.lang.Short[] shortArray71 = new java.lang.Short[] {};
        java.lang.Short[] shortArray72 = new java.lang.Short[] {};
        java.lang.Short[] shortArray73 = new java.lang.Short[] {};
        java.lang.Short[] shortArray74 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray75 = new java.lang.Short[][] { shortArray70, shortArray71, shortArray72, shortArray73, shortArray74 };
        java.lang.Short[] shortArray76 = new java.lang.Short[] {};
        java.lang.Short[] shortArray77 = new java.lang.Short[] {};
        java.lang.Short[] shortArray78 = new java.lang.Short[] {};
        java.lang.Short[] shortArray79 = new java.lang.Short[] {};
        java.lang.Short[] shortArray80 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray81 = new java.lang.Short[][] { shortArray76, shortArray77, shortArray78, shortArray79, shortArray80 };
        java.lang.Short[][][] shortArray82 = new java.lang.Short[][][] { shortArray75, shortArray81 };
        java.lang.Short[] shortArray83 = new java.lang.Short[] {};
        java.lang.Short[] shortArray84 = new java.lang.Short[] {};
        java.lang.Short[] shortArray85 = new java.lang.Short[] {};
        java.lang.Short[] shortArray86 = new java.lang.Short[] {};
        java.lang.Short[] shortArray87 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray88 = new java.lang.Short[][] { shortArray83, shortArray84, shortArray85, shortArray86, shortArray87 };
        java.lang.Short[] shortArray89 = new java.lang.Short[] {};
        java.lang.Short[] shortArray90 = new java.lang.Short[] {};
        java.lang.Short[] shortArray91 = new java.lang.Short[] {};
        java.lang.Short[] shortArray92 = new java.lang.Short[] {};
        java.lang.Short[] shortArray93 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray94 = new java.lang.Short[][] { shortArray89, shortArray90, shortArray91, shortArray92, shortArray93 };
        java.lang.Short[][][] shortArray95 = new java.lang.Short[][][] { shortArray88, shortArray94 };
        java.lang.Short[][][][] shortArray96 = new java.lang.Short[][][][] { shortArray56, shortArray69, shortArray82, shortArray95 };
        java.lang.Short[][][][] shortArray98 = org.apache.commons.lang3.ArrayUtils.remove(shortArray96, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable[][] cloneableArray99 = org.apache.commons.lang3.ArrayUtils.addAll((java.lang.Cloneable[][]) doubleArray6, (java.lang.Cloneable[][]) shortArray96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot store [[[Ljava.lang.Short; in an array of [[D");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertNotNull(shortArray79);
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertNotNull(shortArray84);
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertNotNull(shortArray86);
        org.junit.Assert.assertNotNull(shortArray87);
        org.junit.Assert.assertNotNull(shortArray88);
        org.junit.Assert.assertNotNull(shortArray89);
        org.junit.Assert.assertNotNull(shortArray90);
        org.junit.Assert.assertNotNull(shortArray91);
        org.junit.Assert.assertNotNull(shortArray92);
        org.junit.Assert.assertNotNull(shortArray93);
        org.junit.Assert.assertNotNull(shortArray94);
        org.junit.Assert.assertNotNull(shortArray95);
        org.junit.Assert.assertNotNull(shortArray96);
        org.junit.Assert.assertNotNull(shortArray98);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        long[] longArray9 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray9, 0L);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray11, (long) (byte) -1);
        long[] longArray18 = new long[] { (byte) 1, (short) 100, '#', (byte) 10 };
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray18, 0L);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray20, (long) (byte) 0);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray20);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.addAll(longArray11, longArray20);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.clone(longArray20);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray2, (java.lang.Object) longArray25, (-1));
        int int28 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("anglais(Etats-Unis)                                                                                                  ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[1, 100, 35, 10, 1, 100, 35, 10]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[1, 100, 35, 10]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", "  {false,false,false,false,true}   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
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
        java.lang.String str20 = locale9.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "it_IT" + "'", str20, "it_IT");
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("}eurt,esl");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("slafurturt", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "slafurturt" + "'", str2, "slafurturt");
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "{fulse,fulse,fulse,fulse,tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray4, (byte) 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray4, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{97,1,10,10,35,-1,35,-1}");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("FR", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\u6cd5\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        java.lang.Character[] charArray0 = null;
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0);
        org.junit.Assert.assertNull(charArray1);
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("nglais (Etats-Unis)", "zh_TWzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNzh_CNz", 87);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("10321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051", 6, 221);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "51103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103" + "'", str3, "51103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103210511032105110321051103");
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray4, 213, (int) 'x');
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray4, 3, (int) 'u');
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray10, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("        ja_JP", "                    10 32 10 5 1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("{1.0,-1.0,0.0,0.0}", "                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1                    10 32 10 5 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{1.0,-1.0,0.0,0.0}" + "'", str2, "{1.0,-1.0,0.0,0.0}");
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("US", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US                                                                                                  " + "'", str2, "US                                                                                                  ");
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("u uu");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        java.util.Locale locale2 = java.util.Locale.US;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("", locale2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("  {fPfPfPfPNPJ   ", locale2);
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("e");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] { languageRange7 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet12, filteringMode13);
        boolean boolean15 = locale2.equals((java.lang.Object) strList14);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  {FPFPFPFPNPJ   " + "'", str5, "  {FPFPFPFPNPJ   ");
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode13.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("chinois (Chine)", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        long[] longArray0 = null;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertNull(longArray3);
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("china", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "china    " + "'", str2, "china    ");
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
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
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) 1, 250);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0" + "'", str2, "0#-1.0100.0#-1.0#10.0#1.0#100.0#1.0");
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("{0}", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", "{-1,35,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0a-1", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" trutrufals  ", 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("}eurt,eslaf,eslaf,eslaf,eslaf{", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("{uuu", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale0.getDisplayScript(locale2);
        java.lang.String str5 = locale2.getISO3Language();
        java.lang.String str6 = locale2.getLanguage();
        java.lang.String str7 = locale2.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale2.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Japanese", "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japanese" + "'", str2, "Japanese");
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "{}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, true);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, true);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
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
        java.util.Set<java.lang.Object> objSet96 = objMap15.keySet();
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
        org.junit.Assert.assertNotNull(objSet96);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("{false,false,false,false,true", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("}eurt,eslaf,eslaf,eslaf,eslaf{", "11003510");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("{false,false,false,false,true}", strArray4, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{false,false,false,false,true}" + "'", str9, "{false,false,false,false,true}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxItalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXITALYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + "'", str1, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXITALYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aitalianaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aitalianaa" + "'", str1, "aitalianaa");
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("etruefalse                                                                                         ", "jpn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "etruefalse                                                                                         " + "'", str2, "etruefalse                                                                                         ");
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
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
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray43);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        java.lang.Short[][][][] shortArray0 = new java.lang.Short[][][][] {};
        java.lang.Short[][][][] shortArray1 = new java.lang.Short[][][][] {};
        java.lang.Short[][][][] shortArray2 = new java.lang.Short[][][][] {};
        java.lang.Short[][][][] shortArray3 = new java.lang.Short[][][][] {};
        java.lang.Short[][][][] shortArray4 = new java.lang.Short[][][][] {};
        java.lang.Short[][][][][] shortArray5 = new java.lang.Short[][][][][] { shortArray0, shortArray1, shortArray2, shortArray3, shortArray4 };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("United States", "}eurt,esla");
        java.lang.Short[][][][][] shortArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (java.lang.Object) strArray8);
        long[] longArray15 = new long[] { 35, 0L, 1L, (byte) 1, 100L };
        long[] longArray21 = new long[] { 35, 0L, 1L, (byte) 1, 100L };
        long[][] longArray22 = new long[][] { longArray15, longArray21 };
        long[][] longArray25 = org.apache.commons.lang3.ArrayUtils.subarray(longArray22, (int) (byte) 0, (int) 'a');
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray22);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) longArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable[][] cloneableArray28 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Cloneable[][]) shortArray5, (java.lang.Cloneable[]) longArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: [[J");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[35, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[35, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("10 32 10 5 1", "naliait");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("1 100 35 10", "EN(US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1 100 35 10" + "'", str2, "1 100 35 10");
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        short[] shortArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("kor", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u30a2\u30e1", "nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen}1-,53,1-,53,01,01,1,79{");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        java.lang.Object obj5 = locale1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-US" + "'", str2, "en-US");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)" + "'", str4, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "en_US");
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US" + "'", str1, "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("Chinese", "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinese" + "'", str3, "Chinese");
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FALSE,FALSE,FALSE,TRU,truetruefalse)" + "'", str2, "FALSE,FALSE,FALSE,TRU,truetruefalse)");
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
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
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.add(intArray13, 10);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray13, 9);
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
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 35, 0, 10]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("tru#tru#fals", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tru#tru#fals                                    " + "'", str2, "tru#tru#fals                                    ");
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444france", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("True{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{faltrue{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{falfalse", strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', (int) 'a', 13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
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
        java.lang.Short[] shortArray58 = new java.lang.Short[] { (short) 0 };
        short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray58, (short) (byte) 1);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray60);
        java.lang.Short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray60);
        java.lang.Short[] shortArray64 = new java.lang.Short[] { (short) 0 };
        short[] shortArray66 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray64, (short) (byte) 1);
        short[] shortArray67 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray60, shortArray66);
        short[] shortArray69 = org.apache.commons.lang3.ArrayUtils.add(shortArray60, (short) (byte) -1);
        short[] shortArray71 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray69, (short) (byte) 100);
        int int73 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray71, (short) 10);
        short[] shortArray74 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray71);
        boolean boolean75 = objMap15.equals((java.lang.Object) shortArray74);
        java.util.Collection<java.lang.Object> objCollection76 = objMap15.values();
        org.apache.commons.lang3.StringUtils stringUtils77 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils78 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils79 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils80 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils81 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils82 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils[] stringUtilsArray83 = new org.apache.commons.lang3.StringUtils[] { stringUtils77, stringUtils78, stringUtils79, stringUtils80, stringUtils81, stringUtils82 };
        org.apache.commons.lang3.StringUtils stringUtils84 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils[] stringUtilsArray85 = new org.apache.commons.lang3.StringUtils[] { stringUtils84 };
        org.apache.commons.lang3.StringUtils[] stringUtilsArray86 = org.apache.commons.lang3.ArrayUtils.toArray(stringUtilsArray85);
        org.apache.commons.lang3.StringUtils[] stringUtilsArray87 = org.apache.commons.lang3.ArrayUtils.addAll(stringUtilsArray83, stringUtilsArray85);
        java.lang.Float[] floatArray93 = new java.lang.Float[] { 1.0f, 10.0f, 100.0f, 1.0f, 100.0f };
        float[] floatArray94 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray93);
        float[] floatArray96 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray93, 0.0f);
        float[] floatArray98 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray93, (float) 48);
        java.lang.Object obj99 = objMap15.put((java.lang.Object) stringUtilsArray85, (java.lang.Object) floatArray98);
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
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray66), "[0]");
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray67), "[0, 0]");
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[0, -1]");
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[0, -1]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objCollection76);
        org.junit.Assert.assertNotNull(stringUtilsArray83);
        org.junit.Assert.assertNotNull(stringUtilsArray85);
        org.junit.Assert.assertNotNull(stringUtilsArray86);
        org.junit.Assert.assertNotNull(stringUtilsArray87);
        org.junit.Assert.assertNotNull(floatArray93);
        org.junit.Assert.assertNotNull(floatArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray94), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray96), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray98);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray98), "[1.0, 10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        java.lang.Float[] floatArray0 = null;
        java.lang.Float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "10 32 10 5 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("United States", "  en-US   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United States" + "'", str2, "United States");
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "{97,1,10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXITALYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { (-1.0d), 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) (byte) -1);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray5, (int) (short) 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) 0L);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray7, (double) 100);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, 35, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.add(doubleArray14, (int) '#', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("-1.0", "11003510");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("44444444444444444444444444France");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444fRANCE" + "'", str1, "44444444444444444444444444fRANCE");
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setExtension('a', "Chinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Chinatruetruefalsetruetruefalsetruetruefalsetruetruefalsetruetr [at index 0]");
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
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\u82f1\u8a9e\u30a2en_US");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray4, (byte) 100, (-1));
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray4, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.remove(byteArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, -1]");
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("u uu", "44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "44444444444444444444444444France");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444France" + "'", str1, "44444444444444444444444444France");
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinois (Chine)" + "'", str1, "chinois (Chine)");
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("{false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,   }eurt,eslaf,eslaf,eslaf,eslaf{  ", "   JPNPfPfPfPf{        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa", "Etts-Unis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa" + "'", str2, "aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa");
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen" + "'", str2, "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen");
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("false,false,false,false,tru{false,false,false,false,tru{fal{false,false,false,false,tru{false,false,false,false,tru{fal", "0 ({FALSE,FALSE,FALSE,FALSE,TRU,truetruefalse)", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("de_DE", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de_DE" + "'", str2, "de_DE");
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("italien (Italie)", "\u4e2d\u56fd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("{10}", "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setLanguage("444444444444444444444italien (Italie)44444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 444444444444444444444italien (Italie)44444444444444444444444444444444444444444444444444 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("South Korea", "44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444", 0, 12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444" + "'", str4, "44444444444444444444444444444444444444444444444444italien (Italie)444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ne");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("FALSE,FALSE,FALSE,TRU,truetruefalse)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FALSE,FALSE,FALSE,TRU,truetruefalse)" + "'", str1, "FALSE,FALSE,FALSE,TRU,truetruefalse)");
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("}eurt,esla", "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (COREANO)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}eurt,esla" + "'", str2, "}eurt,esla");
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)" + "'", str1, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)zh_CN(COREANO)");
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("DEU", 213);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DEU" + "'", str2, "DEU");
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "it_it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Chine", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chine" + "'", str2, "Chine");
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("e", "trutrufals", "\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "e" + "'", str4, "e");
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
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
        java.lang.String str38 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) (-1), "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_US");
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1" + "'", str38, "-1");
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguageTag("ja                                        ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ja                                         [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                        {97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE                                                         ", "  {false,false,false,false,true}   ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (COREANO)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (coreano)" + "'", str1, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd) (coreano)");
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("{1,0}", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{1,0}" + "'", str2, "{1,0}");
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("FR_fr", "{97,1,10,10,35,-1,35,-1}nenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("italien", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("{}", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxItalyxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE" + "'", str1, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUETRUEFALSE");
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        long[] longArray7 = new long[] { 35, 0L, 1L, (byte) 1, 100L };
        long[] longArray13 = new long[] { 35, 0L, 1L, (byte) 1, 100L };
        long[][] longArray14 = new long[][] { longArray7, longArray13 };
        long[][] longArray17 = org.apache.commons.lang3.ArrayUtils.subarray(longArray14, (int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass18 = longArray14.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray19 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass18 };
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        long[] longArray27 = new long[] { 35, 0L, 1L, (byte) 1, 100L };
        long[] longArray33 = new long[] { 35, 0L, 1L, (byte) 1, 100L };
        long[][] longArray34 = new long[][] { longArray27, longArray33 };
        long[][] longArray37 = org.apache.commons.lang3.ArrayUtils.subarray(longArray34, (int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass38 = longArray34.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray39 = new java.lang.reflect.GenericDeclaration[] { wildcardClass21, wildcardClass38 };
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        long[] longArray47 = new long[] { 35, 0L, 1L, (byte) 1, 100L };
        long[] longArray53 = new long[] { 35, 0L, 1L, (byte) 1, 100L };
        long[][] longArray54 = new long[][] { longArray47, longArray53 };
        long[][] longArray57 = org.apache.commons.lang3.ArrayUtils.subarray(longArray54, (int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass58 = longArray54.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray59 = new java.lang.reflect.GenericDeclaration[] { wildcardClass41, wildcardClass58 };
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Class<?> wildcardClass61 = obj60.getClass();
        long[] longArray67 = new long[] { 35, 0L, 1L, (byte) 1, 100L };
        long[] longArray73 = new long[] { 35, 0L, 1L, (byte) 1, 100L };
        long[][] longArray74 = new long[][] { longArray67, longArray73 };
        long[][] longArray77 = org.apache.commons.lang3.ArrayUtils.subarray(longArray74, (int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass78 = longArray74.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray79 = new java.lang.reflect.GenericDeclaration[] { wildcardClass61, wildcardClass78 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray80 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray19, genericDeclarationArray39, genericDeclarationArray59, genericDeclarationArray79 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray81 = org.apache.commons.lang3.ArrayUtils.toArray(genericDeclarationArray80);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[35, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[35, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(genericDeclarationArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[35, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[35, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(genericDeclarationArray39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[35, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[35, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(genericDeclarationArray59);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray67), "[35, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray73), "[35, 0, 1, 1, 100]");
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(genericDeclarationArray79);
        org.junit.Assert.assertNotNull(genericDeclarationArray80);
        org.junit.Assert.assertNotNull(genericDeclarationArray81);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale.Builder builder7 = builder4.setLocale(locale5);
        java.util.Locale locale9 = new java.util.Locale("{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}");
        java.lang.String str10 = locale9.getVariant();
        java.util.Locale locale11 = locale9.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder4.setLocale(locale11);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: {97,1,10,10,35,-1,35,-1}lse,false,false,false,true} [at index 0]");
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
        org.junit.Assert.assertEquals(locale9.toString(), "{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "{97,1,10,10,35,-1,35,-1}lse,false,false,false,true}");
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("   JPNPfPfPfPf{        ", 0, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ..." + "'", str3, " ...");
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        int[] intArray3 = new int[] { (byte) -1, 35, (byte) 0 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, (int) (short) 0, (int) (byte) 0);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.toObject(intArray3);
        int int9 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) intArray8);
        java.lang.Integer[] intArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) intArray10, "{0}", (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                   English");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray3);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray2);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray2, (byte) 100, 4);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray2, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "{FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...chinois (Chine){FALSE,...", "japonais (Japon)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("US", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US" + "'", str2, "US");
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0", "\u4e2d\u6587\u53f0\u7063)it_it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0" + "'", str2, "100.0{0}-1.0{0}10.0{0}1.0{0}100.0{0}1.0");
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        java.lang.Short[] shortArray0 = null;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) shortArray0, "######{false,false,false,false,true", (int) 'u', (int) (short) -1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("France", "        {{false,false,false,false,true}PfPfPfPNPJ   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBS         TaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str1, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     " + "'", str1, "     ");
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray6, (byte) 10, (int) '#');
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray6, byteArray12);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) 0);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray12, (byte) 1);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray12, (byte) -1);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray23, (byte) 1, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray2, (byte) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 0);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray13, (byte) 10, (int) '#');
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0 };
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.add(byteArray19, (byte) -1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray13, byteArray19);
        java.lang.Byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray19);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray2, byteArray19);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray19, (int) (short) 1, (int) ' ');
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray27, (byte) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\u5927\u5229\u6587", "china    ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u5927\u5229\u6587" + "'", str3, "\u5927\u5229\u6587");
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("44444444444444444444444444France", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=44444444444444444444444444france");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
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
        byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, (int) ' ', 3);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray12);
        byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, 23, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 1]");
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
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("{", "}eurt,esla}eurt,esla}eurt,esla}eur{false,false,false,false,true}eurt,esla}eurt,esla}eurt,esla}eurt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{" + "'", str2, "{");
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "{FALSE,...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("English", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                        {97,1,10,10,35,-1,35,-1}NENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENENE                                                         ", "zh-CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        int[] intArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(intArray0);
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" ", "NG");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("{fulse,fulse,fulse,fulse,tr", 42, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("italian", "                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    aitalianaa                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U", (java.lang.CharSequence) "Etts-Unis");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U" + "'", charSequence2, "\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2\u82f1\u8a9e\u30a2en_U");
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("CN", "kor");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        java.lang.Short[] shortArray1 = new java.lang.Short[] { (short) 0 };
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray1, (short) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) (byte) 100);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (int) (short) 0, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.remove(shortArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 0]");
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "        ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        ja_JP" + "'", str1, "        ja_JP");
    }
}
